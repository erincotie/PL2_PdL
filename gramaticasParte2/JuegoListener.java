public class JuegoListener extends PokemonParserBaseListener {
    private final EstadoJuego estado = new EstadoJuego();
    // Se ejecuta al encontrar la cabecera de un turno.
    @Override
    public void enterTurn_header(PokemonParser.Turn_headerContext ctx) {
        String jugador = ctx.ID().getText();
        estado.inicioTurno(jugador);
        System.out.println("Turno detectado: " + jugador);
    }
    // Se ejecuta al encontrar el final de la partida.
    @Override
    public void enterEnd(PokemonParser.EndContext ctx) {
        String ganador = ctx.ID().getText();
        estado.winner(ganador);
        System.out.println("Ganador detectado: " + ganador);
    }
    public EstadoJuego getEstado() {
        return estado;
    }
}