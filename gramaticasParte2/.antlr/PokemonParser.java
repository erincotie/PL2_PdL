// Generated from c:/UNIVERSIDAD/tercero/semestre1/procLenguaje/lab/pl1Cod/PL1_parte1_PdL/gramaticasParte2/PokemonParser.g4 by ANTLR 4.13.1
// Generated from c:/Users/michu/Documents/GitHub/PL1_parte1_PdL/gramaticasParte2/PokemonParser.g4 by ANTLR 4.13.1
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
		PARENTESIS_CERRAR=7, EXCLAMACION=8, APOS_S=9, SETUP=10, TURN=11, TURN_MAYUS=12, 
		CHOSE=13, HEADS=14, TAILS=15, COIN=16, FLIP=17, WON=18, TOSS=19, DECIDED=20, 
		GO=21, FIRST=22, DREW=23, DRAWN=24, A=25, CARD=26, CARDS=27, FOR=28, THE=29, 
		OPENING=30, HAND=31, SEVEN=32, PLAYED=33, DISCARDED=34, TO=35, ACTIVE=36, 
		SPOT=37, BENCH=38, IN=39, ATTACHED=40, ON=41, EVOLVED=42, USED=43, DAMAGE=44, 
		DAMAGE_MAYUS=45, BASE=46, ITEM=47, TOTAL=48, WAS=49, K_O=50, TOOK=51, 
		PRIZE=52, A_MAYUS=53, ADDED=54, SWITCHED=55, WITH=56, BECOME=57, POKEMON=58, 
		RETREATED=59, SHUFFLED=60, THEIR=61, DECK=62, MOVED=63, ENDED=64, ALL=65, 
		WERE=66, TAKEN=67, WINS=68, OPPONENT=69, CONCEDED=70, CARTA=71, NUM=72, 
		ID=73, WS=74;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_coin_toss = 2, RULE_win_coin = 3, 
		RULE_turn_decision = 4, RULE_draw_cards_init = 5, RULE_descripcion_cartas = 6, 
		RULE_setup_actions = 7, RULE_turn_block = 8, RULE_turn_header = 9, RULE_turn_action = 10, 
		RULE_bullet_line = 11, RULE_play_cards = 12, RULE_draw_action = 13, RULE_attach_energy = 14, 
		RULE_evolve_pokemon = 15, RULE_use_ability_or_attack = 16, RULE_sub_effect = 17, 
		RULE_end_turn = 18, RULE_card_name = 19, RULE_end = 20, RULE_concede = 21, 
		RULE_prize_cards = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "coin_toss", "win_coin", "turn_decision", "draw_cards_init", 
			"descripcion_cartas", "setup_actions", "turn_block", "turn_header", "turn_action", 
			"bullet_line", "play_cards", "draw_action", "attach_energy", "evolve_pokemon", 
			"use_ability_or_attack", "sub_effect", "end_turn", "card_name", "end", 
			"concede", "prize_cards"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'-'", "'\\u2022'", "':'", "'('", "')'", "'!'", null, 
			"'Setup'", "'turn'", "'Turn'", "'chose'", "'heads'", "'tails'", "'coin'", 
			"'flip'", "'won'", "'toss'", "'decided'", "'go'", "'first'", "'drew'", 
			"'drawn'", "'a'", "'card'", "'cards'", "'for'", "'the'", "'opening'", 
			"'hand'", "'7'", "'played'", "'discarded'", "'to'", "'Active'", "'Spot'", 
			"'Bench'", "'in'", "'attached'", "'on'", "'evolved'", "'used'", "'damage'", 
			"'Damage'", "'Base'", "'Item'", "'Total'", "'was'", "'Knocked Out !'", 
			"'took'", "'Prize'", "'A'", "'added'", "'switched'", "'with'", "'become'", 
			"'Pokemon'", "'retreated'", "'shuffled'", "'their'", "'deck'", "'moved'", 
			"'ended'", "'All'", "'were'", "'taken'", "'wins'", "'opponent'", "'conceded'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUNTO", "COMA", "RAYA", "PUNTO_RELLENO", "DOS_PUNTOS", "PARENTESIS_ABRIR", 
			"PARENTESIS_CERRAR", "EXCLAMACION", "APOS_S", "SETUP", "TURN", "TURN_MAYUS", 
			"CHOSE", "HEADS", "TAILS", "COIN", "FLIP", "WON", "TOSS", "DECIDED", 
			"GO", "FIRST", "DREW", "DRAWN", "A", "CARD", "CARDS", "FOR", "THE", "OPENING", 
			"HAND", "SEVEN", "PLAYED", "DISCARDED", "TO", "ACTIVE", "SPOT", "BENCH", 
			"IN", "ATTACHED", "ON", "EVOLVED", "USED", "DAMAGE", "DAMAGE_MAYUS", 
			"BASE", "ITEM", "TOTAL", "WAS", "K_O", "TOOK", "PRIZE", "A_MAYUS", "ADDED", 
			"SWITCHED", "WITH", "BECOME", "POKEMON", "RETREATED", "SHUFFLED", "THEIR", 
			"DECK", "MOVED", "ENDED", "ALL", "WERE", "TAKEN", "WINS", "OPPONENT", 
			"CONCEDED", "CARTA", "NUM", "ID", "WS"
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
		public TerminalNode EOF() { return getToken(PokemonParser.EOF, 0); }
		public List<Turn_blockContext> turn_block() {
			return getRuleContexts(Turn_blockContext.class);
		}
		public Turn_blockContext turn_block(int i) {
			return getRuleContext(Turn_blockContext.class,i);
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
		int _la;
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
		public List<Setup_actionsContext> setup_actions() {
			return getRuleContexts(Setup_actionsContext.class);
		}
		public Setup_actionsContext setup_actions(int i) {
			return getRuleContext(Setup_actionsContext.class,i);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(SETUP);
			setState(59);
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
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public List<Descripcion_cartasContext> descripcion_cartas() {
			return getRuleContexts(Descripcion_cartasContext.class);
		}
		public Descripcion_cartasContext descripcion_cartas(int i) {
			return getRuleContext(Descripcion_cartasContext.class,i);
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
			while (_la==PUNTO_RELLENO) {
				{
				setState(77);
				descripcion_cartas();
				}
				}
				setState(113);
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
	public static class Descripcion_cartasContext extends ParserRuleContext {
		public TerminalNode PUNTO_RELLENO() { return getToken(PokemonParser.PUNTO_RELLENO, 0); }
		public List<Card_nameContext> card_name() {
			return getRuleContexts(Card_nameContext.class);
		}
		public Card_nameContext card_name(int i) {
			return getRuleContext(Card_nameContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PokemonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PokemonParser.COMA, i);
		}
		public Descripcion_cartasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion_cartas; }
	}

	public final Descripcion_cartasContext descripcion_cartas() throws RecognitionException {
		Descripcion_cartasContext _localctx = new Descripcion_cartasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_descripcion_cartas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PUNTO_RELLENO);
			setState(115);
			card_name();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(116);
				match(COMA);
				setState(117);
				card_name();
				}
				}
				setState(122);
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
	public static class Setup_actionsContext extends ParserRuleContext {
		public Play_cardsContext play_cards() {
			return getRuleContext(Play_cardsContext.class,0);
		}
		public Setup_actionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_actions; }
	}

	public final Setup_actionsContext setup_actions() throws RecognitionException {
		Setup_actionsContext _localctx = new Setup_actionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setup_actions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			play_cards();
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
	public static class Turn_blockContext extends ParserRuleContext {
		public Turn_headerContext turn_header() {
			return getRuleContext(Turn_headerContext.class,0);
		}
		public List<Turn_actionContext> turn_action() {
			return getRuleContexts(Turn_actionContext.class);
		}
		public Turn_actionContext turn_action(int i) {
			return getRuleContext(Turn_actionContext.class,i);
		}
		public End_turnContext end_turn() {
			return getRuleContext(End_turnContext.class,0);
		}
		public Turn_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_block; }
	}

	public final Turn_blockContext turn_block() throws RecognitionException {
		Turn_blockContext _localctx = new Turn_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_turn_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			turn_header();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					turn_action();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(132);
				end_turn();
				}
				break;
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
	public static class Turn_headerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public TerminalNode TURN_MAYUS() { return getToken(PokemonParser.TURN_MAYUS, 0); }
		public Turn_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_header; }
	}

	public final Turn_headerContext turn_header() throws RecognitionException {
		Turn_headerContext _localctx = new Turn_headerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_turn_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(136);
			match(APOS_S);
			setState(137);
			match(TURN_MAYUS);
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
	public static class Turn_actionContext extends ParserRuleContext {
		public Play_cardsContext play_cards() {
			return getRuleContext(Play_cardsContext.class,0);
		}
		public Draw_actionContext draw_action() {
			return getRuleContext(Draw_actionContext.class,0);
		}
		public Attach_energyContext attach_energy() {
			return getRuleContext(Attach_energyContext.class,0);
		}
		public Evolve_pokemonContext evolve_pokemon() {
			return getRuleContext(Evolve_pokemonContext.class,0);
		}
		public Use_ability_or_attackContext use_ability_or_attack() {
			return getRuleContext(Use_ability_or_attackContext.class,0);
		}
		public Bullet_lineContext bullet_line() {
			return getRuleContext(Bullet_lineContext.class,0);
		}
		public Sub_effectContext sub_effect() {
			return getRuleContext(Sub_effectContext.class,0);
		}
		public Turn_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_action; }
	}

	public final Turn_actionContext turn_action() throws RecognitionException {
		Turn_actionContext _localctx = new Turn_actionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_turn_action);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				play_cards();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				draw_action();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				attach_energy();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				evolve_pokemon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				use_ability_or_attack();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				bullet_line();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				sub_effect();
				}
				break;
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
	public static class Bullet_lineContext extends ParserRuleContext {
		public TerminalNode PUNTO_RELLENO() { return getToken(PokemonParser.PUNTO_RELLENO, 0); }
		public List<Card_nameContext> card_name() {
			return getRuleContexts(Card_nameContext.class);
		}
		public Card_nameContext card_name(int i) {
			return getRuleContext(Card_nameContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PokemonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PokemonParser.COMA, i);
		}
		public Bullet_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bullet_line; }
	}

	public final Bullet_lineContext bullet_line() throws RecognitionException {
		Bullet_lineContext _localctx = new Bullet_lineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bullet_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PUNTO_RELLENO);
			setState(149);
			card_name();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(150);
				match(COMA);
				setState(151);
				card_name();
				}
				}
				setState(156);
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
		enterRule(_localctx, 24, RULE_play_cards);
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
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public Item_cardContext item_card() {
			return getRuleContext(Item_cardContext.class,0);
		}
		public Supporter_cardContext supporter_card() {
			return getRuleContext(Supporter_cardContext.class,0);
		}
		public Energy_cardContext energy_card() {
			return getRuleContext(Energy_cardContext.class,0);
		}
		public TerminalNode CARTA() { return getToken(PokemonParser.CARTA, 0); }
		public Card_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_name; }
	}

	public final Card_nameContext card_name() throws RecognitionException {
		Card_nameContext _localctx = new Card_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_card_name);
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
		public List<TerminalNode> PUNTO() { return getTokens(PokemonParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(PokemonParser.PUNTO, i);
		}
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode WINS() { return getToken(PokemonParser.WINS, 0); }
		public TerminalNode OPPONENT() { return getToken(PokemonParser.OPPONENT, 0); }
		public TerminalNode CONCEDED() { return getToken(PokemonParser.CONCEDED, 0); }
		public TerminalNode ALL() { return getToken(PokemonParser.ALL, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonParser.PRIZE, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode TAKEN() { return getToken(PokemonParser.TAKEN, 0); }
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
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005[\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0003\u0007"+
		"i\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bq\b\b\u0001\t\u0001\t\u0003\tu\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0083\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"\u0000\u0006\u0001\u0000\r\u000e\u0001"+
		"\u0000GP\u0001\u0000Q]\u0001\u0000^a\u0001\u0000bn\u0002\u0000ggnu\u0089"+
		"\u0000$\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004"+
		"2\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bD\u0001\u0000"+
		"\u0000\u0000\nK\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000e"+
		"^\u0001\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012t\u0001"+
		"\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016x\u0001\u0000\u0000"+
		"\u0000\u0018z\u0001\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c"+
		"~\u0001\u0000\u0000\u0000\u001e\u0082\u0001\u0000\u0000\u0000 \u0088\u0001"+
		"\u0000\u0000\u0000\"\u008c\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001"+
		"\u0000%&\u0003\u001e\u000f\u0000&\u0001\u0001\u0000\u0000\u0000\'(\u0005"+
		"\t\u0000\u0000()\u0003\u0004\u0002\u0000)*\u0003\b\u0004\u0000*+\u0003"+
		"\n\u0005\u0000+/\u0003\n\u0005\u0000,.\u0003\u000e\u0007\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000023\u0005E\u0000\u000034\u0005\f\u0000\u000045\u0007\u0000"+
		"\u0000\u000056\u0005\u001b\u0000\u000067\u0005\u001c\u0000\u000078\u0005"+
		"\u001d\u0000\u000089\u0005\u000f\u0000\u00009:\u0005\u0010\u0000\u0000"+
		":;\u0005\u0001\u0000\u0000;<\u0003\u0006\u0003\u0000<\u0005\u0001\u0000"+
		"\u0000\u0000=>\u0005E\u0000\u0000>?\u0005\u0011\u0000\u0000?@\u0005\u001c"+
		"\u0000\u0000@A\u0005\u000f\u0000\u0000AB\u0005\u0012\u0000\u0000BC\u0005"+
		"\u0001\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0005E\u0000\u0000"+
		"EF\u0005\u0013\u0000\u0000FG\u0005\"\u0000\u0000GH\u0005\u0014\u0000\u0000"+
		"HI\u0005\u0015\u0000\u0000IJ\u0005\u0001\u0000\u0000J\t\u0001\u0000\u0000"+
		"\u0000KL\u0005E\u0000\u0000LM\u0005\u0016\u0000\u0000MN\u0005\u001f\u0000"+
		"\u0000NO\u0005\u001a\u0000\u0000OP\u0005\u001b\u0000\u0000PQ\u0005\u001c"+
		"\u0000\u0000QR\u0005\u001d\u0000\u0000RS\u0005\u001e\u0000\u0000ST\u0005"+
		"\u0001\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0005\u001f\u0000\u0000"+
		"VW\u0005\u0017\u0000\u0000WX\u0005\u001a\u0000\u0000XZ\u0005\u0001\u0000"+
		"\u0000Y[\u0003\f\u0006\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u000b\u0001\u0000\u0000\u0000\\]\u0005\u0004\u0000\u0000]\r\u0001"+
		"\u0000\u0000\u0000^_\u0005E\u0000\u0000_`\u0005 \u0000\u0000`h\u0003\u0010"+
		"\b\u0000ab\u0005\"\u0000\u0000bf\u0005\u001c\u0000\u0000cg\u0005%\u0000"+
		"\u0000de\u0005#\u0000\u0000eg\u0005$\u0000\u0000fc\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000ha\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0001"+
		"\u0000\u0000k\u000f\u0001\u0000\u0000\u0000lq\u0003\u0012\t\u0000mq\u0003"+
		"\u0014\n\u0000nq\u0003\u0016\u000b\u0000oq\u0003\u0018\f\u0000pl\u0001"+
		"\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000q\u0011\u0001\u0000\u0000\u0000ru\u0003\u001a"+
		"\r\u0000su\u0003\u001c\u000e\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000u\u0013\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000\u0000"+
		"w\u0015\u0001\u0000\u0000\u0000xy\u0007\u0002\u0000\u0000y\u0017\u0001"+
		"\u0000\u0000\u0000z{\u0007\u0003\u0000\u0000{\u0019\u0001\u0000\u0000"+
		"\u0000|}\u0007\u0004\u0000\u0000}\u001b\u0001\u0000\u0000\u0000~\u007f"+
		"\u0007\u0005\u0000\u0000\u007f\u001d\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0003 \u0010\u0000\u0081\u0083\u0003\"\u0011\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005E\u0000\u0000\u0085\u0086\u0005C\u0000"+
		"\u0000\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u001f\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005v\u0000\u0000\u0089\u008a\u0005w\u0000\u0000\u008a"+
		"\u008b\u0005\u0001\u0000\u0000\u008b!\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005@\u0000\u0000\u008d\u008e\u00052\u0000\u0000\u008e\u008f\u0005\u001a"+
		"\u0000\u0000\u008f\u0090\u0005B\u0000\u0000\u0090\u0091\u0005\u0001\u0000"+
		"\u0000\u0091#\u0001\u0000\u0000\u0000\u0007/Zfhpt\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}