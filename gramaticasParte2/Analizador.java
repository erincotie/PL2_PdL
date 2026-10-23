import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Analizador{
    
    //Metodo de entrada

    public static void main(String[] args) throws Exception{
        //Inicializamos la entrada de datos
        String inputFile = null;
        if(args.length>0) inputFile = args[0];

        // Uso de CharStreams ANTLRInputStream, que sale en los videos esta deprecado
        CharStream input;
        if (inputFile != null) {
            input = CharStreams.fromFileName(inputFile);
        } else {
            input = CharStreams.fromStream(System.in);
        }

        //Conectar con el lexer
        PokemonLexer lexer = new PokemonLexer(input);

        //Iniciar un canal de tokens entre el lexer y parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PokemonParser parser = new PokemonParser(tokens);

        //Se genera el arbol sintactico a partir del lexer, parser y el fichero de input
        ParseTree tree = parser.program();

        //Para recorrer un arbol utilizaremos un listener, con lo que primero necesitamos inicializar un recorredor (walker)
        // luego inicializar un escuchador (listener) y decirle que recorra el arbol
        ParseTreeWalker walker = new ParseTreeWalker();

        //PokemonParserListener listener = new PokemonParserListener();

        //walker.walk(listener, tree);

    }
}