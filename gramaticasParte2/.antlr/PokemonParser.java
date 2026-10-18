// Generated from c:/UNIVERSIDAD/tercero/semestre1/procLenguaje/lab/pl1Cod/PL1_parte1_PdL/gramaticasParte2/PokemonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PokemonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNTO=1, COMA=2, RAYA=3, PUNTO_RELLENO=4, DOS_PUNTOS=5, PARENTESIS_ABRIR=6, 
		PARENTESIS_CERRAR=7, EXCLAMACION=8, SETUP=9, TURN=10, TURN_MAYUS=11, CHOSE=12, 
		HEADS=13, TAILS=14, COIN=15, FLIP=16, WON=17, TOSS=18, DECIDED=19, GO=20, 
		FIRST=21, DREW=22, DRAWN=23, A=24, CARD=25, CARDS=26, FOR=27, THE=28, 
		OPENING=29, HAND=30, SEVEN=31, PLAYED=32, DISCARDED=33, TO=34, ACTIVE=35, 
		SPOT=36, BENCH=37, ATTACHED=38, ON=39, EVOLVED=40, USED=41, DAMAGE=42, 
		DAMAGE_MAYUS=43, BASE=44, ITEM=45, TOTAL=46, WAS=47, K_O=48, TOOK=49, 
		PRIZE=50, A_MAYUS=51, ADDED=52, SWITCH=53, SWITCHED=54, WITH=55, BECOME=56, 
		POKEMON=57, RETREATED=58, SHUFFLED=59, THEIR=60, DECK=61, MOVED=62, ENDED=63, 
		ALL=64, WERE=65, TAKEN=66, WINS=67, OPPONENT=68, CONCEDED=69, NUM=70, 
		ID=71, WS=72;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_coin_toss = 2, RULE_win_coin = 3, 
		RULE_turn_decision = 4, RULE_draw_cards_init = 5, RULE_descripcion_cartas = 6, 
		RULE_play_cards = 7, RULE_card_name = 8, RULE_end = 9, RULE_concede = 10, 
		RULE_prize_cards = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "coin_toss", "win_coin", "turn_decision", "draw_cards_init", 
			"descripcion_cartas", "play_cards", "card_name", "end", "concede", "prize_cards"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'-'", "'\\u2022'", "':'", "'('", "')'", "'!'", "'Setup'", 
			"'turn'", "'Turn'", "'chose'", "'heads'", "'tails'", "'coin'", "'flip'", 
			"'won'", "'toss'", "'decided'", "'go'", "'first'", "'drew'", "'drawn'", 
			"'a'", "'card'", "'cards'", "'for'", "'the'", "'opening'", "'hand'", 
			"'7'", "'played'", "'discarded'", "'to'", "'Active'", "'Spot'", "'Bench'", 
			"'attached'", "'on'", "'evolved'", "'used'", "'damage'", "'Damage'", 
			"'Base'", "'Item'", "'Total'", "'was'", "'Knocked Out !'", "'took'", 
			"'Prize'", "'A'", "'added'", "'Switch'", "'switched'", "'with'", "'become'", 
			"'Pokemon'", "'retreated'", "'shuffled'", "'their'", "'deck'", "'moved'", 
			"'ended'", "'All'", "'were'", "'taken'", "'wins'", "'opponent'", "'conceded'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUNTO", "COMA", "RAYA", "PUNTO_RELLENO", "DOS_PUNTOS", "PARENTESIS_ABRIR", 
			"PARENTESIS_CERRAR", "EXCLAMACION", "SETUP", "TURN", "TURN_MAYUS", "CHOSE", 
			"HEADS", "TAILS", "COIN", "FLIP", "WON", "TOSS", "DECIDED", "GO", "FIRST", 
			"DREW", "DRAWN", "A", "CARD", "CARDS", "FOR", "THE", "OPENING", "HAND", 
			"SEVEN", "PLAYED", "DISCARDED", "TO", "ACTIVE", "SPOT", "BENCH", "ATTACHED", 
			"ON", "EVOLVED", "USED", "DAMAGE", "DAMAGE_MAYUS", "BASE", "ITEM", "TOTAL", 
			"WAS", "K_O", "TOOK", "PRIZE", "A_MAYUS", "ADDED", "SWITCH", "SWITCHED", 
			"WITH", "BECOME", "POKEMON", "RETREATED", "SHUFFLED", "THEIR", "DECK", 
			"MOVED", "ENDED", "ALL", "WERE", "TAKEN", "WINS", "OPPONENT", "CONCEDED", 
			"NUM", "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "PokemonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PokemonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			setup();
			setState(25);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetupContext extends ParserRuleContext {
		public TerminalNode SETUP() { return getToken(PokemonParser.SETUP, 0); }
		public Coin_tossContext coin_toss() {
			return getRuleContext(Coin_tossContext.class,0);
		}
		public Turn_decisionContext turn_decision() {
			return getRuleContext(Turn_decisionContext.class,0);
		}
		public List<Draw_cards_initContext> draw_cards_init() {
			return getRuleContexts(Draw_cards_initContext.class);
		}
		public Draw_cards_initContext draw_cards_init(int i) {
			return getRuleContext(Draw_cards_initContext.class,i);
		}
		public List<Play_cardsContext> play_cards() {
			return getRuleContexts(Play_cardsContext.class);
		}
		public Play_cardsContext play_cards(int i) {
			return getRuleContext(Play_cardsContext.class,i);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(SETUP);
			setState(28);
			coin_toss();
			setState(29);
			turn_decision();
			setState(30);
			draw_cards_init();
			setState(31);
			draw_cards_init();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(32);
				play_cards();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Coin_tossContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode CHOSE() { return getToken(PokemonParser.CHOSE, 0); }
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(PokemonParser.OPENING, 0); }
		public TerminalNode COIN() { return getToken(PokemonParser.COIN, 0); }
		public TerminalNode FLIP() { return getToken(PokemonParser.FLIP, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Win_coinContext win_coin() {
			return getRuleContext(Win_coinContext.class,0);
		}
		public TerminalNode HEADS() { return getToken(PokemonParser.HEADS, 0); }
		public TerminalNode TAILS() { return getToken(PokemonParser.TAILS, 0); }
		public Coin_tossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coin_toss; }
	}

	public final Coin_tossContext coin_toss() throws RecognitionException {
		Coin_tossContext _localctx = new Coin_tossContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coin_toss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ID);
			setState(39);
			match(CHOSE);
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			match(FOR);
			setState(42);
			match(THE);
			setState(43);
			match(OPENING);
			setState(44);
			match(COIN);
			setState(45);
			match(FLIP);
			setState(46);
			match(PUNTO);
			setState(47);
			win_coin();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Win_coinContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode WON() { return getToken(PokemonParser.WON, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode COIN() { return getToken(PokemonParser.COIN, 0); }
		public TerminalNode TOSS() { return getToken(PokemonParser.TOSS, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Win_coinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_win_coin; }
	}

	public final Win_coinContext win_coin() throws RecognitionException {
		Win_coinContext _localctx = new Win_coinContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_win_coin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(WON);
			setState(51);
			match(THE);
			setState(52);
			match(COIN);
			setState(53);
			match(TOSS);
			setState(54);
			match(PUNTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Turn_decisionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DECIDED() { return getToken(PokemonParser.DECIDED, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode GO() { return getToken(PokemonParser.GO, 0); }
		public TerminalNode FIRST() { return getToken(PokemonParser.FIRST, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Turn_decisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_decision; }
	}

	public final Turn_decisionContext turn_decision() throws RecognitionException {
		Turn_decisionContext _localctx = new Turn_decisionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_turn_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(57);
			match(DECIDED);
			setState(58);
			match(TO);
			setState(59);
			match(GO);
			setState(60);
			match(FIRST);
			setState(61);
			match(PUNTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Draw_cards_initContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public List<TerminalNode> SEVEN() { return getTokens(PokemonParser.SEVEN); }
		public TerminalNode SEVEN(int i) {
			return getToken(PokemonParser.SEVEN, i);
		}
		public List<TerminalNode> CARDS() { return getTokens(PokemonParser.CARDS); }
		public TerminalNode CARDS(int i) {
			return getToken(PokemonParser.CARDS, i);
		}
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(PokemonParser.OPENING, 0); }
		public TerminalNode HAND() { return getToken(PokemonParser.HAND, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(PokemonParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(PokemonParser.PUNTO, i);
		}
		public TerminalNode RAYA() { return getToken(PokemonParser.RAYA, 0); }
		public TerminalNode DRAWN() { return getToken(PokemonParser.DRAWN, 0); }
		public Descripcion_cartasContext descripcion_cartas() {
			return getRuleContext(Descripcion_cartasContext.class,0);
		}
		public Draw_cards_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_cards_init; }
	}

	public final Draw_cards_initContext draw_cards_init() throws RecognitionException {
		Draw_cards_initContext _localctx = new Draw_cards_initContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_draw_cards_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(64);
			match(DREW);
			setState(65);
			match(SEVEN);
			setState(66);
			match(CARDS);
			setState(67);
			match(FOR);
			setState(68);
			match(THE);
			setState(69);
			match(OPENING);
			setState(70);
			match(HAND);
			setState(71);
			match(PUNTO);
			setState(72);
			match(RAYA);
			setState(73);
			match(SEVEN);
			setState(74);
			match(DRAWN);
			setState(75);
			match(CARDS);
			setState(76);
			match(PUNTO);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_RELLENO) {
				{
				setState(77);
				descripcion_cartas();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Descripcion_cartasContext extends ParserRuleContext {
		public TerminalNode PUNTO_RELLENO() { return getToken(PokemonParser.PUNTO_RELLENO, 0); }
		public Descripcion_cartasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion_cartas; }
	}

	public final Descripcion_cartasContext descripcion_cartas() throws RecognitionException {
		Descripcion_cartasContext _localctx = new Descripcion_cartasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_descripcion_cartas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PUNTO_RELLENO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Play_cardsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode PLAYED() { return getToken(PokemonParser.PLAYED, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Play_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play_cards; }
	}

	public final Play_cardsContext play_cards() throws RecognitionException {
		Play_cardsContext _localctx = new Play_cardsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_play_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(PLAYED);
			setState(84);
			card_name();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(85);
				match(TO);
				setState(86);
				match(THE);
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(87);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(88);
					match(ACTIVE);
					setState(89);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(94);
			match(PUNTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Card_nameContext extends ParserRuleContext {
		public Card_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_name; }
	}

	public final Card_nameContext card_name() throws RecognitionException {
		Card_nameContext _localctx = new Card_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_card_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode WINS() { return getToken(PokemonParser.WINS, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public ConcedeContext concede() {
			return getRuleContext(ConcedeContext.class,0);
		}
		public Prize_cardsContext prize_cards() {
			return getRuleContext(Prize_cardsContext.class,0);
		}
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPPONENT:
				{
				setState(98);
				concede();
				}
				break;
			case ALL:
				{
				setState(99);
				prize_cards();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			match(ID);
			setState(103);
			match(WINS);
			setState(104);
			match(PUNTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConcedeContext extends ParserRuleContext {
		public TerminalNode OPPONENT() { return getToken(PokemonParser.OPPONENT, 0); }
		public TerminalNode CONCEDED() { return getToken(PokemonParser.CONCEDED, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public ConcedeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concede; }
	}

	public final ConcedeContext concede() throws RecognitionException {
		ConcedeContext _localctx = new ConcedeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_concede);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(OPPONENT);
			setState(107);
			match(CONCEDED);
			setState(108);
			match(PUNTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prize_cardsContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PokemonParser.ALL, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonParser.PRIZE, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode TAKEN() { return getToken(PokemonParser.TAKEN, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Prize_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prize_cards; }
	}

	public final Prize_cardsContext prize_cards() throws RecognitionException {
		Prize_cardsContext _localctx = new Prize_cardsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prize_cards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ALL);
			setState(111);
			match(PRIZE);
			setState(112);
			match(CARDS);
			setState(113);
			match(TAKEN);
			setState(114);
			match(PUNTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001Hu\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001%\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007[\b\u0007"+
		"\u0003\u0007]\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0003\te\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000\r\u000em\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b8\u0001\u0000"+
		"\u0000\u0000\n?\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000e"+
		"R\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012d\u0001"+
		"\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016n\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0003\u0012\t\u0000"+
		"\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0005\t\u0000\u0000\u001c"+
		"\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0003\b\u0004\u0000\u001e\u001f"+
		"\u0003\n\u0005\u0000\u001f#\u0003\n\u0005\u0000 \"\u0003\u000e\u0007\u0000"+
		"! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000&\'\u0005G\u0000\u0000\'(\u0005\f\u0000\u0000()\u0007"+
		"\u0000\u0000\u0000)*\u0005\u001b\u0000\u0000*+\u0005\u001c\u0000\u0000"+
		"+,\u0005\u001d\u0000\u0000,-\u0005\u000f\u0000\u0000-.\u0005\u0010\u0000"+
		"\u0000./\u0005\u0001\u0000\u0000/0\u0003\u0006\u0003\u00000\u0005\u0001"+
		"\u0000\u0000\u000012\u0005G\u0000\u000023\u0005\u0011\u0000\u000034\u0005"+
		"\u001c\u0000\u000045\u0005\u000f\u0000\u000056\u0005\u0012\u0000\u0000"+
		"67\u0005\u0001\u0000\u00007\u0007\u0001\u0000\u0000\u000089\u0005G\u0000"+
		"\u00009:\u0005\u0013\u0000\u0000:;\u0005\"\u0000\u0000;<\u0005\u0014\u0000"+
		"\u0000<=\u0005\u0015\u0000\u0000=>\u0005\u0001\u0000\u0000>\t\u0001\u0000"+
		"\u0000\u0000?@\u0005G\u0000\u0000@A\u0005\u0016\u0000\u0000AB\u0005\u001f"+
		"\u0000\u0000BC\u0005\u001a\u0000\u0000CD\u0005\u001b\u0000\u0000DE\u0005"+
		"\u001c\u0000\u0000EF\u0005\u001d\u0000\u0000FG\u0005\u001e\u0000\u0000"+
		"GH\u0005\u0001\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u001f\u0000"+
		"\u0000JK\u0005\u0017\u0000\u0000KL\u0005\u001a\u0000\u0000LN\u0005\u0001"+
		"\u0000\u0000MO\u0003\f\u0006\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u0005\u0004\u0000\u0000"+
		"Q\r\u0001\u0000\u0000\u0000RS\u0005G\u0000\u0000ST\u0005 \u0000\u0000"+
		"T\\\u0003\u0010\b\u0000UV\u0005\"\u0000\u0000VZ\u0005\u001c\u0000\u0000"+
		"W[\u0005%\u0000\u0000XY\u0005#\u0000\u0000Y[\u0005$\u0000\u0000ZW\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\U\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0001\u0000\u0000_\u000f\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\u0011\u0001\u0000\u0000\u0000be\u0003\u0014\n\u0000"+
		"ce\u0003\u0016\u000b\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fg\u0005G\u0000\u0000gh\u0005C\u0000\u0000"+
		"hi\u0005\u0001\u0000\u0000i\u0013\u0001\u0000\u0000\u0000jk\u0005D\u0000"+
		"\u0000kl\u0005E\u0000\u0000lm\u0005\u0001\u0000\u0000m\u0015\u0001\u0000"+
		"\u0000\u0000no\u0005@\u0000\u0000op\u00052\u0000\u0000pq\u0005\u001a\u0000"+
		"\u0000qr\u0005B\u0000\u0000rs\u0005\u0001\u0000\u0000s\u0017\u0001\u0000"+
		"\u0000\u0000\u0005#NZ\\d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}