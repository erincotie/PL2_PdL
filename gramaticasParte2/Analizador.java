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

        InputStream is = System.in;
        if(inputFile != null) is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);

        //Conectar con el lexer
        PokemonLexer lexer = new PokemonLexer(input);

        //Iniciar un canal de tokens entre el lexer y parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PokemonParser parser = new PokemonParser(tokens);

        //Se genera el arbol sintactico a partir del lexer, parser y el fichero de input
        ParserTree tree = parser.fichero();

        //Para recorrer un arbol utilizaremos un listener, con lo que primero necesitamos inicializar un recorredor (walker)
        // luego inicializar un escuchador (listener) y decirle que recorra el arbol
        ParserTreeWalker walker = new ParserTreeWalker();

        PokemonParserListener listener = new PokemonParserListener();

        walker.walk(listener, tree);

    }
}