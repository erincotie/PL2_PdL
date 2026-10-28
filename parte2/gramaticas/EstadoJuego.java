import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class EstadoJuego {
    // Información de la partida
    private String jugadorActivo;
    private String ganador;
    private int turnos;
    private List<String> jugadores; // nombres de los dos jugadores

    private Map<String, String> pokemonActivo; // Pokémon activo de cada jugador
    private Map<String, List<String>> banca; // Pokémon en la banca de cada jugador

    private Map<String, Map<String, Integer>> mano; // cartas conocidas de cada jugador y número de copias
    private Map<String, Integer> cartasDesconocidas;

    private Map<String, Integer> premiosRestantes;

    private Map<String, Integer> kos; // KOs hechos por cada jugador
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

    // Registra un jugador si aún no está
    public void añadirJugador(String nombre)
    {
        if(!jugadores.contains(nombre))
        {
            jugadores.add(nombre);
        }
    }

    // Copia de la lista de jugadores
    public List<String> getJugadores()
    {
        return new ArrayList<>(jugadores);
    }

    // Jugador que tiene el turno actual
    public String getJugadorActivo()
    {
        return jugadorActivo;
    }

    // El otro jugador de la partida, o null si aún no se conoce
    public String getRival(String nomJugador)
    {
        for (String j : jugadores)
        {
            if (!j.equals(nomJugador))
            {
                return j;
            }
        }
        return null;
    }

    // Inicio de turno
    public void inicioTurno(String nomJugador)
    {
        añadirJugador(nomJugador);
        jugadorActivo = nomJugador;
        turnos++;
    }

    // POKÉMON ACTIVO Y BANCA
    // Fija el Pokémon activo de un jugador
    public void setPokemonActivo(String nomJugador, String pokemon)
    {
        añadirJugador(nomJugador);
        pokemonActivo.put(nomJugador, pokemon);
    }

    // Añade un Pokémon a la banca
    public void añadirBanquillo(String nomJugador, String pokemon)
    {
        añadirJugador(nomJugador);
        if(!banca.containsKey(nomJugador))
        {
            banca.put(nomJugador, new ArrayList<>());
        }
        banca.get(nomJugador).add(pokemon);

    }

    // Pokémon activo de un jugador
    public String getPokemonActivo(String nomJugador)
    {
        return pokemonActivo.get(nomJugador);
    }

    // Copia de la banca de un jugador
    public List<String> getBanquillo(String nomJugador)
    {
        if (!banca.containsKey(nomJugador))
        {
            return new ArrayList<>();
        }
        return new ArrayList<>(banca.get(nomJugador));
    }

    // Retirada: el activo pasa a la banca y el puesto queda vacío
    // hasta la línea "X is now in the Active Spot."
    public void retirarActivoABanca(String nomJugador, String pokemon)
    {
        if (pokemon.equals(pokemonActivo.get(nomJugador)))
        {
            pokemonActivo.remove(nomJugador);
            añadirBanquillo(nomJugador, pokemon);
        }
    }

    // Un Pokémon de la banca pasa a ser el activo; si había otro, vuelve a la banca
    public void promoverActivo(String nomJugador, String pokemon)
    {
        añadirJugador(nomJugador);
        String actual = pokemonActivo.get(nomJugador);
        if (pokemon.equals(actual))
        {
            return;
        }
        if (banca.containsKey(nomJugador))
        {
            banca.get(nomJugador).remove(pokemon);
        }
        if (actual != null)
        {
            añadirBanquillo(nomJugador, actual);
        }
        pokemonActivo.put(nomJugador, pokemon);
    }

    // Evolución: sustituye el nombre en el puesto activo o en la banca
    public void evolucionar(String nomJugador, String desde, String hacia)
    {
        if (desde.equals(pokemonActivo.get(nomJugador)))
        {
            pokemonActivo.put(nomJugador, hacia);
            return;
        }
        List<String> b = banca.get(nomJugador);
        if (b != null)
        {
            int i = b.indexOf(desde);
            if (i >= 0)
            {
                b.set(i, hacia);
            }
        }
    }

    // KO: el Pokémon sale del campo
    public void pokemonNoqueado(String nomJugador, String pokemon)
    {
        if (pokemon.equals(pokemonActivo.get(nomJugador)))
        {
            pokemonActivo.remove(nomJugador);
        }
        else if (banca.containsKey(nomJugador))
        {
            banca.get(nomJugador).remove(pokemon);
        }
    }

    // MANO
    // Inicializa la mano de un jugador
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

    // Añade una carta conocida a la mano
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

    // Añade una carta desconocida a la mano
    public void robarCartaDesconocida(String nomJugador)
    {
        prepararMano(nomJugador);
        cartasDesconocidas.put(nomJugador, cartasDesconocidas.get(nomJugador) + 1);
    }

    // Una carta desconocida pasa a conocida (lista de cartas tras un robo)
    public void revelarCartaRobada(String nomJugador, String carta)
    {
        prepararMano(nomJugador);
        int desconocidas = cartasDesconocidas.get(nomJugador);
        if (desconocidas > 0)
        {
            cartasDesconocidas.put(nomJugador, desconocidas - 1);
        }
        robarCartaConocida(nomJugador, carta);
    }

    // Quita una carta de la mano al jugarla, adjuntarla o descartarla.
    // Si no está entre las conocidas y se permite, se descuenta una desconocida.
    public boolean quitarCartaMano(String nomJugador, String carta, boolean permitirDesconocida)
    {
        prepararMano(nomJugador);
        Map<String, Integer> m = mano.get(nomJugador);

        Integer n = m.get(carta);
        if (n != null)
        {
            if (n > 1)
            {
                m.put(carta, n - 1);
            }
            else
            {
                m.remove(carta);
            }
            return true;
        }

        if (permitirDesconocida && cartasDesconocidas.get(nomJugador) > 0)
        {
            cartasDesconocidas.put(nomJugador, cartasDesconocidas.get(nomJugador) - 1);
            return true;
        }
        return false;
    }

    // Quita varias cartas desconocidas (descartes del rival sin detallar)
    public void quitarCartasDesconocidas(String nomJugador, int n)
    {
        prepararMano(nomJugador);
        cartasDesconocidas.put(nomJugador, Math.max(0, cartasDesconocidas.get(nomJugador) - n));
    }

    // Cartas conocidas de un jugador
    public Map<String, Integer> getMano(String nomJugador)
    {
        prepararMano(nomJugador);
        return new HashMap<>(mano.get(nomJugador));
    }

    // Número de cartas desconocidas de un jugador
    public int getCartasDesconocidas(String nomJugador)
    {
        prepararMano(nomJugador);
        return cartasDesconocidas.get(nomJugador);
    }

    // PREMIOS
    // Premios que le quedan por coger a un jugador
    public int getPremiosRestantes(String nomJugador)
    {
        añadirJugador(nomJugador);
        if(!premiosRestantes.containsKey(nomJugador))
        {
            premiosRestantes.put(nomJugador, 6);
        }
        return premiosRestantes.get(nomJugador);
    }

    // Fija el número de premios restantes
    public void setPremiosRestantes(String nomJugador, int premios)
    {
        añadirJugador(nomJugador);
        premiosRestantes.put(nomJugador, Math.max(0, premios));
    }

    // El jugador coge un premio
    public void cogerPremio(String nomJugador)
    {
        int premios = getPremiosRestantes(nomJugador);
        if (premios > 0)
        {
            premiosRestantes.put(nomJugador, premios - 1);
        }
    }

    // KOs Y DAÑO
    // Suma un KO al jugador
    public void registroKO(String nomJugador)
    {
        añadirJugador(nomJugador);
        if(!kos.containsKey(nomJugador))
        {
            kos.put(nomJugador, 0);
        }
        kos.put(nomJugador, kos.get(nomJugador) + 1);
    }

    // KOs de un jugador
    public int getKO(String nomJugador)
    {
        if(!kos.containsKey(nomJugador))
        {
            return 0;
        }
        return kos.get(nomJugador);
    }
    
    // Suma daño infligido por un jugador
    public void añadirDaño(String nomJugador, int daño)
    {
        añadirJugador(nomJugador);
        if(!dañoTotal.containsKey(nomJugador))
        {
            dañoTotal.put(nomJugador, 0);
        }

        if(daño > 0)
        {
            dañoTotal.put(nomJugador, dañoTotal.get(nomJugador) + daño);
        }
    }

    // Daño total infligido por un jugador
    public int getDañoTotal(String nomJugador)
    {
        if(!dañoTotal.containsKey(nomJugador))
        {
            return 0;
        }
        return dañoTotal.get(nomJugador);
    }
    

    // Ganador de la partida
    public void winner(String nomJugador)
    {
        ganador = nomJugador;
    }

    // Número de turnos
    public int getTurnos()
    {
        return turnos;
    }

    // RESUMEN DE LA PARTIDA
    public void imprimirResumen()
    {
        System.out.println("RESUMEN DE LA PARTIDA");
        for (String jugador : jugadores) {
            System.out.println("Jugador: " + jugador);
            String activo = getPokemonActivo(jugador);
            System.out.println("Pokemon activo: " + (activo == null ? "ninguno" : activo));
            System.out.println("Banquillo: " + getBanquillo(jugador));
            System.out.println("Cartas conocidas: " + getMano(jugador));
            System.out.println("Cartas desconocidas: " + getCartasDesconocidas(jugador));
            System.out.println("KOs realizados: " + getKO(jugador));
            System.out.println("Daño infligido total: " + getDañoTotal(jugador));
            System.out.println("Premios restantes (por coger): " + getPremiosRestantes(jugador));
        }

        System.out.println("Turnos totales: " + turnos);
        System.out.println("Ganador de la partida: " + ganador);
    }
}