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
        System.out.println("Jugadores: " + jugadores);
        System.out.println("Turno: " + turnos);
        System.out.println("Ganador de la partida: " + ganador);
    }
}
