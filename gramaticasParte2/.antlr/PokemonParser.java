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
		PARENTESIS_CERRAR=7, EXCLAMACION=8, SETUP=9, TURN=10, TURN_MAYUS=11, CHOSE=12, 
		HEADS=13, TAILS=14, COIN=15, FLIP=16, WON=17, TOSS=18, DECIDED=19, GO=20, 
		FIRST=21, DREW=22, DRAWN=23, A=24, CARD=25, CARDS=26, FOR=27, THE=28, 
		OPENING=29, HAND=30, SEVEN=31, PLAYED=32, DISCARDED=33, TO=34, ACTIVE=35, 
		SPOT=36, BENCH=37, ATTACHED=38, ON=39, EVOLVED=40, USED=41, DAMAGE=42, 
		DAMAGE_MAYUS=43, BASE=44, ITEM=45, TOTAL=46, WAS=47, K_O=48, TOOK=49, 
		PRIZE=50, A_MAYUS=51, ADDED=52, SWITCH=53, SWITCHED=54, WITH=55, BECOME=56, 
		POKEMON=57, RETREATED=58, SHUFFLED=59, THEIR=60, DECK=61, MOVED=62, ENDED=63, 
		ALL=64, WERE=65, TAKEN=66, WINS=67, NUM=68, ID=69, WS=70, BUDDY_POFFIN=71, 
		ENERGY_RECYCLER=72, NIGHT_STRETCHER=73, POKE_PAD=74, RARE_CANDY=75, SCRAMBLE_SWITCH=76, 
		ULTRA_BALL=77, N_PP=78, TICKET=79, N_CASTLE=80, BLACK_BELT=81, BOSS=82, 
		DAWN=83, HILDA=84, LILLIE=85, TEAM_ROCKET=86, CYRANO=87, JANINE=88, JUDGE=89, 
		AIR_BALLON=90, BINDING_MOCHI=91, HERO_CAPE=92, POWERGLASS=93, PRISM_ENERGY=94, 
		BASIC_DARK=95, BASIC_METALLIC=96, BASIC_PSYCHIC=97, LILLIE_CLEFAIRY=98, 
		MEW=99, DEINO=100, ZWEILOUS=101, HYDREIGON=102, FEZANDIPITI=103, GENESECT=104, 
		STEVEN_BELDUM=105, STEVEN_METANG=106, STEVEN_METAGROSS=107, LATIOS=108, 
		MEGA_LATIAS=109, MEOWTH=110, N_DARUMAKA=111, N_DARMANITAN=112, N_ZORUA=113, 
		N_ZOROARK=114, PECHARUNT=115, N_RESHIRAM=116, N_ZEKROM=117, OPPONENT=118, 
		CONCEDED=119;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_coin_toss = 2, RULE_win_coin = 3, 
		RULE_turn_decision = 4, RULE_draw_cards_init = 5, RULE_descripcion_cartas = 6, 
		RULE_play_cards = 7, RULE_card_name = 8, RULE_pokemon_card = 9, RULE_item_card = 10, 
		RULE_supporter_card = 11, RULE_energy_card = 12, RULE_mew_deck = 13, RULE_zoroark_deck = 14, 
		RULE_end = 15, RULE_concede = 16, RULE_prize_cards = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "coin_toss", "win_coin", "turn_decision", "draw_cards_init", 
			"descripcion_cartas", "play_cards", "card_name", "pokemon_card", "item_card", 
			"supporter_card", "energy_card", "mew_deck", "zoroark_deck", "end", "concede", 
			"prize_cards"
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
			"'ended'", "'All'", "'were'", "'taken'", "'wins'"
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
			"MOVED", "ENDED", "ALL", "WERE", "TAKEN", "WINS", "NUM", "ID", "WS", 
			"BUDDY_POFFIN", "ENERGY_RECYCLER", "NIGHT_STRETCHER", "POKE_PAD", "RARE_CANDY", 
			"SCRAMBLE_SWITCH", "ULTRA_BALL", "N_PP", "TICKET", "N_CASTLE", "BLACK_BELT", 
			"BOSS", "DAWN", "HILDA", "LILLIE", "TEAM_ROCKET", "CYRANO", "JANINE", 
			"JUDGE", "AIR_BALLON", "BINDING_MOCHI", "HERO_CAPE", "POWERGLASS", "PRISM_ENERGY", 
			"BASIC_DARK", "BASIC_METALLIC", "BASIC_PSYCHIC", "LILLIE_CLEFAIRY", "MEW", 
			"DEINO", "ZWEILOUS", "HYDREIGON", "FEZANDIPITI", "GENESECT", "STEVEN_BELDUM", 
			"STEVEN_METANG", "STEVEN_METAGROSS", "LATIOS", "MEGA_LATIAS", "MEOWTH", 
			"N_DARUMAKA", "N_DARMANITAN", "N_ZORUA", "N_ZOROARK", "PECHARUNT", "N_RESHIRAM", 
			"N_ZEKROM", "OPPONENT", "CONCEDED"
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
			setState(36);
			setup();
			setState(37);
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
			setState(39);
			match(SETUP);
			setState(40);
			coin_toss();
			setState(41);
			turn_decision();
			setState(42);
			draw_cards_init();
			setState(43);
			draw_cards_init();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44);
				play_cards();
				}
				}
				setState(49);
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
			setState(50);
			match(ID);
			setState(51);
			match(CHOSE);
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			match(FOR);
			setState(54);
			match(THE);
			setState(55);
			match(OPENING);
			setState(56);
			match(COIN);
			setState(57);
			match(FLIP);
			setState(58);
			match(PUNTO);
			setState(59);
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
			setState(61);
			match(ID);
			setState(62);
			match(WON);
			setState(63);
			match(THE);
			setState(64);
			match(COIN);
			setState(65);
			match(TOSS);
			setState(66);
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
			setState(68);
			match(ID);
			setState(69);
			match(DECIDED);
			setState(70);
			match(TO);
			setState(71);
			match(GO);
			setState(72);
			match(FIRST);
			setState(73);
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
			setState(75);
			match(ID);
			setState(76);
			match(DREW);
			setState(77);
			match(SEVEN);
			setState(78);
			match(CARDS);
			setState(79);
			match(FOR);
			setState(80);
			match(THE);
			setState(81);
			match(OPENING);
			setState(82);
			match(HAND);
			setState(83);
			match(PUNTO);
			setState(84);
			match(RAYA);
			setState(85);
			match(SEVEN);
			setState(86);
			match(DRAWN);
			setState(87);
			match(CARDS);
			setState(88);
			match(PUNTO);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_RELLENO) {
				{
				setState(89);
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
			setState(92);
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
			setState(94);
			match(ID);
			setState(95);
			match(PLAYED);
			setState(96);
			card_name();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(97);
				match(TO);
				setState(98);
				match(THE);
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(99);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(100);
					match(ACTIVE);
					setState(101);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(106);
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
		public Card_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_name; }
	}

	public final Card_nameContext card_name() throws RecognitionException {
		Card_nameContext _localctx = new Card_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_card_name);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LILLIE_CLEFAIRY:
			case MEW:
			case DEINO:
			case ZWEILOUS:
			case HYDREIGON:
			case FEZANDIPITI:
			case GENESECT:
			case STEVEN_BELDUM:
			case STEVEN_METANG:
			case STEVEN_METAGROSS:
			case LATIOS:
			case MEGA_LATIAS:
			case MEOWTH:
			case N_DARUMAKA:
			case N_DARMANITAN:
			case N_ZORUA:
			case N_ZOROARK:
			case PECHARUNT:
			case N_RESHIRAM:
			case N_ZEKROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				pokemon_card();
				}
				break;
			case BUDDY_POFFIN:
			case ENERGY_RECYCLER:
			case NIGHT_STRETCHER:
			case POKE_PAD:
			case RARE_CANDY:
			case SCRAMBLE_SWITCH:
			case ULTRA_BALL:
			case N_PP:
			case TICKET:
			case N_CASTLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				item_card();
				}
				break;
			case BLACK_BELT:
			case BOSS:
			case DAWN:
			case HILDA:
			case LILLIE:
			case TEAM_ROCKET:
			case CYRANO:
			case JANINE:
			case JUDGE:
			case AIR_BALLON:
			case BINDING_MOCHI:
			case HERO_CAPE:
			case POWERGLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				supporter_card();
				}
				break;
			case PRISM_ENERGY:
			case BASIC_DARK:
			case BASIC_METALLIC:
			case BASIC_PSYCHIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				energy_card();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Pokemon_cardContext extends ParserRuleContext {
		public Mew_deckContext mew_deck() {
			return getRuleContext(Mew_deckContext.class,0);
		}
		public Zoroark_deckContext zoroark_deck() {
			return getRuleContext(Zoroark_deckContext.class,0);
		}
		public Pokemon_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_card; }
	}

	public final Pokemon_cardContext pokemon_card() throws RecognitionException {
		Pokemon_cardContext _localctx = new Pokemon_cardContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pokemon_card);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				mew_deck();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				zoroark_deck();
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
	public static class Item_cardContext extends ParserRuleContext {
		public TerminalNode BUDDY_POFFIN() { return getToken(PokemonParser.BUDDY_POFFIN, 0); }
		public TerminalNode ENERGY_RECYCLER() { return getToken(PokemonParser.ENERGY_RECYCLER, 0); }
		public TerminalNode NIGHT_STRETCHER() { return getToken(PokemonParser.NIGHT_STRETCHER, 0); }
		public TerminalNode POKE_PAD() { return getToken(PokemonParser.POKE_PAD, 0); }
		public TerminalNode RARE_CANDY() { return getToken(PokemonParser.RARE_CANDY, 0); }
		public TerminalNode SCRAMBLE_SWITCH() { return getToken(PokemonParser.SCRAMBLE_SWITCH, 0); }
		public TerminalNode ULTRA_BALL() { return getToken(PokemonParser.ULTRA_BALL, 0); }
		public TerminalNode N_PP() { return getToken(PokemonParser.N_PP, 0); }
		public TerminalNode TICKET() { return getToken(PokemonParser.TICKET, 0); }
		public TerminalNode N_CASTLE() { return getToken(PokemonParser.N_CASTLE, 0); }
		public Item_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_card; }
	}

	public final Item_cardContext item_card() throws RecognitionException {
		Item_cardContext _localctx = new Item_cardContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_item_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Supporter_cardContext extends ParserRuleContext {
		public TerminalNode BLACK_BELT() { return getToken(PokemonParser.BLACK_BELT, 0); }
		public TerminalNode BOSS() { return getToken(PokemonParser.BOSS, 0); }
		public TerminalNode DAWN() { return getToken(PokemonParser.DAWN, 0); }
		public TerminalNode HILDA() { return getToken(PokemonParser.HILDA, 0); }
		public TerminalNode LILLIE() { return getToken(PokemonParser.LILLIE, 0); }
		public TerminalNode TEAM_ROCKET() { return getToken(PokemonParser.TEAM_ROCKET, 0); }
		public TerminalNode CYRANO() { return getToken(PokemonParser.CYRANO, 0); }
		public TerminalNode JANINE() { return getToken(PokemonParser.JANINE, 0); }
		public TerminalNode JUDGE() { return getToken(PokemonParser.JUDGE, 0); }
		public TerminalNode AIR_BALLON() { return getToken(PokemonParser.AIR_BALLON, 0); }
		public TerminalNode BINDING_MOCHI() { return getToken(PokemonParser.BINDING_MOCHI, 0); }
		public TerminalNode HERO_CAPE() { return getToken(PokemonParser.HERO_CAPE, 0); }
		public TerminalNode POWERGLASS() { return getToken(PokemonParser.POWERGLASS, 0); }
		public Supporter_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supporter_card; }
	}

	public final Supporter_cardContext supporter_card() throws RecognitionException {
		Supporter_cardContext _localctx = new Supporter_cardContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_supporter_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 8191L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Energy_cardContext extends ParserRuleContext {
		public TerminalNode PRISM_ENERGY() { return getToken(PokemonParser.PRISM_ENERGY, 0); }
		public TerminalNode BASIC_DARK() { return getToken(PokemonParser.BASIC_DARK, 0); }
		public TerminalNode BASIC_METALLIC() { return getToken(PokemonParser.BASIC_METALLIC, 0); }
		public TerminalNode BASIC_PSYCHIC() { return getToken(PokemonParser.BASIC_PSYCHIC, 0); }
		public Energy_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_energy_card; }
	}

	public final Energy_cardContext energy_card() throws RecognitionException {
		Energy_cardContext _localctx = new Energy_cardContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_energy_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Mew_deckContext extends ParserRuleContext {
		public TerminalNode LILLIE_CLEFAIRY() { return getToken(PokemonParser.LILLIE_CLEFAIRY, 0); }
		public TerminalNode MEW() { return getToken(PokemonParser.MEW, 0); }
		public TerminalNode DEINO() { return getToken(PokemonParser.DEINO, 0); }
		public TerminalNode ZWEILOUS() { return getToken(PokemonParser.ZWEILOUS, 0); }
		public TerminalNode HYDREIGON() { return getToken(PokemonParser.HYDREIGON, 0); }
		public TerminalNode FEZANDIPITI() { return getToken(PokemonParser.FEZANDIPITI, 0); }
		public TerminalNode GENESECT() { return getToken(PokemonParser.GENESECT, 0); }
		public TerminalNode STEVEN_BELDUM() { return getToken(PokemonParser.STEVEN_BELDUM, 0); }
		public TerminalNode STEVEN_METANG() { return getToken(PokemonParser.STEVEN_METANG, 0); }
		public TerminalNode STEVEN_METAGROSS() { return getToken(PokemonParser.STEVEN_METAGROSS, 0); }
		public TerminalNode LATIOS() { return getToken(PokemonParser.LATIOS, 0); }
		public TerminalNode MEGA_LATIAS() { return getToken(PokemonParser.MEGA_LATIAS, 0); }
		public TerminalNode MEOWTH() { return getToken(PokemonParser.MEOWTH, 0); }
		public Mew_deckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mew_deck; }
	}

	public final Mew_deckContext mew_deck() throws RecognitionException {
		Mew_deckContext _localctx = new Mew_deckContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mew_deck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 8191L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Zoroark_deckContext extends ParserRuleContext {
		public TerminalNode N_DARUMAKA() { return getToken(PokemonParser.N_DARUMAKA, 0); }
		public TerminalNode N_DARMANITAN() { return getToken(PokemonParser.N_DARMANITAN, 0); }
		public TerminalNode N_ZORUA() { return getToken(PokemonParser.N_ZORUA, 0); }
		public TerminalNode N_ZOROARK() { return getToken(PokemonParser.N_ZOROARK, 0); }
		public TerminalNode PECHARUNT() { return getToken(PokemonParser.PECHARUNT, 0); }
		public TerminalNode N_RESHIRAM() { return getToken(PokemonParser.N_RESHIRAM, 0); }
		public TerminalNode N_ZEKROM() { return getToken(PokemonParser.N_ZEKROM, 0); }
		public TerminalNode FEZANDIPITI() { return getToken(PokemonParser.FEZANDIPITI, 0); }
		public TerminalNode MEOWTH() { return getToken(PokemonParser.MEOWTH, 0); }
		public Zoroark_deckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zoroark_deck; }
	}

	public final Zoroark_deckContext zoroark_deck() throws RecognitionException {
		Zoroark_deckContext _localctx = new Zoroark_deckContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_zoroark_deck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 32641L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 30, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPPONENT:
				{
				setState(128);
				concede();
				}
				break;
			case ALL:
				{
				setState(129);
				prize_cards();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(ID);
			setState(133);
			match(WINS);
			setState(134);
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
		enterRule(_localctx, 32, RULE_concede);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OPPONENT);
			setState(137);
			match(CONCEDED);
			setState(138);
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
		enterRule(_localctx, 34, RULE_prize_cards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ALL);
			setState(141);
			match(PRIZE);
			setState(142);
			match(CARDS);
			setState(143);
			match(TAKEN);
			setState(144);
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
		"\u0004\u0001w\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002"+
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