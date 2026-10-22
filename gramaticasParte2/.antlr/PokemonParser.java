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
		PARENTESIS_CERRAR=7, EXCLAMACION=8, APOS_S=9, NEWLINE=10, WS=11, SETUP=12, 
		TURN=13, TURN_MAYUS=14, CHOSE=15, HEADS=16, TAILS=17, COIN=18, FLIP=19, 
		WON=20, TOSS=21, DECIDED=22, GO=23, FIRST=24, DREW=25, DRAWN=26, A=27, 
		A_MAYUS=28, CARD=29, CARDS=30, FOR=31, THE=32, OPENING=33, HAND=34, SEVEN=35, 
		PLAYED=36, DISCARDED=37, TO=38, ACTIVE=39, SPOT=40, BENCH=41, IN=42, ON=43, 
		ATTACHED=44, EVOLVED=45, USED=46, DAMAGE_BREAKDOWN=47, BASE_DAMAGE=48, 
		TOTAL_DAMAGE=49, DAMAGE=50, DAMAGE_MAYUS=51, BASE=52, TOTAL=53, ITEM=54, 
		WAS=55, WERE=56, K_O=57, TOOK=58, MORE_WORD=59, PRIZE=60, ADDED=61, SWITCHED=62, 
		WITH=63, BECOME=64, POKEMON=65, RETREATED=66, SHUFFLED=67, THEIR=68, DECK=69, 
		MOVED=70, ENDED=71, ALL=72, TAKEN=73, WINS=74, OPPONENT=75, CONCEDED=76, 
		NO=77, BENCHED=78, BACKUP=79, AND=80, IT=81, THEM=82, INTO=83, PUT=84, 
		COUNTERS=85, FROM=86, STADIUM=87, IS=88, NOW=89, MULLIGAN=90, REVEALED=91, 
		BECAUSE=92, AT=93, LEAST=94, WEAKNESS=95, OF=96, CARTA_POKEMON=97, CARTA_ENERGIA=98, 
		CARTA_ITEM=99, CARTA_SUPPORTER=100, CARTA_STADIUM=101, ATAQUE=102, FIGHTING=103, 
		NUM=104, ID=105;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_setup_entry = 2, RULE_coin_toss = 3, 
		RULE_win_coin = 4, RULE_turn_decision = 5, RULE_draw_cards_init = 6, RULE_mulligan_reveal = 7, 
		RULE_mulligan_bonus = 8, RULE_take_mulligan_action = 9, RULE_turn_block = 10, 
		RULE_turn_header = 11, RULE_turn_entry = 12, RULE_turn_action = 13, RULE_play_cards = 14, 
		RULE_draw_action = 15, RULE_attach_energy = 16, RULE_evolve_pokemon = 17, 
		RULE_use_ability_or_attack = 18, RULE_damage_weakness_clause = 19, RULE_retreat_action = 20, 
		RULE_active_pokemon_update = 21, RULE_take_prize_action = 22, RULE_knockout_action = 23, 
		RULE_card_added_to_hand = 24, RULE_discarded_card_from_pokemon = 25, RULE_damage_taken_action = 26, 
		RULE_end_turn = 27, RULE_sub_effect = 28, RULE_drawn_cards_effect = 29, 
		RULE_draw_number_effect = 30, RULE_draw_named_card_effect = 31, RULE_draw_and_play_effect = 32, 
		RULE_shuffle_deck_effect = 33, RULE_shuffle_cards_into_deck_effect = 34, 
		RULE_discard_number_effect = 35, RULE_discard_named_card_effect = 36, 
		RULE_discard_from_pokemon_effect = 37, RULE_discard_named_from_pokemon_effect = 38, 
		RULE_put_damage_counters_effect = 39, RULE_switch_active_pokemon_effect = 40, 
		RULE_attach_card_effect = 41, RULE_move_card_to_hand_effect = 42, RULE_damage_taken_effect = 43, 
		RULE_mulligan_reveal_effect = 44, RULE_generic_sub_effect = 45, RULE_damage_breakdown = 46, 
		RULE_damage_breakdown_entry = 47, RULE_generic_damage_entry = 48, RULE_bullet_line = 49, 
		RULE_card_name = 50, RULE_pokemon_card = 51, RULE_energy_card = 52, RULE_item_card = 53, 
		RULE_supporter_card = 54, RULE_stadium_card = 55, RULE_attack_name = 56, 
		RULE_number = 57, RULE_end = 58, RULE_end_reason = 59, RULE_line_end = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "setup_entry", "coin_toss", "win_coin", "turn_decision", 
			"draw_cards_init", "mulligan_reveal", "mulligan_bonus", "take_mulligan_action", 
			"turn_block", "turn_header", "turn_entry", "turn_action", "play_cards", 
			"draw_action", "attach_energy", "evolve_pokemon", "use_ability_or_attack", 
			"damage_weakness_clause", "retreat_action", "active_pokemon_update", 
			"take_prize_action", "knockout_action", "card_added_to_hand", "discarded_card_from_pokemon", 
			"damage_taken_action", "end_turn", "sub_effect", "drawn_cards_effect", 
			"draw_number_effect", "draw_named_card_effect", "draw_and_play_effect", 
			"shuffle_deck_effect", "shuffle_cards_into_deck_effect", "discard_number_effect", 
			"discard_named_card_effect", "discard_from_pokemon_effect", "discard_named_from_pokemon_effect", 
			"put_damage_counters_effect", "switch_active_pokemon_effect", "attach_card_effect", 
			"move_card_to_hand_effect", "damage_taken_effect", "mulligan_reveal_effect", 
			"generic_sub_effect", "damage_breakdown", "damage_breakdown_entry", "generic_damage_entry", 
			"bullet_line", "card_name", "pokemon_card", "energy_card", "item_card", 
			"supporter_card", "stadium_card", "attack_name", "number", "end", "end_reason", 
			"line_end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'-'", "'\\u2022'", "':'", "'('", "')'", "'!'", null, 
			null, null, "'Setup'", "'turn'", "'Turn'", "'chose'", "'heads'", "'tails'", 
			"'coin'", "'flip'", "'won'", "'toss'", "'decided'", "'go'", "'first'", 
			"'drew'", "'drawn'", "'a'", "'A'", "'card'", "'cards'", "'for'", "'the'", 
			"'opening'", "'hand'", "'7'", "'played'", "'discarded'", "'to'", "'Active'", 
			"'Spot'", "'Bench'", "'in'", "'on'", "'attached'", "'evolved'", "'used'", 
			"'Damage breakdown'", "'Base damage'", "'Total damage'", "'damage'", 
			"'Damage'", "'Base'", "'Total'", "'Item'", "'was'", "'were'", "'Knocked Out!'", 
			"'took'", "'more'", "'Prize'", "'added'", "'switched'", "'with'", "'become'", 
			null, "'retreated'", "'shuffled'", "'their'", "'deck'", "'moved'", "'ended'", 
			"'All'", "'taken'", "'wins'", null, null, "'No'", "'Benched'", "'backup'", 
			"'and'", "'it'", "'them'", "'into'", "'put'", null, "'from'", "'Stadium'", 
			"'is'", "'now'", null, "'revealed'", "'because'", "'at'", "'least'", 
			"'Weakness'", "'of'", null, null, null, null, null, null, "'Fighting'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUNTO", "COMA", "RAYA", "PUNTO_RELLENO", "DOS_PUNTOS", "PARENTESIS_ABRIR", 
			"PARENTESIS_CERRAR", "EXCLAMACION", "APOS_S", "NEWLINE", "WS", "SETUP", 
			"TURN", "TURN_MAYUS", "CHOSE", "HEADS", "TAILS", "COIN", "FLIP", "WON", 
			"TOSS", "DECIDED", "GO", "FIRST", "DREW", "DRAWN", "A", "A_MAYUS", "CARD", 
			"CARDS", "FOR", "THE", "OPENING", "HAND", "SEVEN", "PLAYED", "DISCARDED", 
			"TO", "ACTIVE", "SPOT", "BENCH", "IN", "ON", "ATTACHED", "EVOLVED", "USED", 
			"DAMAGE_BREAKDOWN", "BASE_DAMAGE", "TOTAL_DAMAGE", "DAMAGE", "DAMAGE_MAYUS", 
			"BASE", "TOTAL", "ITEM", "WAS", "WERE", "K_O", "TOOK", "MORE_WORD", "PRIZE", 
			"ADDED", "SWITCHED", "WITH", "BECOME", "POKEMON", "RETREATED", "SHUFFLED", 
			"THEIR", "DECK", "MOVED", "ENDED", "ALL", "TAKEN", "WINS", "OPPONENT", 
			"CONCEDED", "NO", "BENCHED", "BACKUP", "AND", "IT", "THEM", "INTO", "PUT", 
			"COUNTERS", "FROM", "STADIUM", "IS", "NOW", "MULLIGAN", "REVEALED", "BECAUSE", 
			"AT", "LEAST", "WEAKNESS", "OF", "CARTA_POKEMON", "CARTA_ENERGIA", "CARTA_ITEM", 
			"CARTA_SUPPORTER", "CARTA_STADIUM", "ATAQUE", "FIGHTING", "NUM", "ID"
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
		public TerminalNode EOF() { return getToken(PokemonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PokemonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PokemonParser.NEWLINE, i);
		}
		public List<Turn_blockContext> turn_block() {
			return getRuleContexts(Turn_blockContext.class);
		}
		public Turn_blockContext turn_block(int i) {
			return getRuleContext(Turn_blockContext.class,i);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(122);
				match(NEWLINE);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			setup();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(129);
				turn_block();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			end();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(136);
				match(NEWLINE);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(EOF);
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
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public List<Setup_entryContext> setup_entry() {
			return getRuleContexts(Setup_entryContext.class);
		}
		public Setup_entryContext setup_entry(int i) {
			return getRuleContext(Setup_entryContext.class,i);
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
			setState(144);
			match(SETUP);
			setState(145);
			line_end();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					setup_entry();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class Setup_entryContext extends ParserRuleContext {
		public Coin_tossContext coin_toss() {
			return getRuleContext(Coin_tossContext.class,0);
		}
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public Win_coinContext win_coin() {
			return getRuleContext(Win_coinContext.class,0);
		}
		public Turn_decisionContext turn_decision() {
			return getRuleContext(Turn_decisionContext.class,0);
		}
		public Draw_cards_initContext draw_cards_init() {
			return getRuleContext(Draw_cards_initContext.class,0);
		}
		public Sub_effectContext sub_effect() {
			return getRuleContext(Sub_effectContext.class,0);
		}
		public Mulligan_revealContext mulligan_reveal() {
			return getRuleContext(Mulligan_revealContext.class,0);
		}
		public Mulligan_bonusContext mulligan_bonus() {
			return getRuleContext(Mulligan_bonusContext.class,0);
		}
		public Take_mulligan_actionContext take_mulligan_action() {
			return getRuleContext(Take_mulligan_actionContext.class,0);
		}
		public Turn_actionContext turn_action() {
			return getRuleContext(Turn_actionContext.class,0);
		}
		public Bullet_lineContext bullet_line() {
			return getRuleContext(Bullet_lineContext.class,0);
		}
		public Setup_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_entry; }
	}

	public final Setup_entryContext setup_entry() throws RecognitionException {
		Setup_entryContext _localctx = new Setup_entryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setup_entry);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				coin_toss();
				setState(153);
				line_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				win_coin();
				setState(156);
				line_end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				turn_decision();
				setState(159);
				line_end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				draw_cards_init();
				setState(162);
				line_end();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				sub_effect();
				setState(165);
				line_end();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				mulligan_reveal();
				setState(168);
				line_end();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				mulligan_bonus();
				setState(171);
				line_end();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				take_mulligan_action();
				setState(174);
				line_end();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				turn_action();
				setState(177);
				line_end();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				bullet_line();
				setState(180);
				line_end();
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
	public static class Coin_tossContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode CHOSE() { return getToken(PokemonParser.CHOSE, 0); }
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(PokemonParser.OPENING, 0); }
		public TerminalNode COIN() { return getToken(PokemonParser.COIN, 0); }
		public TerminalNode FLIP() { return getToken(PokemonParser.FLIP, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode HEADS() { return getToken(PokemonParser.HEADS, 0); }
		public TerminalNode TAILS() { return getToken(PokemonParser.TAILS, 0); }
		public Coin_tossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coin_toss; }
	}

	public final Coin_tossContext coin_toss() throws RecognitionException {
		Coin_tossContext _localctx = new Coin_tossContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_coin_toss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(185);
			match(CHOSE);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
			match(FOR);
			setState(188);
			match(THE);
			setState(189);
			match(OPENING);
			setState(190);
			match(COIN);
			setState(191);
			match(FLIP);
			setState(192);
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
		enterRule(_localctx, 8, RULE_win_coin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(WON);
			setState(196);
			match(THE);
			setState(197);
			match(COIN);
			setState(198);
			match(TOSS);
			setState(199);
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
		enterRule(_localctx, 10, RULE_turn_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(DECIDED);
			setState(203);
			match(TO);
			setState(204);
			match(GO);
			setState(205);
			match(FIRST);
			setState(206);
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
		public TerminalNode SEVEN() { return getToken(PokemonParser.SEVEN, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(PokemonParser.OPENING, 0); }
		public TerminalNode HAND() { return getToken(PokemonParser.HAND, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Draw_cards_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_cards_init; }
	}

	public final Draw_cards_initContext draw_cards_init() throws RecognitionException {
		Draw_cards_initContext _localctx = new Draw_cards_initContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_draw_cards_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(DREW);
			setState(210);
			match(SEVEN);
			setState(211);
			match(CARDS);
			setState(212);
			match(FOR);
			setState(213);
			match(THE);
			setState(214);
			match(OPENING);
			setState(215);
			match(HAND);
			setState(216);
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
	public static class Mulligan_revealContext extends ParserRuleContext {
		public TerminalNode RAYA() { return getToken(PokemonParser.RAYA, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode REVEALED() { return getToken(PokemonParser.REVEALED, 0); }
		public TerminalNode FROM() { return getToken(PokemonParser.FROM, 0); }
		public TerminalNode MULLIGAN() { return getToken(PokemonParser.MULLIGAN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Mulligan_revealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulligan_reveal; }
	}

	public final Mulligan_revealContext mulligan_reveal() throws RecognitionException {
		Mulligan_revealContext _localctx = new Mulligan_revealContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mulligan_reveal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(RAYA);
			setState(219);
			match(ID);
			setState(220);
			match(REVEALED);
			setState(221);
			match(FROM);
			setState(222);
			match(MULLIGAN);
			setState(223);
			number();
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
	public static class Mulligan_bonusContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode MORE_WORD() { return getToken(PokemonParser.MORE_WORD, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode BECAUSE() { return getToken(PokemonParser.BECAUSE, 0); }
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public TerminalNode AT() { return getToken(PokemonParser.AT, 0); }
		public TerminalNode LEAST() { return getToken(PokemonParser.LEAST, 0); }
		public TerminalNode MULLIGAN() { return getToken(PokemonParser.MULLIGAN, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Mulligan_bonusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulligan_bonus; }
	}

	public final Mulligan_bonusContext mulligan_bonus() throws RecognitionException {
		Mulligan_bonusContext _localctx = new Mulligan_bonusContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mulligan_bonus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ID);
			setState(226);
			match(DREW);
			setState(227);
			number();
			setState(228);
			match(MORE_WORD);
			setState(229);
			match(CARD);
			setState(230);
			match(BECAUSE);
			setState(231);
			match(ID);
			setState(232);
			match(TOOK);
			setState(233);
			match(AT);
			setState(234);
			match(LEAST);
			setState(235);
			number();
			setState(236);
			match(MULLIGAN);
			setState(237);
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
	public static class Take_mulligan_actionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public TerminalNode A() { return getToken(PokemonParser.A, 0); }
		public TerminalNode MULLIGAN() { return getToken(PokemonParser.MULLIGAN, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Take_mulligan_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_take_mulligan_action; }
	}

	public final Take_mulligan_actionContext take_mulligan_action() throws RecognitionException {
		Take_mulligan_actionContext _localctx = new Take_mulligan_actionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_take_mulligan_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			setState(240);
			match(TOOK);
			setState(241);
			match(A);
			setState(242);
			match(MULLIGAN);
			setState(243);
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
	public static class Turn_blockContext extends ParserRuleContext {
		public Turn_headerContext turn_header() {
			return getRuleContext(Turn_headerContext.class,0);
		}
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public List<Turn_entryContext> turn_entry() {
			return getRuleContexts(Turn_entryContext.class);
		}
		public Turn_entryContext turn_entry(int i) {
			return getRuleContext(Turn_entryContext.class,i);
		}
		public Turn_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_block; }
	}

	public final Turn_blockContext turn_block() throws RecognitionException {
		Turn_blockContext _localctx = new Turn_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_turn_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			turn_header();
			setState(246);
			line_end();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					turn_entry();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 22, RULE_turn_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(254);
			match(APOS_S);
			setState(255);
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
	public static class Turn_entryContext extends ParserRuleContext {
		public Turn_actionContext turn_action() {
			return getRuleContext(Turn_actionContext.class,0);
		}
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public Damage_breakdownContext damage_breakdown() {
			return getRuleContext(Damage_breakdownContext.class,0);
		}
		public Sub_effectContext sub_effect() {
			return getRuleContext(Sub_effectContext.class,0);
		}
		public Bullet_lineContext bullet_line() {
			return getRuleContext(Bullet_lineContext.class,0);
		}
		public Mulligan_revealContext mulligan_reveal() {
			return getRuleContext(Mulligan_revealContext.class,0);
		}
		public Mulligan_bonusContext mulligan_bonus() {
			return getRuleContext(Mulligan_bonusContext.class,0);
		}
		public Turn_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_entry; }
	}

	public final Turn_entryContext turn_entry() throws RecognitionException {
		Turn_entryContext _localctx = new Turn_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_turn_entry);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				turn_action();
				setState(258);
				line_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				damage_breakdown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				sub_effect();
				setState(262);
				line_end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				bullet_line();
				setState(265);
				line_end();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				mulligan_reveal();
				setState(268);
				line_end();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				mulligan_bonus();
				setState(271);
				line_end();
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
		public Retreat_actionContext retreat_action() {
			return getRuleContext(Retreat_actionContext.class,0);
		}
		public Active_pokemon_updateContext active_pokemon_update() {
			return getRuleContext(Active_pokemon_updateContext.class,0);
		}
		public Take_prize_actionContext take_prize_action() {
			return getRuleContext(Take_prize_actionContext.class,0);
		}
		public Knockout_actionContext knockout_action() {
			return getRuleContext(Knockout_actionContext.class,0);
		}
		public Card_added_to_handContext card_added_to_hand() {
			return getRuleContext(Card_added_to_handContext.class,0);
		}
		public Discarded_card_from_pokemonContext discarded_card_from_pokemon() {
			return getRuleContext(Discarded_card_from_pokemonContext.class,0);
		}
		public Damage_taken_actionContext damage_taken_action() {
			return getRuleContext(Damage_taken_actionContext.class,0);
		}
		public End_turnContext end_turn() {
			return getRuleContext(End_turnContext.class,0);
		}
		public Turn_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_action; }
	}

	public final Turn_actionContext turn_action() throws RecognitionException {
		Turn_actionContext _localctx = new Turn_actionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_turn_action);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				play_cards();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				draw_action();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				attach_energy();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				evolve_pokemon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				use_ability_or_attack();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				retreat_action();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				active_pokemon_update();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(282);
				take_prize_action();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(283);
				knockout_action();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(284);
				card_added_to_hand();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(285);
				discarded_card_from_pokemon();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(286);
				damage_taken_action();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(287);
				end_turn();
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
		public TerminalNode STADIUM() { return getToken(PokemonParser.STADIUM, 0); }
		public Play_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play_cards; }
	}

	public final Play_cardsContext play_cards() throws RecognitionException {
		Play_cardsContext _localctx = new Play_cardsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_play_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(291);
			match(PLAYED);
			setState(292);
			card_name();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(293);
				match(TO);
				setState(294);
				match(THE);
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(295);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(296);
					match(ACTIVE);
					setState(297);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(298);
					match(STADIUM);
					setState(299);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(304);
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
	public static class Draw_actionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode A() { return getToken(PokemonParser.A, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public Draw_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_action; }
	}

	public final Draw_actionContext draw_action() throws RecognitionException {
		Draw_actionContext _localctx = new Draw_actionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_draw_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ID);
			setState(307);
			match(DREW);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				{
				setState(308);
				match(A);
				setState(309);
				match(CARD);
				}
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(310);
				card_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
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
	public static class Attach_energyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode ATTACHED() { return getToken(PokemonParser.ATTACHED, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode IN() { return getToken(PokemonParser.IN, 0); }
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Attach_energyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_energy; }
	}

	public final Attach_energyContext attach_energy() throws RecognitionException {
		Attach_energyContext _localctx = new Attach_energyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attach_energy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(ATTACHED);
			setState(317);
			card_name();
			setState(318);
			match(TO);
			setState(319);
			pokemon_card();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==ON) {
				{
				setState(320);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				match(THE);
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(322);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(323);
					match(ACTIVE);
					setState(324);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(329);
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
	public static class Evolve_pokemonContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode EVOLVED() { return getToken(PokemonParser.EVOLVED, 0); }
		public List<Pokemon_cardContext> pokemon_card() {
			return getRuleContexts(Pokemon_cardContext.class);
		}
		public Pokemon_cardContext pokemon_card(int i) {
			return getRuleContext(Pokemon_cardContext.class,i);
		}
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode IN() { return getToken(PokemonParser.IN, 0); }
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Evolve_pokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evolve_pokemon; }
	}

	public final Evolve_pokemonContext evolve_pokemon() throws RecognitionException {
		Evolve_pokemonContext _localctx = new Evolve_pokemonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_evolve_pokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ID);
			setState(332);
			match(EVOLVED);
			setState(333);
			pokemon_card();
			setState(334);
			match(TO);
			setState(335);
			pokemon_card();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==ON) {
				{
				setState(336);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(337);
				match(THE);
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(338);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(339);
					match(ACTIVE);
					setState(340);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(345);
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
	public static class Use_ability_or_attackContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public List<TerminalNode> APOS_S() { return getTokens(PokemonParser.APOS_S); }
		public TerminalNode APOS_S(int i) {
			return getToken(PokemonParser.APOS_S, i);
		}
		public List<Pokemon_cardContext> pokemon_card() {
			return getRuleContexts(Pokemon_cardContext.class);
		}
		public Pokemon_cardContext pokemon_card(int i) {
			return getRuleContext(Pokemon_cardContext.class,i);
		}
		public TerminalNode USED() { return getToken(PokemonParser.USED, 0); }
		public Attack_nameContext attack_name() {
			return getRuleContext(Attack_nameContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public Damage_weakness_clauseContext damage_weakness_clause() {
			return getRuleContext(Damage_weakness_clauseContext.class,0);
		}
		public Use_ability_or_attackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_ability_or_attack; }
	}

	public final Use_ability_or_attackContext use_ability_or_attack() throws RecognitionException {
		Use_ability_or_attackContext _localctx = new Use_ability_or_attackContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_use_ability_or_attack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ID);
			setState(348);
			match(APOS_S);
			setState(349);
			pokemon_card();
			setState(350);
			match(USED);
			setState(351);
			attack_name();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(352);
				match(ON);
				setState(353);
				match(ID);
				setState(354);
				match(APOS_S);
				setState(355);
				pokemon_card();
				setState(356);
				match(FOR);
				setState(357);
				number();
				setState(358);
				match(DAMAGE);
				}
			}

			setState(362);
			match(PUNTO);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(363);
				damage_weakness_clause();
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
	public static class Damage_weakness_clauseContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode MORE_WORD() { return getToken(PokemonParser.MORE_WORD, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public TerminalNode BECAUSE() { return getToken(PokemonParser.BECAUSE, 0); }
		public TerminalNode OF() { return getToken(PokemonParser.OF, 0); }
		public TerminalNode WEAKNESS() { return getToken(PokemonParser.WEAKNESS, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode FIGHTING() { return getToken(PokemonParser.FIGHTING, 0); }
		public Damage_weakness_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_weakness_clause; }
	}

	public final Damage_weakness_clauseContext damage_weakness_clause() throws RecognitionException {
		Damage_weakness_clauseContext _localctx = new Damage_weakness_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_damage_weakness_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ID);
			setState(367);
			match(APOS_S);
			setState(368);
			pokemon_card();
			setState(369);
			match(TOOK);
			setState(370);
			number();
			setState(371);
			match(MORE_WORD);
			setState(372);
			match(DAMAGE);
			setState(373);
			match(BECAUSE);
			setState(374);
			match(OF);
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==FIGHTING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(376);
			match(WEAKNESS);
			setState(377);
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
	public static class Retreat_actionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode RETREATED() { return getToken(PokemonParser.RETREATED, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Retreat_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retreat_action; }
	}

	public final Retreat_actionContext retreat_action() throws RecognitionException {
		Retreat_actionContext _localctx = new Retreat_actionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_retreat_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ID);
			setState(380);
			match(RETREATED);
			setState(381);
			pokemon_card();
			setState(382);
			match(TO);
			setState(383);
			match(THE);
			setState(384);
			match(BENCH);
			setState(385);
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
	public static class Active_pokemon_updateContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode IS() { return getToken(PokemonParser.IS, 0); }
		public TerminalNode NOW() { return getToken(PokemonParser.NOW, 0); }
		public TerminalNode IN() { return getToken(PokemonParser.IN, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Active_pokemon_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_active_pokemon_update; }
	}

	public final Active_pokemon_updateContext active_pokemon_update() throws RecognitionException {
		Active_pokemon_updateContext _localctx = new Active_pokemon_updateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_active_pokemon_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(387);
				match(ID);
				setState(388);
				match(APOS_S);
				}
			}

			setState(391);
			pokemon_card();
			setState(392);
			match(IS);
			setState(393);
			match(NOW);
			setState(394);
			match(IN);
			setState(395);
			match(THE);
			setState(396);
			match(ACTIVE);
			setState(397);
			match(SPOT);
			setState(398);
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
	public static class Take_prize_actionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonParser.PRIZE, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode A() { return getToken(PokemonParser.A, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Take_prize_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_take_prize_action; }
	}

	public final Take_prize_actionContext take_prize_action() throws RecognitionException {
		Take_prize_actionContext _localctx = new Take_prize_actionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_take_prize_action);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(ID);
				setState(401);
				match(TOOK);
				setState(404);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(402);
					match(A);
					}
					break;
				case SEVEN:
				case NUM:
					{
					setState(403);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(406);
				match(PRIZE);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CARD) {
					{
					setState(407);
					match(CARD);
					}
				}

				setState(410);
				match(PUNTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(ID);
				setState(412);
				match(TOOK);
				setState(413);
				number();
				setState(414);
				match(PRIZE);
				setState(415);
				match(CARDS);
				setState(416);
				match(PUNTO);
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
	public static class Knockout_actionContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode K_O() { return getToken(PokemonParser.K_O, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Knockout_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knockout_action; }
	}

	public final Knockout_actionContext knockout_action() throws RecognitionException {
		Knockout_actionContext _localctx = new Knockout_actionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_knockout_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(420);
				match(ID);
				setState(421);
				match(APOS_S);
				}
			}

			setState(424);
			pokemon_card();
			setState(425);
			match(WAS);
			setState(426);
			match(K_O);
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
	public static class Card_added_to_handContext extends ParserRuleContext {
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode ADDED() { return getToken(PokemonParser.ADDED, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public TerminalNode HAND() { return getToken(PokemonParser.HAND, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode A_MAYUS() { return getToken(PokemonParser.A_MAYUS, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public Card_added_to_handContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_added_to_hand; }
	}

	public final Card_added_to_handContext card_added_to_hand() throws RecognitionException {
		Card_added_to_handContext _localctx = new Card_added_to_handContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_card_added_to_hand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_MAYUS:
				{
				setState(428);
				match(A_MAYUS);
				setState(429);
				match(CARD);
				}
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(430);
				card_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(433);
			match(WAS);
			setState(434);
			match(ADDED);
			setState(435);
			match(TO);
			setState(436);
			match(ID);
			setState(437);
			match(APOS_S);
			setState(438);
			match(HAND);
			setState(439);
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
	public static class Discarded_card_from_pokemonContext extends ParserRuleContext {
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode DISCARDED() { return getToken(PokemonParser.DISCARDED, 0); }
		public TerminalNode FROM() { return getToken(PokemonParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Discarded_card_from_pokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discarded_card_from_pokemon; }
	}

	public final Discarded_card_from_pokemonContext discarded_card_from_pokemon() throws RecognitionException {
		Discarded_card_from_pokemonContext _localctx = new Discarded_card_from_pokemonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_discarded_card_from_pokemon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			card_name();
			setState(442);
			match(WAS);
			setState(443);
			match(DISCARDED);
			setState(444);
			match(FROM);
			setState(445);
			match(ID);
			setState(446);
			match(APOS_S);
			setState(447);
			pokemon_card();
			setState(448);
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
	public static class Damage_taken_actionContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public TerminalNode MORE_WORD() { return getToken(PokemonParser.MORE_WORD, 0); }
		public TerminalNode BECAUSE() { return getToken(PokemonParser.BECAUSE, 0); }
		public TerminalNode OF() { return getToken(PokemonParser.OF, 0); }
		public TerminalNode WEAKNESS() { return getToken(PokemonParser.WEAKNESS, 0); }
		public TerminalNode FIGHTING() { return getToken(PokemonParser.FIGHTING, 0); }
		public Damage_taken_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_taken_action; }
	}

	public final Damage_taken_actionContext damage_taken_action() throws RecognitionException {
		Damage_taken_actionContext _localctx = new Damage_taken_actionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_damage_taken_action);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(450);
					match(ID);
					setState(451);
					match(APOS_S);
					}
				}

				setState(454);
				pokemon_card();
				setState(455);
				match(TOOK);
				setState(456);
				number();
				setState(457);
				match(DAMAGE);
				setState(458);
				match(PUNTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(460);
					match(ID);
					setState(461);
					match(APOS_S);
					}
				}

				setState(464);
				pokemon_card();
				setState(465);
				match(TOOK);
				setState(466);
				number();
				setState(467);
				match(MORE_WORD);
				setState(468);
				match(DAMAGE);
				setState(469);
				match(BECAUSE);
				setState(470);
				match(OF);
				setState(471);
				_la = _input.LA(1);
				if ( !(_la==FIGHTING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(472);
				match(WEAKNESS);
				setState(473);
				match(PUNTO);
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
	public static class End_turnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode ENDED() { return getToken(PokemonParser.ENDED, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode TURN() { return getToken(PokemonParser.TURN, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public End_turnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_turn; }
	}

	public final End_turnContext end_turn() throws RecognitionException {
		End_turnContext _localctx = new End_turnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_end_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(ID);
			setState(478);
			match(ENDED);
			setState(479);
			match(THEIR);
			setState(480);
			match(TURN);
			setState(481);
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
	public static class Sub_effectContext extends ParserRuleContext {
		public TerminalNode RAYA() { return getToken(PokemonParser.RAYA, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Drawn_cards_effectContext drawn_cards_effect() {
			return getRuleContext(Drawn_cards_effectContext.class,0);
		}
		public Draw_and_play_effectContext draw_and_play_effect() {
			return getRuleContext(Draw_and_play_effectContext.class,0);
		}
		public Draw_number_effectContext draw_number_effect() {
			return getRuleContext(Draw_number_effectContext.class,0);
		}
		public Draw_named_card_effectContext draw_named_card_effect() {
			return getRuleContext(Draw_named_card_effectContext.class,0);
		}
		public Shuffle_deck_effectContext shuffle_deck_effect() {
			return getRuleContext(Shuffle_deck_effectContext.class,0);
		}
		public Shuffle_cards_into_deck_effectContext shuffle_cards_into_deck_effect() {
			return getRuleContext(Shuffle_cards_into_deck_effectContext.class,0);
		}
		public Discard_number_effectContext discard_number_effect() {
			return getRuleContext(Discard_number_effectContext.class,0);
		}
		public Discard_named_card_effectContext discard_named_card_effect() {
			return getRuleContext(Discard_named_card_effectContext.class,0);
		}
		public Discard_from_pokemon_effectContext discard_from_pokemon_effect() {
			return getRuleContext(Discard_from_pokemon_effectContext.class,0);
		}
		public Discard_named_from_pokemon_effectContext discard_named_from_pokemon_effect() {
			return getRuleContext(Discard_named_from_pokemon_effectContext.class,0);
		}
		public Put_damage_counters_effectContext put_damage_counters_effect() {
			return getRuleContext(Put_damage_counters_effectContext.class,0);
		}
		public Switch_active_pokemon_effectContext switch_active_pokemon_effect() {
			return getRuleContext(Switch_active_pokemon_effectContext.class,0);
		}
		public Attach_card_effectContext attach_card_effect() {
			return getRuleContext(Attach_card_effectContext.class,0);
		}
		public Move_card_to_hand_effectContext move_card_to_hand_effect() {
			return getRuleContext(Move_card_to_hand_effectContext.class,0);
		}
		public Damage_taken_effectContext damage_taken_effect() {
			return getRuleContext(Damage_taken_effectContext.class,0);
		}
		public Mulligan_reveal_effectContext mulligan_reveal_effect() {
			return getRuleContext(Mulligan_reveal_effectContext.class,0);
		}
		public Generic_sub_effectContext generic_sub_effect() {
			return getRuleContext(Generic_sub_effectContext.class,0);
		}
		public Sub_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_effect; }
	}

	public final Sub_effectContext sub_effect() throws RecognitionException {
		Sub_effectContext _localctx = new Sub_effectContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sub_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(RAYA);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(484);
				drawn_cards_effect();
				}
				break;
			case 2:
				{
				setState(485);
				draw_and_play_effect();
				}
				break;
			case 3:
				{
				setState(486);
				draw_number_effect();
				}
				break;
			case 4:
				{
				setState(487);
				draw_named_card_effect();
				}
				break;
			case 5:
				{
				setState(488);
				shuffle_deck_effect();
				}
				break;
			case 6:
				{
				setState(489);
				shuffle_cards_into_deck_effect();
				}
				break;
			case 7:
				{
				setState(490);
				discard_number_effect();
				}
				break;
			case 8:
				{
				setState(491);
				discard_named_card_effect();
				}
				break;
			case 9:
				{
				setState(492);
				discard_from_pokemon_effect();
				}
				break;
			case 10:
				{
				setState(493);
				discard_named_from_pokemon_effect();
				}
				break;
			case 11:
				{
				setState(494);
				put_damage_counters_effect();
				}
				break;
			case 12:
				{
				setState(495);
				switch_active_pokemon_effect();
				}
				break;
			case 13:
				{
				setState(496);
				attach_card_effect();
				}
				break;
			case 14:
				{
				setState(497);
				move_card_to_hand_effect();
				}
				break;
			case 15:
				{
				setState(498);
				damage_taken_effect();
				}
				break;
			case 16:
				{
				setState(499);
				mulligan_reveal_effect();
				}
				break;
			case 17:
				{
				setState(500);
				generic_sub_effect();
				}
				break;
			}
			setState(503);
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
	public static class Drawn_cards_effectContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DRAWN() { return getToken(PokemonParser.DRAWN, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Drawn_cards_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawn_cards_effect; }
	}

	public final Drawn_cards_effectContext drawn_cards_effect() throws RecognitionException {
		Drawn_cards_effectContext _localctx = new Drawn_cards_effectContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_drawn_cards_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			number();
			setState(506);
			match(DRAWN);
			setState(507);
			match(CARDS);
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
	public static class Draw_number_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Draw_number_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_number_effect; }
	}

	public final Draw_number_effectContext draw_number_effect() throws RecognitionException {
		Draw_number_effectContext _localctx = new Draw_number_effectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_draw_number_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(ID);
			setState(510);
			match(DREW);
			setState(511);
			number();
			setState(512);
			_la = _input.LA(1);
			if ( !(_la==CARD || _la==CARDS) ) {
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
	public static class Draw_named_card_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public Draw_named_card_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_named_card_effect; }
	}

	public final Draw_named_card_effectContext draw_named_card_effect() throws RecognitionException {
		Draw_named_card_effectContext _localctx = new Draw_named_card_effectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_draw_named_card_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(ID);
			setState(515);
			match(DREW);
			setState(516);
			card_name();
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
	public static class Draw_and_play_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode AND() { return getToken(PokemonParser.AND, 0); }
		public TerminalNode PLAYED() { return getToken(PokemonParser.PLAYED, 0); }
		public TerminalNode THEM() { return getToken(PokemonParser.THEM, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Draw_and_play_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_and_play_effect; }
	}

	public final Draw_and_play_effectContext draw_and_play_effect() throws RecognitionException {
		Draw_and_play_effectContext _localctx = new Draw_and_play_effectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_draw_and_play_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(ID);
			setState(519);
			match(DREW);
			setState(520);
			number();
			setState(521);
			_la = _input.LA(1);
			if ( !(_la==CARD || _la==CARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(522);
			match(AND);
			setState(523);
			match(PLAYED);
			setState(524);
			match(THEM);
			setState(525);
			match(TO);
			setState(526);
			match(THE);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BENCH:
				{
				setState(527);
				match(BENCH);
				}
				break;
			case ACTIVE:
				{
				setState(528);
				match(ACTIVE);
				setState(529);
				match(SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Shuffle_deck_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode SHUFFLED() { return getToken(PokemonParser.SHUFFLED, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(PokemonParser.DECK, 0); }
		public Shuffle_deck_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffle_deck_effect; }
	}

	public final Shuffle_deck_effectContext shuffle_deck_effect() throws RecognitionException {
		Shuffle_deck_effectContext _localctx = new Shuffle_deck_effectContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shuffle_deck_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(ID);
			setState(533);
			match(SHUFFLED);
			setState(534);
			match(THEIR);
			setState(535);
			match(DECK);
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
	public static class Shuffle_cards_into_deck_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode SHUFFLED() { return getToken(PokemonParser.SHUFFLED, 0); }
		public TerminalNode INTO() { return getToken(PokemonParser.INTO, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(PokemonParser.DECK, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode A() { return getToken(PokemonParser.A, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public Shuffle_cards_into_deck_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffle_cards_into_deck_effect; }
	}

	public final Shuffle_cards_into_deck_effectContext shuffle_cards_into_deck_effect() throws RecognitionException {
		Shuffle_cards_into_deck_effectContext _localctx = new Shuffle_cards_into_deck_effectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shuffle_cards_into_deck_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(ID);
			setState(538);
			match(SHUFFLED);
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEVEN:
			case NUM:
				{
				setState(539);
				number();
				setState(540);
				match(CARDS);
				}
				break;
			case A:
				{
				setState(542);
				match(A);
				setState(543);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(546);
			match(INTO);
			setState(547);
			match(THEIR);
			setState(548);
			match(DECK);
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
	public static class Discard_number_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DISCARDED() { return getToken(PokemonParser.DISCARDED, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Discard_number_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_number_effect; }
	}

	public final Discard_number_effectContext discard_number_effect() throws RecognitionException {
		Discard_number_effectContext _localctx = new Discard_number_effectContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_discard_number_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(ID);
			setState(551);
			match(DISCARDED);
			setState(552);
			number();
			setState(553);
			_la = _input.LA(1);
			if ( !(_la==CARD || _la==CARDS) ) {
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
	public static class Discard_named_card_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DISCARDED() { return getToken(PokemonParser.DISCARDED, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public Discard_named_card_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_named_card_effect; }
	}

	public final Discard_named_card_effectContext discard_named_card_effect() throws RecognitionException {
		Discard_named_card_effectContext _localctx = new Discard_named_card_effectContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_discard_named_card_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(ID);
			setState(556);
			match(DISCARDED);
			setState(557);
			card_name();
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
	public static class Discard_from_pokemon_effectContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DISCARDED() { return getToken(PokemonParser.DISCARDED, 0); }
		public TerminalNode FROM() { return getToken(PokemonParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode WERE() { return getToken(PokemonParser.WERE, 0); }
		public Discard_from_pokemon_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_from_pokemon_effect; }
	}

	public final Discard_from_pokemon_effectContext discard_from_pokemon_effect() throws RecognitionException {
		Discard_from_pokemon_effectContext _localctx = new Discard_from_pokemon_effectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_discard_from_pokemon_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			number();
			setState(560);
			_la = _input.LA(1);
			if ( !(_la==CARD || _la==CARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(561);
			_la = _input.LA(1);
			if ( !(_la==WAS || _la==WERE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(562);
			match(DISCARDED);
			setState(563);
			match(FROM);
			setState(564);
			match(ID);
			setState(565);
			match(APOS_S);
			setState(566);
			pokemon_card();
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
	public static class Discard_named_from_pokemon_effectContext extends ParserRuleContext {
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode DISCARDED() { return getToken(PokemonParser.DISCARDED, 0); }
		public TerminalNode FROM() { return getToken(PokemonParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public Discard_named_from_pokemon_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_named_from_pokemon_effect; }
	}

	public final Discard_named_from_pokemon_effectContext discard_named_from_pokemon_effect() throws RecognitionException {
		Discard_named_from_pokemon_effectContext _localctx = new Discard_named_from_pokemon_effectContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_discard_named_from_pokemon_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			card_name();
			setState(569);
			match(WAS);
			setState(570);
			match(DISCARDED);
			setState(571);
			match(FROM);
			setState(572);
			match(ID);
			setState(573);
			match(APOS_S);
			setState(574);
			pokemon_card();
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
	public static class Put_damage_counters_effectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode PUT() { return getToken(PokemonParser.PUT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode COUNTERS() { return getToken(PokemonParser.COUNTERS, 0); }
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public Put_damage_counters_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_damage_counters_effect; }
	}

	public final Put_damage_counters_effectContext put_damage_counters_effect() throws RecognitionException {
		Put_damage_counters_effectContext _localctx = new Put_damage_counters_effectContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_put_damage_counters_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(ID);
			setState(577);
			match(PUT);
			setState(578);
			number();
			setState(579);
			match(COUNTERS);
			setState(580);
			match(ON);
			setState(581);
			match(ID);
			setState(582);
			match(APOS_S);
			setState(583);
			pokemon_card();
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
	public static class Switch_active_pokemon_effectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public List<TerminalNode> APOS_S() { return getTokens(PokemonParser.APOS_S); }
		public TerminalNode APOS_S(int i) {
			return getToken(PokemonParser.APOS_S, i);
		}
		public List<Pokemon_cardContext> pokemon_card() {
			return getRuleContexts(Pokemon_cardContext.class);
		}
		public Pokemon_cardContext pokemon_card(int i) {
			return getRuleContext(Pokemon_cardContext.class,i);
		}
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode SWITCHED() { return getToken(PokemonParser.SWITCHED, 0); }
		public TerminalNode WITH() { return getToken(PokemonParser.WITH, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode BECOME() { return getToken(PokemonParser.BECOME, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode POKEMON() { return getToken(PokemonParser.POKEMON, 0); }
		public Switch_active_pokemon_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_active_pokemon_effect; }
	}

	public final Switch_active_pokemon_effectContext switch_active_pokemon_effect() throws RecognitionException {
		Switch_active_pokemon_effectContext _localctx = new Switch_active_pokemon_effectContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switch_active_pokemon_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(ID);
			setState(586);
			match(APOS_S);
			setState(587);
			pokemon_card();
			setState(588);
			match(WAS);
			setState(589);
			match(SWITCHED);
			setState(590);
			match(WITH);
			setState(591);
			match(ID);
			setState(592);
			match(APOS_S);
			setState(593);
			pokemon_card();
			setState(594);
			match(TO);
			setState(595);
			match(BECOME);
			setState(596);
			match(THE);
			setState(597);
			match(ACTIVE);
			setState(598);
			match(POKEMON);
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
	public static class Attach_card_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode ATTACHED() { return getToken(PokemonParser.ATTACHED, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public TerminalNode IN() { return getToken(PokemonParser.IN, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Attach_card_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_card_effect; }
	}

	public final Attach_card_effectContext attach_card_effect() throws RecognitionException {
		Attach_card_effectContext _localctx = new Attach_card_effectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_attach_card_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(ID);
			setState(601);
			match(ATTACHED);
			setState(602);
			card_name();
			setState(603);
			match(TO);
			setState(604);
			pokemon_card();
			{
			setState(605);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(606);
			match(THE);
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BENCH:
				{
				setState(607);
				match(BENCH);
				}
				break;
			case ACTIVE:
				{
				setState(608);
				match(ACTIVE);
				setState(609);
				match(SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Move_card_to_hand_effectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode MOVED() { return getToken(PokemonParser.MOVED, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode HAND() { return getToken(PokemonParser.HAND, 0); }
		public Move_card_to_hand_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_card_to_hand_effect; }
	}

	public final Move_card_to_hand_effectContext move_card_to_hand_effect() throws RecognitionException {
		Move_card_to_hand_effectContext _localctx = new Move_card_to_hand_effectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_move_card_to_hand_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(ID);
			setState(613);
			match(MOVED);
			setState(614);
			match(ID);
			setState(615);
			match(APOS_S);
			setState(616);
			card_name();
			setState(617);
			match(TO);
			setState(618);
			match(THEIR);
			setState(619);
			match(HAND);
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
	public static class Damage_taken_effectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public TerminalNode MORE_WORD() { return getToken(PokemonParser.MORE_WORD, 0); }
		public TerminalNode BECAUSE() { return getToken(PokemonParser.BECAUSE, 0); }
		public TerminalNode OF() { return getToken(PokemonParser.OF, 0); }
		public TerminalNode WEAKNESS() { return getToken(PokemonParser.WEAKNESS, 0); }
		public TerminalNode FIGHTING() { return getToken(PokemonParser.FIGHTING, 0); }
		public Damage_taken_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_taken_effect; }
	}

	public final Damage_taken_effectContext damage_taken_effect() throws RecognitionException {
		Damage_taken_effectContext _localctx = new Damage_taken_effectContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_damage_taken_effect);
		int _la;
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(ID);
				setState(622);
				match(APOS_S);
				setState(623);
				pokemon_card();
				setState(624);
				match(TOOK);
				setState(625);
				number();
				setState(626);
				match(DAMAGE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(ID);
				setState(629);
				match(APOS_S);
				setState(630);
				pokemon_card();
				setState(631);
				match(TOOK);
				setState(632);
				number();
				setState(633);
				match(MORE_WORD);
				setState(634);
				match(DAMAGE);
				setState(635);
				match(BECAUSE);
				setState(636);
				match(OF);
				setState(637);
				_la = _input.LA(1);
				if ( !(_la==FIGHTING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(638);
				match(WEAKNESS);
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
	public static class Mulligan_reveal_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode REVEALED() { return getToken(PokemonParser.REVEALED, 0); }
		public TerminalNode FROM() { return getToken(PokemonParser.FROM, 0); }
		public TerminalNode MULLIGAN() { return getToken(PokemonParser.MULLIGAN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Mulligan_reveal_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulligan_reveal_effect; }
	}

	public final Mulligan_reveal_effectContext mulligan_reveal_effect() throws RecognitionException {
		Mulligan_reveal_effectContext _localctx = new Mulligan_reveal_effectContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mulligan_reveal_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(ID);
			setState(643);
			match(REVEALED);
			setState(644);
			match(FROM);
			setState(645);
			match(MULLIGAN);
			setState(646);
			number();
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
	public static class Generic_sub_effectContext extends ParserRuleContext {
		public List<TerminalNode> PUNTO() { return getTokens(PokemonParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(PokemonParser.PUNTO, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PokemonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PokemonParser.NEWLINE, i);
		}
		public Generic_sub_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_sub_effect; }
	}

	public final Generic_sub_effectContext generic_sub_effect() throws RecognitionException {
		Generic_sub_effectContext _localctx = new Generic_sub_effectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_generic_sub_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(648);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==PUNTO || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -1028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4398046511103L) != 0) );
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
	public static class Damage_breakdownContext extends ParserRuleContext {
		public TerminalNode RAYA() { return getToken(PokemonParser.RAYA, 0); }
		public TerminalNode DAMAGE_BREAKDOWN() { return getToken(PokemonParser.DAMAGE_BREAKDOWN, 0); }
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(PokemonParser.DOS_PUNTOS, 0); }
		public List<Damage_breakdown_entryContext> damage_breakdown_entry() {
			return getRuleContexts(Damage_breakdown_entryContext.class);
		}
		public Damage_breakdown_entryContext damage_breakdown_entry(int i) {
			return getRuleContext(Damage_breakdown_entryContext.class,i);
		}
		public Damage_breakdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_breakdown; }
	}

	public final Damage_breakdownContext damage_breakdown() throws RecognitionException {
		Damage_breakdownContext _localctx = new Damage_breakdownContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_damage_breakdown);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(RAYA);
			setState(654);
			match(DAMAGE_BREAKDOWN);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(655);
				match(DOS_PUNTOS);
				}
			}

			setState(658);
			line_end();
			setState(660); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(659);
					damage_breakdown_entry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(662); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Damage_breakdown_entryContext extends ParserRuleContext {
		public TerminalNode PUNTO_RELLENO() { return getToken(PokemonParser.PUNTO_RELLENO, 0); }
		public TerminalNode BASE_DAMAGE() { return getToken(PokemonParser.BASE_DAMAGE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(PokemonParser.DOS_PUNTOS, 0); }
		public TerminalNode PARENTESIS_ABRIR() { return getToken(PokemonParser.PARENTESIS_ABRIR, 0); }
		public TerminalNode ITEM() { return getToken(PokemonParser.ITEM, 0); }
		public TerminalNode PARENTESIS_CERRAR() { return getToken(PokemonParser.PARENTESIS_CERRAR, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode WEAKNESS() { return getToken(PokemonParser.WEAKNESS, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode FIGHTING() { return getToken(PokemonParser.FIGHTING, 0); }
		public TerminalNode TOTAL_DAMAGE() { return getToken(PokemonParser.TOTAL_DAMAGE, 0); }
		public Generic_damage_entryContext generic_damage_entry() {
			return getRuleContext(Generic_damage_entryContext.class,0);
		}
		public Damage_breakdown_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_breakdown_entry; }
	}

	public final Damage_breakdown_entryContext damage_breakdown_entry() throws RecognitionException {
		Damage_breakdown_entryContext _localctx = new Damage_breakdown_entryContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_damage_breakdown_entry);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(PUNTO_RELLENO);
				setState(665);
				match(BASE_DAMAGE);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(666);
					match(DOS_PUNTOS);
					}
				}

				setState(669);
				number();
				setState(670);
				match(DAMAGE);
				setState(671);
				line_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(PUNTO_RELLENO);
				setState(674);
				match(PARENTESIS_ABRIR);
				setState(675);
				match(ITEM);
				setState(676);
				match(PARENTESIS_CERRAR);
				setState(677);
				card_name();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(678);
					match(DOS_PUNTOS);
					}
				}

				setState(681);
				number();
				setState(682);
				match(DAMAGE);
				setState(683);
				line_end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(PUNTO_RELLENO);
				setState(686);
				match(WEAKNESS);
				setState(687);
				match(TO);
				setState(688);
				_la = _input.LA(1);
				if ( !(_la==FIGHTING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(689);
				number();
				setState(690);
				match(DAMAGE);
				setState(691);
				line_end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				match(PUNTO_RELLENO);
				setState(694);
				match(TOTAL_DAMAGE);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(695);
					match(DOS_PUNTOS);
					}
				}

				setState(698);
				number();
				setState(699);
				match(DAMAGE);
				setState(700);
				line_end();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(702);
				match(PUNTO_RELLENO);
				setState(703);
				generic_damage_entry();
				setState(704);
				line_end();
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
	public static class Generic_damage_entryContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PokemonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PokemonParser.NEWLINE, i);
		}
		public Generic_damage_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_damage_entry; }
	}

	public final Generic_damage_entryContext generic_damage_entry() throws RecognitionException {
		Generic_damage_entryContext _localctx = new Generic_damage_entryContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_generic_damage_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(708);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(711); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -1026L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4398046511103L) != 0) );
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
		enterRule(_localctx, 98, RULE_bullet_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(PUNTO_RELLENO);
			setState(714);
			card_name();
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(715);
				match(COMA);
				setState(716);
				card_name();
				}
				}
				setState(721);
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
	public static class Card_nameContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public Energy_cardContext energy_card() {
			return getRuleContext(Energy_cardContext.class,0);
		}
		public Item_cardContext item_card() {
			return getRuleContext(Item_cardContext.class,0);
		}
		public Supporter_cardContext supporter_card() {
			return getRuleContext(Supporter_cardContext.class,0);
		}
		public Stadium_cardContext stadium_card() {
			return getRuleContext(Stadium_cardContext.class,0);
		}
		public Card_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_name; }
	}

	public final Card_nameContext card_name() throws RecognitionException {
		Card_nameContext _localctx = new Card_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_card_name);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARTA_POKEMON:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				pokemon_card();
				}
				break;
			case CARTA_ENERGIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				energy_card();
				}
				break;
			case CARTA_ITEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				item_card();
				}
				break;
			case CARTA_SUPPORTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				supporter_card();
				}
				break;
			case CARTA_STADIUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				stadium_card();
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
		public TerminalNode CARTA_POKEMON() { return getToken(PokemonParser.CARTA_POKEMON, 0); }
		public Pokemon_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_card; }
	}

	public final Pokemon_cardContext pokemon_card() throws RecognitionException {
		Pokemon_cardContext _localctx = new Pokemon_cardContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pokemon_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(CARTA_POKEMON);
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
		public TerminalNode CARTA_ENERGIA() { return getToken(PokemonParser.CARTA_ENERGIA, 0); }
		public Energy_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_energy_card; }
	}

	public final Energy_cardContext energy_card() throws RecognitionException {
		Energy_cardContext _localctx = new Energy_cardContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_energy_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(CARTA_ENERGIA);
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
		public TerminalNode CARTA_ITEM() { return getToken(PokemonParser.CARTA_ITEM, 0); }
		public Item_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_card; }
	}

	public final Item_cardContext item_card() throws RecognitionException {
		Item_cardContext _localctx = new Item_cardContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_item_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(CARTA_ITEM);
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
		public TerminalNode CARTA_SUPPORTER() { return getToken(PokemonParser.CARTA_SUPPORTER, 0); }
		public Supporter_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supporter_card; }
	}

	public final Supporter_cardContext supporter_card() throws RecognitionException {
		Supporter_cardContext _localctx = new Supporter_cardContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_supporter_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(CARTA_SUPPORTER);
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
	public static class Stadium_cardContext extends ParserRuleContext {
		public TerminalNode CARTA_STADIUM() { return getToken(PokemonParser.CARTA_STADIUM, 0); }
		public Stadium_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stadium_card; }
	}

	public final Stadium_cardContext stadium_card() throws RecognitionException {
		Stadium_cardContext _localctx = new Stadium_cardContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_stadium_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(CARTA_STADIUM);
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
	public static class Attack_nameContext extends ParserRuleContext {
		public TerminalNode ATAQUE() { return getToken(PokemonParser.ATAQUE, 0); }
		public Attack_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack_name; }
	}

	public final Attack_nameContext attack_name() throws RecognitionException {
		Attack_nameContext _localctx = new Attack_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_attack_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(ATAQUE);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(PokemonParser.NUM, 0); }
		public TerminalNode SEVEN() { return getToken(PokemonParser.SEVEN, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( !(_la==SEVEN || _la==NUM) ) {
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
		public End_reasonContext end_reason() {
			return getRuleContext(End_reasonContext.class,0);
		}
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode WINS() { return getToken(PokemonParser.WINS, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			end_reason();
			setState(744);
			match(ID);
			setState(745);
			match(WINS);
			setState(746);
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
	public static class End_reasonContext extends ParserRuleContext {
		public TerminalNode OPPONENT() { return getToken(PokemonParser.OPPONENT, 0); }
		public TerminalNode CONCEDED() { return getToken(PokemonParser.CONCEDED, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode ALL() { return getToken(PokemonParser.ALL, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonParser.PRIZE, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode TAKEN() { return getToken(PokemonParser.TAKEN, 0); }
		public TerminalNode NO() { return getToken(PokemonParser.NO, 0); }
		public TerminalNode BENCHED() { return getToken(PokemonParser.BENCHED, 0); }
		public TerminalNode POKEMON() { return getToken(PokemonParser.POKEMON, 0); }
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public TerminalNode BACKUP() { return getToken(PokemonParser.BACKUP, 0); }
		public End_reasonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_reason; }
	}

	public final End_reasonContext end_reason() throws RecognitionException {
		End_reasonContext _localctx = new End_reasonContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_end_reason);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				match(OPPONENT);
				setState(749);
				match(CONCEDED);
				setState(750);
				match(PUNTO);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				match(ALL);
				setState(752);
				match(PRIZE);
				setState(753);
				match(CARDS);
				setState(754);
				match(TAKEN);
				setState(755);
				match(PUNTO);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(NO);
				setState(757);
				match(BENCHED);
				setState(758);
				match(POKEMON);
				setState(759);
				match(FOR);
				setState(760);
				match(BACKUP);
				setState(761);
				match(PUNTO);
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
	public static class Line_endContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PokemonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PokemonParser.NEWLINE, i);
		}
		public Line_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_end; }
	}

	public final Line_endContext line_end() throws RecognitionException {
		Line_endContext _localctx = new Line_endContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_line_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(764);
				match(NEWLINE);
				}
				}
				setState(767); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
		"\u0004\u0001i\u0302\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0001\u0000\u0005\u0000|\b\u0000\n\u0000\f\u0000\u007f\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0083\b\u0000\n\u0000\f\u0000\u0086"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u008a\b\u0000\n\u0000\f\u0000"+
		"\u008d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0094\b\u0001\n\u0001\f\u0001\u0097\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b7"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00f9\b\n\n\n\f\n\u00fc\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0112\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0121\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u012d\b\u000e\u0003\u000e\u012f\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0138\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0146\b\u0010\u0003\u0010\u0148\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0156\b\u0011\u0003\u0011\u0158\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0169\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u016d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0186\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0195\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0199\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01a3\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u01a7\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01b0\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01c5"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01cf\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01dc\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01f6\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0213\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0221\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u0263\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u0281\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0004-\u028a\b-\u000b-\f-\u028b\u0001.\u0001.\u0001.\u0003.\u0291"+
		"\b.\u0001.\u0001.\u0004.\u0295\b.\u000b.\f.\u0296\u0001/\u0001/\u0001"+
		"/\u0003/\u029c\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u02a8\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u02b9\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u02c3\b/\u00010\u00040\u02c6\b0\u000b0\f0\u02c7\u00011\u00011\u0001"+
		"1\u00011\u00051\u02ce\b1\n1\f1\u02d1\t1\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u02d8\b2\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u0001"+
		"6\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u02fb\b;\u0001<\u0004<\u02fe"+
		"\b<\u000b<\f<\u02ff\u0001<\u0000\u0000=\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\b\u0001\u0000\u0010\u0011\u0001"+
		"\u0000*+\u0002\u0000ggii\u0001\u0000\u001d\u001e\u0001\u000078\u0002\u0000"+
		"\u0001\u0001\n\n\u0001\u0000\n\n\u0002\u0000##hh\u031d\u0000}\u0001\u0000"+
		"\u0000\u0000\u0002\u0090\u0001\u0000\u0000\u0000\u0004\u00b6\u0001\u0000"+
		"\u0000\u0000\u0006\u00b8\u0001\u0000\u0000\u0000\b\u00c2\u0001\u0000\u0000"+
		"\u0000\n\u00c9\u0001\u0000\u0000\u0000\f\u00d0\u0001\u0000\u0000\u0000"+
		"\u000e\u00da\u0001\u0000\u0000\u0000\u0010\u00e1\u0001\u0000\u0000\u0000"+
		"\u0012\u00ef\u0001\u0000\u0000\u0000\u0014\u00f5\u0001\u0000\u0000\u0000"+
		"\u0016\u00fd\u0001\u0000\u0000\u0000\u0018\u0111\u0001\u0000\u0000\u0000"+
		"\u001a\u0120\u0001\u0000\u0000\u0000\u001c\u0122\u0001\u0000\u0000\u0000"+
		"\u001e\u0132\u0001\u0000\u0000\u0000 \u013b\u0001\u0000\u0000\u0000\""+
		"\u014b\u0001\u0000\u0000\u0000$\u015b\u0001\u0000\u0000\u0000&\u016e\u0001"+
		"\u0000\u0000\u0000(\u017b\u0001\u0000\u0000\u0000*\u0185\u0001\u0000\u0000"+
		"\u0000,\u01a2\u0001\u0000\u0000\u0000.\u01a6\u0001\u0000\u0000\u00000"+
		"\u01af\u0001\u0000\u0000\u00002\u01b9\u0001\u0000\u0000\u00004\u01db\u0001"+
		"\u0000\u0000\u00006\u01dd\u0001\u0000\u0000\u00008\u01e3\u0001\u0000\u0000"+
		"\u0000:\u01f9\u0001\u0000\u0000\u0000<\u01fd\u0001\u0000\u0000\u0000>"+
		"\u0202\u0001\u0000\u0000\u0000@\u0206\u0001\u0000\u0000\u0000B\u0214\u0001"+
		"\u0000\u0000\u0000D\u0219\u0001\u0000\u0000\u0000F\u0226\u0001\u0000\u0000"+
		"\u0000H\u022b\u0001\u0000\u0000\u0000J\u022f\u0001\u0000\u0000\u0000L"+
		"\u0238\u0001\u0000\u0000\u0000N\u0240\u0001\u0000\u0000\u0000P\u0249\u0001"+
		"\u0000\u0000\u0000R\u0258\u0001\u0000\u0000\u0000T\u0264\u0001\u0000\u0000"+
		"\u0000V\u0280\u0001\u0000\u0000\u0000X\u0282\u0001\u0000\u0000\u0000Z"+
		"\u0289\u0001\u0000\u0000\u0000\\\u028d\u0001\u0000\u0000\u0000^\u02c2"+
		"\u0001\u0000\u0000\u0000`\u02c5\u0001\u0000\u0000\u0000b\u02c9\u0001\u0000"+
		"\u0000\u0000d\u02d7\u0001\u0000\u0000\u0000f\u02d9\u0001\u0000\u0000\u0000"+
		"h\u02db\u0001\u0000\u0000\u0000j\u02dd\u0001\u0000\u0000\u0000l\u02df"+
		"\u0001\u0000\u0000\u0000n\u02e1\u0001\u0000\u0000\u0000p\u02e3\u0001\u0000"+
		"\u0000\u0000r\u02e5\u0001\u0000\u0000\u0000t\u02e7\u0001\u0000\u0000\u0000"+
		"v\u02fa\u0001\u0000\u0000\u0000x\u02fd\u0001\u0000\u0000\u0000z|\u0005"+
		"\n\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0084\u0003\u0002\u0001"+
		"\u0000\u0081\u0083\u0003\u0014\n\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008b\u0003t:\u0000\u0088\u008a"+
		"\u0005\n\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0000\u0000\u0001\u008f\u0001\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0095\u0003x"+
		"<\u0000\u0092\u0094\u0003\u0004\u0002\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0003\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0006\u0003"+
		"\u0000\u0099\u009a\u0003x<\u0000\u009a\u00b7\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0003\b\u0004\u0000\u009c\u009d\u0003x<\u0000\u009d\u00b7\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0003\n\u0005\u0000\u009f\u00a0\u0003x"+
		"<\u0000\u00a0\u00b7\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\f\u0006"+
		"\u0000\u00a2\u00a3\u0003x<\u0000\u00a3\u00b7\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u00038\u001c\u0000\u00a5\u00a6\u0003x<\u0000\u00a6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000\u00a8\u00a9\u0003"+
		"x<\u0000\u00a9\u00b7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0010\b"+
		"\u0000\u00ab\u00ac\u0003x<\u0000\u00ac\u00b7\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0003\u0012\t\u0000\u00ae\u00af\u0003x<\u0000\u00af\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0003\u001a\r\u0000\u00b1\u00b2\u0003x"+
		"<\u0000\u00b2\u00b7\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003b1\u0000"+
		"\u00b4\u00b5\u0003x<\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u0098"+
		"\u0001\u0000\u0000\u0000\u00b6\u009b\u0001\u0000\u0000\u0000\u00b6\u009e"+
		"\u0001\u0000\u0000\u0000\u00b6\u00a1\u0001\u0000\u0000\u0000\u00b6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00a7\u0001\u0000\u0000\u0000\u00b6\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7\u0005"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005i\u0000\u0000\u00b9\u00ba\u0005"+
		"\u000f\u0000\u0000\u00ba\u00bb\u0007\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u001f\u0000\u0000\u00bc\u00bd\u0005 \u0000\u0000\u00bd\u00be\u0005!\u0000"+
		"\u0000\u00be\u00bf\u0005\u0012\u0000\u0000\u00bf\u00c0\u0005\u0013\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0001\u0000\u0000\u00c1\u0007\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005i\u0000\u0000\u00c3\u00c4\u0005\u0014\u0000\u0000"+
		"\u00c4\u00c5\u0005 \u0000\u0000\u00c5\u00c6\u0005\u0012\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0015\u0000\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8"+
		"\t\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005i\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0016\u0000\u0000\u00cb\u00cc\u0005&\u0000\u0000\u00cc\u00cd\u0005"+
		"\u0017\u0000\u0000\u00cd\u00ce\u0005\u0018\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0001\u0000\u0000\u00cf\u000b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"i\u0000\u0000\u00d1\u00d2\u0005\u0019\u0000\u0000\u00d2\u00d3\u0005#\u0000"+
		"\u0000\u00d3\u00d4\u0005\u001e\u0000\u0000\u00d4\u00d5\u0005\u001f\u0000"+
		"\u0000\u00d5\u00d6\u0005 \u0000\u0000\u00d6\u00d7\u0005!\u0000\u0000\u00d7"+
		"\u00d8\u0005\"\u0000\u0000\u00d8\u00d9\u0005\u0001\u0000\u0000\u00d9\r"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc"+
		"\u0005i\u0000\u0000\u00dc\u00dd\u0005[\u0000\u0000\u00dd\u00de\u0005V"+
		"\u0000\u0000\u00de\u00df\u0005Z\u0000\u0000\u00df\u00e0\u0003r9\u0000"+
		"\u00e0\u000f\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005i\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0019\u0000\u0000\u00e3\u00e4\u0003r9\u0000\u00e4\u00e5\u0005"+
		";\u0000\u0000\u00e5\u00e6\u0005\u001d\u0000\u0000\u00e6\u00e7\u0005\\"+
		"\u0000\u0000\u00e7\u00e8\u0005i\u0000\u0000\u00e8\u00e9\u0005:\u0000\u0000"+
		"\u00e9\u00ea\u0005]\u0000\u0000\u00ea\u00eb\u0005^\u0000\u0000\u00eb\u00ec"+
		"\u0003r9\u0000\u00ec\u00ed\u0005Z\u0000\u0000\u00ed\u00ee\u0005\u0001"+
		"\u0000\u0000\u00ee\u0011\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005i\u0000"+
		"\u0000\u00f0\u00f1\u0005:\u0000\u0000\u00f1\u00f2\u0005\u001b\u0000\u0000"+
		"\u00f2\u00f3\u0005Z\u0000\u0000\u00f3\u00f4\u0005\u0001\u0000\u0000\u00f4"+
		"\u0013\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003\u0016\u000b\u0000\u00f6"+
		"\u00fa\u0003x<\u0000\u00f7\u00f9\u0003\u0018\f\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0015\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"i\u0000\u0000\u00fe\u00ff\u0005\t\u0000\u0000\u00ff\u0100\u0005\u000e"+
		"\u0000\u0000\u0100\u0017\u0001\u0000\u0000\u0000\u0101\u0102\u0003\u001a"+
		"\r\u0000\u0102\u0103\u0003x<\u0000\u0103\u0112\u0001\u0000\u0000\u0000"+
		"\u0104\u0112\u0003\\.\u0000\u0105\u0106\u00038\u001c\u0000\u0106\u0107"+
		"\u0003x<\u0000\u0107\u0112\u0001\u0000\u0000\u0000\u0108\u0109\u0003b"+
		"1\u0000\u0109\u010a\u0003x<\u0000\u010a\u0112\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0003\u000e\u0007\u0000\u010c\u010d\u0003x<\u0000\u010d\u0112"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0003\u0010\b\u0000\u010f\u0110\u0003"+
		"x<\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u0101\u0001\u0000\u0000"+
		"\u0000\u0111\u0104\u0001\u0000\u0000\u0000\u0111\u0105\u0001\u0000\u0000"+
		"\u0000\u0111\u0108\u0001\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000"+
		"\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0112\u0019\u0001\u0000\u0000"+
		"\u0000\u0113\u0121\u0003\u001c\u000e\u0000\u0114\u0121\u0003\u001e\u000f"+
		"\u0000\u0115\u0121\u0003 \u0010\u0000\u0116\u0121\u0003\"\u0011\u0000"+
		"\u0117\u0121\u0003$\u0012\u0000\u0118\u0121\u0003(\u0014\u0000\u0119\u0121"+
		"\u0003*\u0015\u0000\u011a\u0121\u0003,\u0016\u0000\u011b\u0121\u0003."+
		"\u0017\u0000\u011c\u0121\u00030\u0018\u0000\u011d\u0121\u00032\u0019\u0000"+
		"\u011e\u0121\u00034\u001a\u0000\u011f\u0121\u00036\u001b\u0000\u0120\u0113"+
		"\u0001\u0000\u0000\u0000\u0120\u0114\u0001\u0000\u0000\u0000\u0120\u0115"+
		"\u0001\u0000\u0000\u0000\u0120\u0116\u0001\u0000\u0000\u0000\u0120\u0117"+
		"\u0001\u0000\u0000\u0000\u0120\u0118\u0001\u0000\u0000\u0000\u0120\u0119"+
		"\u0001\u0000\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011b"+
		"\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011d"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u0121\u001b\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0005i\u0000\u0000\u0123\u0124\u0005$\u0000\u0000\u0124\u012e\u0003d"+
		"2\u0000\u0125\u0126\u0005&\u0000\u0000\u0126\u012c\u0005 \u0000\u0000"+
		"\u0127\u012d\u0005)\u0000\u0000\u0128\u0129\u0005\'\u0000\u0000\u0129"+
		"\u012d\u0005(\u0000\u0000\u012a\u012b\u0005W\u0000\u0000\u012b\u012d\u0005"+
		"(\u0000\u0000\u012c\u0127\u0001\u0000\u0000\u0000\u012c\u0128\u0001\u0000"+
		"\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u0125\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0001"+
		"\u0000\u0000\u0131\u001d\u0001\u0000\u0000\u0000\u0132\u0133\u0005i\u0000"+
		"\u0000\u0133\u0137\u0005\u0019\u0000\u0000\u0134\u0135\u0005\u001b\u0000"+
		"\u0000\u0135\u0138\u0005\u001d\u0000\u0000\u0136\u0138\u0003d2\u0000\u0137"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u0001\u0000\u0000\u013a"+
		"\u001f\u0001\u0000\u0000\u0000\u013b\u013c\u0005i\u0000\u0000\u013c\u013d"+
		"\u0005,\u0000\u0000\u013d\u013e\u0003d2\u0000\u013e\u013f\u0005&\u0000"+
		"\u0000\u013f\u0147\u0003f3\u0000\u0140\u0141\u0007\u0001\u0000\u0000\u0141"+
		"\u0145\u0005 \u0000\u0000\u0142\u0146\u0005)\u0000\u0000\u0143\u0144\u0005"+
		"\'\u0000\u0000\u0144\u0146\u0005(\u0000\u0000\u0145\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0140\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0001"+
		"\u0000\u0000\u014a!\u0001\u0000\u0000\u0000\u014b\u014c\u0005i\u0000\u0000"+
		"\u014c\u014d\u0005-\u0000\u0000\u014d\u014e\u0003f3\u0000\u014e\u014f"+
		"\u0005&\u0000\u0000\u014f\u0157\u0003f3\u0000\u0150\u0151\u0007\u0001"+
		"\u0000\u0000\u0151\u0155\u0005 \u0000\u0000\u0152\u0156\u0005)\u0000\u0000"+
		"\u0153\u0154\u0005\'\u0000\u0000\u0154\u0156\u0005(\u0000\u0000\u0155"+
		"\u0152\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u0001\u0000\u0000\u0000\u0157\u0150\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005\u0001\u0000\u0000\u015a#\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005i\u0000\u0000\u015c\u015d\u0005\t\u0000\u0000\u015d\u015e\u0003"+
		"f3\u0000\u015e\u015f\u0005.\u0000\u0000\u015f\u0168\u0003p8\u0000\u0160"+
		"\u0161\u0005+\u0000\u0000\u0161\u0162\u0005i\u0000\u0000\u0162\u0163\u0005"+
		"\t\u0000\u0000\u0163\u0164\u0003f3\u0000\u0164\u0165\u0005\u001f\u0000"+
		"\u0000\u0165\u0166\u0003r9\u0000\u0166\u0167\u00052\u0000\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u0160\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u016c\u0005\u0001\u0000\u0000\u016b\u016d\u0003&\u0013\u0000\u016c\u016b"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d%\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005i\u0000\u0000\u016f\u0170\u0005\t"+
		"\u0000\u0000\u0170\u0171\u0003f3\u0000\u0171\u0172\u0005:\u0000\u0000"+
		"\u0172\u0173\u0003r9\u0000\u0173\u0174\u0005;\u0000\u0000\u0174\u0175"+
		"\u00052\u0000\u0000\u0175\u0176\u0005\\\u0000\u0000\u0176\u0177\u0005"+
		"`\u0000\u0000\u0177\u0178\u0007\u0002\u0000\u0000\u0178\u0179\u0005_\u0000"+
		"\u0000\u0179\u017a\u0005\u0001\u0000\u0000\u017a\'\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0005i\u0000\u0000\u017c\u017d\u0005B\u0000\u0000\u017d\u017e"+
		"\u0003f3\u0000\u017e\u017f\u0005&\u0000\u0000\u017f\u0180\u0005 \u0000"+
		"\u0000\u0180\u0181\u0005)\u0000\u0000\u0181\u0182\u0005\u0001\u0000\u0000"+
		"\u0182)\u0001\u0000\u0000\u0000\u0183\u0184\u0005i\u0000\u0000\u0184\u0186"+
		"\u0005\t\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0003"+
		"f3\u0000\u0188\u0189\u0005X\u0000\u0000\u0189\u018a\u0005Y\u0000\u0000"+
		"\u018a\u018b\u0005*\u0000\u0000\u018b\u018c\u0005 \u0000\u0000\u018c\u018d"+
		"\u0005\'\u0000\u0000\u018d\u018e\u0005(\u0000\u0000\u018e\u018f\u0005"+
		"\u0001\u0000\u0000\u018f+\u0001\u0000\u0000\u0000\u0190\u0191\u0005i\u0000"+
		"\u0000\u0191\u0194\u0005:\u0000\u0000\u0192\u0195\u0005\u001b\u0000\u0000"+
		"\u0193\u0195\u0003r9\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0193"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198"+
		"\u0005<\u0000\u0000\u0197\u0199\u0005\u001d\u0000\u0000\u0198\u0197\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u01a3\u0005\u0001\u0000\u0000\u019b\u019c\u0005"+
		"i\u0000\u0000\u019c\u019d\u0005:\u0000\u0000\u019d\u019e\u0003r9\u0000"+
		"\u019e\u019f\u0005<\u0000\u0000\u019f\u01a0\u0005\u001e\u0000\u0000\u01a0"+
		"\u01a1\u0005\u0001\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2"+
		"\u0190\u0001\u0000\u0000\u0000\u01a2\u019b\u0001\u0000\u0000\u0000\u01a3"+
		"-\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005i\u0000\u0000\u01a5\u01a7\u0005"+
		"\t\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003f3\u0000"+
		"\u01a9\u01aa\u00057\u0000\u0000\u01aa\u01ab\u00059\u0000\u0000\u01ab/"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u001c\u0000\u0000\u01ad\u01b0"+
		"\u0005\u001d\u0000\u0000\u01ae\u01b0\u0003d2\u0000\u01af\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u00057\u0000\u0000\u01b2\u01b3\u0005=\u0000\u0000"+
		"\u01b3\u01b4\u0005&\u0000\u0000\u01b4\u01b5\u0005i\u0000\u0000\u01b5\u01b6"+
		"\u0005\t\u0000\u0000\u01b6\u01b7\u0005\"\u0000\u0000\u01b7\u01b8\u0005"+
		"\u0001\u0000\u0000\u01b81\u0001\u0000\u0000\u0000\u01b9\u01ba\u0003d2"+
		"\u0000\u01ba\u01bb\u00057\u0000\u0000\u01bb\u01bc\u0005%\u0000\u0000\u01bc"+
		"\u01bd\u0005V\u0000\u0000\u01bd\u01be\u0005i\u0000\u0000\u01be\u01bf\u0005"+
		"\t\u0000\u0000\u01bf\u01c0\u0003f3\u0000\u01c0\u01c1\u0005\u0001\u0000"+
		"\u0000\u01c13\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005i\u0000\u0000\u01c3"+
		"\u01c5\u0005\t\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0003f3\u0000\u01c7\u01c8\u0005:\u0000\u0000\u01c8\u01c9\u0003r9\u0000"+
		"\u01c9\u01ca\u00052\u0000\u0000\u01ca\u01cb\u0005\u0001\u0000\u0000\u01cb"+
		"\u01dc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005i\u0000\u0000\u01cd\u01cf"+
		"\u0005\t\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003"+
		"f3\u0000\u01d1\u01d2\u0005:\u0000\u0000\u01d2\u01d3\u0003r9\u0000\u01d3"+
		"\u01d4\u0005;\u0000\u0000\u01d4\u01d5\u00052\u0000\u0000\u01d5\u01d6\u0005"+
		"\\\u0000\u0000\u01d6\u01d7\u0005`\u0000\u0000\u01d7\u01d8\u0007\u0002"+
		"\u0000\u0000\u01d8\u01d9\u0005_\u0000\u0000\u01d9\u01da\u0005\u0001\u0000"+
		"\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01c4\u0001\u0000\u0000"+
		"\u0000\u01db\u01ce\u0001\u0000\u0000\u0000\u01dc5\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0005i\u0000\u0000\u01de\u01df\u0005G\u0000\u0000\u01df\u01e0"+
		"\u0005D\u0000\u0000\u01e0\u01e1\u0005\r\u0000\u0000\u01e1\u01e2\u0005"+
		"\u0001\u0000\u0000\u01e27\u0001\u0000\u0000\u0000\u01e3\u01f5\u0005\u0003"+
		"\u0000\u0000\u01e4\u01f6\u0003:\u001d\u0000\u01e5\u01f6\u0003@ \u0000"+
		"\u01e6\u01f6\u0003<\u001e\u0000\u01e7\u01f6\u0003>\u001f\u0000\u01e8\u01f6"+
		"\u0003B!\u0000\u01e9\u01f6\u0003D\"\u0000\u01ea\u01f6\u0003F#\u0000\u01eb"+
		"\u01f6\u0003H$\u0000\u01ec\u01f6\u0003J%\u0000\u01ed\u01f6\u0003L&\u0000"+
		"\u01ee\u01f6\u0003N\'\u0000\u01ef\u01f6\u0003P(\u0000\u01f0\u01f6\u0003"+
		"R)\u0000\u01f1\u01f6\u0003T*\u0000\u01f2\u01f6\u0003V+\u0000\u01f3\u01f6"+
		"\u0003X,\u0000\u01f4\u01f6\u0003Z-\u0000\u01f5\u01e4\u0001\u0000\u0000"+
		"\u0000\u01f5\u01e5\u0001\u0000\u0000\u0000\u01f5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01f5\u01e7\u0001\u0000\u0000\u0000\u01f5\u01e8\u0001\u0000\u0000"+
		"\u0000\u01f5\u01e9\u0001\u0000\u0000\u0000\u01f5\u01ea\u0001\u0000\u0000"+
		"\u0000\u01f5\u01eb\u0001\u0000\u0000\u0000\u01f5\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f5\u01ed\u0001\u0000\u0000\u0000\u01f5\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f5\u01ef\u0001\u0000\u0000\u0000\u01f5\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f1\u0001\u0000\u0000\u0000\u01f5\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u0001\u0000"+
		"\u0000\u01f89\u0001\u0000\u0000\u0000\u01f9\u01fa\u0003r9\u0000\u01fa"+
		"\u01fb\u0005\u001a\u0000\u0000\u01fb\u01fc\u0005\u001e\u0000\u0000\u01fc"+
		";\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005i\u0000\u0000\u01fe\u01ff\u0005"+
		"\u0019\u0000\u0000\u01ff\u0200\u0003r9\u0000\u0200\u0201\u0007\u0003\u0000"+
		"\u0000\u0201=\u0001\u0000\u0000\u0000\u0202\u0203\u0005i\u0000\u0000\u0203"+
		"\u0204\u0005\u0019\u0000\u0000\u0204\u0205\u0003d2\u0000\u0205?\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0005i\u0000\u0000\u0207\u0208\u0005\u0019"+
		"\u0000\u0000\u0208\u0209\u0003r9\u0000\u0209\u020a\u0007\u0003\u0000\u0000"+
		"\u020a\u020b\u0005P\u0000\u0000\u020b\u020c\u0005$\u0000\u0000\u020c\u020d"+
		"\u0005R\u0000\u0000\u020d\u020e\u0005&\u0000\u0000\u020e\u0212\u0005 "+
		"\u0000\u0000\u020f\u0213\u0005)\u0000\u0000\u0210\u0211\u0005\'\u0000"+
		"\u0000\u0211\u0213\u0005(\u0000\u0000\u0212\u020f\u0001\u0000\u0000\u0000"+
		"\u0212\u0210\u0001\u0000\u0000\u0000\u0213A\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0005i\u0000\u0000\u0215\u0216\u0005C\u0000\u0000\u0216\u0217\u0005"+
		"D\u0000\u0000\u0217\u0218\u0005E\u0000\u0000\u0218C\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0005i\u0000\u0000\u021a\u0220\u0005C\u0000\u0000\u021b"+
		"\u021c\u0003r9\u0000\u021c\u021d\u0005\u001e\u0000\u0000\u021d\u0221\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0005\u001b\u0000\u0000\u021f\u0221\u0005"+
		"\u001d\u0000\u0000\u0220\u021b\u0001\u0000\u0000\u0000\u0220\u021e\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0005"+
		"S\u0000\u0000\u0223\u0224\u0005D\u0000\u0000\u0224\u0225\u0005E\u0000"+
		"\u0000\u0225E\u0001\u0000\u0000\u0000\u0226\u0227\u0005i\u0000\u0000\u0227"+
		"\u0228\u0005%\u0000\u0000\u0228\u0229\u0003r9\u0000\u0229\u022a\u0007"+
		"\u0003\u0000\u0000\u022aG\u0001\u0000\u0000\u0000\u022b\u022c\u0005i\u0000"+
		"\u0000\u022c\u022d\u0005%\u0000\u0000\u022d\u022e\u0003d2\u0000\u022e"+
		"I\u0001\u0000\u0000\u0000\u022f\u0230\u0003r9\u0000\u0230\u0231\u0007"+
		"\u0003\u0000\u0000\u0231\u0232\u0007\u0004\u0000\u0000\u0232\u0233\u0005"+
		"%\u0000\u0000\u0233\u0234\u0005V\u0000\u0000\u0234\u0235\u0005i\u0000"+
		"\u0000\u0235\u0236\u0005\t\u0000\u0000\u0236\u0237\u0003f3\u0000\u0237"+
		"K\u0001\u0000\u0000\u0000\u0238\u0239\u0003d2\u0000\u0239\u023a\u0005"+
		"7\u0000\u0000\u023a\u023b\u0005%\u0000\u0000\u023b\u023c\u0005V\u0000"+
		"\u0000\u023c\u023d\u0005i\u0000\u0000\u023d\u023e\u0005\t\u0000\u0000"+
		"\u023e\u023f\u0003f3\u0000\u023fM\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0005i\u0000\u0000\u0241\u0242\u0005T\u0000\u0000\u0242\u0243\u0003r"+
		"9\u0000\u0243\u0244\u0005U\u0000\u0000\u0244\u0245\u0005+\u0000\u0000"+
		"\u0245\u0246\u0005i\u0000\u0000\u0246\u0247\u0005\t\u0000\u0000\u0247"+
		"\u0248\u0003f3\u0000\u0248O\u0001\u0000\u0000\u0000\u0249\u024a\u0005"+
		"i\u0000\u0000\u024a\u024b\u0005\t\u0000\u0000\u024b\u024c\u0003f3\u0000"+
		"\u024c\u024d\u00057\u0000\u0000\u024d\u024e\u0005>\u0000\u0000\u024e\u024f"+
		"\u0005?\u0000\u0000\u024f\u0250\u0005i\u0000\u0000\u0250\u0251\u0005\t"+
		"\u0000\u0000\u0251\u0252\u0003f3\u0000\u0252\u0253\u0005&\u0000\u0000"+
		"\u0253\u0254\u0005@\u0000\u0000\u0254\u0255\u0005 \u0000\u0000\u0255\u0256"+
		"\u0005\'\u0000\u0000\u0256\u0257\u0005A\u0000\u0000\u0257Q\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0005i\u0000\u0000\u0259\u025a\u0005,\u0000\u0000"+
		"\u025a\u025b\u0003d2\u0000\u025b\u025c\u0005&\u0000\u0000\u025c\u025d"+
		"\u0003f3\u0000\u025d\u025e\u0007\u0001\u0000\u0000\u025e\u0262\u0005 "+
		"\u0000\u0000\u025f\u0263\u0005)\u0000\u0000\u0260\u0261\u0005\'\u0000"+
		"\u0000\u0261\u0263\u0005(\u0000\u0000\u0262\u025f\u0001\u0000\u0000\u0000"+
		"\u0262\u0260\u0001\u0000\u0000\u0000\u0263S\u0001\u0000\u0000\u0000\u0264"+
		"\u0265\u0005i\u0000\u0000\u0265\u0266\u0005F\u0000\u0000\u0266\u0267\u0005"+
		"i\u0000\u0000\u0267\u0268\u0005\t\u0000\u0000\u0268\u0269\u0003d2\u0000"+
		"\u0269\u026a\u0005&\u0000\u0000\u026a\u026b\u0005D\u0000\u0000\u026b\u026c"+
		"\u0005\"\u0000\u0000\u026cU\u0001\u0000\u0000\u0000\u026d\u026e\u0005"+
		"i\u0000\u0000\u026e\u026f\u0005\t\u0000\u0000\u026f\u0270\u0003f3\u0000"+
		"\u0270\u0271\u0005:\u0000\u0000\u0271\u0272\u0003r9\u0000\u0272\u0273"+
		"\u00052\u0000\u0000\u0273\u0281\u0001\u0000\u0000\u0000\u0274\u0275\u0005"+
		"i\u0000\u0000\u0275\u0276\u0005\t\u0000\u0000\u0276\u0277\u0003f3\u0000"+
		"\u0277\u0278\u0005:\u0000\u0000\u0278\u0279\u0003r9\u0000\u0279\u027a"+
		"\u0005;\u0000\u0000\u027a\u027b\u00052\u0000\u0000\u027b\u027c\u0005\\"+
		"\u0000\u0000\u027c\u027d\u0005`\u0000\u0000\u027d\u027e\u0007\u0002\u0000"+
		"\u0000\u027e\u027f\u0005_\u0000\u0000\u027f\u0281\u0001\u0000\u0000\u0000"+
		"\u0280\u026d\u0001\u0000\u0000\u0000\u0280\u0274\u0001\u0000\u0000\u0000"+
		"\u0281W\u0001\u0000\u0000\u0000\u0282\u0283\u0005i\u0000\u0000\u0283\u0284"+
		"\u0005[\u0000\u0000\u0284\u0285\u0005V\u0000\u0000\u0285\u0286\u0005Z"+
		"\u0000\u0000\u0286\u0287\u0003r9\u0000\u0287Y\u0001\u0000\u0000\u0000"+
		"\u0288\u028a\b\u0005\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c[\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0005\u0003\u0000\u0000\u028e\u0290\u0005/\u0000\u0000\u028f\u0291\u0005"+
		"\u0005\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0290\u0291\u0001"+
		"\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0294\u0003"+
		"x<\u0000\u0293\u0295\u0003^/\u0000\u0294\u0293\u0001\u0000\u0000\u0000"+
		"\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000"+
		"\u0296\u0297\u0001\u0000\u0000\u0000\u0297]\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0005\u0004\u0000\u0000\u0299\u029b\u00050\u0000\u0000\u029a\u029c"+
		"\u0005\u0005\u0000\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e"+
		"\u0003r9\u0000\u029e\u029f\u00052\u0000\u0000\u029f\u02a0\u0003x<\u0000"+
		"\u02a0\u02c3\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005\u0004\u0000\u0000"+
		"\u02a2\u02a3\u0005\u0006\u0000\u0000\u02a3\u02a4\u00056\u0000\u0000\u02a4"+
		"\u02a5\u0005\u0007\u0000\u0000\u02a5\u02a7\u0003d2\u0000\u02a6\u02a8\u0005"+
		"\u0005\u0000\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0003"+
		"r9\u0000\u02aa\u02ab\u00052\u0000\u0000\u02ab\u02ac\u0003x<\u0000\u02ac"+
		"\u02c3\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005\u0004\u0000\u0000\u02ae"+
		"\u02af\u0005_\u0000\u0000\u02af\u02b0\u0005&\u0000\u0000\u02b0\u02b1\u0007"+
		"\u0002\u0000\u0000\u02b1\u02b2\u0003r9\u0000\u02b2\u02b3\u00052\u0000"+
		"\u0000\u02b3\u02b4\u0003x<\u0000\u02b4\u02c3\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b6\u0005\u0004\u0000\u0000\u02b6\u02b8\u00051\u0000\u0000\u02b7\u02b9"+
		"\u0005\u0005\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0003r9\u0000\u02bb\u02bc\u00052\u0000\u0000\u02bc\u02bd\u0003x<\u0000"+
		"\u02bd\u02c3\u0001\u0000\u0000\u0000\u02be\u02bf\u0005\u0004\u0000\u0000"+
		"\u02bf\u02c0\u0003`0\u0000\u02c0\u02c1\u0003x<\u0000\u02c1\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c2\u0298\u0001\u0000\u0000\u0000\u02c2\u02a1\u0001"+
		"\u0000\u0000\u0000\u02c2\u02ad\u0001\u0000\u0000\u0000\u02c2\u02b5\u0001"+
		"\u0000\u0000\u0000\u02c2\u02be\u0001\u0000\u0000\u0000\u02c3_\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c6\b\u0006\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8a\u0001\u0000\u0000\u0000"+
		"\u02c9\u02ca\u0005\u0004\u0000\u0000\u02ca\u02cf\u0003d2\u0000\u02cb\u02cc"+
		"\u0005\u0002\u0000\u0000\u02cc\u02ce\u0003d2\u0000\u02cd\u02cb\u0001\u0000"+
		"\u0000\u0000\u02ce\u02d1\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0c\u0001\u0000\u0000"+
		"\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d8\u0003f3\u0000\u02d3"+
		"\u02d8\u0003h4\u0000\u02d4\u02d8\u0003j5\u0000\u02d5\u02d8\u0003l6\u0000"+
		"\u02d6\u02d8\u0003n7\u0000\u02d7\u02d2\u0001\u0000\u0000\u0000\u02d7\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8e\u0001"+
		"\u0000\u0000\u0000\u02d9\u02da\u0005a\u0000\u0000\u02dag\u0001\u0000\u0000"+
		"\u0000\u02db\u02dc\u0005b\u0000\u0000\u02dci\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u0005c\u0000\u0000\u02dek\u0001\u0000\u0000\u0000\u02df\u02e0\u0005"+
		"d\u0000\u0000\u02e0m\u0001\u0000\u0000\u0000\u02e1\u02e2\u0005e\u0000"+
		"\u0000\u02e2o\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005f\u0000\u0000\u02e4"+
		"q\u0001\u0000\u0000\u0000\u02e5\u02e6\u0007\u0007\u0000\u0000\u02e6s\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0003v;\u0000\u02e8\u02e9\u0005i\u0000"+
		"\u0000\u02e9\u02ea\u0005J\u0000\u0000\u02ea\u02eb\u0005\u0001\u0000\u0000"+
		"\u02ebu\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005K\u0000\u0000\u02ed\u02ee"+
		"\u0005L\u0000\u0000\u02ee\u02fb\u0005\u0001\u0000\u0000\u02ef\u02f0\u0005"+
		"H\u0000\u0000\u02f0\u02f1\u0005<\u0000\u0000\u02f1\u02f2\u0005\u001e\u0000"+
		"\u0000\u02f2\u02f3\u0005I\u0000\u0000\u02f3\u02fb\u0005\u0001\u0000\u0000"+
		"\u02f4\u02f5\u0005M\u0000\u0000\u02f5\u02f6\u0005N\u0000\u0000\u02f6\u02f7"+
		"\u0005A\u0000\u0000\u02f7\u02f8\u0005\u001f\u0000\u0000\u02f8\u02f9\u0005"+
		"O\u0000\u0000\u02f9\u02fb\u0005\u0001\u0000\u0000\u02fa\u02ec\u0001\u0000"+
		"\u0000\u0000\u02fa\u02ef\u0001\u0000\u0000\u0000\u02fa\u02f4\u0001\u0000"+
		"\u0000\u0000\u02fbw\u0001\u0000\u0000\u0000\u02fc\u02fe\u0005\n\u0000"+
		"\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000"+
		"\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000"+
		"\u0000\u0300y\u0001\u0000\u0000\u0000+}\u0084\u008b\u0095\u00b6\u00fa"+
		"\u0111\u0120\u012c\u012e\u0137\u0145\u0147\u0155\u0157\u0168\u016c\u0185"+
		"\u0194\u0198\u01a2\u01a6\u01af\u01c4\u01ce\u01db\u01f5\u0212\u0220\u0262"+
		"\u0280\u028b\u0290\u0296\u029b\u02a7\u02b8\u02c2\u02c7\u02cf\u02d7\u02fa"+
		"\u02ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}