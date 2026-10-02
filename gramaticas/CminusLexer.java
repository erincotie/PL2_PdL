// Generated from CminusLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CminusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, IF=2, INT=3, RETURN=4, VOID=5, WHILE=6, INPUT=7, OUTPUT=8, ID=9, 
		NUM=10, SUMA=11, RESTA=12, MULT=13, DIV=14, MENORIGUAL=15, MENOR=16, MAYORIGUAL=17, 
		MAYOR=18, IGUALDAD=19, NOIGUAL=20, ASIG=21, PUNTOCOMA=22, COMA=23, PARENTESIS_ABRIR=24, 
		PARENTESIS_CERRAR=25, CORCH_ABRIR=26, CORCH_CERRAR=27, LLAVES_ABRIR=28, 
		LLAVES_CERRAR=29, COMENTARIOABRIR=30, COMENTARIOCERRAR=31, TEXTOCOMENTARIO=32, 
		WS=33;
	public static final int
		COMENTARIO_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ELSE", "IF", "INT", "RETURN", "VOID", "WHILE", "INPUT", "OUTPUT", "LETRA", 
			"DIGITO", "ID", "NUM", "SUMA", "RESTA", "MULT", "DIV", "MENORIGUAL", 
			"MENOR", "MAYORIGUAL", "MAYOR", "IGUALDAD", "NOIGUAL", "ASIG", "PUNTOCOMA", 
			"COMA", "PARENTESIS_ABRIR", "PARENTESIS_CERRAR", "CORCH_ABRIR", "CORCH_CERRAR", 
			"LLAVES_ABRIR", "LLAVES_CERRAR", "COMENTARIOABRIR", "COMENTARIOCERRAR", 
			"TEXTOCOMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'if'", "'int'", "'return'", "'void'", "'while'", "'input'", 
			"'output'", null, null, "'+'", "'-'", "'*'", "'/'", "'<='", "'<'", "'>='", 
			"'>'", "'=='", "'!='", "'='", "';'", "','", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'/*'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ELSE", "IF", "INT", "RETURN", "VOID", "WHILE", "INPUT", "OUTPUT", 
			"ID", "NUM", "SUMA", "RESTA", "MULT", "DIV", "MENORIGUAL", "MENOR", "MAYORIGUAL", 
			"MAYOR", "IGUALDAD", "NOIGUAL", "ASIG", "PUNTOCOMA", "COMA", "PARENTESIS_ABRIR", 
			"PARENTESIS_CERRAR", "CORCH_ABRIR", "CORCH_CERRAR", "LLAVES_ABRIR", "LLAVES_CERRAR", 
			"COMENTARIOABRIR", "COMENTARIOCERRAR", "TEXTOCOMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CminusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CminusLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000!\u00c4\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002"+
		"\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002"+
		"\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002"+
		"\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002"+
		" \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0081\b\u000b\n\u000b\f\u000b\u0084\t\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001\"\u0004\"\u00bf\b\"\u000b\"\f\"\u00c0"+
		"\u0001\"\u0001\"\u0000\u0000#\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004"+
		"\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\u0000\u0014\u0000\u0016\t\u0018"+
		"\n\u001a\u000b\u001c\f\u001e\r \u000e\"\u000f$\u0010&\u0011(\u0012*\u0013"+
		",\u0014.\u00150\u00162\u00174\u00186\u00198\u001a:\u001b<\u001c>\u001d"+
		"@\u001eB\u001fD F!\u0002\u0000\u0001\u0003\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u00c3\u0000\u0002\u0001\u0000\u0000\u0000\u0000"+
		"\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000"+
		"\b\u0001\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001"+
		"\u0000\u0000\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001"+
		"\u0000\u0000\u0000\u0000\u0016\u0001\u0000\u0000\u0000\u0000\u0018\u0001"+
		"\u0000\u0000\u0000\u0000\u001a\u0001\u0000\u0000\u0000\u0000\u001c\u0001"+
		"\u0000\u0000\u0000\u0000\u001e\u0001\u0000\u0000\u0000\u0000 \u0001\u0000"+
		"\u0000\u0000\u0000\"\u0001\u0000\u0000\u0000\u0000$\u0001\u0000\u0000"+
		"\u0000\u0000&\u0001\u0000\u0000\u0000\u0000(\u0001\u0000\u0000\u0000\u0000"+
		"*\u0001\u0000\u0000\u0000\u0000,\u0001\u0000\u0000\u0000\u0000.\u0001"+
		"\u0000\u0000\u0000\u00000\u0001\u0000\u0000\u0000\u00002\u0001\u0000\u0000"+
		"\u0000\u00004\u0001\u0000\u0000\u0000\u00006\u0001\u0000\u0000\u0000\u0000"+
		"8\u0001\u0000\u0000\u0000\u0000:\u0001\u0000\u0000\u0000\u0000<\u0001"+
		"\u0000\u0000\u0000\u0000>\u0001\u0000\u0000\u0000\u0000@\u0001\u0000\u0000"+
		"\u0000\u0000F\u0001\u0000\u0000\u0000\u0001B\u0001\u0000\u0000\u0000\u0001"+
		"D\u0001\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004M\u0001"+
		"\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000"+
		"\u0000\n[\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000ef\u0001"+
		"\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000"+
		"\u0000\u0014u\u0001\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018"+
		"~\u0001\u0000\u0000\u0000\u001a\u0085\u0001\u0000\u0000\u0000\u001c\u0087"+
		"\u0001\u0000\u0000\u0000\u001e\u0089\u0001\u0000\u0000\u0000 \u008b\u0001"+
		"\u0000\u0000\u0000\"\u008d\u0001\u0000\u0000\u0000$\u0090\u0001\u0000"+
		"\u0000\u0000&\u0092\u0001\u0000\u0000\u0000(\u0095\u0001\u0000\u0000\u0000"+
		"*\u0097\u0001\u0000\u0000\u0000,\u009a\u0001\u0000\u0000\u0000.\u009d"+
		"\u0001\u0000\u0000\u00000\u009f\u0001\u0000\u0000\u00002\u00a1\u0001\u0000"+
		"\u0000\u00004\u00a3\u0001\u0000\u0000\u00006\u00a5\u0001\u0000\u0000\u0000"+
		"8\u00a7\u0001\u0000\u0000\u0000:\u00a9\u0001\u0000\u0000\u0000<\u00ab"+
		"\u0001\u0000\u0000\u0000>\u00ad\u0001\u0000\u0000\u0000@\u00af\u0001\u0000"+
		"\u0000\u0000B\u00b4\u0001\u0000\u0000\u0000D\u00b9\u0001\u0000\u0000\u0000"+
		"F\u00be\u0001\u0000\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005l\u0000\u0000"+
		"JK\u0005s\u0000\u0000KL\u0005e\u0000\u0000L\u0003\u0001\u0000\u0000\u0000"+
		"MN\u0005i\u0000\u0000NO\u0005f\u0000\u0000O\u0005\u0001\u0000\u0000\u0000"+
		"PQ\u0005i\u0000\u0000QR\u0005n\u0000\u0000RS\u0005t\u0000\u0000S\u0007"+
		"\u0001\u0000\u0000\u0000TU\u0005r\u0000\u0000UV\u0005e\u0000\u0000VW\u0005"+
		"t\u0000\u0000WX\u0005u\u0000\u0000XY\u0005r\u0000\u0000YZ\u0005n\u0000"+
		"\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005v\u0000\u0000\\]\u0005o\u0000"+
		"\u0000]^\u0005i\u0000\u0000^_\u0005d\u0000\u0000_\u000b\u0001\u0000\u0000"+
		"\u0000`a\u0005w\u0000\u0000ab\u0005h\u0000\u0000bc\u0005i\u0000\u0000"+
		"cd\u0005l\u0000\u0000de\u0005e\u0000\u0000e\r\u0001\u0000\u0000\u0000"+
		"fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000hi\u0005p\u0000\u0000ij\u0005"+
		"u\u0000\u0000jk\u0005t\u0000\u0000k\u000f\u0001\u0000\u0000\u0000lm\u0005"+
		"o\u0000\u0000mn\u0005u\u0000\u0000no\u0005t\u0000\u0000op\u0005p\u0000"+
		"\u0000pq\u0005u\u0000\u0000qr\u0005t\u0000\u0000r\u0011\u0001\u0000\u0000"+
		"\u0000st\u0007\u0000\u0000\u0000t\u0013\u0001\u0000\u0000\u0000uv\u0007"+
		"\u0001\u0000\u0000v\u0015\u0001\u0000\u0000\u0000w{\u0003\u0012\b\u0000"+
		"xz\u0003\u0012\b\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0017\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0082\u0003\u0014\t\u0000\u007f"+
		"\u0081\u0003\u0014\t\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0019\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005+\u0000\u0000\u0086\u001b\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005-\u0000\u0000\u0088\u001d\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005*\u0000\u0000\u008a\u001f\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005/\u0000\u0000\u008c!\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005<\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f#\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005<\u0000\u0000\u0091%\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005>\u0000\u0000\u0093\u0094\u0005=\u0000\u0000\u0094"+
		"\'\u0001\u0000\u0000\u0000\u0095\u0096\u0005>\u0000\u0000\u0096)\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005=\u0000\u0000\u0098\u0099\u0005=\u0000"+
		"\u0000\u0099+\u0001\u0000\u0000\u0000\u009a\u009b\u0005!\u0000\u0000\u009b"+
		"\u009c\u0005=\u0000\u0000\u009c-\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"=\u0000\u0000\u009e/\u0001\u0000\u0000\u0000\u009f\u00a0\u0005;\u0000"+
		"\u0000\u00a01\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005,\u0000\u0000\u00a2"+
		"3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005(\u0000\u0000\u00a45\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005)\u0000\u0000\u00a67\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005[\u0000\u0000\u00a89\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005]\u0000\u0000\u00aa;\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"{\u0000\u0000\u00ac=\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005}\u0000"+
		"\u0000\u00ae?\u0001\u0000\u0000\u0000\u00af\u00b0\u0005/\u0000\u0000\u00b0"+
		"\u00b1\u0005*\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0006\u001f\u0000\u0000\u00b3A\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"*\u0000\u0000\u00b5\u00b6\u0005/\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0006 \u0001\u0000\u00b8C\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\t\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0006!\u0002\u0000\u00bcE\u0001\u0000\u0000\u0000\u00bd\u00bf\u0007\u0002"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006\"\u0002"+
		"\u0000\u00c3G\u0001\u0000\u0000\u0000\u0005\u0000\u0001{\u0082\u00c0\u0003"+
		"\u0005\u0001\u0000\u0004\u0000\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}