import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Analizador {

    // Uso: java Analizador <fichero_log>
    public static void main(String[] args) throws Exception {
        // Entrada: el fichero indicado o, si no se indica, la entrada estándar
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];

        CharStream input;
        if (inputFile != null) {
            input = CharStreams.fromFileName(inputFile);
        } else {
            input = CharStreams.fromStream(System.in);
        }

        // Lexer. Además del aviso por consola de ANTLR, se cuentan sus errores
        PokemonLexer lexer = new PokemonLexer(input);
        final int[] erroresLexicos = {0};
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object simbolo, int linea,
                                    int columna, String mensaje, RecognitionException e) {
                erroresLexicos[0]++;
            }
        });

        // Tokens del lexer al parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PokemonParser parser = new PokemonParser(tokens);

        // Árbol sintáctico
        ParseTree tree = parser.program();

        // Con errores el árbol puede estar incompleto, así que no se recorre con el listener
        if (erroresLexicos[0] > 0 || parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("La partida tiene errores lexicos o sintacticos: no se genera el resumen.");
            return;
        }

        // El listener recorre el árbol y va actualizando EstadoJuego
        JuegoListener listener = new JuegoListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        // Resumen final
        listener.getEstado().imprimirResumen();
    }
}