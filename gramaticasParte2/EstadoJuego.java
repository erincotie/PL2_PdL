import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class EstadoJuego {
    //Informacion de la partida
    private String jugadorActivo;
    private String ganador;
    private int turnos;
    private List<String> jugadores; //guardamos el id de ambos jugadores de la partida

    private Map<String, String> pokemonActivo; //indica el pokemon que está activo para ese jugador
    private Map<String, List<String>> banca; //indica los pokemons de reserva del jugador

    private Map<String, Map<String, Integer>> mano; //guarda el jugador con sus cartas y las unidades de cada una pq en el tutorial sale que puedes tener varias cartas de energía p.ej
    private Map<String, Integer> cartasDesconocidas;

    private Map<String, Integer> premiosRestantes;

    private Map<String, Integer> kos; //los kos que ha hecho cada jugador
    private Map<String, Integer> dañoTotal; 

    public EstadoJuego()
    {
        jugadorActivo = null;
        ganador = null;
        turnos = 0;
        jugadores = new ArrayList<>();
        pokemonActivo = new HashMap<>();
        banca = new HashMap<>();
        mano = new HashMap<>();
        cartasDesconocidas = new HashMap<>();
        premiosRestantes = new HashMap<>();
        kos = new HashMap<>();
        dañoTotal = new HashMap<>();
    }

    //Añadir los jugadores a la lista
    public void añadirJugador(String nombre)
    {
        if(!jugadores.contains(nombre))
        {
            jugadores.add(nombre);
        }
    }

    //Inicio de turno
    public void inicioTurno(String nomJugador)
    {
        añadirJugador(nomJugador);
        jugadorActivo = nomJugador;
        turnos++;
    }

    //APARTADO DE POKEMON ACTIVO Y EN BANQUILLO
    //Añadimos el pokemon activo en ese momento al jugador correspondiente
    public void setPokemonActivo(String nomJugador, String pokemon)
    {
        añadirJugador(nomJugador);
        pokemonActivo.put(nomJugador, pokemon);
    }

    //Añadimos los pokemons al banquillo
    public void añadirBanquillo(String nomJugador, String pokemon)
    {
        añadirJugador(nomJugador);
        if(!banca.containsKey(nomJugador))
        {
            banca.put(nomJugador, new ArrayList<>());
        }
        banca.get(nomJugador).add(pokemon);

    }

    //Consulta de que pokemon está activo en ese momento
    public String getPokemonActivo(String nomJugador)
    {
        return pokemonActivo.get(nomJugador);
    }

    //Consulta de los pokemons en el banquillo
    public List<String> getBanquillo(String nomJugador)
    {
        if (!banca.containsKey(nomJugador))
        {
            return new ArrayList<>();
        }
        return new ArrayList<>(banca.get(nomJugador));
    }

    //APARTADO DE LAS CARTAS QUE TIENE CADA JUGADOR
    //Mano de un jugador al inicio
    private void prepararMano(String nomJugador)
    {
        añadirJugador(nomJugador);
        if (!mano.containsKey(nomJugador))
        {
            mano.put(nomJugador, new HashMap<>());
        }
        if(!cartasDesconocidas.containsKey(nomJugador))
        {
            cartasDesconocidas.put(nomJugador, 0);
        }
    }

    //Añadimos carta CONOCIDA a la mano
    public void robarCartaConocida(String nomJugador, String carta)
    {
        prepararMano(nomJugador);
        Map<String, Integer> m = mano.get(nomJugador);

        if(m.containsKey(carta))
        {
            m.put(carta, m.get(carta) + 1);
        }
        else
        {
            m.put(carta, 1);
        }
    }

    //Añadimos carta DESCONOCIDA a la mano
    public void robarCartaDesconocida(String nomJugador)
    {
        prepararMano(nomJugador);
        cartasDesconocidas.put(nomJugador, cartasDesconocidas.get(nomJugador) + 1);
    }

    //Consulta de cartas conocidas
    public Map<String, Integer> getMano(String nomJugador)
    {
        prepararMano(nomJugador);
        return new HashMap<>(mano.get(nomJugador));
    }

    //Consultar cartas desconocidas
    public int getCartasDesconocidas(String nomJugador)
    {
        prepararMano(nomJugador);
        return cartasDesconocidas.get(nomJugador);
    }

    //APARTADO DE PREMIOS -> los de cada jugador
    //Consulta los que quedan
    public int getPremiosRestantes(String nomJugador)
    {
        añadirJugador(nomJugador);
        if(!premiosRestantes.containsKey(nomJugador))
        {
            premiosRestantes.put(nomJugador, 6);
        }
        return premiosRestantes.get(nomJugador);
    }

    //Establecemos el número que hay de premios en ese momento
    public void setPremiosRestantes(String nomJugador, int premios)
    {
        añadirJugador(nomJugador);
        premiosRestantes.put(nomJugador, Math.max(0, premios));
    }

    //Cuando el jugador coge el premio por KO
    public void cogerPremio(String nomJugador)
    {
        int premios = getPremiosRestantes(nomJugador);
        if (premios > 0)
        {
            premiosRestantes.put(nomJugador, premios - 1);
        }
    }

    //APARTADO DE KO Y DAÑO
    //Registro del ko
    public void registroKO(String nomJugador)
    {
        añadirJugador(nomJugador);
        if(!kos.containsKey(nomJugador))
        {
            kos.put(nomJugador, 0); //inicializamos si no ha hecho
        }
        kos.put(nomJugador, kos.get(nomJugador) + 1); //añadimos cuando haya hecho alguno
    }

    //Consulta de los ko
    public int getKO(String nomJugador)
    {
        if(!kos.containsKey(nomJugador))
        {
            return 0; //el jugador no hizo ninguno 
        }
        return kos.get(nomJugador);
    }
    
    //Suma del daño de los ataques
    public void añadirDaño(String nomJugador, int daño)
    {
        añadirJugador(nomJugador);
        if(!dañoTotal.containsKey(nomJugador))
        {
            dañoTotal.put(nomJugador, 0);
        }

        if(daño > 0)
        {
            dañoTotal.put(nomJugador, dañoTotal.get(nomJugador) + daño); //registramos el daño q hizo
        }
    }

    //Consulta del daño total
    public int getDañoTotal(String nomJugador)
    {
        if(!dañoTotal.containsKey(nomJugador))
        {
            return 0;
        }
        return dañoTotal.get(nomJugador);
    }
    

    //Ganador de la partida
    public void winner(String nomJugador)
    {
        ganador = nomJugador;
    }

    //Número de turnos 
    public int getTurnos()
    {
        return turnos;
    }

    //RESUMEN DEL ESTADO DEL JUEGO
    public void imprimirResumen()
    {
        System.out.println("RESUMEN DE LA PARTIDA");
        for (String jugador : jugadores) {
            System.out.println("Jugador activo: " + jugador);
            System.out.println("Pokemon activo: " + getPokemonActivo(jugador));
            System.out.println("Banquillo: " + getBanquillo(jugador));
            System.out.println("Cartas conocidas: " + getMano(jugador));
            System.out.println("Cartas desconocidas: " + getCartasDesconocidas(jugador));
            System.out.println("KOs realizados: " + getKO(jugador));
            System.out.println("Daño infligido total: " + getDañoTotal(jugador));
            System.out.println("Premios: "+ getPremiosRestantes(jugador));
            System.out.println("Premios restantes (por coger): " + getPremiosRestantes(jugador));
        }

        System.out.println("Turnos totales: " + turnos);
        System.out.println("Ganador de la partida: " + ganador);
    }
}
