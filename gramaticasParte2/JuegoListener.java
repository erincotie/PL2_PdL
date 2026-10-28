import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JuegoListener extends PokemonParserBaseListener {

    private final EstadoJuego estado = new EstadoJuego();

    // Significado de una lista de cartas (• Carta A, Carta B); depende de la línea anterior
    private enum ModoBullet {
        NINGUNO,    // la lista se ignora
        ROBO,       // cartas robadas: pasan de desconocidas a conocidas
        DESCARTE,   // cartas descartadas de la mano
        MULLIGAN,   // mano revelada en un mulligan: vuelve al mazo
        A_BANCA,    // cartas robadas y jugadas a la banca
        A_ACTIVO    // carta robada y jugada al puesto activo
    }

    private ModoBullet modo = ModoBullet.NINGUNO;
    private String jugadorBullet = null;     // jugador al que pertenece la lista actual
    private int descartesPendientes = 0;     // "discarded N cards" aún sin detallar en la lista
    private String ultimoJugadorRobo = null; // "N drawn cards" no indica el jugador
    private String ultimoJugadorMulligan = null; // "Cards revealed from Mulligan N" no indica el jugador

    // Funciones auxiliares

    // Valor entero de una regla number
    private int valor(PokemonParser.NumberContext n) {
        if (n == null) return 0;
        // El 7 tiene su propio token (SEVEN)
        if (n.SEVEN() != null) return 7;
        return Integer.parseInt(n.NUM().getText());
    }

    // Texto de un ID, o null si la línea no lo incluye
    private String id(TerminalNode t) {
        return (t == null) ? null : t.getText();
    }

    // Prepara la interpretación de la próxima lista de cartas
    private void abrirModo(ModoBullet m, String jugador) {
        modo = m;
        jugadorBullet = jugador;
    }

    // Se llama con cada línea que no es una lista de cartas: la lista anterior termina
    private void cerrarModo() {
        // Si se descartaron N cartas sin detallarlas (mano oculta del rival), se quitan N desconocidas
        if (modo == ModoBullet.DESCARTE && descartesPendientes > 0 && jugadorBullet != null) {
            estado.quitarCartasDesconocidas(jugadorBullet, descartesPendientes);
        }
        modo = ModoBullet.NINGUNO;
        jugadorBullet = null;
        descartesPendientes = 0;
    }

    // Roba n cartas desconocidas; si después llega una lista, se revelan
    private void robarDesconocidas(String jugador, int n) {
        for (int i = 0; i < n; i++) {
            estado.robarCartaDesconocida(jugador);
        }
        ultimoJugadorRobo = jugador;
        abrirModo(ModoBullet.ROBO, jugador);
    }

    // Dueño de un Pokémon cuando la línea no incluye el jugador
    private String buscarDueno(String idExplicito, String pokemon, boolean preferirRival) {
        if (idExplicito != null) return idExplicito;

        List<String> candidatos = new ArrayList<>();
        for (String j : estado.getJugadores()) {
            // Candidatos: jugadores que tienen ese Pokémon en el puesto activo o en la banca
            if (pokemon.equals(estado.getPokemonActivo(j)) || estado.getBanquillo(j).contains(pokemon)) {
                candidatos.add(j);
            }
        }
        if (candidatos.size() == 1) return candidatos.get(0);

        // Si lo tienen los dos, se elige el jugador del turno actual, o su rival si preferirRival es true
        String actual = estado.getJugadorActivo();
        for (String j : candidatos) {
            boolean esActual = j.equals(actual);
            if (esActual != preferirRival) return j;
        }
        return actual;
    }

    // Evolución: cambia el Pokémon en el campo y la carta sale de la mano
    private void aplicarEvolucion(String jugador, String desde, String hacia) {
        estado.evolucionar(jugador, desde, hacia);
        estado.quitarCartaMano(jugador, hacia, true);
    }

    public EstadoJuego getEstado() {
        return estado;
    }

    // Una línea que no es lista de cartas cierra la lista anterior
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

    // Cada carta de la lista se interpreta según el modo abierto
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

    // Los jugadores se registran en las líneas del setup
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
        ultimoJugadorMulligan = ctx.ID().getText();
    }

    // Mano inicial: cartas desconocidas hasta que se revelen en una lista
    @Override
    public void enterDraw_cards_init(PokemonParser.Draw_cards_initContext ctx) {
        robarDesconocidas(ctx.ID().getText(), valor(ctx.number()));
    }

    @Override
    public void enterMulligan_reveal(PokemonParser.Mulligan_revealContext ctx) {
        // Las cartas reveladas son del jugador que acaba de hacer el mulligan
        abrirModo(ModoBullet.MULLIGAN, ultimoJugadorMulligan);
    }

    @Override
    public void enterMulligan_bonus(PokemonParser.Mulligan_bonusContext ctx) {
        // ID(0) = quien roba, ID(1) = quien hizo mulligan; number(0) = cartas extra
        robarDesconocidas(ctx.ID(0).getText(), valor(ctx.number(0)));
    }

    // Inicio de turno
    @Override
    public void enterTurn_header(PokemonParser.Turn_headerContext ctx) {
        cerrarModo();
        String jugador = ctx.ID().getText();
        estado.inicioTurno(jugador);
        System.out.println("Turno detectado: " + jugador);
    }

    // Fin de la partida
    @Override
    public void enterEnd(PokemonParser.EndContext ctx) {
        cerrarModo();
        String ganador = ctx.ID().getText();
        estado.winner(ganador);
        System.out.println("Ganador detectado: " + ganador);
    }

    // Jugar una carta: sale de la mano y, si es un Pokémon, va a la banca o al puesto activo
    @Override
    public void enterPlay_cards(PokemonParser.Play_cardsContext ctx) {
        String jugador = ctx.ID().getText();
        PokemonParser.Card_nameContext c = ctx.card_name();
        String carta = c.getText();

        estado.quitarCartaMano(jugador, carta, true);

        if (c.pokemon_card() != null) {
            if (ctx.BENCH() != null) {
                estado.añadirBanquillo(jugador, carta);
            } else if (ctx.ACTIVE() != null) {
                estado.setPokemonActivo(jugador, carta);
            }
        }
    }

    // Adjuntar una carta: sale de la mano
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

    // Ataque: "for N damage" ya es el daño final, con la debilidad o la resistencia aplicadas.
    // Por eso la línea "took N more/less damage because of..." no vuelve a modificar el daño.
    @Override
    public void enterUse_ability_or_attack(PokemonParser.Use_ability_or_attackContext ctx) {
        String atacante = ctx.ID(0).getText();
        if (ctx.number() != null) {
            estado.añadirDaño(atacante, valor(ctx.number()));
        }
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

    // Premios: uno, o N si la línea lo indica
    @Override
    public void enterTake_prize_action(PokemonParser.Take_prize_actionContext ctx) {
        String jugador = ctx.ID().getText();
        int n = (ctx.number() != null) ? valor(ctx.number()) : 1;
        for (int i = 0; i < n; i++) {
            estado.cogerPremio(jugador);
        }
    }

    // KO: el Pokémon sale del campo y el KO se cuenta para el rival de su dueño
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

    // "N drawn cards": la lista siguiente es del último jugador que robó
    @Override
    public void enterDrawn_cards_effect(PokemonParser.Drawn_cards_effectContext ctx) {
        if (ultimoJugadorRobo != null) {
            abrirModo(ModoBullet.ROBO, ultimoJugadorRobo);
        }
    }

    // Robo: una carta, N cartas o una carta concreta; a veces se juega en la misma línea
    @Override
    public void enterDraw_action(PokemonParser.Draw_actionContext ctx) {
        String jugador = ctx.ID().getText();
        PokemonParser.Draw_objectContext o = ctx.draw_object();


        if (ctx.PLAYED() != null) {               // roba y juega directamente
            boolean banca = ctx.BENCH() != null;
            // N cartas: los nombres llegan en la lista siguiente
            if (o.number() != null) {
                abrirModo(banca ? ModoBullet.A_BANCA : ModoBullet.A_ACTIVO, jugador);
            } else if (o.card_name() != null) {
                String carta = o.card_name().getText();
                if (banca) estado.añadirBanquillo(jugador, carta);
                else estado.setPokemonActivo(jugador, carta);
            }
        } else if (o.number() != null) {
            robarDesconocidas(jugador, valor(o.number()));
        } else if (o.card_name() != null) {
            estado.robarCartaConocida(jugador, o.card_name().getText());
        } else {                                   // "a card": una carta desconocida
            estado.robarCartaDesconocida(jugador);
        }
    }

    // Descarte: N cartas (detalladas en la lista siguiente) o una carta concreta
    @Override
    public void enterDiscard_effect(PokemonParser.Discard_effectContext ctx) {
        String jugador = ctx.ID().getText();
        if (ctx.number() != null) {
            abrirModo(ModoBullet.DESCARTE, jugador);
            descartesPendientes = valor(ctx.number());
        } else {
            estado.quitarCartaMano(jugador, ctx.card_name().getText(), true);
        }
    }

    // Contadores de daño: 10 puntos cada uno. Solo cuentan si se ponen en un Pokémon del rival
    @Override
    public void enterPut_damage_counters_effect(PokemonParser.Put_damage_counters_effectContext ctx) {
        // ID(0) = quien los pone, ID(1) = dueño del Pokémon
        String quien = ctx.ID(0).getText();
        String dueno = ctx.ID(1).getText();
        if (!quien.equals(dueno)) {
            estado.añadirDaño(quien, valor(ctx.number()) * 10);
        }
    }

    // pokemon_card(0) = el que pasa a ser el Pokémon activo
    @Override
    public void enterSwitch_active_pokemon_effect(PokemonParser.Switch_active_pokemon_effectContext ctx) {
        estado.promoverActivo(ctx.ID(0).getText(), ctx.pokemon_card(0).getText());
    }

    // ID(0) = quien recibe las cartas en la mano
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