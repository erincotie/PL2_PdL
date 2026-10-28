// Generated from PokemonParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PokemonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNTO=1, COMA=2, RAYA=3, PUNTO_RELLENO=4, DOS_PUNTOS=5, PARENTESIS_ABRIR=6, 
		PARENTESIS_CERRAR=7, EXCLAMACION=8, APOS_S=9, NEWLINE=10, SETUP=11, TURN=12, 
		TURN_MAYUS=13, CHOSE=14, HEADS=15, TAILS=16, COIN=17, FLIP=18, WON=19, 
		TOSS=20, DECIDED=21, GO=22, FIRST=23, SECOND=24, DREW=25, DRAWN=26, A=27, 
		A_MAYUS=28, CARD=29, CARDS=30, CARDS_MAYUS=31, FOR=32, THE=33, OPENING=34, 
		HAND=35, SEVEN=36, PLAYED=37, DISCARDED=38, TO=39, ACTIVE=40, SPOT=41, 
		BENCH=42, IN=43, ON=44, ATTACHED=45, EVOLVED=46, USED=47, DAMAGE_BREAKDOWN=48, 
		BASE_DAMAGE=49, TOTAL_DAMAGE=50, DAMAGE=51, DAMAGE_MAYUS=52, BASE=53, 
		TOTAL=54, ITEM=55, ATTACK=56, WAS=57, WERE=58, K_O=59, TOOK=60, MORE_WORD=61, 
		PRIZE=62, ADDED=63, SWITCHED=64, WITH=65, BECOME=66, POKEMON=67, RETREATED=68, 
		SHUFFLED=69, THEIR=70, DECK=71, MOVED=72, ENDED=73, ALL=74, TAKEN=75, 
		WINS=76, OPPONENT=77, CONCEDED=78, NO=79, BENCHED=80, BACKUP=81, AND=82, 
		IT=83, THEM=84, INTO=85, PUT=86, COUNTERS=87, DAMAGE_COUNTERS=88, DAMAGE_COUNTER=89, 
		FROM=90, STADIUM=91, IS=92, NOW=93, MULLIGAN=94, REVEALED=95, BECAUSE=96, 
		AT=97, LEAST=98, WEAKNESS=99, OF=100, LESS=101, RESISTANCE=102, HEALED=103, 
		DIDNT=104, TAKE=105, AN=106, ACTION=107, TIME=108, TOO=109, LONG=110, 
		INACTIVE=111, SELECTED=112, ENERGY=113, EXCITED=114, RAN=115, OUT=116, 
		CHECKUP=117, PLACED=118, SPECIAL=119, CONDITION=120, ASLEEP=121, BURNED=122, 
		CONFUSED=123, PARALYZED=124, POISONED=125, TIPOS_WEAK_RES=126, CARTA_POKEMON=127, 
		CARTA_ENERGIA=128, CARTA_ITEM=129, CARTA_SUPPORTER=130, CARTA_STADIUM=131, 
		ATAQUE=132, NUM=133, ID=134, WS=135;
	public static final int
		RULE_program = 0, RULE_setup = 1, RULE_common_entry = 2, RULE_setup_entry = 3, 
		RULE_turn_entry = 4, RULE_coin_toss = 5, RULE_win_coin = 6, RULE_turn_decision = 7, 
		RULE_draw_cards_init = 8, RULE_mulligan_reveal = 9, RULE_mulligan_bonus = 10, 
		RULE_take_mulligan_action = 11, RULE_turn_block = 12, RULE_turn_header = 13, 
		RULE_turn_action = 14, RULE_play_cards = 15, RULE_draw_action = 16, RULE_draw_object = 17, 
		RULE_attach_energy = 18, RULE_evolve_pokemon = 19, RULE_retreat_action = 20, 
		RULE_special_condition = 21, RULE_pokemon_checkup_block = 22, RULE_pokemon_checkup_entry = 23, 
		RULE_take_prize_action = 24, RULE_knockout_action = 25, RULE_card_added_to_hand = 26, 
		RULE_damage_taken = 27, RULE_use_ability_or_attack = 28, RULE_damage_taken_clause = 29, 
		RULE_heal_pokemon = 30, RULE_inactive_action = 31, RULE_end_turn = 32, 
		RULE_sub_effect = 33, RULE_move_damage_counters_effect = 34, RULE_pokemon_status = 35, 
		RULE_chose_effect = 36, RULE_drawn_cards_effect = 37, RULE_discard_effect = 38, 
		RULE_discard_from_pokemon = 39, RULE_shuffle_effect = 40, RULE_put_damage_counters_effect = 41, 
		RULE_switch_active_pokemon_effect = 42, RULE_move_card_to_hand_effect = 43, 
		RULE_damage_breakdown = 44, RULE_damage_breakdown_entry = 45, RULE_breakdown_label = 46, 
		RULE_bullet_line = 47, RULE_card_name = 48, RULE_pokemon_card = 49, RULE_energy_card = 50, 
		RULE_item_card = 51, RULE_supporter_card = 52, RULE_stadium_card = 53, 
		RULE_attack_name = 54, RULE_number = 55, RULE_end = 56, RULE_end_reason = 57, 
		RULE_line_end = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "common_entry", "setup_entry", "turn_entry", "coin_toss", 
			"win_coin", "turn_decision", "draw_cards_init", "mulligan_reveal", "mulligan_bonus", 
			"take_mulligan_action", "turn_block", "turn_header", "turn_action", "play_cards", 
			"draw_action", "draw_object", "attach_energy", "evolve_pokemon", "retreat_action", 
			"special_condition", "pokemon_checkup_block", "pokemon_checkup_entry", 
			"take_prize_action", "knockout_action", "card_added_to_hand", "damage_taken", 
			"use_ability_or_attack", "damage_taken_clause", "heal_pokemon", "inactive_action", 
			"end_turn", "sub_effect", "move_damage_counters_effect", "pokemon_status", 
			"chose_effect", "drawn_cards_effect", "discard_effect", "discard_from_pokemon", 
			"shuffle_effect", "put_damage_counters_effect", "switch_active_pokemon_effect", 
			"move_card_to_hand_effect", "damage_breakdown", "damage_breakdown_entry", 
			"breakdown_label", "bullet_line", "card_name", "pokemon_card", "energy_card", 
			"item_card", "supporter_card", "stadium_card", "attack_name", "number", 
			"end", "end_reason", "line_end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'-'", "'\\u2022'", "':'", "'('", "')'", "'!'", null, 
			null, "'Setup'", "'turn'", "'Turn'", "'chose'", "'heads'", "'tails'", 
			"'coin'", "'flip'", "'won'", "'toss'", "'decided'", "'go'", "'first'", 
			"'second'", "'drew'", "'drawn'", "'a'", "'A'", "'card'", "'cards'", "'Cards'", 
			"'for'", "'the'", "'opening'", "'hand'", "'seven'", "'played'", "'discarded'", 
			"'to'", "'Active'", null, "'Bench'", "'in'", "'on'", "'attached'", "'evolved'", 
			"'used'", "'Damage breakdown'", "'Base damage'", "'Total damage'", "'damage'", 
			"'Damage'", "'base'", "'total'", "'Item'", "'Attack'", "'was'", "'were'", 
			"'Knocked Out'", "'took'", "'more'", "'Prize'", "'added'", "'switched'", 
			"'with'", "'become'", null, "'retreated'", "'shuffled'", "'their'", "'deck'", 
			"'moved'", "'ended'", null, "'taken'", "'wins'", "'Opponent'", "'conceded'", 
			null, null, "'backup'", "'and'", "'it'", "'them'", "'into'", "'put'", 
			"'counters'", "'damage counters'", "'damage counter'", "'from'", "'Stadium'", 
			"'is'", "'now'", null, "'revealed'", "'because'", "'at'", "'least'", 
			null, "'of'", "'less'", null, "'healed'", null, "'take'", "'an'", "'action'", 
			"'time'", "'too'", "'long'", "'inactive'", "'selected'", "'Energy'", 
			"'Excited'", "'ran'", "'out'", "'Checkup'", "'placed'", "'Special'", 
			"'Condition'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUNTO", "COMA", "RAYA", "PUNTO_RELLENO", "DOS_PUNTOS", "PARENTESIS_ABRIR", 
			"PARENTESIS_CERRAR", "EXCLAMACION", "APOS_S", "NEWLINE", "SETUP", "TURN", 
			"TURN_MAYUS", "CHOSE", "HEADS", "TAILS", "COIN", "FLIP", "WON", "TOSS", 
			"DECIDED", "GO", "FIRST", "SECOND", "DREW", "DRAWN", "A", "A_MAYUS", 
			"CARD", "CARDS", "CARDS_MAYUS", "FOR", "THE", "OPENING", "HAND", "SEVEN", 
			"PLAYED", "DISCARDED", "TO", "ACTIVE", "SPOT", "BENCH", "IN", "ON", "ATTACHED", 
			"EVOLVED", "USED", "DAMAGE_BREAKDOWN", "BASE_DAMAGE", "TOTAL_DAMAGE", 
			"DAMAGE", "DAMAGE_MAYUS", "BASE", "TOTAL", "ITEM", "ATTACK", "WAS", "WERE", 
			"K_O", "TOOK", "MORE_WORD", "PRIZE", "ADDED", "SWITCHED", "WITH", "BECOME", 
			"POKEMON", "RETREATED", "SHUFFLED", "THEIR", "DECK", "MOVED", "ENDED", 
			"ALL", "TAKEN", "WINS", "OPPONENT", "CONCEDED", "NO", "BENCHED", "BACKUP", 
			"AND", "IT", "THEM", "INTO", "PUT", "COUNTERS", "DAMAGE_COUNTERS", "DAMAGE_COUNTER", 
			"FROM", "STADIUM", "IS", "NOW", "MULLIGAN", "REVEALED", "BECAUSE", "AT", 
			"LEAST", "WEAKNESS", "OF", "LESS", "RESISTANCE", "HEALED", "DIDNT", "TAKE", 
			"AN", "ACTION", "TIME", "TOO", "LONG", "INACTIVE", "SELECTED", "ENERGY", 
			"EXCITED", "RAN", "OUT", "CHECKUP", "PLACED", "SPECIAL", "CONDITION", 
			"ASLEEP", "BURNED", "CONFUSED", "PARALYZED", "POISONED", "TIPOS_WEAK_RES", 
			"CARTA_POKEMON", "CARTA_ENERGIA", "CARTA_ITEM", "CARTA_SUPPORTER", "CARTA_STADIUM", 
			"ATAQUE", "NUM", "ID", "WS"
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
		public List<Pokemon_checkup_blockContext> pokemon_checkup_block() {
			return getRuleContexts(Pokemon_checkup_blockContext.class);
		}
		public Pokemon_checkup_blockContext pokemon_checkup_block(int i) {
			return getRuleContext(Pokemon_checkup_blockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(118);
				match(NEWLINE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			setup();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(125);
						match(NEWLINE);
						}
						}
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(133);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(131);
						turn_block();
						}
						break;
					case POKEMON:
						{
						setState(132);
						pokemon_checkup_block();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(140);
				match(NEWLINE);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			end();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(147);
				match(NEWLINE);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitSetup(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SETUP);
			setState(156);
			line_end();
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					setup_entry();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class Common_entryContext extends ParserRuleContext {
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public Turn_actionContext turn_action() {
			return getRuleContext(Turn_actionContext.class,0);
		}
		public Sub_effectContext sub_effect() {
			return getRuleContext(Sub_effectContext.class,0);
		}
		public Bullet_lineContext bullet_line() {
			return getRuleContext(Bullet_lineContext.class,0);
		}
		public Mulligan_bonusContext mulligan_bonus() {
			return getRuleContext(Mulligan_bonusContext.class,0);
		}
		public Mulligan_revealContext mulligan_reveal() {
			return getRuleContext(Mulligan_revealContext.class,0);
		}
		public Common_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterCommon_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitCommon_entry(this);
		}
	}

	public final Common_entryContext common_entry() throws RecognitionException {
		Common_entryContext _localctx = new Common_entryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_common_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(163);
				turn_action();
				}
				break;
			case 2:
				{
				setState(164);
				sub_effect();
				}
				break;
			case 3:
				{
				setState(165);
				bullet_line();
				}
				break;
			case 4:
				{
				setState(166);
				mulligan_bonus();
				}
				break;
			case 5:
				{
				setState(167);
				mulligan_reveal();
				}
				break;
			}
			setState(170);
			line_end();
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
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public Coin_tossContext coin_toss() {
			return getRuleContext(Coin_tossContext.class,0);
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
		public Take_mulligan_actionContext take_mulligan_action() {
			return getRuleContext(Take_mulligan_actionContext.class,0);
		}
		public Common_entryContext common_entry() {
			return getRuleContext(Common_entryContext.class,0);
		}
		public Setup_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterSetup_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitSetup_entry(this);
		}
	}

	public final Setup_entryContext setup_entry() throws RecognitionException {
		Setup_entryContext _localctx = new Setup_entryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setup_entry);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(172);
					coin_toss();
					}
					break;
				case 2:
					{
					setState(173);
					win_coin();
					}
					break;
				case 3:
					{
					setState(174);
					turn_decision();
					}
					break;
				case 4:
					{
					setState(175);
					draw_cards_init();
					}
					break;
				case 5:
					{
					setState(176);
					take_mulligan_action();
					}
					break;
				}
				setState(179);
				line_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				common_entry();
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
	public static class Turn_entryContext extends ParserRuleContext {
		public Damage_breakdownContext damage_breakdown() {
			return getRuleContext(Damage_breakdownContext.class,0);
		}
		public Common_entryContext common_entry() {
			return getRuleContext(Common_entryContext.class,0);
		}
		public Turn_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterTurn_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitTurn_entry(this);
		}
	}

	public final Turn_entryContext turn_entry() throws RecognitionException {
		Turn_entryContext _localctx = new Turn_entryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_turn_entry);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				damage_breakdown();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				common_entry();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterCoin_toss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitCoin_toss(this);
		}
	}

	public final Coin_tossContext coin_toss() throws RecognitionException {
		Coin_tossContext _localctx = new Coin_tossContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coin_toss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			match(CHOSE);
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(191);
			match(FOR);
			setState(192);
			match(THE);
			setState(193);
			match(OPENING);
			setState(194);
			match(COIN);
			setState(195);
			match(FLIP);
			setState(196);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterWin_coin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitWin_coin(this);
		}
	}

	public final Win_coinContext win_coin() throws RecognitionException {
		Win_coinContext _localctx = new Win_coinContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_win_coin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(WON);
			setState(200);
			match(THE);
			setState(201);
			match(COIN);
			setState(202);
			match(TOSS);
			setState(203);
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
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode FIRST() { return getToken(PokemonParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(PokemonParser.SECOND, 0); }
		public Turn_decisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterTurn_decision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitTurn_decision(this);
		}
	}

	public final Turn_decisionContext turn_decision() throws RecognitionException {
		Turn_decisionContext _localctx = new Turn_decisionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_turn_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(DECIDED);
			setState(207);
			match(TO);
			setState(208);
			match(GO);
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==SECOND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_cards_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_cards_init(this);
		}
	}

	public final Draw_cards_initContext draw_cards_init() throws RecognitionException {
		Draw_cards_initContext _localctx = new Draw_cards_initContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_draw_cards_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			match(DREW);
			setState(214);
			number();
			setState(215);
			match(CARDS);
			setState(216);
			match(FOR);
			setState(217);
			match(THE);
			setState(218);
			match(OPENING);
			setState(219);
			match(HAND);
			setState(220);
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
		public TerminalNode CARDS_MAYUS() { return getToken(PokemonParser.CARDS_MAYUS, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterMulligan_reveal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitMulligan_reveal(this);
		}
	}

	public final Mulligan_revealContext mulligan_reveal() throws RecognitionException {
		Mulligan_revealContext _localctx = new Mulligan_revealContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulligan_reveal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(RAYA);
			setState(223);
			match(CARDS_MAYUS);
			setState(224);
			match(REVEALED);
			setState(225);
			match(FROM);
			setState(226);
			match(MULLIGAN);
			setState(227);
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
		public TerminalNode BECAUSE() { return getToken(PokemonParser.BECAUSE, 0); }
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public TerminalNode AT() { return getToken(PokemonParser.AT, 0); }
		public TerminalNode LEAST() { return getToken(PokemonParser.LEAST, 0); }
		public TerminalNode MULLIGAN() { return getToken(PokemonParser.MULLIGAN, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Mulligan_bonusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulligan_bonus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterMulligan_bonus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitMulligan_bonus(this);
		}
	}

	public final Mulligan_bonusContext mulligan_bonus() throws RecognitionException {
		Mulligan_bonusContext _localctx = new Mulligan_bonusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mulligan_bonus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ID);
			setState(230);
			match(DREW);
			setState(231);
			number();
			setState(232);
			match(MORE_WORD);
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==CARD || _la==CARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			match(BECAUSE);
			setState(235);
			match(ID);
			setState(236);
			match(TOOK);
			setState(237);
			match(AT);
			setState(238);
			match(LEAST);
			setState(239);
			number();
			setState(240);
			match(MULLIGAN);
			setState(241);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterTake_mulligan_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitTake_mulligan_action(this);
		}
	}

	public final Take_mulligan_actionContext take_mulligan_action() throws RecognitionException {
		Take_mulligan_actionContext _localctx = new Take_mulligan_actionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_take_mulligan_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ID);
			setState(244);
			match(TOOK);
			setState(245);
			match(A);
			setState(246);
			match(MULLIGAN);
			setState(247);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterTurn_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitTurn_block(this);
		}
	}

	public final Turn_blockContext turn_block() throws RecognitionException {
		Turn_blockContext _localctx = new Turn_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_turn_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			turn_header();
			setState(250);
			line_end();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					turn_entry();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Turn_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterTurn_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitTurn_header(this);
		}
	}

	public final Turn_headerContext turn_header() throws RecognitionException {
		Turn_headerContext _localctx = new Turn_headerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_turn_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
			setState(258);
			match(APOS_S);
			setState(259);
			match(TURN_MAYUS);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEVEN || _la==NUM) {
				{
				setState(260);
				number();
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
	public static class Turn_actionContext extends ParserRuleContext {
		public Draw_actionContext draw_action() {
			return getRuleContext(Draw_actionContext.class,0);
		}
		public Attach_energyContext attach_energy() {
			return getRuleContext(Attach_energyContext.class,0);
		}
		public Evolve_pokemonContext evolve_pokemon() {
			return getRuleContext(Evolve_pokemonContext.class,0);
		}
		public Heal_pokemonContext heal_pokemon() {
			return getRuleContext(Heal_pokemonContext.class,0);
		}
		public Discard_from_pokemonContext discard_from_pokemon() {
			return getRuleContext(Discard_from_pokemonContext.class,0);
		}
		public Pokemon_statusContext pokemon_status() {
			return getRuleContext(Pokemon_statusContext.class,0);
		}
		public Damage_takenContext damage_taken() {
			return getRuleContext(Damage_takenContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Play_cardsContext play_cards() {
			return getRuleContext(Play_cardsContext.class,0);
		}
		public Use_ability_or_attackContext use_ability_or_attack() {
			return getRuleContext(Use_ability_or_attackContext.class,0);
		}
		public Retreat_actionContext retreat_action() {
			return getRuleContext(Retreat_actionContext.class,0);
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
		public Inactive_actionContext inactive_action() {
			return getRuleContext(Inactive_actionContext.class,0);
		}
		public End_turnContext end_turn() {
			return getRuleContext(End_turnContext.class,0);
		}
		public Turn_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterTurn_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitTurn_action(this);
		}
	}

	public final Turn_actionContext turn_action() throws RecognitionException {
		Turn_actionContext _localctx = new Turn_actionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_turn_action);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(263);
					draw_action();
					}
					break;
				case 2:
					{
					setState(264);
					attach_energy();
					}
					break;
				case 3:
					{
					setState(265);
					evolve_pokemon();
					}
					break;
				case 4:
					{
					setState(266);
					heal_pokemon();
					}
					break;
				case 5:
					{
					setState(267);
					discard_from_pokemon();
					}
					break;
				case 6:
					{
					setState(268);
					pokemon_status();
					}
					break;
				case 7:
					{
					setState(269);
					damage_taken();
					}
					break;
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO) {
					{
					setState(272);
					match(PUNTO);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				play_cards();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				use_ability_or_attack();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				retreat_action();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				take_prize_action();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				knockout_action();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				card_added_to_hand();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
				inactive_action();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterPlay_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitPlay_cards(this);
		}
	}

	public final Play_cardsContext play_cards() throws RecognitionException {
		Play_cardsContext _localctx = new Play_cardsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_play_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(286);
			match(PLAYED);
			setState(287);
			card_name();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(288);
				match(TO);
				setState(289);
				match(THE);
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(290);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(291);
					match(ACTIVE);
					setState(292);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(293);
					match(STADIUM);
					setState(294);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(299);
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
		public Draw_objectContext draw_object() {
			return getRuleContext(Draw_objectContext.class,0);
		}
		public TerminalNode AND() { return getToken(PokemonParser.AND, 0); }
		public TerminalNode PLAYED() { return getToken(PokemonParser.PLAYED, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode THEM() { return getToken(PokemonParser.THEM, 0); }
		public TerminalNode IT() { return getToken(PokemonParser.IT, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Draw_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_action(this);
		}
	}

	public final Draw_actionContext draw_action() throws RecognitionException {
		Draw_actionContext _localctx = new Draw_actionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_draw_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			match(DREW);
			setState(303);
			draw_object();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(304);
				match(AND);
				setState(305);
				match(PLAYED);
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==IT || _la==THEM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				match(TO);
				setState(308);
				match(THE);
				setState(312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(309);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(310);
					match(ACTIVE);
					setState(311);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class Draw_objectContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode A() { return getToken(PokemonParser.A, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public Draw_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_object(this);
		}
	}

	public final Draw_objectContext draw_object() throws RecognitionException {
		Draw_objectContext _localctx = new Draw_objectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_draw_object);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEVEN:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				number();
				setState(317);
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
				break;
			case A:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(A);
				setState(320);
				match(CARD);
				}
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				card_name();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterAttach_energy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitAttach_energy(this);
		}
	}

	public final Attach_energyContext attach_energy() throws RecognitionException {
		Attach_energyContext _localctx = new Attach_energyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attach_energy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ID);
			setState(325);
			match(ATTACHED);
			setState(326);
			card_name();
			setState(327);
			match(TO);
			setState(328);
			pokemon_card();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==ON) {
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				match(THE);
				setState(334);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(331);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(332);
					match(ACTIVE);
					setState(333);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(338);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterEvolve_pokemon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitEvolve_pokemon(this);
		}
	}

	public final Evolve_pokemonContext evolve_pokemon() throws RecognitionException {
		Evolve_pokemonContext _localctx = new Evolve_pokemonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_evolve_pokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(341);
			match(EVOLVED);
			setState(342);
			pokemon_card();
			setState(343);
			match(TO);
			setState(344);
			pokemon_card();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==ON) {
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				match(THE);
				setState(350);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(347);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(348);
					match(ACTIVE);
					setState(349);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(354);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterRetreat_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitRetreat_action(this);
		}
	}

	public final Retreat_actionContext retreat_action() throws RecognitionException {
		Retreat_actionContext _localctx = new Retreat_actionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_retreat_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ID);
			setState(357);
			match(RETREATED);
			setState(358);
			pokemon_card();
			setState(359);
			match(TO);
			setState(360);
			match(THE);
			setState(361);
			match(BENCH);
			setState(362);
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
	public static class Special_conditionContext extends ParserRuleContext {
		public TerminalNode ASLEEP() { return getToken(PokemonParser.ASLEEP, 0); }
		public TerminalNode BURNED() { return getToken(PokemonParser.BURNED, 0); }
		public TerminalNode CONFUSED() { return getToken(PokemonParser.CONFUSED, 0); }
		public TerminalNode PARALYZED() { return getToken(PokemonParser.PARALYZED, 0); }
		public TerminalNode POISONED() { return getToken(PokemonParser.POISONED, 0); }
		public Special_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterSpecial_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitSpecial_condition(this);
		}
	}

	public final Special_conditionContext special_condition() throws RecognitionException {
		Special_conditionContext _localctx = new Special_conditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_special_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 31L) != 0)) ) {
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
	public static class Pokemon_checkup_blockContext extends ParserRuleContext {
		public TerminalNode POKEMON() { return getToken(PokemonParser.POKEMON, 0); }
		public TerminalNode CHECKUP() { return getToken(PokemonParser.CHECKUP, 0); }
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public List<Pokemon_checkup_entryContext> pokemon_checkup_entry() {
			return getRuleContexts(Pokemon_checkup_entryContext.class);
		}
		public Pokemon_checkup_entryContext pokemon_checkup_entry(int i) {
			return getRuleContext(Pokemon_checkup_entryContext.class,i);
		}
		public Pokemon_checkup_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_checkup_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterPokemon_checkup_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitPokemon_checkup_block(this);
		}
	}

	public final Pokemon_checkup_blockContext pokemon_checkup_block() throws RecognitionException {
		Pokemon_checkup_blockContext _localctx = new Pokemon_checkup_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pokemon_checkup_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(POKEMON);
			setState(367);
			match(CHECKUP);
			setState(368);
			line_end();
			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(369);
				pokemon_checkup_entry();
				}
				}
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEVEN || _la==NUM );
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
	public static class Pokemon_checkup_entryContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode PLACED() { return getToken(PokemonParser.PLACED, 0); }
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode SPECIAL() { return getToken(PokemonParser.SPECIAL, 0); }
		public TerminalNode CONDITION() { return getToken(PokemonParser.CONDITION, 0); }
		public Special_conditionContext special_condition() {
			return getRuleContext(Special_conditionContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public TerminalNode DAMAGE_COUNTER() { return getToken(PokemonParser.DAMAGE_COUNTER, 0); }
		public TerminalNode DAMAGE_COUNTERS() { return getToken(PokemonParser.DAMAGE_COUNTERS, 0); }
		public TerminalNode COUNTERS() { return getToken(PokemonParser.COUNTERS, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_checkup_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_checkup_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterPokemon_checkup_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitPokemon_checkup_entry(this);
		}
	}

	public final Pokemon_checkup_entryContext pokemon_checkup_entry() throws RecognitionException {
		Pokemon_checkup_entryContext _localctx = new Pokemon_checkup_entryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pokemon_checkup_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			number();
			setState(375);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(376);
			match(WAS);
			setState(377);
			match(PLACED);
			setState(378);
			match(ON);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(379);
				match(ID);
				setState(380);
				match(APOS_S);
				}
			}

			setState(383);
			pokemon_card();
			setState(384);
			match(FOR);
			setState(385);
			match(THE);
			setState(386);
			match(SPECIAL);
			setState(387);
			match(CONDITION);
			setState(388);
			special_condition();
			setState(389);
			match(PUNTO);
			setState(390);
			line_end();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterTake_prize_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitTake_prize_action(this);
		}
	}

	public final Take_prize_actionContext take_prize_action() throws RecognitionException {
		Take_prize_actionContext _localctx = new Take_prize_actionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_take_prize_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(ID);
			setState(393);
			match(TOOK);
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				{
				setState(394);
				match(A);
				}
				break;
			case SEVEN:
			case NUM:
				{
				setState(395);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(398);
			match(PRIZE);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARD || _la==CARDS) {
				{
				setState(399);
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

			setState(402);
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
	public static class Knockout_actionContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode K_O() { return getToken(PokemonParser.K_O, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode EXCLAMACION() { return getToken(PokemonParser.EXCLAMACION, 0); }
		public Knockout_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knockout_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterKnockout_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitKnockout_action(this);
		}
	}

	public final Knockout_actionContext knockout_action() throws RecognitionException {
		Knockout_actionContext _localctx = new Knockout_actionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_knockout_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(404);
				match(ID);
				setState(405);
				match(APOS_S);
				}
			}

			setState(408);
			pokemon_card();
			setState(409);
			match(WAS);
			setState(410);
			match(K_O);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO || _la==EXCLAMACION) {
				{
				setState(411);
				_la = _input.LA(1);
				if ( !(_la==PUNTO || _la==EXCLAMACION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterCard_added_to_hand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitCard_added_to_hand(this);
		}
	}

	public final Card_added_to_handContext card_added_to_hand() throws RecognitionException {
		Card_added_to_handContext _localctx = new Card_added_to_handContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_card_added_to_hand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_MAYUS:
				{
				setState(414);
				match(A_MAYUS);
				setState(415);
				match(CARD);
				}
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(416);
				card_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(419);
			match(WAS);
			setState(420);
			match(ADDED);
			setState(421);
			match(TO);
			setState(422);
			match(ID);
			setState(423);
			match(APOS_S);
			setState(424);
			match(HAND);
			setState(425);
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
	public static class Damage_takenContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public TerminalNode RAYA() { return getToken(PokemonParser.RAYA, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LESS() { return getToken(PokemonParser.LESS, 0); }
		public TerminalNode MORE_WORD() { return getToken(PokemonParser.MORE_WORD, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public TerminalNode BECAUSE() { return getToken(PokemonParser.BECAUSE, 0); }
		public TerminalNode OF() { return getToken(PokemonParser.OF, 0); }
		public TerminalNode TIPOS_WEAK_RES() { return getToken(PokemonParser.TIPOS_WEAK_RES, 0); }
		public TerminalNode WEAKNESS() { return getToken(PokemonParser.WEAKNESS, 0); }
		public TerminalNode RESISTANCE() { return getToken(PokemonParser.RESISTANCE, 0); }
		public Damage_takenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_taken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDamage_taken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDamage_taken(this);
		}
	}

	public final Damage_takenContext damage_taken() throws RecognitionException {
		Damage_takenContext _localctx = new Damage_takenContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_damage_taken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(427);
				match(ID);
				setState(428);
				match(APOS_S);
				}
			}

			setState(431);
			pokemon_card();
			setState(432);
			match(TOOK);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(433);
				match(RAYA);
				setState(434);
				number();
				setState(435);
				match(LESS);
				}
				break;
			case 2:
				{
				setState(437);
				number();
				setState(438);
				match(MORE_WORD);
				}
				break;
			case 3:
				{
				setState(440);
				number();
				}
				break;
			}
			setState(443);
			match(DAMAGE);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BECAUSE) {
				{
				setState(444);
				match(BECAUSE);
				setState(445);
				match(OF);
				setState(446);
				match(TIPOS_WEAK_RES);
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==WEAKNESS || _la==RESISTANCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		public Damage_taken_clauseContext damage_taken_clause() {
			return getRuleContext(Damage_taken_clauseContext.class,0);
		}
		public Use_ability_or_attackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_ability_or_attack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterUse_ability_or_attack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitUse_ability_or_attack(this);
		}
	}

	public final Use_ability_or_attackContext use_ability_or_attack() throws RecognitionException {
		Use_ability_or_attackContext _localctx = new Use_ability_or_attackContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_use_ability_or_attack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(ID);
			setState(451);
			match(APOS_S);
			setState(452);
			pokemon_card();
			setState(453);
			match(USED);
			setState(454);
			attack_name();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(455);
				match(ON);
				setState(456);
				match(ID);
				setState(457);
				match(APOS_S);
				setState(458);
				pokemon_card();
				setState(459);
				match(FOR);
				setState(460);
				number();
				setState(461);
				match(DAMAGE);
				}
			}

			setState(465);
			match(PUNTO);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARTA_POKEMON || _la==ID) {
				{
				setState(466);
				damage_taken_clause();
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
	public static class Damage_taken_clauseContext extends ParserRuleContext {
		public Damage_takenContext damage_taken() {
			return getRuleContext(Damage_takenContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Damage_taken_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_taken_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDamage_taken_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDamage_taken_clause(this);
		}
	}

	public final Damage_taken_clauseContext damage_taken_clause() throws RecognitionException {
		Damage_taken_clauseContext _localctx = new Damage_taken_clauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_damage_taken_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			damage_taken();
			setState(470);
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
	public static class Heal_pokemonContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode HEALED() { return getToken(PokemonParser.HEALED, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Heal_pokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heal_pokemon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterHeal_pokemon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitHeal_pokemon(this);
		}
	}

	public final Heal_pokemonContext heal_pokemon() throws RecognitionException {
		Heal_pokemonContext _localctx = new Heal_pokemonContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_heal_pokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(472);
				match(ID);
				setState(473);
				match(APOS_S);
				}
			}

			setState(476);
			pokemon_card();
			setState(477);
			match(HEALED);
			setState(478);
			number();
			setState(479);
			match(DAMAGE);
			setState(480);
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
	public static class Inactive_actionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DIDNT() { return getToken(PokemonParser.DIDNT, 0); }
		public TerminalNode TAKE() { return getToken(PokemonParser.TAKE, 0); }
		public TerminalNode AN() { return getToken(PokemonParser.AN, 0); }
		public TerminalNode ACTION() { return getToken(PokemonParser.ACTION, 0); }
		public TerminalNode IN() { return getToken(PokemonParser.IN, 0); }
		public TerminalNode TIME() { return getToken(PokemonParser.TIME, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Inactive_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inactive_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterInactive_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitInactive_action(this);
		}
	}

	public final Inactive_actionContext inactive_action() throws RecognitionException {
		Inactive_actionContext _localctx = new Inactive_actionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inactive_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(ID);
			setState(483);
			match(DIDNT);
			setState(484);
			match(TAKE);
			setState(485);
			match(AN);
			setState(486);
			match(ACTION);
			setState(487);
			match(IN);
			setState(488);
			match(TIME);
			setState(489);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterEnd_turn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitEnd_turn(this);
		}
	}

	public final End_turnContext end_turn() throws RecognitionException {
		End_turnContext _localctx = new End_turnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_end_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(ID);
			setState(492);
			match(ENDED);
			setState(493);
			match(THEIR);
			setState(494);
			match(TURN);
			setState(495);
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
		public Draw_actionContext draw_action() {
			return getRuleContext(Draw_actionContext.class,0);
		}
		public Attach_energyContext attach_energy() {
			return getRuleContext(Attach_energyContext.class,0);
		}
		public Evolve_pokemonContext evolve_pokemon() {
			return getRuleContext(Evolve_pokemonContext.class,0);
		}
		public Heal_pokemonContext heal_pokemon() {
			return getRuleContext(Heal_pokemonContext.class,0);
		}
		public Discard_from_pokemonContext discard_from_pokemon() {
			return getRuleContext(Discard_from_pokemonContext.class,0);
		}
		public Pokemon_statusContext pokemon_status() {
			return getRuleContext(Pokemon_statusContext.class,0);
		}
		public Damage_takenContext damage_taken() {
			return getRuleContext(Damage_takenContext.class,0);
		}
		public Drawn_cards_effectContext drawn_cards_effect() {
			return getRuleContext(Drawn_cards_effectContext.class,0);
		}
		public Shuffle_effectContext shuffle_effect() {
			return getRuleContext(Shuffle_effectContext.class,0);
		}
		public Discard_effectContext discard_effect() {
			return getRuleContext(Discard_effectContext.class,0);
		}
		public Put_damage_counters_effectContext put_damage_counters_effect() {
			return getRuleContext(Put_damage_counters_effectContext.class,0);
		}
		public Switch_active_pokemon_effectContext switch_active_pokemon_effect() {
			return getRuleContext(Switch_active_pokemon_effectContext.class,0);
		}
		public Move_card_to_hand_effectContext move_card_to_hand_effect() {
			return getRuleContext(Move_card_to_hand_effectContext.class,0);
		}
		public Move_damage_counters_effectContext move_damage_counters_effect() {
			return getRuleContext(Move_damage_counters_effectContext.class,0);
		}
		public Chose_effectContext chose_effect() {
			return getRuleContext(Chose_effectContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public Sub_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterSub_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitSub_effect(this);
		}
	}

	public final Sub_effectContext sub_effect() throws RecognitionException {
		Sub_effectContext _localctx = new Sub_effectContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sub_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(RAYA);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(498);
				draw_action();
				}
				break;
			case 2:
				{
				setState(499);
				attach_energy();
				}
				break;
			case 3:
				{
				setState(500);
				evolve_pokemon();
				}
				break;
			case 4:
				{
				setState(501);
				heal_pokemon();
				}
				break;
			case 5:
				{
				setState(502);
				discard_from_pokemon();
				}
				break;
			case 6:
				{
				setState(503);
				pokemon_status();
				}
				break;
			case 7:
				{
				setState(504);
				damage_taken();
				}
				break;
			case 8:
				{
				setState(505);
				drawn_cards_effect();
				}
				break;
			case 9:
				{
				setState(506);
				shuffle_effect();
				}
				break;
			case 10:
				{
				setState(507);
				discard_effect();
				}
				break;
			case 11:
				{
				setState(508);
				put_damage_counters_effect();
				}
				break;
			case 12:
				{
				setState(509);
				switch_active_pokemon_effect();
				}
				break;
			case 13:
				{
				setState(510);
				move_card_to_hand_effect();
				}
				break;
			case 14:
				{
				setState(511);
				move_damage_counters_effect();
				}
				break;
			case 15:
				{
				setState(512);
				chose_effect();
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO) {
				{
				setState(515);
				match(PUNTO);
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
	public static class Move_damage_counters_effectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode MOVED() { return getToken(PokemonParser.MOVED, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PokemonParser.FROM, 0); }
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
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode DAMAGE_COUNTER() { return getToken(PokemonParser.DAMAGE_COUNTER, 0); }
		public TerminalNode DAMAGE_COUNTERS() { return getToken(PokemonParser.DAMAGE_COUNTERS, 0); }
		public TerminalNode COUNTERS() { return getToken(PokemonParser.COUNTERS, 0); }
		public Move_damage_counters_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_damage_counters_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterMove_damage_counters_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitMove_damage_counters_effect(this);
		}
	}

	public final Move_damage_counters_effectContext move_damage_counters_effect() throws RecognitionException {
		Move_damage_counters_effectContext _localctx = new Move_damage_counters_effectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_move_damage_counters_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(ID);
			setState(519);
			match(MOVED);
			setState(520);
			number();
			setState(521);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(522);
			match(FROM);
			setState(523);
			match(ID);
			setState(524);
			match(APOS_S);
			setState(525);
			pokemon_card();
			setState(526);
			match(TO);
			setState(527);
			match(ID);
			setState(528);
			match(APOS_S);
			setState(529);
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
	public static class Pokemon_statusContext extends ParserRuleContext {
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode IS() { return getToken(PokemonParser.IS, 0); }
		public TerminalNode NOW() { return getToken(PokemonParser.NOW, 0); }
		public TerminalNode IN() { return getToken(PokemonParser.IN, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Special_conditionContext special_condition() {
			return getRuleContext(Special_conditionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterPokemon_status(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitPokemon_status(this);
		}
	}

	public final Pokemon_statusContext pokemon_status() throws RecognitionException {
		Pokemon_statusContext _localctx = new Pokemon_statusContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pokemon_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(531);
				match(ID);
				setState(532);
				match(APOS_S);
				}
			}

			setState(535);
			pokemon_card();
			setState(536);
			match(IS);
			setState(537);
			match(NOW);
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(538);
				match(IN);
				setState(539);
				match(THE);
				setState(540);
				match(ACTIVE);
				setState(541);
				match(SPOT);
				}
				break;
			case ASLEEP:
			case BURNED:
			case CONFUSED:
			case PARALYZED:
			case POISONED:
				{
				setState(542);
				special_condition();
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
	public static class Chose_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode CHOSE() { return getToken(PokemonParser.CHOSE, 0); }
		public Attack_nameContext attack_name() {
			return getRuleContext(Attack_nameContext.class,0);
		}
		public Chose_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chose_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterChose_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitChose_effect(this);
		}
	}

	public final Chose_effectContext chose_effect() throws RecognitionException {
		Chose_effectContext _localctx = new Chose_effectContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_chose_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(ID);
			setState(546);
			match(CHOSE);
			setState(547);
			attack_name();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDrawn_cards_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDrawn_cards_effect(this);
		}
	}

	public final Drawn_cards_effectContext drawn_cards_effect() throws RecognitionException {
		Drawn_cards_effectContext _localctx = new Drawn_cards_effectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_drawn_cards_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			number();
			setState(550);
			match(DRAWN);
			setState(551);
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
	public static class Discard_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DISCARDED() { return getToken(PokemonParser.DISCARDED, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Discard_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDiscard_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDiscard_effect(this);
		}
	}

	public final Discard_effectContext discard_effect() throws RecognitionException {
		Discard_effectContext _localctx = new Discard_effectContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_discard_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(ID);
			setState(554);
			match(DISCARDED);
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEVEN:
			case NUM:
				{
				setState(555);
				number();
				setState(556);
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
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(558);
				card_name();
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
	public static class Discard_from_pokemonContext extends ParserRuleContext {
		public TerminalNode DISCARDED() { return getToken(PokemonParser.DISCARDED, 0); }
		public TerminalNode FROM() { return getToken(PokemonParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode WERE() { return getToken(PokemonParser.WERE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Discard_from_pokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_from_pokemon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDiscard_from_pokemon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDiscard_from_pokemon(this);
		}
	}

	public final Discard_from_pokemonContext discard_from_pokemon() throws RecognitionException {
		Discard_from_pokemonContext _localctx = new Discard_from_pokemonContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_discard_from_pokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEVEN:
			case NUM:
				{
				setState(561);
				number();
				setState(562);
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
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(564);
				card_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(567);
			_la = _input.LA(1);
			if ( !(_la==WAS || _la==WERE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(568);
			match(DISCARDED);
			setState(569);
			match(FROM);
			setState(570);
			match(ID);
			setState(571);
			match(APOS_S);
			setState(572);
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
	public static class Shuffle_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode SHUFFLED() { return getToken(PokemonParser.SHUFFLED, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(PokemonParser.DECK, 0); }
		public TerminalNode INTO() { return getToken(PokemonParser.INTO, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode A() { return getToken(PokemonParser.A, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public Shuffle_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffle_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterShuffle_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitShuffle_effect(this);
		}
	}

	public final Shuffle_effectContext shuffle_effect() throws RecognitionException {
		Shuffle_effectContext _localctx = new Shuffle_effectContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shuffle_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(ID);
			setState(575);
			match(SHUFFLED);
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEIR:
				{
				setState(576);
				match(THEIR);
				setState(577);
				match(DECK);
				}
				break;
			case A:
			case SEVEN:
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
			case NUM:
				{
				setState(584);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEVEN:
				case NUM:
					{
					setState(578);
					number();
					setState(579);
					match(CARDS);
					}
					break;
				case A:
					{
					setState(581);
					match(A);
					setState(582);
					match(CARD);
					}
					break;
				case CARTA_POKEMON:
				case CARTA_ENERGIA:
				case CARTA_ITEM:
				case CARTA_SUPPORTER:
				case CARTA_STADIUM:
					{
					setState(583);
					card_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(586);
				match(INTO);
				setState(587);
				match(THEIR);
				setState(588);
				match(DECK);
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
	public static class Put_damage_counters_effectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode PUT() { return getToken(PokemonParser.PUT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public Pokemon_cardContext pokemon_card() {
			return getRuleContext(Pokemon_cardContext.class,0);
		}
		public TerminalNode DAMAGE_COUNTERS() { return getToken(PokemonParser.DAMAGE_COUNTERS, 0); }
		public TerminalNode COUNTERS() { return getToken(PokemonParser.COUNTERS, 0); }
		public Put_damage_counters_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_damage_counters_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterPut_damage_counters_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitPut_damage_counters_effect(this);
		}
	}

	public final Put_damage_counters_effectContext put_damage_counters_effect() throws RecognitionException {
		Put_damage_counters_effectContext _localctx = new Put_damage_counters_effectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_put_damage_counters_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(ID);
			setState(592);
			match(PUT);
			setState(593);
			number();
			setState(594);
			_la = _input.LA(1);
			if ( !(_la==COUNTERS || _la==DAMAGE_COUNTERS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(595);
			match(ON);
			setState(596);
			match(ID);
			setState(597);
			match(APOS_S);
			setState(598);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterSwitch_active_pokemon_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitSwitch_active_pokemon_effect(this);
		}
	}

	public final Switch_active_pokemon_effectContext switch_active_pokemon_effect() throws RecognitionException {
		Switch_active_pokemon_effectContext _localctx = new Switch_active_pokemon_effectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switch_active_pokemon_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(ID);
			setState(601);
			match(APOS_S);
			setState(602);
			pokemon_card();
			setState(603);
			match(WAS);
			setState(604);
			match(SWITCHED);
			setState(605);
			match(WITH);
			setState(606);
			match(ID);
			setState(607);
			match(APOS_S);
			setState(608);
			pokemon_card();
			setState(609);
			match(TO);
			setState(610);
			match(BECOME);
			setState(611);
			match(THE);
			setState(612);
			match(ACTIVE);
			setState(613);
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
	public static class Move_card_to_hand_effectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PokemonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PokemonParser.ID, i);
		}
		public TerminalNode MOVED() { return getToken(PokemonParser.MOVED, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode HAND() { return getToken(PokemonParser.HAND, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public Move_card_to_hand_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_card_to_hand_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterMove_card_to_hand_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitMove_card_to_hand_effect(this);
		}
	}

	public final Move_card_to_hand_effectContext move_card_to_hand_effect() throws RecognitionException {
		Move_card_to_hand_effectContext _localctx = new Move_card_to_hand_effectContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_move_card_to_hand_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(ID);
			setState(616);
			match(MOVED);
			setState(617);
			match(ID);
			setState(618);
			match(APOS_S);
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEVEN:
			case NUM:
				{
				setState(619);
				number();
				setState(620);
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
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(622);
				card_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(625);
			match(TO);
			setState(626);
			match(THEIR);
			setState(627);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDamage_breakdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDamage_breakdown(this);
		}
	}

	public final Damage_breakdownContext damage_breakdown() throws RecognitionException {
		Damage_breakdownContext _localctx = new Damage_breakdownContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_damage_breakdown);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(RAYA);
			setState(630);
			match(DAMAGE_BREAKDOWN);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(631);
				match(DOS_PUNTOS);
				}
			}

			setState(634);
			line_end();
			setState(636); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(635);
					damage_breakdown_entry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(638); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public Breakdown_labelContext breakdown_label() {
			return getRuleContext(Breakdown_labelContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(PokemonParser.DAMAGE, 0); }
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(PokemonParser.DOS_PUNTOS, 0); }
		public TerminalNode RAYA() { return getToken(PokemonParser.RAYA, 0); }
		public Damage_breakdown_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_breakdown_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDamage_breakdown_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDamage_breakdown_entry(this);
		}
	}

	public final Damage_breakdown_entryContext damage_breakdown_entry() throws RecognitionException {
		Damage_breakdown_entryContext _localctx = new Damage_breakdown_entryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_damage_breakdown_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(PUNTO_RELLENO);
			setState(641);
			breakdown_label();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(642);
				match(DOS_PUNTOS);
				}
			}

			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAYA) {
				{
				setState(645);
				match(RAYA);
				}
			}

			setState(648);
			number();
			setState(649);
			match(DAMAGE);
			setState(650);
			line_end();
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
	public static class Breakdown_labelContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ENERGY() { return getToken(PokemonParser.ENERGY, 0); }
		public TerminalNode SELECTED() { return getToken(PokemonParser.SELECTED, 0); }
		public TerminalNode ATTACHED() { return getToken(PokemonParser.ATTACHED, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonParser.PRIZE, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode DAMAGE_COUNTER() { return getToken(PokemonParser.DAMAGE_COUNTER, 0); }
		public TerminalNode DAMAGE_COUNTERS() { return getToken(PokemonParser.DAMAGE_COUNTERS, 0); }
		public TerminalNode COUNTERS() { return getToken(PokemonParser.COUNTERS, 0); }
		public TerminalNode BASE_DAMAGE() { return getToken(PokemonParser.BASE_DAMAGE, 0); }
		public TerminalNode PARENTESIS_ABRIR() { return getToken(PokemonParser.PARENTESIS_ABRIR, 0); }
		public TerminalNode ITEM() { return getToken(PokemonParser.ITEM, 0); }
		public TerminalNode PARENTESIS_CERRAR() { return getToken(PokemonParser.PARENTESIS_CERRAR, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode ATTACK() { return getToken(PokemonParser.ATTACK, 0); }
		public Attack_nameContext attack_name() {
			return getRuleContext(Attack_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode TIPOS_WEAK_RES() { return getToken(PokemonParser.TIPOS_WEAK_RES, 0); }
		public TerminalNode WEAKNESS() { return getToken(PokemonParser.WEAKNESS, 0); }
		public TerminalNode RESISTANCE() { return getToken(PokemonParser.RESISTANCE, 0); }
		public TerminalNode TOTAL_DAMAGE() { return getToken(PokemonParser.TOTAL_DAMAGE, 0); }
		public Breakdown_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakdown_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterBreakdown_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitBreakdown_label(this);
		}
	}

	public final Breakdown_labelContext breakdown_label() throws RecognitionException {
		Breakdown_labelContext _localctx = new Breakdown_labelContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_breakdown_label);
		int _la;
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				number();
				setState(653);
				_la = _input.LA(1);
				if ( !(_la==ATTACHED || _la==SELECTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(654);
				match(ENERGY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				number();
				setState(657);
				match(PRIZE);
				setState(658);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				number();
				setState(661);
				_la = _input.LA(1);
				if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
				match(BASE_DAMAGE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(664);
				match(PARENTESIS_ABRIR);
				setState(665);
				match(ITEM);
				setState(666);
				match(PARENTESIS_CERRAR);
				setState(667);
				card_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(668);
				match(PARENTESIS_ABRIR);
				setState(669);
				match(ATTACK);
				setState(670);
				match(PARENTESIS_CERRAR);
				setState(671);
				attack_name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(672);
				_la = _input.LA(1);
				if ( !(_la==WEAKNESS || _la==RESISTANCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(673);
				match(TO);
				setState(674);
				match(TIPOS_WEAK_RES);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(675);
				match(TOTAL_DAMAGE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterBullet_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitBullet_line(this);
		}
	}

	public final Bullet_lineContext bullet_line() throws RecognitionException {
		Bullet_lineContext _localctx = new Bullet_lineContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_bullet_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(PUNTO_RELLENO);
			setState(679);
			card_name();
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(680);
				match(COMA);
				setState(681);
				card_name();
				}
				}
				setState(686);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterCard_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitCard_name(this);
		}
	}

	public final Card_nameContext card_name() throws RecognitionException {
		Card_nameContext _localctx = new Card_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_card_name);
		try {
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARTA_POKEMON:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				pokemon_card();
				}
				break;
			case CARTA_ENERGIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				energy_card();
				}
				break;
			case CARTA_ITEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				item_card();
				}
				break;
			case CARTA_SUPPORTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(690);
				supporter_card();
				}
				break;
			case CARTA_STADIUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(691);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterPokemon_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitPokemon_card(this);
		}
	}

	public final Pokemon_cardContext pokemon_card() throws RecognitionException {
		Pokemon_cardContext _localctx = new Pokemon_cardContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pokemon_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterEnergy_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitEnergy_card(this);
		}
	}

	public final Energy_cardContext energy_card() throws RecognitionException {
		Energy_cardContext _localctx = new Energy_cardContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_energy_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterItem_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitItem_card(this);
		}
	}

	public final Item_cardContext item_card() throws RecognitionException {
		Item_cardContext _localctx = new Item_cardContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_item_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterSupporter_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitSupporter_card(this);
		}
	}

	public final Supporter_cardContext supporter_card() throws RecognitionException {
		Supporter_cardContext _localctx = new Supporter_cardContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_supporter_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterStadium_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitStadium_card(this);
		}
	}

	public final Stadium_cardContext stadium_card() throws RecognitionException {
		Stadium_cardContext _localctx = new Stadium_cardContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_stadium_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterAttack_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitAttack_name(this);
		}
	}

	public final Attack_nameContext attack_name() throws RecognitionException {
		Attack_nameContext _localctx = new Attack_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_attack_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			end_reason();
			setState(709);
			match(ID);
			setState(710);
			match(WINS);
			setState(711);
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
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
		public TerminalNode CONCEDED() { return getToken(PokemonParser.CONCEDED, 0); }
		public TerminalNode TOOK() { return getToken(PokemonParser.TOOK, 0); }
		public TerminalNode ALL() { return getToken(PokemonParser.ALL, 0); }
		public TerminalNode OF() { return getToken(PokemonParser.OF, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonParser.PRIZE, 0); }
		public TerminalNode CARDS() { return getToken(PokemonParser.CARDS, 0); }
		public TerminalNode WAS() { return getToken(PokemonParser.WAS, 0); }
		public TerminalNode INACTIVE() { return getToken(PokemonParser.INACTIVE, 0); }
		public TerminalNode FOR() { return getToken(PokemonParser.FOR, 0); }
		public TerminalNode TOO() { return getToken(PokemonParser.TOO, 0); }
		public TerminalNode LONG() { return getToken(PokemonParser.LONG, 0); }
		public TerminalNode APOS_S() { return getToken(PokemonParser.APOS_S, 0); }
		public TerminalNode DECK() { return getToken(PokemonParser.DECK, 0); }
		public TerminalNode RAN() { return getToken(PokemonParser.RAN, 0); }
		public TerminalNode OUT() { return getToken(PokemonParser.OUT, 0); }
		public TerminalNode TAKEN() { return getToken(PokemonParser.TAKEN, 0); }
		public TerminalNode NO() { return getToken(PokemonParser.NO, 0); }
		public TerminalNode BENCHED() { return getToken(PokemonParser.BENCHED, 0); }
		public TerminalNode POKEMON() { return getToken(PokemonParser.POKEMON, 0); }
		public TerminalNode BACKUP() { return getToken(PokemonParser.BACKUP, 0); }
		public End_reasonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_reason; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterEnd_reason(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitEnd_reason(this);
		}
	}

	public final End_reasonContext end_reason() throws RecognitionException {
		End_reasonContext _localctx = new End_reasonContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_end_reason);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(OPPONENT);
				setState(732);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONCEDED:
					{
					setState(714);
					match(CONCEDED);
					}
					break;
				case TOOK:
					{
					setState(715);
					match(TOOK);
					setState(716);
					match(ALL);
					setState(717);
					match(OF);
					setState(718);
					match(THEIR);
					setState(719);
					match(PRIZE);
					setState(720);
					match(CARDS);
					}
					break;
				case WAS:
					{
					setState(721);
					match(WAS);
					setState(722);
					match(INACTIVE);
					setState(723);
					match(FOR);
					setState(724);
					match(TOO);
					setState(725);
					match(LONG);
					}
					break;
				case APOS_S:
					{
					setState(726);
					match(APOS_S);
					setState(727);
					match(DECK);
					setState(728);
					match(RAN);
					setState(729);
					match(OUT);
					setState(730);
					match(OF);
					setState(731);
					match(CARDS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(734);
				match(PUNTO);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(ALL);
				setState(736);
				match(PRIZE);
				setState(737);
				match(CARDS);
				setState(738);
				match(TAKEN);
				setState(739);
				match(PUNTO);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				match(NO);
				setState(741);
				match(BENCHED);
				setState(742);
				match(POKEMON);
				setState(743);
				match(FOR);
				setState(744);
				match(BACKUP);
				setState(745);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterLine_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitLine_end(this);
		}
	}

	public final Line_endContext line_end() throws RecognitionException {
		Line_endContext _localctx = new Line_endContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_line_end);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(748);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(751); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0087\u02f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000"+
		"\u0005\u0000x\b\u0000\n\u0000\f\u0000{\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u007f\b\u0000\n\u0000\f\u0000\u0082\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0086\b\u0000\u0005\u0000\u0088\b\u0000\n\u0000\f\u0000"+
		"\u008b\t\u0000\u0001\u0000\u0005\u0000\u008e\b\u0000\n\u0000\f\u0000\u0091"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0095\b\u0000\n\u0000\f\u0000"+
		"\u0098\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u009f\b\u0001\n\u0001\f\u0001\u00a2\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a9\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00b2\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00b7\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00bb\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00fd"+
		"\b\f\n\f\f\f\u0100\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0106\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u010f\b\u000e\u0001\u000e\u0003\u000e\u0112\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011c\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0128\b\u000f\u0003\u000f\u012a"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0139\b\u0010\u0003\u0010\u013b\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0143\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u014f\b\u0012\u0003\u0012\u0151\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015f"+
		"\b\u0013\u0003\u0013\u0161\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0004\u0016\u0173\b\u0016\u000b\u0016\f\u0016\u0174\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u017e\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u018d\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0191\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0197\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u019d\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01a2\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01ae\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01ba\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01c1\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01d0"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01d4\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01db\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0202\b!\u0001"+
		"!\u0003!\u0205\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003"+
		"#\u0216\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0220\b#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0230\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0236\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u0249\b(\u0001(\u0001(\u0001(\u0003(\u024e\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0270\b+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0003"+
		",\u0279\b,\u0001,\u0001,\u0004,\u027d\b,\u000b,\f,\u027e\u0001-\u0001"+
		"-\u0001-\u0003-\u0284\b-\u0001-\u0003-\u0287\b-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u02a5\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0005/\u02ab\b/\n/\f/\u02ae\t/\u00010\u00010\u00010\u00010\u00010\u0003"+
		"0\u02b5\b0\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u0001"+
		"5\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u02dd\b9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u02eb\b9\u0001:\u0004:\u02ee\b:\u000b:\f"+
		":\u02ef\u0001:\u0000\u0000;\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprt\u0000\r\u0001\u0000\u000f\u0010\u0001\u0000\u0017\u0018"+
		"\u0001\u0000\u001d\u001e\u0001\u0000ST\u0001\u0000+,\u0001\u0000y}\u0001"+
		"\u0000WY\u0002\u0000\u0001\u0001\b\b\u0002\u0000ccff\u0001\u00009:\u0001"+
		"\u0000WX\u0002\u0000--pp\u0002\u0000$$\u0085\u0085\u031e\u0000y\u0001"+
		"\u0000\u0000\u0000\u0002\u009b\u0001\u0000\u0000\u0000\u0004\u00a8\u0001"+
		"\u0000\u0000\u0000\u0006\u00b6\u0001\u0000\u0000\u0000\b\u00ba\u0001\u0000"+
		"\u0000\u0000\n\u00bc\u0001\u0000\u0000\u0000\f\u00c6\u0001\u0000\u0000"+
		"\u0000\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u00d4\u0001\u0000\u0000"+
		"\u0000\u0012\u00de\u0001\u0000\u0000\u0000\u0014\u00e5\u0001\u0000\u0000"+
		"\u0000\u0016\u00f3\u0001\u0000\u0000\u0000\u0018\u00f9\u0001\u0000\u0000"+
		"\u0000\u001a\u0101\u0001\u0000\u0000\u0000\u001c\u011b\u0001\u0000\u0000"+
		"\u0000\u001e\u011d\u0001\u0000\u0000\u0000 \u012d\u0001\u0000\u0000\u0000"+
		"\"\u0142\u0001\u0000\u0000\u0000$\u0144\u0001\u0000\u0000\u0000&\u0154"+
		"\u0001\u0000\u0000\u0000(\u0164\u0001\u0000\u0000\u0000*\u016c\u0001\u0000"+
		"\u0000\u0000,\u016e\u0001\u0000\u0000\u0000.\u0176\u0001\u0000\u0000\u0000"+
		"0\u0188\u0001\u0000\u0000\u00002\u0196\u0001\u0000\u0000\u00004\u01a1"+
		"\u0001\u0000\u0000\u00006\u01ad\u0001\u0000\u0000\u00008\u01c2\u0001\u0000"+
		"\u0000\u0000:\u01d5\u0001\u0000\u0000\u0000<\u01da\u0001\u0000\u0000\u0000"+
		">\u01e2\u0001\u0000\u0000\u0000@\u01eb\u0001\u0000\u0000\u0000B\u01f1"+
		"\u0001\u0000\u0000\u0000D\u0206\u0001\u0000\u0000\u0000F\u0215\u0001\u0000"+
		"\u0000\u0000H\u0221\u0001\u0000\u0000\u0000J\u0225\u0001\u0000\u0000\u0000"+
		"L\u0229\u0001\u0000\u0000\u0000N\u0235\u0001\u0000\u0000\u0000P\u023e"+
		"\u0001\u0000\u0000\u0000R\u024f\u0001\u0000\u0000\u0000T\u0258\u0001\u0000"+
		"\u0000\u0000V\u0267\u0001\u0000\u0000\u0000X\u0275\u0001\u0000\u0000\u0000"+
		"Z\u0280\u0001\u0000\u0000\u0000\\\u02a4\u0001\u0000\u0000\u0000^\u02a6"+
		"\u0001\u0000\u0000\u0000`\u02b4\u0001\u0000\u0000\u0000b\u02b6\u0001\u0000"+
		"\u0000\u0000d\u02b8\u0001\u0000\u0000\u0000f\u02ba\u0001\u0000\u0000\u0000"+
		"h\u02bc\u0001\u0000\u0000\u0000j\u02be\u0001\u0000\u0000\u0000l\u02c0"+
		"\u0001\u0000\u0000\u0000n\u02c2\u0001\u0000\u0000\u0000p\u02c4\u0001\u0000"+
		"\u0000\u0000r\u02ea\u0001\u0000\u0000\u0000t\u02ed\u0001\u0000\u0000\u0000"+
		"vx\u0005\n\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|\u0089\u0003\u0002\u0001\u0000}\u007f"+
		"\u0005\n\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0085\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0003\u0018\f\u0000\u0084\u0086\u0003,\u0016\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008f\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0005\n\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0096\u0003p8\u0000\u0093\u0095\u0005\n\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0000\u0000\u0001\u009a\u0001\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u000b\u0000\u0000\u009c\u00a0\u0003t:\u0000\u009d\u009f\u0003\u0006\u0003"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u0003\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a9\u0003\u001c\u000e\u0000\u00a4\u00a9\u0003B!\u0000\u00a5"+
		"\u00a9\u0003^/\u0000\u00a6\u00a9\u0003\u0014\n\u0000\u00a7\u00a9\u0003"+
		"\u0012\t\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0003t:\u0000\u00ab\u0005\u0001\u0000\u0000\u0000"+
		"\u00ac\u00b2\u0003\n\u0005\u0000\u00ad\u00b2\u0003\f\u0006\u0000\u00ae"+
		"\u00b2\u0003\u000e\u0007\u0000\u00af\u00b2\u0003\u0010\b\u0000\u00b0\u00b2"+
		"\u0003\u0016\u000b\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003t:\u0000\u00b4\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0003\u0004\u0002\u0000\u00b6\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0007\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0003X,\u0000\u00b9\u00bb\u0003\u0004\u0002\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\t\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0086\u0000\u0000\u00bd"+
		"\u00be\u0005\u000e\u0000\u0000\u00be\u00bf\u0007\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005 \u0000\u0000\u00c0\u00c1\u0005!\u0000\u0000\u00c1\u00c2\u0005"+
		"\"\u0000\u0000\u00c2\u00c3\u0005\u0011\u0000\u0000\u00c3\u00c4\u0005\u0012"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0001\u0000\u0000\u00c5\u000b\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\u0086\u0000\u0000\u00c7\u00c8\u0005\u0013"+
		"\u0000\u0000\u00c8\u00c9\u0005!\u0000\u0000\u00c9\u00ca\u0005\u0011\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0014\u0000\u0000\u00cb\u00cc\u0005\u0001\u0000"+
		"\u0000\u00cc\r\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0086\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0015\u0000\u0000\u00cf\u00d0\u0005\'\u0000\u0000\u00d0"+
		"\u00d1\u0005\u0016\u0000\u0000\u00d1\u00d2\u0007\u0001\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0001\u0000\u0000\u00d3\u000f\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005\u0086\u0000\u0000\u00d5\u00d6\u0005\u0019\u0000\u0000\u00d6"+
		"\u00d7\u0003n7\u0000\u00d7\u00d8\u0005\u001e\u0000\u0000\u00d8\u00d9\u0005"+
		" \u0000\u0000\u00d9\u00da\u0005!\u0000\u0000\u00da\u00db\u0005\"\u0000"+
		"\u0000\u00db\u00dc\u0005#\u0000\u0000\u00dc\u00dd\u0005\u0001\u0000\u0000"+
		"\u00dd\u0011\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0003\u0000\u0000"+
		"\u00df\u00e0\u0005\u001f\u0000\u0000\u00e0\u00e1\u0005_\u0000\u0000\u00e1"+
		"\u00e2\u0005Z\u0000\u0000\u00e2\u00e3\u0005^\u0000\u0000\u00e3\u00e4\u0003"+
		"n7\u0000\u00e4\u0013\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0086\u0000"+
		"\u0000\u00e6\u00e7\u0005\u0019\u0000\u0000\u00e7\u00e8\u0003n7\u0000\u00e8"+
		"\u00e9\u0005=\u0000\u0000\u00e9\u00ea\u0007\u0002\u0000\u0000\u00ea\u00eb"+
		"\u0005`\u0000\u0000\u00eb\u00ec\u0005\u0086\u0000\u0000\u00ec\u00ed\u0005"+
		"<\u0000\u0000\u00ed\u00ee\u0005a\u0000\u0000\u00ee\u00ef\u0005b\u0000"+
		"\u0000\u00ef\u00f0\u0003n7\u0000\u00f0\u00f1\u0005^\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0001\u0000\u0000\u00f2\u0015\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0086\u0000\u0000\u00f4\u00f5\u0005<\u0000\u0000\u00f5\u00f6"+
		"\u0005\u001b\u0000\u0000\u00f6\u00f7\u0005^\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0001\u0000\u0000\u00f8\u0017\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003"+
		"\u001a\r\u0000\u00fa\u00fe\u0003t:\u0000\u00fb\u00fd\u0003\b\u0004\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0019\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005\u0086\u0000\u0000\u0102\u0103\u0005\t\u0000\u0000\u0103"+
		"\u0105\u0005\r\u0000\u0000\u0104\u0106\u0003n7\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u001b\u0001"+
		"\u0000\u0000\u0000\u0107\u010f\u0003 \u0010\u0000\u0108\u010f\u0003$\u0012"+
		"\u0000\u0109\u010f\u0003&\u0013\u0000\u010a\u010f\u0003<\u001e\u0000\u010b"+
		"\u010f\u0003N\'\u0000\u010c\u010f\u0003F#\u0000\u010d\u010f\u00036\u001b"+
		"\u0000\u010e\u0107\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000"+
		"\u0000\u010e\u0109\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000"+
		"\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0005\u0001\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u011c\u0001\u0000\u0000"+
		"\u0000\u0113\u011c\u0003\u001e\u000f\u0000\u0114\u011c\u00038\u001c\u0000"+
		"\u0115\u011c\u0003(\u0014\u0000\u0116\u011c\u00030\u0018\u0000\u0117\u011c"+
		"\u00032\u0019\u0000\u0118\u011c\u00034\u001a\u0000\u0119\u011c\u0003>"+
		"\u001f\u0000\u011a\u011c\u0003@ \u0000\u011b\u010e\u0001\u0000\u0000\u0000"+
		"\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000\u0000"+
		"\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000"+
		"\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u001d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0086\u0000\u0000"+
		"\u011e\u011f\u0005%\u0000\u0000\u011f\u0129\u0003`0\u0000\u0120\u0121"+
		"\u0005\'\u0000\u0000\u0121\u0127\u0005!\u0000\u0000\u0122\u0128\u0005"+
		"*\u0000\u0000\u0123\u0124\u0005(\u0000\u0000\u0124\u0128\u0005)\u0000"+
		"\u0000\u0125\u0126\u0005[\u0000\u0000\u0126\u0128\u0005)\u0000\u0000\u0127"+
		"\u0122\u0001\u0000\u0000\u0000\u0127\u0123\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129"+
		"\u0120\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0001\u0000\u0000\u012c"+
		"\u001f\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0086\u0000\u0000\u012e"+
		"\u012f\u0005\u0019\u0000\u0000\u012f\u013a\u0003\"\u0011\u0000\u0130\u0131"+
		"\u0005R\u0000\u0000\u0131\u0132\u0005%\u0000\u0000\u0132\u0133\u0007\u0003"+
		"\u0000\u0000\u0133\u0134\u0005\'\u0000\u0000\u0134\u0138\u0005!\u0000"+
		"\u0000\u0135\u0139\u0005*\u0000\u0000\u0136\u0137\u0005(\u0000\u0000\u0137"+
		"\u0139\u0005)\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0130"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b!\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0003n7\u0000\u013d\u013e\u0007\u0002\u0000"+
		"\u0000\u013e\u0143\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u001b\u0000"+
		"\u0000\u0140\u0143\u0005\u001d\u0000\u0000\u0141\u0143\u0003`0\u0000\u0142"+
		"\u013c\u0001\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000\u0142"+
		"\u0141\u0001\u0000\u0000\u0000\u0143#\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0005\u0086\u0000\u0000\u0145\u0146\u0005-\u0000\u0000\u0146\u0147\u0003"+
		"`0\u0000\u0147\u0148\u0005\'\u0000\u0000\u0148\u0150\u0003b1\u0000\u0149"+
		"\u014a\u0007\u0004\u0000\u0000\u014a\u014e\u0005!\u0000\u0000\u014b\u014f"+
		"\u0005*\u0000\u0000\u014c\u014d\u0005(\u0000\u0000\u014d\u014f\u0005)"+
		"\u0000\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0149\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005\u0001\u0000\u0000\u0153%\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0005\u0086\u0000\u0000\u0155\u0156\u0005.\u0000\u0000"+
		"\u0156\u0157\u0003b1\u0000\u0157\u0158\u0005\'\u0000\u0000\u0158\u0160"+
		"\u0003b1\u0000\u0159\u015a\u0007\u0004\u0000\u0000\u015a\u015e\u0005!"+
		"\u0000\u0000\u015b\u015f\u0005*\u0000\u0000\u015c\u015d\u0005(\u0000\u0000"+
		"\u015d\u015f\u0005)\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160"+
		"\u0159\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0001\u0000\u0000\u0163"+
		"\'\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0086\u0000\u0000\u0165\u0166"+
		"\u0005D\u0000\u0000\u0166\u0167\u0003b1\u0000\u0167\u0168\u0005\'\u0000"+
		"\u0000\u0168\u0169\u0005!\u0000\u0000\u0169\u016a\u0005*\u0000\u0000\u016a"+
		"\u016b\u0005\u0001\u0000\u0000\u016b)\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0007\u0005\u0000\u0000\u016d+\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"C\u0000\u0000\u016f\u0170\u0005u\u0000\u0000\u0170\u0172\u0003t:\u0000"+
		"\u0171\u0173\u0003.\u0017\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175-\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0003n7\u0000\u0177\u0178\u0007\u0006\u0000\u0000\u0178\u0179\u00059"+
		"\u0000\u0000\u0179\u017a\u0005v\u0000\u0000\u017a\u017d\u0005,\u0000\u0000"+
		"\u017b\u017c\u0005\u0086\u0000\u0000\u017c\u017e\u0005\t\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0003b1\u0000\u0180\u0181\u0005"+
		" \u0000\u0000\u0181\u0182\u0005!\u0000\u0000\u0182\u0183\u0005w\u0000"+
		"\u0000\u0183\u0184\u0005x\u0000\u0000\u0184\u0185\u0003*\u0015\u0000\u0185"+
		"\u0186\u0005\u0001\u0000\u0000\u0186\u0187\u0003t:\u0000\u0187/\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0005\u0086\u0000\u0000\u0189\u018c\u0005"+
		"<\u0000\u0000\u018a\u018d\u0005\u001b\u0000\u0000\u018b\u018d\u0003n7"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0005>\u0000\u0000"+
		"\u018f\u0191\u0007\u0002\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0005\u0001\u0000\u0000\u01931\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0005\u0086\u0000\u0000\u0195\u0197\u0005\t\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0003b1\u0000\u0199\u019a\u00059"+
		"\u0000\u0000\u019a\u019c\u0005;\u0000\u0000\u019b\u019d\u0007\u0007\u0000"+
		"\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d3\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u001c\u0000\u0000"+
		"\u019f\u01a2\u0005\u001d\u0000\u0000\u01a0\u01a2\u0003`0\u0000\u01a1\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u00059\u0000\u0000\u01a4\u01a5\u0005"+
		"?\u0000\u0000\u01a5\u01a6\u0005\'\u0000\u0000\u01a6\u01a7\u0005\u0086"+
		"\u0000\u0000\u01a7\u01a8\u0005\t\u0000\u0000\u01a8\u01a9\u0005#\u0000"+
		"\u0000\u01a9\u01aa\u0005\u0001\u0000\u0000\u01aa5\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0005\u0086\u0000\u0000\u01ac\u01ae\u0005\t\u0000\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0003b1\u0000\u01b0\u01b9\u0005"+
		"<\u0000\u0000\u01b1\u01b2\u0005\u0003\u0000\u0000\u01b2\u01b3\u0003n7"+
		"\u0000\u01b3\u01b4\u0005e\u0000\u0000\u01b4\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0003n7\u0000\u01b6\u01b7\u0005=\u0000\u0000\u01b7\u01ba"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0003n7\u0000\u01b9\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b5\u0001\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01c0\u00053\u0000"+
		"\u0000\u01bc\u01bd\u0005`\u0000\u0000\u01bd\u01be\u0005d\u0000\u0000\u01be"+
		"\u01bf\u0005~\u0000\u0000\u01bf\u01c1\u0007\b\u0000\u0000\u01c0\u01bc"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c17\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0005\u0086\u0000\u0000\u01c3\u01c4\u0005"+
		"\t\u0000\u0000\u01c4\u01c5\u0003b1\u0000\u01c5\u01c6\u0005/\u0000\u0000"+
		"\u01c6\u01cf\u0003l6\u0000\u01c7\u01c8\u0005,\u0000\u0000\u01c8\u01c9"+
		"\u0005\u0086\u0000\u0000\u01c9\u01ca\u0005\t\u0000\u0000\u01ca\u01cb\u0003"+
		"b1\u0000\u01cb\u01cc\u0005 \u0000\u0000\u01cc\u01cd\u0003n7\u0000\u01cd"+
		"\u01ce\u00053\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01c7"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d3\u0005\u0001\u0000\u0000\u01d2\u01d4"+
		"\u0003:\u001d\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d49\u0001\u0000\u0000\u0000\u01d5\u01d6\u00036\u001b"+
		"\u0000\u01d6\u01d7\u0005\u0001\u0000\u0000\u01d7;\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0005\u0086\u0000\u0000\u01d9\u01db\u0005\t\u0000\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003b1\u0000\u01dd\u01de\u0005"+
		"g\u0000\u0000\u01de\u01df\u0003n7\u0000\u01df\u01e0\u00053\u0000\u0000"+
		"\u01e0\u01e1\u0005\u0001\u0000\u0000\u01e1=\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005\u0086\u0000\u0000\u01e3\u01e4\u0005h\u0000\u0000\u01e4\u01e5"+
		"\u0005i\u0000\u0000\u01e5\u01e6\u0005j\u0000\u0000\u01e6\u01e7\u0005k"+
		"\u0000\u0000\u01e7\u01e8\u0005+\u0000\u0000\u01e8\u01e9\u0005l\u0000\u0000"+
		"\u01e9\u01ea\u0005\u0001\u0000\u0000\u01ea?\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0005\u0086\u0000\u0000\u01ec\u01ed\u0005I\u0000\u0000\u01ed\u01ee"+
		"\u0005F\u0000\u0000\u01ee\u01ef\u0005\f\u0000\u0000\u01ef\u01f0\u0005"+
		"\u0001\u0000\u0000\u01f0A\u0001\u0000\u0000\u0000\u01f1\u0201\u0005\u0003"+
		"\u0000\u0000\u01f2\u0202\u0003 \u0010\u0000\u01f3\u0202\u0003$\u0012\u0000"+
		"\u01f4\u0202\u0003&\u0013\u0000\u01f5\u0202\u0003<\u001e\u0000\u01f6\u0202"+
		"\u0003N\'\u0000\u01f7\u0202\u0003F#\u0000\u01f8\u0202\u00036\u001b\u0000"+
		"\u01f9\u0202\u0003J%\u0000\u01fa\u0202\u0003P(\u0000\u01fb\u0202\u0003"+
		"L&\u0000\u01fc\u0202\u0003R)\u0000\u01fd\u0202\u0003T*\u0000\u01fe\u0202"+
		"\u0003V+\u0000\u01ff\u0202\u0003D\"\u0000\u0200\u0202\u0003H$\u0000\u0201"+
		"\u01f2\u0001\u0000\u0000\u0000\u0201\u01f3\u0001\u0000\u0000\u0000\u0201"+
		"\u01f4\u0001\u0000\u0000\u0000\u0201\u01f5\u0001\u0000\u0000\u0000\u0201"+
		"\u01f6\u0001\u0000\u0000\u0000\u0201\u01f7\u0001\u0000\u0000\u0000\u0201"+
		"\u01f8\u0001\u0000\u0000\u0000\u0201\u01f9\u0001\u0000\u0000\u0000\u0201"+
		"\u01fa\u0001\u0000\u0000\u0000\u0201\u01fb\u0001\u0000\u0000\u0000\u0201"+
		"\u01fc\u0001\u0000\u0000\u0000\u0201\u01fd\u0001\u0000\u0000\u0000\u0201"+
		"\u01fe\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203"+
		"\u0205\u0005\u0001\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0001\u0000\u0000\u0000\u0205C\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005\u0086\u0000\u0000\u0207\u0208\u0005H\u0000\u0000\u0208\u0209\u0003"+
		"n7\u0000\u0209\u020a\u0007\u0006\u0000\u0000\u020a\u020b\u0005Z\u0000"+
		"\u0000\u020b\u020c\u0005\u0086\u0000\u0000\u020c\u020d\u0005\t\u0000\u0000"+
		"\u020d\u020e\u0003b1\u0000\u020e\u020f\u0005\'\u0000\u0000\u020f\u0210"+
		"\u0005\u0086\u0000\u0000\u0210\u0211\u0005\t\u0000\u0000\u0211\u0212\u0003"+
		"b1\u0000\u0212E\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0086\u0000"+
		"\u0000\u0214\u0216\u0005\t\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0003b1\u0000\u0218\u0219\u0005\\\u0000\u0000\u0219\u021f"+
		"\u0005]\u0000\u0000\u021a\u021b\u0005+\u0000\u0000\u021b\u021c\u0005!"+
		"\u0000\u0000\u021c\u021d\u0005(\u0000\u0000\u021d\u0220\u0005)\u0000\u0000"+
		"\u021e\u0220\u0003*\u0015\u0000\u021f\u021a\u0001\u0000\u0000\u0000\u021f"+
		"\u021e\u0001\u0000\u0000\u0000\u0220G\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0005\u0086\u0000\u0000\u0222\u0223\u0005\u000e\u0000\u0000\u0223\u0224"+
		"\u0003l6\u0000\u0224I\u0001\u0000\u0000\u0000\u0225\u0226\u0003n7\u0000"+
		"\u0226\u0227\u0005\u001a\u0000\u0000\u0227\u0228\u0005\u001e\u0000\u0000"+
		"\u0228K\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u0086\u0000\u0000\u022a"+
		"\u022f\u0005&\u0000\u0000\u022b\u022c\u0003n7\u0000\u022c\u022d\u0007"+
		"\u0002\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u0230\u0003"+
		"`0\u0000\u022f\u022b\u0001\u0000\u0000\u0000\u022f\u022e\u0001\u0000\u0000"+
		"\u0000\u0230M\u0001\u0000\u0000\u0000\u0231\u0232\u0003n7\u0000\u0232"+
		"\u0233\u0007\u0002\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234"+
		"\u0236\u0003`0\u0000\u0235\u0231\u0001\u0000\u0000\u0000\u0235\u0234\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0007"+
		"\t\u0000\u0000\u0238\u0239\u0005&\u0000\u0000\u0239\u023a\u0005Z\u0000"+
		"\u0000\u023a\u023b\u0005\u0086\u0000\u0000\u023b\u023c\u0005\t\u0000\u0000"+
		"\u023c\u023d\u0003b1\u0000\u023dO\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0005\u0086\u0000\u0000\u023f\u024d\u0005E\u0000\u0000\u0240\u0241\u0005"+
		"F\u0000\u0000\u0241\u024e\u0005G\u0000\u0000\u0242\u0243\u0003n7\u0000"+
		"\u0243\u0244\u0005\u001e\u0000\u0000\u0244\u0249\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0005\u001b\u0000\u0000\u0246\u0249\u0005\u001d\u0000\u0000"+
		"\u0247\u0249\u0003`0\u0000\u0248\u0242\u0001\u0000\u0000\u0000\u0248\u0245"+
		"\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0005U\u0000\u0000\u024b\u024c\u0005"+
		"F\u0000\u0000\u024c\u024e\u0005G\u0000\u0000\u024d\u0240\u0001\u0000\u0000"+
		"\u0000\u024d\u0248\u0001\u0000\u0000\u0000\u024eQ\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0005\u0086\u0000\u0000\u0250\u0251\u0005V\u0000\u0000\u0251"+
		"\u0252\u0003n7\u0000\u0252\u0253\u0007\n\u0000\u0000\u0253\u0254\u0005"+
		",\u0000\u0000\u0254\u0255\u0005\u0086\u0000\u0000\u0255\u0256\u0005\t"+
		"\u0000\u0000\u0256\u0257\u0003b1\u0000\u0257S\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0005\u0086\u0000\u0000\u0259\u025a\u0005\t\u0000\u0000\u025a"+
		"\u025b\u0003b1\u0000\u025b\u025c\u00059\u0000\u0000\u025c\u025d\u0005"+
		"@\u0000\u0000\u025d\u025e\u0005A\u0000\u0000\u025e\u025f\u0005\u0086\u0000"+
		"\u0000\u025f\u0260\u0005\t\u0000\u0000\u0260\u0261\u0003b1\u0000\u0261"+
		"\u0262\u0005\'\u0000\u0000\u0262\u0263\u0005B\u0000\u0000\u0263\u0264"+
		"\u0005!\u0000\u0000\u0264\u0265\u0005(\u0000\u0000\u0265\u0266\u0005C"+
		"\u0000\u0000\u0266U\u0001\u0000\u0000\u0000\u0267\u0268\u0005\u0086\u0000"+
		"\u0000\u0268\u0269\u0005H\u0000\u0000\u0269\u026a\u0005\u0086\u0000\u0000"+
		"\u026a\u026f\u0005\t\u0000\u0000\u026b\u026c\u0003n7\u0000\u026c\u026d"+
		"\u0007\u0002\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u0270"+
		"\u0003`0\u0000\u026f\u026b\u0001\u0000\u0000\u0000\u026f\u026e\u0001\u0000"+
		"\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0005\'\u0000"+
		"\u0000\u0272\u0273\u0005F\u0000\u0000\u0273\u0274\u0005#\u0000\u0000\u0274"+
		"W\u0001\u0000\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276\u0278"+
		"\u00050\u0000\u0000\u0277\u0279\u0005\u0005\u0000\u0000\u0278\u0277\u0001"+
		"\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001"+
		"\u0000\u0000\u0000\u027a\u027c\u0003t:\u0000\u027b\u027d\u0003Z-\u0000"+
		"\u027c\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000"+
		"\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000"+
		"\u027fY\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u0004\u0000\u0000\u0281"+
		"\u0283\u0003\\.\u0000\u0282\u0284\u0005\u0005\u0000\u0000\u0283\u0282"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286"+
		"\u0001\u0000\u0000\u0000\u0285\u0287\u0005\u0003\u0000\u0000\u0286\u0285"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288\u0289\u0003n7\u0000\u0289\u028a\u00053"+
		"\u0000\u0000\u028a\u028b\u0003t:\u0000\u028b[\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0003n7\u0000\u028d\u028e\u0007\u000b\u0000\u0000\u028e\u028f"+
		"\u0005q\u0000\u0000\u028f\u02a5\u0001\u0000\u0000\u0000\u0290\u0291\u0003"+
		"n7\u0000\u0291\u0292\u0005>\u0000\u0000\u0292\u0293\u0005\u001e\u0000"+
		"\u0000\u0293\u02a5\u0001\u0000\u0000\u0000\u0294\u0295\u0003n7\u0000\u0295"+
		"\u0296\u0007\u0006\u0000\u0000\u0296\u02a5\u0001\u0000\u0000\u0000\u0297"+
		"\u02a5\u00051\u0000\u0000\u0298\u0299\u0005\u0006\u0000\u0000\u0299\u029a"+
		"\u00057\u0000\u0000\u029a\u029b\u0005\u0007\u0000\u0000\u029b\u02a5\u0003"+
		"`0\u0000\u029c\u029d\u0005\u0006\u0000\u0000\u029d\u029e\u00058\u0000"+
		"\u0000\u029e\u029f\u0005\u0007\u0000\u0000\u029f\u02a5\u0003l6\u0000\u02a0"+
		"\u02a1\u0007\b\u0000\u0000\u02a1\u02a2\u0005\'\u0000\u0000\u02a2\u02a5"+
		"\u0005~\u0000\u0000\u02a3\u02a5\u00052\u0000\u0000\u02a4\u028c\u0001\u0000"+
		"\u0000\u0000\u02a4\u0290\u0001\u0000\u0000\u0000\u02a4\u0294\u0001\u0000"+
		"\u0000\u0000\u02a4\u0297\u0001\u0000\u0000\u0000\u02a4\u0298\u0001\u0000"+
		"\u0000\u0000\u02a4\u029c\u0001\u0000\u0000\u0000\u02a4\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5]\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0005\u0004\u0000\u0000\u02a7\u02ac\u0003`0\u0000\u02a8"+
		"\u02a9\u0005\u0002\u0000\u0000\u02a9\u02ab\u0003`0\u0000\u02aa\u02a8\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad_\u0001\u0000"+
		"\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b5\u0003b1\u0000"+
		"\u02b0\u02b5\u0003d2\u0000\u02b1\u02b5\u0003f3\u0000\u02b2\u02b5\u0003"+
		"h4\u0000\u02b3\u02b5\u0003j5\u0000\u02b4\u02af\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b0\u0001\u0000\u0000\u0000\u02b4\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b5a\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005\u007f\u0000\u0000\u02b7"+
		"c\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005\u0080\u0000\u0000\u02b9e\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0005\u0081\u0000\u0000\u02bbg\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0005\u0082\u0000\u0000\u02bdi\u0001\u0000\u0000"+
		"\u0000\u02be\u02bf\u0005\u0083\u0000\u0000\u02bfk\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0005\u0084\u0000\u0000\u02c1m\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c3\u0007\f\u0000\u0000\u02c3o\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0003r9\u0000\u02c5\u02c6\u0005\u0086\u0000\u0000\u02c6\u02c7\u0005L"+
		"\u0000\u0000\u02c7\u02c8\u0005\u0001\u0000\u0000\u02c8q\u0001\u0000\u0000"+
		"\u0000\u02c9\u02dc\u0005M\u0000\u0000\u02ca\u02dd\u0005N\u0000\u0000\u02cb"+
		"\u02cc\u0005<\u0000\u0000\u02cc\u02cd\u0005J\u0000\u0000\u02cd\u02ce\u0005"+
		"d\u0000\u0000\u02ce\u02cf\u0005F\u0000\u0000\u02cf\u02d0\u0005>\u0000"+
		"\u0000\u02d0\u02dd\u0005\u001e\u0000\u0000\u02d1\u02d2\u00059\u0000\u0000"+
		"\u02d2\u02d3\u0005o\u0000\u0000\u02d3\u02d4\u0005 \u0000\u0000\u02d4\u02d5"+
		"\u0005m\u0000\u0000\u02d5\u02dd\u0005n\u0000\u0000\u02d6\u02d7\u0005\t"+
		"\u0000\u0000\u02d7\u02d8\u0005G\u0000\u0000\u02d8\u02d9\u0005s\u0000\u0000"+
		"\u02d9\u02da\u0005t\u0000\u0000\u02da\u02db\u0005d\u0000\u0000\u02db\u02dd"+
		"\u0005\u001e\u0000\u0000\u02dc\u02ca\u0001\u0000\u0000\u0000\u02dc\u02cb"+
		"\u0001\u0000\u0000\u0000\u02dc\u02d1\u0001\u0000\u0000\u0000\u02dc\u02d6"+
		"\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02eb"+
		"\u0005\u0001\u0000\u0000\u02df\u02e0\u0005J\u0000\u0000\u02e0\u02e1\u0005"+
		">\u0000\u0000\u02e1\u02e2\u0005\u001e\u0000\u0000\u02e2\u02e3\u0005K\u0000"+
		"\u0000\u02e3\u02eb\u0005\u0001\u0000\u0000\u02e4\u02e5\u0005O\u0000\u0000"+
		"\u02e5\u02e6\u0005P\u0000\u0000\u02e6\u02e7\u0005C\u0000\u0000\u02e7\u02e8"+
		"\u0005 \u0000\u0000\u02e8\u02e9\u0005Q\u0000\u0000\u02e9\u02eb\u0005\u0001"+
		"\u0000\u0000\u02ea\u02c9\u0001\u0000\u0000\u0000\u02ea\u02df\u0001\u0000"+
		"\u0000\u0000\u02ea\u02e4\u0001\u0000\u0000\u0000\u02ebs\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ee\u0005\n\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0u\u0001\u0000\u0000\u00009y"+
		"\u0080\u0085\u0089\u008f\u0096\u00a0\u00a8\u00b1\u00b6\u00ba\u00fe\u0105"+
		"\u010e\u0111\u011b\u0127\u0129\u0138\u013a\u0142\u014e\u0150\u015e\u0160"+
		"\u0174\u017d\u018c\u0190\u0196\u019c\u01a1\u01ad\u01b9\u01c0\u01cf\u01d3"+
		"\u01da\u0201\u0204\u0215\u021f\u022f\u0235\u0248\u024d\u026f\u0278\u027e"+
		"\u0283\u0286\u02a4\u02ac\u02b4\u02dc\u02ea\u02ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}