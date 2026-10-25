import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Analizador {

    //Metodo de entrada
    public static void main(String[] args) throws Exception {
        //Inicializamos la entrada de datos
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];

        // Uso de CharStreams (ANTLRInputStream esta deprecado)
        CharStream input;
        if (inputFile != null) {
            input = CharStreams.fromFileName(inputFile);
        } else {
            input = CharStreams.fromStream(System.in);
        }

        //Conectar con el lexer
        PokemonLexer lexer = new PokemonLexer(input);

        //Canal de tokens entre el lexer y el parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PokemonParser parser = new PokemonParser(tokens);

        //Se genera el arbol sintactico
        ParseTree tree = parser.program();

        // Con errores sintacticos el arbol puede tener nodos incompletos,
        // asi que no se recorre con el listener.
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("La partida tiene errores sintacticos: no se genera el resumen.");
            return;
        }

        //Recorremos el arbol con el listener, que va rellenando EstadoJuego
        JuegoListener listener = new JuegoListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        //Resumen final del estado
        listener.getEstado().imprimirResumen();
    }
}