import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JuegoListener extends PokemonParserBaseListener {

    private final EstadoJuego estado = new EstadoJuego();

    // se utiliza una variable para indicar que tipo de sentencia es la que corresponde a la linea que comience con
    // el bullet, ya que hay distintos tipos
    private enum ModoBullet {
        NINGUNO,    // se ignora si no se puede categorizar en ninguna de las siguientes
        ROBO,       // un jugador roba cartas pasan de "desconocida" a "conocida" en la mano del jugador conocido
        DESCARTE,   // un jugador descarta cartas de la mano
        MULLIGAN,   // mano revelada en un mulligan: vuelve al mazo, se quita de la mano
        A_BANCA,    // cartas jugadas directamente al banquillo
        A_ACTIVO    // carta robada y jugada directamente al puesto activo
    }

    private ModoBullet modo = ModoBullet.NINGUNO; //inicialmente comenzamos con ningun modo
    private String jugadorBullet = null;     // jugador al que pertenece la lista actual de acciones
    private int descartesPendientes = 0;     // "discarded N cards" aun sin detallar en bullets
    private String ultimoJugadorRobo = null; // para la linea "N drawn cards", que no lleva jugador

    //Funciones auxiliares

    //Esta funcioón devuelve el entero correspondiente con el nodo terminal de un numero
    private int valor(PokemonParser.NumberContext n) {
        if (n == null) return 0;
        //Como tenemos un token seven, ya que se utiliza mucho, utilizamos esta regla especifica
        if (n.SEVEN() != null) return 7;
        //Si es cualquier otro numero se convierte a mano
        return Integer.parseInt(n.NUM().getText());
    }

    //Funcion que devuelve el id de un nodo terminal. si es nulo, devuelve null, y sino su texto
    private String id(TerminalNode t) {
        return (t == null) ? null : t.getText();
    }

    //Cuando se detecta una linea con bullet, se abre el modo correspondiente y se asigna el jugador al que le corresponden las sentencias
    private void abrirModo(ModoBullet m, String jugador) {
        modo = m;
        jugadorBullet = jugador;
    }

    // Se llama cada vez que llega una linea que NO es bullet: la lista anterior termina.
    private void cerrarModo() {
        // Si se descartaron N cartas y los bullets no las detallaron
        // (mano oculta del rival), se quitan N cartas desconocidas.
        if (modo == ModoBullet.DESCARTE && descartesPendientes > 0 && jugadorBullet != null) {
            estado.quitarCartasDesconocidas(jugadorBullet, descartesPendientes);
        }
        modo = ModoBullet.NINGUNO;
        jugadorBullet = null;
        descartesPendientes = 0;
    }

    // Roba n cartas cuyo nombre aun no se conoce y espera una posible lista de bullets.
    private void robarDesconocidas(String jugador, int n) {
        for (int i = 0; i < n; i++) {
            estado.robarCartaDesconocida(jugador);
        }
        ultimoJugadorRobo = jugador;
        abrirModo(ModoBullet.ROBO, jugador);
    }

    // Busca el dueño de un pokemon cuando la linea no incluye el nombre de jugador.
    private String buscarDueno(String idExplicito, String pokemon, boolean preferirRival) {
        if (idExplicito != null) return idExplicito;

        List<String> candidatos = new ArrayList<>();
        for (String j : estado.getJugadores()) {
            //Si el pokemon usado esta en su pokemon activo, o en su banquillo se añade el jugador a los posibles 
            if (pokemon.equals(estado.getPokemonActivo(j)) || estado.getBanquillo(j).contains(pokemon)) {
                candidatos.add(j);
            }
        }
        //si solo hay un candidato posible (es decir el otro jugador no lo tiene ni en banquillo ni en activo)
        if (candidatos.size() == 1) return candidatos.get(0);

        //si los dos jugadores tienen ese pokemon-> se devuelve el jugador activo en ese momento (que sea su turno), 
        // a menos que tengamos el booleano preferir rival activado
        String actual = estado.getJugadorActivo();
        for (String j : candidatos) {
            boolean esActual = j.equals(actual);
            if (esActual != preferirRival) return j;
        }
        return actual;
    }

    // Evolucion: cambia el pokemon en el campo y gasta la carta de la mano.
    private void aplicarEvolucion(String jugador, String desde, String hacia) {
        estado.evolucionar(jugador, desde, hacia);
        estado.quitarCartaMano(jugador, hacia, true);
    }

    public EstadoJuego getEstado() {
        return estado;
    }

    //si la linea no comienza por un bullet, se cierra el modo bullet
    @Override
    public void enterSetup_entry(PokemonParser.Setup_entryContext ctx) {
        if (ctx.common_entry() == null) cerrarModo();
    }

    @Override
    public void enterTurn_entry(PokemonParser.Turn_entryContext ctx) {
        if (ctx.common_entry() == null) cerrarModo();
    }

    @Override
    public void enterCommon_entry(PokemonParser.Common_entryContext ctx){
        if(ctx.bullet_line() == null) cerrarModo();
    }

    //Si la proxima linea es un bullet se elige el modo correspondiente y se realizan las funciones necesarias usando la clase estadoJuego
    @Override
    public void enterBullet_line(PokemonParser.Bullet_lineContext ctx) {
        if (modo == ModoBullet.NINGUNO || jugadorBullet == null) return;

        for (PokemonParser.Card_nameContext c : ctx.card_name()) {
            String carta = c.getText();
            switch (modo) {
                case ROBO:
                    estado.revelarCartaRobada(jugadorBullet, carta);
                    break;
                case DESCARTE:
                    if (descartesPendientes > 0) {
                        estado.quitarCartaMano(jugadorBullet, carta, true);
                        descartesPendientes--;
                    }
                    break;
                case MULLIGAN:
                    estado.quitarCartaMano(jugadorBullet, carta, true);
                    break;
                case A_BANCA:
                    if (c.pokemon_card() != null) estado.añadirBanquillo(jugadorBullet, carta);
                    break;
                case A_ACTIVO:
                    if (c.pokemon_card() != null) estado.setPokemonActivo(jugadorBullet, carta);
                    break;
                default:
                    break;
            }
        }
    }

    //Se añaden los jugadores al estado Juego durante las lineas de setup, como coin tos, win coin y turn decision
    @Override
    public void enterCoin_toss(PokemonParser.Coin_tossContext ctx) {
        estado.añadirJugador(ctx.ID().getText());
    }

    @Override
    public void enterWin_coin(PokemonParser.Win_coinContext ctx) {
        estado.añadirJugador(ctx.ID().getText());
    }

    @Override
    public void enterTurn_decision(PokemonParser.Turn_decisionContext ctx) {
        estado.añadirJugador(ctx.ID().getText());
    }

    @Override
    public void enterTake_mulligan_action(PokemonParser.Take_mulligan_actionContext ctx) {
        estado.añadirJugador(ctx.ID().getText());
    }

    //Al robar cartas, se utiliza la funcion correspondiente y se espera si se van a revelar o no que cartas se roban
    @Override
    public void enterDraw_cards_init(PokemonParser.Draw_cards_initContext ctx) {
        robarDesconocidas(ctx.ID().getText(), valor(ctx.number()));
    }

    @Override
    public void enterMulligan_reveal(PokemonParser.Mulligan_revealContext ctx) {
        abrirModo(ModoBullet.MULLIGAN, ctx.ID().getText());
    }

    @Override
    public void enterMulligan_bonus(PokemonParser.Mulligan_bonusContext ctx) {
        // ID(0) = quien roba, ID(1) = quien hizo mulligan; number(0) = cartas extra
        robarDesconocidas(ctx.ID(0).getText(), valor(ctx.number(0)));
    }

    //cada vez que comienza un turno se cierra el modo anterior, y se imprime a quien le corresponde el turno
    @Override
    public void enterTurn_header(PokemonParser.Turn_headerContext ctx) {
        cerrarModo();
        String jugador = ctx.ID().getText();
        estado.inicioTurno(jugador);
        System.out.println("Turno detectado: " + jugador);
    }

    //cuando termina la partida se usa la clase estado Juego para imprimir el ganador
    @Override
    public void enterEnd(PokemonParser.EndContext ctx) {
        cerrarModo();
        String ganador = ctx.ID().getText();
        estado.winner(ganador);
        System.out.println("Ganador detectado: " + ganador);
    }

   //Acciones: play cards 
    @Override
    public void enterPlay_cards(PokemonParser.Play_cardsContext ctx) {
        //Se buscan en los nodos inferiores: el nombre del jugador y de la carta jugada
        String jugador = ctx.ID().getText();
        PokemonParser.Card_nameContext c = ctx.card_name();
        String carta = c.getText();

        //Se borran de la mano 
        estado.quitarCartaMano(jugador, carta, true);

        //dependiendo de a donde se jueguen, se colocan en bench o en active spot
        if (c.pokemon_card() != null) {
            if (ctx.BENCH() != null) {
                estado.añadirBanquillo(jugador, carta);
            } else if (ctx.ACTIVE() != null) {
                estado.setPokemonActivo(jugador, carta);
            }
        }
    }

    //Similar a robar carta, pero para la energia
    @Override
    public void enterAttach_energy(PokemonParser.Attach_energyContext ctx) {
        estado.quitarCartaMano(ctx.ID().getText(), ctx.card_name().getText(), true);
    }

    @Override
    public void enterEvolve_pokemon(PokemonParser.Evolve_pokemonContext ctx) {
        aplicarEvolucion(ctx.ID().getText(),
                ctx.pokemon_card(0).getText(),
                ctx.pokemon_card(1).getText());
    }

    //Al entrar en un ataque -> se guarda el daño producido en el estado de juego
    @Override
    public void enterUse_ability_or_attack(PokemonParser.Use_ability_or_attackContext ctx) {
        String atacante = ctx.ID(0).getText();
        if (ctx.number() != null) {
            estado.añadirDaño(atacante, valor(ctx.number()));
        }
    }

    // "X took N more damage because of ... Weakness": daño extra del atacante (el rival del que lo recibe)
    //AQUI: HAY QUE COMPROBAR SI FUNCIONA CON LA RESISTENCIA!!!!
    @Override
    public void enterDamage_taken(PokemonParser.Damage_takenContext ctx) {
        if (ctx.MORE_WORD() == null && ctx.LESS() == null) return;
        String pokemon = ctx.pokemon_card().getText();
        String defensor = buscarDueno(id(ctx.ID()), pokemon, true);
        String atacante = (defensor == null) ? null : estado.getRival(defensor);
        if (atacante == null) return;

        int n = valor(ctx.number());
        //si se incluye la palabra more, implica que hay un weakness -> sumar daño
        if (ctx.MORE_WORD() != null) estado.añadirDaño(atacante, n);
        //si no, implica una resistencia -> restar daño
        else estado.restarDaño(atacante, n);
    }

    @Override
    public void enterRetreat_action(PokemonParser.Retreat_actionContext ctx) {
        estado.retirarActivoABanca(ctx.ID().getText(), ctx.pokemon_card().getText());
    }

    @Override
    public void enterPokemon_status(PokemonParser.Pokemon_statusContext ctx) {
        String pokemon = ctx.pokemon_card().getText();
        String duenio = buscarDueno(id(ctx.ID()), pokemon, false);
        if (duenio != null) {
            estado.promoverActivo(duenio, pokemon);
        }
    }

    //Al coger una prize card, se recoge el numero de prize cards cogidas por el jugador especifico
    @Override
    public void enterTake_prize_action(PokemonParser.Take_prize_actionContext ctx) {
        String jugador = ctx.ID().getText();
        int n = (ctx.number() != null) ? valor(ctx.number()) : 1;
        for (int i = 0; i < n; i++) {
            estado.cogerPremio(jugador);
        }
    }

    //Se guarda tambien las acciones de KO, por jugador (uno para el atacante a favor, y uno para el defensor en contra)
    @Override
    public void enterKnockout_action(PokemonParser.Knockout_actionContext ctx) {
        String pokemon = ctx.pokemon_card().getText();
        String duenio = buscarDueno(id(ctx.ID()), pokemon, true);
        if (duenio == null) return;

        estado.pokemonNoqueado(duenio, pokemon);
        String atacante = estado.getRival(duenio);
        if (atacante != null) {
            estado.registroKO(atacante);
        }
    }

    @Override
    public void enterCard_added_to_hand(PokemonParser.Card_added_to_handContext ctx) {
        String jugador = ctx.ID().getText();
        if (ctx.card_name() != null) {
            estado.robarCartaConocida(jugador, ctx.card_name().getText());
        } else {
            estado.robarCartaDesconocida(jugador);
        }
    }

    //Efectos: robar cartas sin linea bullet
    @Override
    public void enterDrawn_cards_effect(PokemonParser.Drawn_cards_effectContext ctx) {
        if (ultimoJugadorRobo != null) {
            abrirModo(ModoBullet.ROBO, ultimoJugadorRobo);
        }
    }

    //como ahora hay una sola regla de draw cards, de aqui sacamos toda la funcionalidad
    @Override
    public void enterDraw_action(PokemonParser.Draw_actionContext ctx) {
        String jugador = ctx.ID().getText();
        //Dependiendo del draw object se roban una, varias, conocidas o no
        PokemonParser.Draw_objectContext o = ctx.draw_object();


        if (ctx.PLAYED() != null) {               // roba y juega directamente
            boolean banca = ctx.BENCH() != null;
            //si conocemos el numero de cartas, pero no su nombre
            if (o.number() != null) {
                abrirModo(banca ? ModoBullet.A_BANCA : ModoBullet.A_ACTIVO, jugador);
            } else if (o.card_name() != null) { //si se conoce el nombre de la carta, se añade al bench o al active
                String carta = o.card_name().getText();
                if (banca) estado.añadirBanquillo(jugador, carta);
                else estado.setPokemonActivo(jugador, carta);
            }
        //los mismos casos pero sin que se jueguen las cartas
        } else if (o.number() != null) {
            robarDesconocidas(jugador, valor(o.number()));
        } else if (o.card_name() != null) {
            estado.robarCartaConocida(jugador, o.card_name().getText());
        } else {                                   // A CARD -> no hay numero, pero se sabe q solo es una
            estado.robarCartaDesconocida(jugador);
        }
    }

    //para la regla de descartarse cartas
    @Override
    public void enterDiscard_effect(PokemonParser.Discard_effectContext ctx) {
        String jugador = ctx.ID().getText();
        //si se sabe el numero -> se sabe el nombre porque no se conocen las cartas que se descarta el oponente
        if (ctx.number() != null) {
            abrirModo(ModoBullet.DESCARTE, jugador);
            descartesPendientes = valor(ctx.number());
        } else {    //si no se saben los numeros (o es una sola carta)
            estado.quitarCartaMano(jugador, ctx.card_name().getText(), true);
        }
    }

    // Cada contador de daño son 10 puntos de daño.
    @Override
    public void enterPut_damage_counters_effect(PokemonParser.Put_damage_counters_effectContext ctx) {
        estado.añadirDaño(ctx.ID(0).getText(), valor(ctx.number()) * 10);
    }

    // pokemon_card(0) = el que pasa a ser el Pokemon Activo.
    @Override
    public void enterSwitch_active_pokemon_effect(PokemonParser.Switch_active_pokemon_effectContext ctx) {
        estado.promoverActivo(ctx.ID(0).getText(), ctx.pokemon_card(0).getText());
    }

    // ID(0) = quien recibe las cartas en la mano.
    @Override
    public void enterMove_card_to_hand_effect(PokemonParser.Move_card_to_hand_effectContext ctx) {
        String jugador = ctx.ID(0).getText();
        if (ctx.number() != null) {
            robarDesconocidas(jugador, valor(ctx.number()));
        } else if (ctx.card_name() != null) {
            estado.robarCartaConocida(jugador, ctx.card_name().getText());
        }
    }
}