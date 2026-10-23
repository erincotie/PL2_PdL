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
		RULE_draw_number_effect = 30, RULE_draw_single_card_effect = 31, RULE_draw_named_card_effect = 32, 
		RULE_draw_and_play_effect = 33, RULE_draw_and_play_named_effect = 34, 
		RULE_shuffle_deck_effect = 35, RULE_shuffle_cards_into_deck_effect = 36, 
		RULE_shuffle_named_card_into_deck_effect = 37, RULE_evolve_pokemon_effect = 38, 
		RULE_discard_number_effect = 39, RULE_discard_named_card_effect = 40, 
		RULE_discard_from_pokemon_effect = 41, RULE_discard_named_from_pokemon_effect = 42, 
		RULE_put_damage_counters_effect = 43, RULE_switch_active_pokemon_effect = 44, 
		RULE_attach_card_effect = 45, RULE_move_card_to_hand_effect = 46, RULE_damage_taken_effect = 47, 
		RULE_mulligan_reveal_effect = 48, RULE_damage_breakdown = 49, RULE_damage_breakdown_entry = 50, 
		RULE_bullet_line = 51, RULE_card_name = 52, RULE_pokemon_card = 53, RULE_energy_card = 54, 
		RULE_item_card = 55, RULE_supporter_card = 56, RULE_stadium_card = 57, 
		RULE_attack_name = 58, RULE_number = 59, RULE_end = 60, RULE_end_reason = 61, 
		RULE_line_end = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setup", "setup_entry", "coin_toss", "win_coin", "turn_decision", 
			"draw_cards_init", "mulligan_reveal", "mulligan_bonus", "take_mulligan_action", 
			"turn_block", "turn_header", "turn_entry", "turn_action", "play_cards", 
			"draw_action", "attach_energy", "evolve_pokemon", "use_ability_or_attack", 
			"damage_weakness_clause", "retreat_action", "active_pokemon_update", 
			"take_prize_action", "knockout_action", "card_added_to_hand", "discarded_card_from_pokemon", 
			"damage_taken_action", "end_turn", "sub_effect", "drawn_cards_effect", 
			"draw_number_effect", "draw_single_card_effect", "draw_named_card_effect", 
			"draw_and_play_effect", "draw_and_play_named_effect", "shuffle_deck_effect", 
			"shuffle_cards_into_deck_effect", "shuffle_named_card_into_deck_effect", 
			"evolve_pokemon_effect", "discard_number_effect", "discard_named_card_effect", 
			"discard_from_pokemon_effect", "discard_named_from_pokemon_effect", "put_damage_counters_effect", 
			"switch_active_pokemon_effect", "attach_card_effect", "move_card_to_hand_effect", 
			"damage_taken_effect", "mulligan_reveal_effect", "damage_breakdown", 
			"damage_breakdown_entry", "bullet_line", "card_name", "pokemon_card", 
			"energy_card", "item_card", "supporter_card", "stadium_card", "attack_name", 
			"number", "end", "end_reason", "line_end"
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
			null, "'Bench'", "'in'", "'on'", "'attached'", "'evolved'", "'used'", 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(126);
				match(NEWLINE);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			setup();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(133);
				turn_block();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			end();
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
			setState(148);
			match(SETUP);
			setState(149);
			line_end();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					setup_entry();
					}
					} 
				}
				setState(155);
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
		enterRule(_localctx, 4, RULE_setup_entry);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				coin_toss();
				setState(157);
				line_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				win_coin();
				setState(160);
				line_end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				turn_decision();
				setState(163);
				line_end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				draw_cards_init();
				setState(166);
				line_end();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				sub_effect();
				setState(169);
				line_end();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				mulligan_reveal();
				setState(172);
				line_end();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				mulligan_bonus();
				setState(175);
				line_end();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				take_mulligan_action();
				setState(178);
				line_end();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				turn_action();
				setState(181);
				line_end();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(183);
				bullet_line();
				setState(184);
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
		enterRule(_localctx, 6, RULE_coin_toss);
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
		enterRule(_localctx, 8, RULE_win_coin);
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
		public TerminalNode FIRST() { return getToken(PokemonParser.FIRST, 0); }
		public TerminalNode PUNTO() { return getToken(PokemonParser.PUNTO, 0); }
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
		enterRule(_localctx, 10, RULE_turn_decision);
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
			match(FIRST);
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
		enterRule(_localctx, 12, RULE_draw_cards_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			match(DREW);
			setState(214);
			match(SEVEN);
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
		enterRule(_localctx, 14, RULE_mulligan_reveal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(RAYA);
			setState(223);
			match(ID);
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
		enterRule(_localctx, 16, RULE_mulligan_bonus);
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
			match(CARD);
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
		enterRule(_localctx, 18, RULE_take_mulligan_action);
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
		enterRule(_localctx, 20, RULE_turn_block);
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
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 22, RULE_turn_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
			setState(258);
			match(APOS_S);
			setState(259);
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
		enterRule(_localctx, 24, RULE_turn_entry);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				turn_action();
				setState(262);
				line_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				damage_breakdown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				sub_effect();
				setState(266);
				line_end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				bullet_line();
				setState(269);
				line_end();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				mulligan_reveal();
				setState(272);
				line_end();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				mulligan_bonus();
				setState(275);
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
		enterRule(_localctx, 26, RULE_turn_action);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				play_cards();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				draw_action();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				attach_energy();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				evolve_pokemon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				use_ability_or_attack();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				retreat_action();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				active_pokemon_update();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
				take_prize_action();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(287);
				knockout_action();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(288);
				card_added_to_hand();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(289);
				discarded_card_from_pokemon();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(290);
				damage_taken_action();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(291);
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
		enterRule(_localctx, 28, RULE_play_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ID);
			setState(295);
			match(PLAYED);
			setState(296);
			card_name();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(297);
				match(TO);
				setState(298);
				match(THE);
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(299);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(300);
					match(ACTIVE);
					setState(301);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(302);
					match(STADIUM);
					setState(303);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(308);
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
		enterRule(_localctx, 30, RULE_draw_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ID);
			setState(311);
			match(DREW);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				{
				setState(312);
				match(A);
				setState(313);
				match(CARD);
				}
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(314);
				card_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
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
		enterRule(_localctx, 32, RULE_attach_energy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ID);
			setState(320);
			match(ATTACHED);
			setState(321);
			card_name();
			setState(322);
			match(TO);
			setState(323);
			pokemon_card();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==ON) {
				{
				setState(324);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				match(THE);
				setState(329);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(326);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(327);
					match(ACTIVE);
					setState(328);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(333);
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
		enterRule(_localctx, 34, RULE_evolve_pokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ID);
			setState(336);
			match(EVOLVED);
			setState(337);
			pokemon_card();
			setState(338);
			match(TO);
			setState(339);
			pokemon_card();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==ON) {
				{
				setState(340);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(341);
				match(THE);
				setState(345);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(342);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(343);
					match(ACTIVE);
					setState(344);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(349);
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
		enterRule(_localctx, 36, RULE_use_ability_or_attack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ID);
			setState(352);
			match(APOS_S);
			setState(353);
			pokemon_card();
			setState(354);
			match(USED);
			setState(355);
			attack_name();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(356);
				match(ON);
				setState(357);
				match(ID);
				setState(358);
				match(APOS_S);
				setState(359);
				pokemon_card();
				setState(360);
				match(FOR);
				setState(361);
				number();
				setState(362);
				match(DAMAGE);
				}
			}

			setState(366);
			match(PUNTO);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(367);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDamage_weakness_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDamage_weakness_clause(this);
		}
	}

	public final Damage_weakness_clauseContext damage_weakness_clause() throws RecognitionException {
		Damage_weakness_clauseContext _localctx = new Damage_weakness_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_damage_weakness_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(371);
			match(APOS_S);
			setState(372);
			pokemon_card();
			setState(373);
			match(TOOK);
			setState(374);
			number();
			setState(375);
			match(MORE_WORD);
			setState(376);
			match(DAMAGE);
			setState(377);
			match(BECAUSE);
			setState(378);
			match(OF);
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==FIGHTING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(380);
			match(WEAKNESS);
			setState(381);
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
			setState(383);
			match(ID);
			setState(384);
			match(RETREATED);
			setState(385);
			pokemon_card();
			setState(386);
			match(TO);
			setState(387);
			match(THE);
			setState(388);
			match(BENCH);
			setState(389);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterActive_pokemon_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitActive_pokemon_update(this);
		}
	}

	public final Active_pokemon_updateContext active_pokemon_update() throws RecognitionException {
		Active_pokemon_updateContext _localctx = new Active_pokemon_updateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_active_pokemon_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(391);
				match(ID);
				setState(392);
				match(APOS_S);
				}
			}

			setState(395);
			pokemon_card();
			setState(396);
			match(IS);
			setState(397);
			match(NOW);
			setState(398);
			match(IN);
			setState(399);
			match(THE);
			setState(400);
			match(ACTIVE);
			setState(401);
			match(SPOT);
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
		enterRule(_localctx, 44, RULE_take_prize_action);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(ID);
				setState(405);
				match(TOOK);
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(406);
					match(A);
					}
					break;
				case SEVEN:
				case NUM:
					{
					setState(407);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(410);
				match(PRIZE);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CARD) {
					{
					setState(411);
					match(CARD);
					}
				}

				setState(414);
				match(PUNTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(ID);
				setState(416);
				match(TOOK);
				setState(417);
				number();
				setState(418);
				match(PRIZE);
				setState(419);
				match(CARDS);
				setState(420);
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
		enterRule(_localctx, 46, RULE_knockout_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(424);
				match(ID);
				setState(425);
				match(APOS_S);
				}
			}

			setState(428);
			pokemon_card();
			setState(429);
			match(WAS);
			setState(430);
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
		enterRule(_localctx, 48, RULE_card_added_to_hand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_MAYUS:
				{
				setState(432);
				match(A_MAYUS);
				setState(433);
				match(CARD);
				}
				break;
			case CARTA_POKEMON:
			case CARTA_ENERGIA:
			case CARTA_ITEM:
			case CARTA_SUPPORTER:
			case CARTA_STADIUM:
				{
				setState(434);
				card_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(437);
			match(WAS);
			setState(438);
			match(ADDED);
			setState(439);
			match(TO);
			setState(440);
			match(ID);
			setState(441);
			match(APOS_S);
			setState(442);
			match(HAND);
			setState(443);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDiscarded_card_from_pokemon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDiscarded_card_from_pokemon(this);
		}
	}

	public final Discarded_card_from_pokemonContext discarded_card_from_pokemon() throws RecognitionException {
		Discarded_card_from_pokemonContext _localctx = new Discarded_card_from_pokemonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_discarded_card_from_pokemon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			card_name();
			setState(446);
			match(WAS);
			setState(447);
			match(DISCARDED);
			setState(448);
			match(FROM);
			setState(449);
			match(ID);
			setState(450);
			match(APOS_S);
			setState(451);
			pokemon_card();
			setState(452);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDamage_taken_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDamage_taken_action(this);
		}
	}

	public final Damage_taken_actionContext damage_taken_action() throws RecognitionException {
		Damage_taken_actionContext _localctx = new Damage_taken_actionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_damage_taken_action);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(454);
					match(ID);
					setState(455);
					match(APOS_S);
					}
				}

				setState(458);
				pokemon_card();
				setState(459);
				match(TOOK);
				setState(460);
				number();
				setState(461);
				match(DAMAGE);
				setState(462);
				match(PUNTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(464);
					match(ID);
					setState(465);
					match(APOS_S);
					}
				}

				setState(468);
				pokemon_card();
				setState(469);
				match(TOOK);
				setState(470);
				number();
				setState(471);
				match(MORE_WORD);
				setState(472);
				match(DAMAGE);
				setState(473);
				match(BECAUSE);
				setState(474);
				match(OF);
				setState(475);
				_la = _input.LA(1);
				if ( !(_la==FIGHTING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				match(WEAKNESS);
				setState(477);
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
		enterRule(_localctx, 54, RULE_end_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(ID);
			setState(482);
			match(ENDED);
			setState(483);
			match(THEIR);
			setState(484);
			match(TURN);
			setState(485);
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
		public Draw_and_play_named_effectContext draw_and_play_named_effect() {
			return getRuleContext(Draw_and_play_named_effectContext.class,0);
		}
		public Draw_number_effectContext draw_number_effect() {
			return getRuleContext(Draw_number_effectContext.class,0);
		}
		public Draw_single_card_effectContext draw_single_card_effect() {
			return getRuleContext(Draw_single_card_effectContext.class,0);
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
		public Shuffle_named_card_into_deck_effectContext shuffle_named_card_into_deck_effect() {
			return getRuleContext(Shuffle_named_card_into_deck_effectContext.class,0);
		}
		public Evolve_pokemon_effectContext evolve_pokemon_effect() {
			return getRuleContext(Evolve_pokemon_effectContext.class,0);
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
		enterRule(_localctx, 56, RULE_sub_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(RAYA);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(488);
				drawn_cards_effect();
				}
				break;
			case 2:
				{
				setState(489);
				draw_and_play_effect();
				}
				break;
			case 3:
				{
				setState(490);
				draw_and_play_named_effect();
				}
				break;
			case 4:
				{
				setState(491);
				draw_number_effect();
				}
				break;
			case 5:
				{
				setState(492);
				draw_single_card_effect();
				}
				break;
			case 6:
				{
				setState(493);
				draw_named_card_effect();
				}
				break;
			case 7:
				{
				setState(494);
				shuffle_deck_effect();
				}
				break;
			case 8:
				{
				setState(495);
				shuffle_cards_into_deck_effect();
				}
				break;
			case 9:
				{
				setState(496);
				shuffle_named_card_into_deck_effect();
				}
				break;
			case 10:
				{
				setState(497);
				evolve_pokemon_effect();
				}
				break;
			case 11:
				{
				setState(498);
				discard_number_effect();
				}
				break;
			case 12:
				{
				setState(499);
				discard_named_card_effect();
				}
				break;
			case 13:
				{
				setState(500);
				discard_from_pokemon_effect();
				}
				break;
			case 14:
				{
				setState(501);
				discard_named_from_pokemon_effect();
				}
				break;
			case 15:
				{
				setState(502);
				put_damage_counters_effect();
				}
				break;
			case 16:
				{
				setState(503);
				switch_active_pokemon_effect();
				}
				break;
			case 17:
				{
				setState(504);
				attach_card_effect();
				}
				break;
			case 18:
				{
				setState(505);
				move_card_to_hand_effect();
				}
				break;
			case 19:
				{
				setState(506);
				damage_taken_effect();
				}
				break;
			case 20:
				{
				setState(507);
				mulligan_reveal_effect();
				}
				break;
			}
			setState(510);
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
		enterRule(_localctx, 58, RULE_drawn_cards_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			number();
			setState(513);
			match(DRAWN);
			setState(514);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_number_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_number_effect(this);
		}
	}

	public final Draw_number_effectContext draw_number_effect() throws RecognitionException {
		Draw_number_effectContext _localctx = new Draw_number_effectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_draw_number_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(ID);
			setState(517);
			match(DREW);
			setState(518);
			number();
			setState(519);
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
	public static class Draw_single_card_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public TerminalNode A() { return getToken(PokemonParser.A, 0); }
		public TerminalNode CARD() { return getToken(PokemonParser.CARD, 0); }
		public Draw_single_card_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_single_card_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_single_card_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_single_card_effect(this);
		}
	}

	public final Draw_single_card_effectContext draw_single_card_effect() throws RecognitionException {
		Draw_single_card_effectContext _localctx = new Draw_single_card_effectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_draw_single_card_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ID);
			setState(522);
			match(DREW);
			setState(523);
			match(A);
			setState(524);
			match(CARD);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_named_card_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_named_card_effect(this);
		}
	}

	public final Draw_named_card_effectContext draw_named_card_effect() throws RecognitionException {
		Draw_named_card_effectContext _localctx = new Draw_named_card_effectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_draw_named_card_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ID);
			setState(527);
			match(DREW);
			setState(528);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_and_play_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_and_play_effect(this);
		}
	}

	public final Draw_and_play_effectContext draw_and_play_effect() throws RecognitionException {
		Draw_and_play_effectContext _localctx = new Draw_and_play_effectContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_draw_and_play_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(ID);
			setState(531);
			match(DREW);
			setState(532);
			number();
			setState(533);
			_la = _input.LA(1);
			if ( !(_la==CARD || _la==CARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(534);
			match(AND);
			setState(535);
			match(PLAYED);
			setState(536);
			match(THEM);
			setState(537);
			match(TO);
			setState(538);
			match(THE);
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BENCH:
				{
				setState(539);
				match(BENCH);
				}
				break;
			case ACTIVE:
				{
				setState(540);
				match(ACTIVE);
				setState(541);
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
	public static class Draw_and_play_named_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode DREW() { return getToken(PokemonParser.DREW, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode AND() { return getToken(PokemonParser.AND, 0); }
		public TerminalNode PLAYED() { return getToken(PokemonParser.PLAYED, 0); }
		public TerminalNode IT() { return getToken(PokemonParser.IT, 0); }
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Draw_and_play_named_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_and_play_named_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDraw_and_play_named_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDraw_and_play_named_effect(this);
		}
	}

	public final Draw_and_play_named_effectContext draw_and_play_named_effect() throws RecognitionException {
		Draw_and_play_named_effectContext _localctx = new Draw_and_play_named_effectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_draw_and_play_named_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(ID);
			setState(545);
			match(DREW);
			setState(546);
			card_name();
			setState(547);
			match(AND);
			setState(548);
			match(PLAYED);
			setState(549);
			match(IT);
			setState(550);
			match(TO);
			setState(551);
			match(THE);
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BENCH:
				{
				setState(552);
				match(BENCH);
				}
				break;
			case ACTIVE:
				{
				setState(553);
				match(ACTIVE);
				setState(554);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterShuffle_deck_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitShuffle_deck_effect(this);
		}
	}

	public final Shuffle_deck_effectContext shuffle_deck_effect() throws RecognitionException {
		Shuffle_deck_effectContext _localctx = new Shuffle_deck_effectContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shuffle_deck_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(ID);
			setState(558);
			match(SHUFFLED);
			setState(559);
			match(THEIR);
			setState(560);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterShuffle_cards_into_deck_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitShuffle_cards_into_deck_effect(this);
		}
	}

	public final Shuffle_cards_into_deck_effectContext shuffle_cards_into_deck_effect() throws RecognitionException {
		Shuffle_cards_into_deck_effectContext _localctx = new Shuffle_cards_into_deck_effectContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shuffle_cards_into_deck_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(ID);
			setState(563);
			match(SHUFFLED);
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEVEN:
			case NUM:
				{
				setState(564);
				number();
				setState(565);
				match(CARDS);
				}
				break;
			case A:
				{
				setState(567);
				match(A);
				setState(568);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(571);
			match(INTO);
			setState(572);
			match(THEIR);
			setState(573);
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
	public static class Shuffle_named_card_into_deck_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode SHUFFLED() { return getToken(PokemonParser.SHUFFLED, 0); }
		public Card_nameContext card_name() {
			return getRuleContext(Card_nameContext.class,0);
		}
		public TerminalNode INTO() { return getToken(PokemonParser.INTO, 0); }
		public TerminalNode THEIR() { return getToken(PokemonParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(PokemonParser.DECK, 0); }
		public Shuffle_named_card_into_deck_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffle_named_card_into_deck_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterShuffle_named_card_into_deck_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitShuffle_named_card_into_deck_effect(this);
		}
	}

	public final Shuffle_named_card_into_deck_effectContext shuffle_named_card_into_deck_effect() throws RecognitionException {
		Shuffle_named_card_into_deck_effectContext _localctx = new Shuffle_named_card_into_deck_effectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_shuffle_named_card_into_deck_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(ID);
			setState(576);
			match(SHUFFLED);
			setState(577);
			card_name();
			setState(578);
			match(INTO);
			setState(579);
			match(THEIR);
			setState(580);
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
	public static class Evolve_pokemon_effectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PokemonParser.ID, 0); }
		public TerminalNode EVOLVED() { return getToken(PokemonParser.EVOLVED, 0); }
		public List<Pokemon_cardContext> pokemon_card() {
			return getRuleContexts(Pokemon_cardContext.class);
		}
		public Pokemon_cardContext pokemon_card(int i) {
			return getRuleContext(Pokemon_cardContext.class,i);
		}
		public TerminalNode TO() { return getToken(PokemonParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonParser.THE, 0); }
		public TerminalNode IN() { return getToken(PokemonParser.IN, 0); }
		public TerminalNode ON() { return getToken(PokemonParser.ON, 0); }
		public TerminalNode BENCH() { return getToken(PokemonParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonParser.SPOT, 0); }
		public Evolve_pokemon_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evolve_pokemon_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterEvolve_pokemon_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitEvolve_pokemon_effect(this);
		}
	}

	public final Evolve_pokemon_effectContext evolve_pokemon_effect() throws RecognitionException {
		Evolve_pokemon_effectContext _localctx = new Evolve_pokemon_effectContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_evolve_pokemon_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(ID);
			setState(583);
			match(EVOLVED);
			setState(584);
			pokemon_card();
			setState(585);
			match(TO);
			setState(586);
			pokemon_card();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==ON) {
				{
				setState(587);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(588);
				match(THE);
				setState(592);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(589);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(590);
					match(ACTIVE);
					setState(591);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDiscard_number_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDiscard_number_effect(this);
		}
	}

	public final Discard_number_effectContext discard_number_effect() throws RecognitionException {
		Discard_number_effectContext _localctx = new Discard_number_effectContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_discard_number_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(ID);
			setState(597);
			match(DISCARDED);
			setState(598);
			number();
			setState(599);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDiscard_named_card_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDiscard_named_card_effect(this);
		}
	}

	public final Discard_named_card_effectContext discard_named_card_effect() throws RecognitionException {
		Discard_named_card_effectContext _localctx = new Discard_named_card_effectContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_discard_named_card_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ID);
			setState(602);
			match(DISCARDED);
			setState(603);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDiscard_from_pokemon_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDiscard_from_pokemon_effect(this);
		}
	}

	public final Discard_from_pokemon_effectContext discard_from_pokemon_effect() throws RecognitionException {
		Discard_from_pokemon_effectContext _localctx = new Discard_from_pokemon_effectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_discard_from_pokemon_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			number();
			setState(606);
			_la = _input.LA(1);
			if ( !(_la==CARD || _la==CARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(607);
			_la = _input.LA(1);
			if ( !(_la==WAS || _la==WERE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(608);
			match(DISCARDED);
			setState(609);
			match(FROM);
			setState(610);
			match(ID);
			setState(611);
			match(APOS_S);
			setState(612);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDiscard_named_from_pokemon_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDiscard_named_from_pokemon_effect(this);
		}
	}

	public final Discard_named_from_pokemon_effectContext discard_named_from_pokemon_effect() throws RecognitionException {
		Discard_named_from_pokemon_effectContext _localctx = new Discard_named_from_pokemon_effectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_discard_named_from_pokemon_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			card_name();
			setState(615);
			match(WAS);
			setState(616);
			match(DISCARDED);
			setState(617);
			match(FROM);
			setState(618);
			match(ID);
			setState(619);
			match(APOS_S);
			setState(620);
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
		enterRule(_localctx, 86, RULE_put_damage_counters_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(ID);
			setState(623);
			match(PUT);
			setState(624);
			number();
			setState(625);
			match(COUNTERS);
			setState(626);
			match(ON);
			setState(627);
			match(ID);
			setState(628);
			match(APOS_S);
			setState(629);
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
		enterRule(_localctx, 88, RULE_switch_active_pokemon_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(ID);
			setState(632);
			match(APOS_S);
			setState(633);
			pokemon_card();
			setState(634);
			match(WAS);
			setState(635);
			match(SWITCHED);
			setState(636);
			match(WITH);
			setState(637);
			match(ID);
			setState(638);
			match(APOS_S);
			setState(639);
			pokemon_card();
			setState(640);
			match(TO);
			setState(641);
			match(BECOME);
			setState(642);
			match(THE);
			setState(643);
			match(ACTIVE);
			setState(644);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterAttach_card_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitAttach_card_effect(this);
		}
	}

	public final Attach_card_effectContext attach_card_effect() throws RecognitionException {
		Attach_card_effectContext _localctx = new Attach_card_effectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_attach_card_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(ID);
			setState(647);
			match(ATTACHED);
			setState(648);
			card_name();
			setState(649);
			match(TO);
			setState(650);
			pokemon_card();
			{
			setState(651);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(652);
			match(THE);
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BENCH:
				{
				setState(653);
				match(BENCH);
				}
				break;
			case ACTIVE:
				{
				setState(654);
				match(ACTIVE);
				setState(655);
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
		enterRule(_localctx, 92, RULE_move_card_to_hand_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(ID);
			setState(659);
			match(MOVED);
			setState(660);
			match(ID);
			setState(661);
			match(APOS_S);
			setState(662);
			card_name();
			setState(663);
			match(TO);
			setState(664);
			match(THEIR);
			setState(665);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterDamage_taken_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitDamage_taken_effect(this);
		}
	}

	public final Damage_taken_effectContext damage_taken_effect() throws RecognitionException {
		Damage_taken_effectContext _localctx = new Damage_taken_effectContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_damage_taken_effect);
		int _la;
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(ID);
				setState(668);
				match(APOS_S);
				setState(669);
				pokemon_card();
				setState(670);
				match(TOOK);
				setState(671);
				number();
				setState(672);
				match(DAMAGE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(ID);
				setState(675);
				match(APOS_S);
				setState(676);
				pokemon_card();
				setState(677);
				match(TOOK);
				setState(678);
				number();
				setState(679);
				match(MORE_WORD);
				setState(680);
				match(DAMAGE);
				setState(681);
				match(BECAUSE);
				setState(682);
				match(OF);
				setState(683);
				_la = _input.LA(1);
				if ( !(_la==FIGHTING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(684);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).enterMulligan_reveal_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonParserListener ) ((PokemonParserListener)listener).exitMulligan_reveal_effect(this);
		}
	}

	public final Mulligan_reveal_effectContext mulligan_reveal_effect() throws RecognitionException {
		Mulligan_reveal_effectContext _localctx = new Mulligan_reveal_effectContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mulligan_reveal_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(ID);
			setState(689);
			match(REVEALED);
			setState(690);
			match(FROM);
			setState(691);
			match(MULLIGAN);
			setState(692);
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
		enterRule(_localctx, 98, RULE_damage_breakdown);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(RAYA);
			setState(695);
			match(DAMAGE_BREAKDOWN);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(696);
				match(DOS_PUNTOS);
				}
			}

			setState(699);
			line_end();
			setState(701); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(700);
					damage_breakdown_entry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(703); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 100, RULE_damage_breakdown_entry);
		int _la;
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(PUNTO_RELLENO);
				setState(706);
				match(BASE_DAMAGE);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(707);
					match(DOS_PUNTOS);
					}
				}

				setState(710);
				number();
				setState(711);
				match(DAMAGE);
				setState(712);
				line_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(PUNTO_RELLENO);
				setState(715);
				match(PARENTESIS_ABRIR);
				setState(716);
				match(ITEM);
				setState(717);
				match(PARENTESIS_CERRAR);
				setState(718);
				card_name();
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(719);
					match(DOS_PUNTOS);
					}
				}

				setState(722);
				number();
				setState(723);
				match(DAMAGE);
				setState(724);
				line_end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(PUNTO_RELLENO);
				setState(727);
				match(WEAKNESS);
				setState(728);
				match(TO);
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==FIGHTING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(730);
				number();
				setState(731);
				match(DAMAGE);
				setState(732);
				line_end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				match(PUNTO_RELLENO);
				setState(735);
				match(TOTAL_DAMAGE);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(736);
					match(DOS_PUNTOS);
					}
				}

				setState(739);
				number();
				setState(740);
				match(DAMAGE);
				setState(741);
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
		enterRule(_localctx, 102, RULE_bullet_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(PUNTO_RELLENO);
			setState(746);
			card_name();
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(747);
				match(COMA);
				setState(748);
				card_name();
				}
				}
				setState(753);
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
		enterRule(_localctx, 104, RULE_card_name);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARTA_POKEMON:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				pokemon_card();
				}
				break;
			case CARTA_ENERGIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				energy_card();
				}
				break;
			case CARTA_ITEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				item_card();
				}
				break;
			case CARTA_SUPPORTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(757);
				supporter_card();
				}
				break;
			case CARTA_STADIUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(758);
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
		enterRule(_localctx, 106, RULE_pokemon_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		enterRule(_localctx, 108, RULE_energy_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
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
		enterRule(_localctx, 110, RULE_item_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
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
		enterRule(_localctx, 112, RULE_supporter_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
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
		enterRule(_localctx, 114, RULE_stadium_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
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
		enterRule(_localctx, 116, RULE_attack_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
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
		enterRule(_localctx, 118, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
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
		enterRule(_localctx, 120, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			end_reason();
			setState(776);
			match(ID);
			setState(777);
			match(WINS);
			setState(778);
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
		enterRule(_localctx, 122, RULE_end_reason);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				match(OPPONENT);
				setState(781);
				match(CONCEDED);
				setState(782);
				match(PUNTO);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(ALL);
				setState(784);
				match(PRIZE);
				setState(785);
				match(CARDS);
				setState(786);
				match(TAKEN);
				setState(787);
				match(PUNTO);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				match(NO);
				setState(789);
				match(BENCHED);
				setState(790);
				match(POKEMON);
				setState(791);
				match(FOR);
				setState(792);
				match(BACKUP);
				setState(793);
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
		enterRule(_localctx, 124, RULE_line_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(796);
				match(NEWLINE);
				}
				}
				setState(799); 
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
		"\u0004\u0001i\u0322\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0005\u0000\u0080\b\u0000"+
		"\n\u0000\f\u0000\u0083\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0087"+
		"\b\u0000\n\u0000\f\u0000\u008a\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u008e\b\u0000\n\u0000\f\u0000\u0091\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0098\b\u0001\n\u0001\f\u0001"+
		"\u009b\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00bb\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00fd\b\n\n\n\f\n\u0100\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0116\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0125\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0131\b\u000e\u0003\u000e"+
		"\u0133\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u013c\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014a\b\u0010"+
		"\u0003\u0010\u014c\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u015a\b\u0011\u0003\u0011\u015c\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u016d\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0171\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u018a\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0199\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019d\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01a7\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01ab\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01b4\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01c9\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01d3\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01e0\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01fd\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u021f\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u022c"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u023a\b$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0251\b&\u0003&\u0253\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)"+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u0291\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u02af\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00031\u02ba\b1\u00011\u00011\u00041\u02be\b1\u000b1\f1\u02bf"+
		"\u00012\u00012\u00012\u00032\u02c5\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00032\u02d1\b2\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00032\u02e2\b2\u00012\u00012\u00012\u00012\u00032\u02e8"+
		"\b2\u00013\u00013\u00013\u00013\u00053\u02ee\b3\n3\f3\u02f1\t3\u00014"+
		"\u00014\u00014\u00014\u00014\u00034\u02f8\b4\u00015\u00015\u00016\u0001"+
		"6\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003"+
		"=\u031b\b=\u0001>\u0004>\u031e\b>\u000b>\f>\u031f\u0001>\u0000\u0000?"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\u0000\u0006"+
		"\u0001\u0000\u0010\u0011\u0001\u0000*+\u0002\u0000ggii\u0001\u0000\u001d"+
		"\u001e\u0001\u000078\u0002\u0000##hh\u033e\u0000\u0081\u0001\u0000\u0000"+
		"\u0000\u0002\u0094\u0001\u0000\u0000\u0000\u0004\u00ba\u0001\u0000\u0000"+
		"\u0000\u0006\u00bc\u0001\u0000\u0000\u0000\b\u00c6\u0001\u0000\u0000\u0000"+
		"\n\u00cd\u0001\u0000\u0000\u0000\f\u00d4\u0001\u0000\u0000\u0000\u000e"+
		"\u00de\u0001\u0000\u0000\u0000\u0010\u00e5\u0001\u0000\u0000\u0000\u0012"+
		"\u00f3\u0001\u0000\u0000\u0000\u0014\u00f9\u0001\u0000\u0000\u0000\u0016"+
		"\u0101\u0001\u0000\u0000\u0000\u0018\u0115\u0001\u0000\u0000\u0000\u001a"+
		"\u0124\u0001\u0000\u0000\u0000\u001c\u0126\u0001\u0000\u0000\u0000\u001e"+
		"\u0136\u0001\u0000\u0000\u0000 \u013f\u0001\u0000\u0000\u0000\"\u014f"+
		"\u0001\u0000\u0000\u0000$\u015f\u0001\u0000\u0000\u0000&\u0172\u0001\u0000"+
		"\u0000\u0000(\u017f\u0001\u0000\u0000\u0000*\u0189\u0001\u0000\u0000\u0000"+
		",\u01a6\u0001\u0000\u0000\u0000.\u01aa\u0001\u0000\u0000\u00000\u01b3"+
		"\u0001\u0000\u0000\u00002\u01bd\u0001\u0000\u0000\u00004\u01df\u0001\u0000"+
		"\u0000\u00006\u01e1\u0001\u0000\u0000\u00008\u01e7\u0001\u0000\u0000\u0000"+
		":\u0200\u0001\u0000\u0000\u0000<\u0204\u0001\u0000\u0000\u0000>\u0209"+
		"\u0001\u0000\u0000\u0000@\u020e\u0001\u0000\u0000\u0000B\u0212\u0001\u0000"+
		"\u0000\u0000D\u0220\u0001\u0000\u0000\u0000F\u022d\u0001\u0000\u0000\u0000"+
		"H\u0232\u0001\u0000\u0000\u0000J\u023f\u0001\u0000\u0000\u0000L\u0246"+
		"\u0001\u0000\u0000\u0000N\u0254\u0001\u0000\u0000\u0000P\u0259\u0001\u0000"+
		"\u0000\u0000R\u025d\u0001\u0000\u0000\u0000T\u0266\u0001\u0000\u0000\u0000"+
		"V\u026e\u0001\u0000\u0000\u0000X\u0277\u0001\u0000\u0000\u0000Z\u0286"+
		"\u0001\u0000\u0000\u0000\\\u0292\u0001\u0000\u0000\u0000^\u02ae\u0001"+
		"\u0000\u0000\u0000`\u02b0\u0001\u0000\u0000\u0000b\u02b6\u0001\u0000\u0000"+
		"\u0000d\u02e7\u0001\u0000\u0000\u0000f\u02e9\u0001\u0000\u0000\u0000h"+
		"\u02f7\u0001\u0000\u0000\u0000j\u02f9\u0001\u0000\u0000\u0000l\u02fb\u0001"+
		"\u0000\u0000\u0000n\u02fd\u0001\u0000\u0000\u0000p\u02ff\u0001\u0000\u0000"+
		"\u0000r\u0301\u0001\u0000\u0000\u0000t\u0303\u0001\u0000\u0000\u0000v"+
		"\u0305\u0001\u0000\u0000\u0000x\u0307\u0001\u0000\u0000\u0000z\u031a\u0001"+
		"\u0000\u0000\u0000|\u031d\u0001\u0000\u0000\u0000~\u0080\u0005\n\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0088\u0003\u0002\u0001\u0000\u0085\u0087\u0003\u0014\n\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008f\u0003x<\u0000\u008c\u008e\u0005\n\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0000\u0000\u0001\u0093\u0001\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\f\u0000\u0000\u0095\u0099\u0003|>\u0000\u0096\u0098\u0003\u0004\u0002"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u0003\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0003\u0006\u0003\u0000\u009d\u009e\u0003|>\u0000\u009e"+
		"\u00bb\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\b\u0004\u0000\u00a0\u00a1"+
		"\u0003|>\u0000\u00a1\u00bb\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\n"+
		"\u0005\u0000\u00a3\u00a4\u0003|>\u0000\u00a4\u00bb\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0003\f\u0006\u0000\u00a6\u00a7\u0003|>\u0000\u00a7\u00bb"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u00038\u001c\u0000\u00a9\u00aa\u0003"+
		"|>\u0000\u00aa\u00bb\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u000e\u0007"+
		"\u0000\u00ac\u00ad\u0003|>\u0000\u00ad\u00bb\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0003\u0010\b\u0000\u00af\u00b0\u0003|>\u0000\u00b0\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0003\u0012\t\u0000\u00b2\u00b3\u0003|"+
		">\u0000\u00b3\u00bb\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u001a\r"+
		"\u0000\u00b5\u00b6\u0003|>\u0000\u00b6\u00bb\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0003f3\u0000\u00b8\u00b9\u0003|>\u0000\u00b9\u00bb\u0001\u0000"+
		"\u0000\u0000\u00ba\u009c\u0001\u0000\u0000\u0000\u00ba\u009f\u0001\u0000"+
		"\u0000\u0000\u00ba\u00a2\u0001\u0000\u0000\u0000\u00ba\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ba\u00a8\u0001\u0000\u0000\u0000\u00ba\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ba\u00ae\u0001\u0000\u0000\u0000\u00ba\u00b1\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000"+
		"\u0000\u0000\u00bb\u0005\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005i\u0000"+
		"\u0000\u00bd\u00be\u0005\u000f\u0000\u0000\u00be\u00bf\u0007\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u001f\u0000\u0000\u00c0\u00c1\u0005 \u0000\u0000"+
		"\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c3\u0005\u0012\u0000\u0000\u00c3"+
		"\u00c4\u0005\u0013\u0000\u0000\u00c4\u00c5\u0005\u0001\u0000\u0000\u00c5"+
		"\u0007\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005i\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0014\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00ca\u0005"+
		"\u0012\u0000\u0000\u00ca\u00cb\u0005\u0015\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0001\u0000\u0000\u00cc\t\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005i"+
		"\u0000\u0000\u00ce\u00cf\u0005\u0016\u0000\u0000\u00cf\u00d0\u0005&\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0017\u0000\u0000\u00d1\u00d2\u0005\u0018\u0000"+
		"\u0000\u00d2\u00d3\u0005\u0001\u0000\u0000\u00d3\u000b\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005i\u0000\u0000\u00d5\u00d6\u0005\u0019\u0000\u0000"+
		"\u00d6\u00d7\u0005#\u0000\u0000\u00d7\u00d8\u0005\u001e\u0000\u0000\u00d8"+
		"\u00d9\u0005\u001f\u0000\u0000\u00d9\u00da\u0005 \u0000\u0000\u00da\u00db"+
		"\u0005!\u0000\u0000\u00db\u00dc\u0005\"\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0001\u0000\u0000\u00dd\r\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0003"+
		"\u0000\u0000\u00df\u00e0\u0005i\u0000\u0000\u00e0\u00e1\u0005[\u0000\u0000"+
		"\u00e1\u00e2\u0005V\u0000\u0000\u00e2\u00e3\u0005Z\u0000\u0000\u00e3\u00e4"+
		"\u0003v;\u0000\u00e4\u000f\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005i"+
		"\u0000\u0000\u00e6\u00e7\u0005\u0019\u0000\u0000\u00e7\u00e8\u0003v;\u0000"+
		"\u00e8\u00e9\u0005;\u0000\u0000\u00e9\u00ea\u0005\u001d\u0000\u0000\u00ea"+
		"\u00eb\u0005\\\u0000\u0000\u00eb\u00ec\u0005i\u0000\u0000\u00ec\u00ed"+
		"\u0005:\u0000\u0000\u00ed\u00ee\u0005]\u0000\u0000\u00ee\u00ef\u0005^"+
		"\u0000\u0000\u00ef\u00f0\u0003v;\u0000\u00f0\u00f1\u0005Z\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0001\u0000\u0000\u00f2\u0011\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005i\u0000\u0000\u00f4\u00f5\u0005:\u0000\u0000\u00f5\u00f6"+
		"\u0005\u001b\u0000\u0000\u00f6\u00f7\u0005Z\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0001\u0000\u0000\u00f8\u0013\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003"+
		"\u0016\u000b\u0000\u00fa\u00fe\u0003|>\u0000\u00fb\u00fd\u0003\u0018\f"+
		"\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0015\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005i\u0000\u0000\u0102\u0103\u0005\t\u0000\u0000"+
		"\u0103\u0104\u0005\u000e\u0000\u0000\u0104\u0017\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0003\u001a\r\u0000\u0106\u0107\u0003|>\u0000\u0107\u0116"+
		"\u0001\u0000\u0000\u0000\u0108\u0116\u0003b1\u0000\u0109\u010a\u00038"+
		"\u001c\u0000\u010a\u010b\u0003|>\u0000\u010b\u0116\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0003f3\u0000\u010d\u010e\u0003|>\u0000\u010e\u0116\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0003\u000e\u0007\u0000\u0110\u0111\u0003"+
		"|>\u0000\u0111\u0116\u0001\u0000\u0000\u0000\u0112\u0113\u0003\u0010\b"+
		"\u0000\u0113\u0114\u0003|>\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115"+
		"\u0105\u0001\u0000\u0000\u0000\u0115\u0108\u0001\u0000\u0000\u0000\u0115"+
		"\u0109\u0001\u0000\u0000\u0000\u0115\u010c\u0001\u0000\u0000\u0000\u0115"+
		"\u010f\u0001\u0000\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0116"+
		"\u0019\u0001\u0000\u0000\u0000\u0117\u0125\u0003\u001c\u000e\u0000\u0118"+
		"\u0125\u0003\u001e\u000f\u0000\u0119\u0125\u0003 \u0010\u0000\u011a\u0125"+
		"\u0003\"\u0011\u0000\u011b\u0125\u0003$\u0012\u0000\u011c\u0125\u0003"+
		"(\u0014\u0000\u011d\u0125\u0003*\u0015\u0000\u011e\u0125\u0003,\u0016"+
		"\u0000\u011f\u0125\u0003.\u0017\u0000\u0120\u0125\u00030\u0018\u0000\u0121"+
		"\u0125\u00032\u0019\u0000\u0122\u0125\u00034\u001a\u0000\u0123\u0125\u0003"+
		"6\u001b\u0000\u0124\u0117\u0001\u0000\u0000\u0000\u0124\u0118\u0001\u0000"+
		"\u0000\u0000\u0124\u0119\u0001\u0000\u0000\u0000\u0124\u011a\u0001\u0000"+
		"\u0000\u0000\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000"+
		"\u0000\u0000\u0124\u011d\u0001\u0000\u0000\u0000\u0124\u011e\u0001\u0000"+
		"\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000"+
		"\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u001b\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005i\u0000\u0000\u0127\u0128\u0005$\u0000\u0000"+
		"\u0128\u0132\u0003h4\u0000\u0129\u012a\u0005&\u0000\u0000\u012a\u0130"+
		"\u0005 \u0000\u0000\u012b\u0131\u0005)\u0000\u0000\u012c\u012d\u0005\'"+
		"\u0000\u0000\u012d\u0131\u0005(\u0000\u0000\u012e\u012f\u0005W\u0000\u0000"+
		"\u012f\u0131\u0005(\u0000\u0000\u0130\u012b\u0001\u0000\u0000\u0000\u0130"+
		"\u012c\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131"+
		"\u0133\u0001\u0000\u0000\u0000\u0132\u0129\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005\u0001\u0000\u0000\u0135\u001d\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005i\u0000\u0000\u0137\u013b\u0005\u0019\u0000\u0000\u0138\u0139"+
		"\u0005\u001b\u0000\u0000\u0139\u013c\u0005\u001d\u0000\u0000\u013a\u013c"+
		"\u0003h4\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0001"+
		"\u0000\u0000\u013e\u001f\u0001\u0000\u0000\u0000\u013f\u0140\u0005i\u0000"+
		"\u0000\u0140\u0141\u0005,\u0000\u0000\u0141\u0142\u0003h4\u0000\u0142"+
		"\u0143\u0005&\u0000\u0000\u0143\u014b\u0003j5\u0000\u0144\u0145\u0007"+
		"\u0001\u0000\u0000\u0145\u0149\u0005 \u0000\u0000\u0146\u014a\u0005)\u0000"+
		"\u0000\u0147\u0148\u0005\'\u0000\u0000\u0148\u014a\u0005(\u0000\u0000"+
		"\u0149\u0146\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0144\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0005\u0001\u0000\u0000\u014e!\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005i\u0000\u0000\u0150\u0151\u0005-\u0000\u0000\u0151\u0152\u0003"+
		"j5\u0000\u0152\u0153\u0005&\u0000\u0000\u0153\u015b\u0003j5\u0000\u0154"+
		"\u0155\u0007\u0001\u0000\u0000\u0155\u0159\u0005 \u0000\u0000\u0156\u015a"+
		"\u0005)\u0000\u0000\u0157\u0158\u0005\'\u0000\u0000\u0158\u015a\u0005"+
		"(\u0000\u0000\u0159\u0156\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0154\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0005\u0001\u0000\u0000\u015e#\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005i\u0000\u0000\u0160\u0161\u0005\t\u0000\u0000"+
		"\u0161\u0162\u0003j5\u0000\u0162\u0163\u0005.\u0000\u0000\u0163\u016c"+
		"\u0003t:\u0000\u0164\u0165\u0005+\u0000\u0000\u0165\u0166\u0005i\u0000"+
		"\u0000\u0166\u0167\u0005\t\u0000\u0000\u0167\u0168\u0003j5\u0000\u0168"+
		"\u0169\u0005\u001f\u0000\u0000\u0169\u016a\u0003v;\u0000\u016a\u016b\u0005"+
		"2\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u0164\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u0170\u0005\u0001\u0000\u0000\u016f\u0171\u0003&\u0013"+
		"\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171%\u0001\u0000\u0000\u0000\u0172\u0173\u0005i\u0000\u0000\u0173"+
		"\u0174\u0005\t\u0000\u0000\u0174\u0175\u0003j5\u0000\u0175\u0176\u0005"+
		":\u0000\u0000\u0176\u0177\u0003v;\u0000\u0177\u0178\u0005;\u0000\u0000"+
		"\u0178\u0179\u00052\u0000\u0000\u0179\u017a\u0005\\\u0000\u0000\u017a"+
		"\u017b\u0005`\u0000\u0000\u017b\u017c\u0007\u0002\u0000\u0000\u017c\u017d"+
		"\u0005_\u0000\u0000\u017d\u017e\u0005\u0001\u0000\u0000\u017e\'\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0005i\u0000\u0000\u0180\u0181\u0005B\u0000"+
		"\u0000\u0181\u0182\u0003j5\u0000\u0182\u0183\u0005&\u0000\u0000\u0183"+
		"\u0184\u0005 \u0000\u0000\u0184\u0185\u0005)\u0000\u0000\u0185\u0186\u0005"+
		"\u0001\u0000\u0000\u0186)\u0001\u0000\u0000\u0000\u0187\u0188\u0005i\u0000"+
		"\u0000\u0188\u018a\u0005\t\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0003j5\u0000\u018c\u018d\u0005X\u0000\u0000\u018d\u018e"+
		"\u0005Y\u0000\u0000\u018e\u018f\u0005*\u0000\u0000\u018f\u0190\u0005 "+
		"\u0000\u0000\u0190\u0191\u0005\'\u0000\u0000\u0191\u0192\u0005(\u0000"+
		"\u0000\u0192\u0193\u0005\u0001\u0000\u0000\u0193+\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0005i\u0000\u0000\u0195\u0198\u0005:\u0000\u0000\u0196\u0199"+
		"\u0005\u001b\u0000\u0000\u0197\u0199\u0003v;\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019c\u0005<\u0000\u0000\u019b\u019d\u0005\u001d\u0000"+
		"\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a7\u0005\u0001\u0000"+
		"\u0000\u019f\u01a0\u0005i\u0000\u0000\u01a0\u01a1\u0005:\u0000\u0000\u01a1"+
		"\u01a2\u0003v;\u0000\u01a2\u01a3\u0005<\u0000\u0000\u01a3\u01a4\u0005"+
		"\u001e\u0000\u0000\u01a4\u01a5\u0005\u0001\u0000\u0000\u01a5\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a6\u0194\u0001\u0000\u0000\u0000\u01a6\u019f\u0001"+
		"\u0000\u0000\u0000\u01a7-\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005i\u0000"+
		"\u0000\u01a9\u01ab\u0005\t\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0003j5\u0000\u01ad\u01ae\u00057\u0000\u0000\u01ae\u01af"+
		"\u00059\u0000\u0000\u01af/\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u001c"+
		"\u0000\u0000\u01b1\u01b4\u0005\u001d\u0000\u0000\u01b2\u01b4\u0003h4\u0000"+
		"\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u00057\u0000\u0000\u01b6"+
		"\u01b7\u0005=\u0000\u0000\u01b7\u01b8\u0005&\u0000\u0000\u01b8\u01b9\u0005"+
		"i\u0000\u0000\u01b9\u01ba\u0005\t\u0000\u0000\u01ba\u01bb\u0005\"\u0000"+
		"\u0000\u01bb\u01bc\u0005\u0001\u0000\u0000\u01bc1\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0003h4\u0000\u01be\u01bf\u00057\u0000\u0000\u01bf\u01c0"+
		"\u0005%\u0000\u0000\u01c0\u01c1\u0005V\u0000\u0000\u01c1\u01c2\u0005i"+
		"\u0000\u0000\u01c2\u01c3\u0005\t\u0000\u0000\u01c3\u01c4\u0003j5\u0000"+
		"\u01c4\u01c5\u0005\u0001\u0000\u0000\u01c53\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0005i\u0000\u0000\u01c7\u01c9\u0005\t\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003j5\u0000\u01cb\u01cc\u0005:"+
		"\u0000\u0000\u01cc\u01cd\u0003v;\u0000\u01cd\u01ce\u00052\u0000\u0000"+
		"\u01ce\u01cf\u0005\u0001\u0000\u0000\u01cf\u01e0\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d1\u0005i\u0000\u0000\u01d1\u01d3\u0005\t\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003j5\u0000\u01d5\u01d6\u0005"+
		":\u0000\u0000\u01d6\u01d7\u0003v;\u0000\u01d7\u01d8\u0005;\u0000\u0000"+
		"\u01d8\u01d9\u00052\u0000\u0000\u01d9\u01da\u0005\\\u0000\u0000\u01da"+
		"\u01db\u0005`\u0000\u0000\u01db\u01dc\u0007\u0002\u0000\u0000\u01dc\u01dd"+
		"\u0005_\u0000\u0000\u01dd\u01de\u0005\u0001\u0000\u0000\u01de\u01e0\u0001"+
		"\u0000\u0000\u0000\u01df\u01c8\u0001\u0000\u0000\u0000\u01df\u01d2\u0001"+
		"\u0000\u0000\u0000\u01e05\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005i\u0000"+
		"\u0000\u01e2\u01e3\u0005G\u0000\u0000\u01e3\u01e4\u0005D\u0000\u0000\u01e4"+
		"\u01e5\u0005\r\u0000\u0000\u01e5\u01e6\u0005\u0001\u0000\u0000\u01e67"+
		"\u0001\u0000\u0000\u0000\u01e7\u01fc\u0005\u0003\u0000\u0000\u01e8\u01fd"+
		"\u0003:\u001d\u0000\u01e9\u01fd\u0003B!\u0000\u01ea\u01fd\u0003D\"\u0000"+
		"\u01eb\u01fd\u0003<\u001e\u0000\u01ec\u01fd\u0003>\u001f\u0000\u01ed\u01fd"+
		"\u0003@ \u0000\u01ee\u01fd\u0003F#\u0000\u01ef\u01fd\u0003H$\u0000\u01f0"+
		"\u01fd\u0003J%\u0000\u01f1\u01fd\u0003L&\u0000\u01f2\u01fd\u0003N\'\u0000"+
		"\u01f3\u01fd\u0003P(\u0000\u01f4\u01fd\u0003R)\u0000\u01f5\u01fd\u0003"+
		"T*\u0000\u01f6\u01fd\u0003V+\u0000\u01f7\u01fd\u0003X,\u0000\u01f8\u01fd"+
		"\u0003Z-\u0000\u01f9\u01fd\u0003\\.\u0000\u01fa\u01fd\u0003^/\u0000\u01fb"+
		"\u01fd\u0003`0\u0000\u01fc\u01e8\u0001\u0000\u0000\u0000\u01fc\u01e9\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ea\u0001\u0000\u0000\u0000\u01fc\u01eb\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ec\u0001\u0000\u0000\u0000\u01fc\u01ed\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ee\u0001\u0000\u0000\u0000\u01fc\u01ef\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f0\u0001\u0000\u0000\u0000\u01fc\u01f1\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f2\u0001\u0000\u0000\u0000\u01fc\u01f3\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f4\u0001\u0000\u0000\u0000\u01fc\u01f5\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f6\u0001\u0000\u0000\u0000\u01fc\u01f7\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f8\u0001\u0000\u0000\u0000\u01fc\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005"+
		"\u0001\u0000\u0000\u01ff9\u0001\u0000\u0000\u0000\u0200\u0201\u0003v;"+
		"\u0000\u0201\u0202\u0005\u001a\u0000\u0000\u0202\u0203\u0005\u001e\u0000"+
		"\u0000\u0203;\u0001\u0000\u0000\u0000\u0204\u0205\u0005i\u0000\u0000\u0205"+
		"\u0206\u0005\u0019\u0000\u0000\u0206\u0207\u0003v;\u0000\u0207\u0208\u0007"+
		"\u0003\u0000\u0000\u0208=\u0001\u0000\u0000\u0000\u0209\u020a\u0005i\u0000"+
		"\u0000\u020a\u020b\u0005\u0019\u0000\u0000\u020b\u020c\u0005\u001b\u0000"+
		"\u0000\u020c\u020d\u0005\u001d\u0000\u0000\u020d?\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0005i\u0000\u0000\u020f\u0210\u0005\u0019\u0000\u0000\u0210"+
		"\u0211\u0003h4\u0000\u0211A\u0001\u0000\u0000\u0000\u0212\u0213\u0005"+
		"i\u0000\u0000\u0213\u0214\u0005\u0019\u0000\u0000\u0214\u0215\u0003v;"+
		"\u0000\u0215\u0216\u0007\u0003\u0000\u0000\u0216\u0217\u0005P\u0000\u0000"+
		"\u0217\u0218\u0005$\u0000\u0000\u0218\u0219\u0005R\u0000\u0000\u0219\u021a"+
		"\u0005&\u0000\u0000\u021a\u021e\u0005 \u0000\u0000\u021b\u021f\u0005)"+
		"\u0000\u0000\u021c\u021d\u0005\'\u0000\u0000\u021d\u021f\u0005(\u0000"+
		"\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021fC\u0001\u0000\u0000\u0000\u0220\u0221\u0005i\u0000\u0000\u0221"+
		"\u0222\u0005\u0019\u0000\u0000\u0222\u0223\u0003h4\u0000\u0223\u0224\u0005"+
		"P\u0000\u0000\u0224\u0225\u0005$\u0000\u0000\u0225\u0226\u0005Q\u0000"+
		"\u0000\u0226\u0227\u0005&\u0000\u0000\u0227\u022b\u0005 \u0000\u0000\u0228"+
		"\u022c\u0005)\u0000\u0000\u0229\u022a\u0005\'\u0000\u0000\u022a\u022c"+
		"\u0005(\u0000\u0000\u022b\u0228\u0001\u0000\u0000\u0000\u022b\u0229\u0001"+
		"\u0000\u0000\u0000\u022cE\u0001\u0000\u0000\u0000\u022d\u022e\u0005i\u0000"+
		"\u0000\u022e\u022f\u0005C\u0000\u0000\u022f\u0230\u0005D\u0000\u0000\u0230"+
		"\u0231\u0005E\u0000\u0000\u0231G\u0001\u0000\u0000\u0000\u0232\u0233\u0005"+
		"i\u0000\u0000\u0233\u0239\u0005C\u0000\u0000\u0234\u0235\u0003v;\u0000"+
		"\u0235\u0236\u0005\u001e\u0000\u0000\u0236\u023a\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0005\u001b\u0000\u0000\u0238\u023a\u0005\u001d\u0000\u0000"+
		"\u0239\u0234\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0005S\u0000\u0000\u023c"+
		"\u023d\u0005D\u0000\u0000\u023d\u023e\u0005E\u0000\u0000\u023eI\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0005i\u0000\u0000\u0240\u0241\u0005C\u0000"+
		"\u0000\u0241\u0242\u0003h4\u0000\u0242\u0243\u0005S\u0000\u0000\u0243"+
		"\u0244\u0005D\u0000\u0000\u0244\u0245\u0005E\u0000\u0000\u0245K\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0005i\u0000\u0000\u0247\u0248\u0005-\u0000"+
		"\u0000\u0248\u0249\u0003j5\u0000\u0249\u024a\u0005&\u0000\u0000\u024a"+
		"\u0252\u0003j5\u0000\u024b\u024c\u0007\u0001\u0000\u0000\u024c\u0250\u0005"+
		" \u0000\u0000\u024d\u0251\u0005)\u0000\u0000\u024e\u024f\u0005\'\u0000"+
		"\u0000\u024f\u0251\u0005(\u0000\u0000\u0250\u024d\u0001\u0000\u0000\u0000"+
		"\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0253\u0001\u0000\u0000\u0000"+
		"\u0252\u024b\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000"+
		"\u0253M\u0001\u0000\u0000\u0000\u0254\u0255\u0005i\u0000\u0000\u0255\u0256"+
		"\u0005%\u0000\u0000\u0256\u0257\u0003v;\u0000\u0257\u0258\u0007\u0003"+
		"\u0000\u0000\u0258O\u0001\u0000\u0000\u0000\u0259\u025a\u0005i\u0000\u0000"+
		"\u025a\u025b\u0005%\u0000\u0000\u025b\u025c\u0003h4\u0000\u025cQ\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0003v;\u0000\u025e\u025f\u0007\u0003\u0000"+
		"\u0000\u025f\u0260\u0007\u0004\u0000\u0000\u0260\u0261\u0005%\u0000\u0000"+
		"\u0261\u0262\u0005V\u0000\u0000\u0262\u0263\u0005i\u0000\u0000\u0263\u0264"+
		"\u0005\t\u0000\u0000\u0264\u0265\u0003j5\u0000\u0265S\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0003h4\u0000\u0267\u0268\u00057\u0000\u0000\u0268"+
		"\u0269\u0005%\u0000\u0000\u0269\u026a\u0005V\u0000\u0000\u026a\u026b\u0005"+
		"i\u0000\u0000\u026b\u026c\u0005\t\u0000\u0000\u026c\u026d\u0003j5\u0000"+
		"\u026dU\u0001\u0000\u0000\u0000\u026e\u026f\u0005i\u0000\u0000\u026f\u0270"+
		"\u0005T\u0000\u0000\u0270\u0271\u0003v;\u0000\u0271\u0272\u0005U\u0000"+
		"\u0000\u0272\u0273\u0005+\u0000\u0000\u0273\u0274\u0005i\u0000\u0000\u0274"+
		"\u0275\u0005\t\u0000\u0000\u0275\u0276\u0003j5\u0000\u0276W\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0005i\u0000\u0000\u0278\u0279\u0005\t\u0000"+
		"\u0000\u0279\u027a\u0003j5\u0000\u027a\u027b\u00057\u0000\u0000\u027b"+
		"\u027c\u0005>\u0000\u0000\u027c\u027d\u0005?\u0000\u0000\u027d\u027e\u0005"+
		"i\u0000\u0000\u027e\u027f\u0005\t\u0000\u0000\u027f\u0280\u0003j5\u0000"+
		"\u0280\u0281\u0005&\u0000\u0000\u0281\u0282\u0005@\u0000\u0000\u0282\u0283"+
		"\u0005 \u0000\u0000\u0283\u0284\u0005\'\u0000\u0000\u0284\u0285\u0005"+
		"A\u0000\u0000\u0285Y\u0001\u0000\u0000\u0000\u0286\u0287\u0005i\u0000"+
		"\u0000\u0287\u0288\u0005,\u0000\u0000\u0288\u0289\u0003h4\u0000\u0289"+
		"\u028a\u0005&\u0000\u0000\u028a\u028b\u0003j5\u0000\u028b\u028c\u0007"+
		"\u0001\u0000\u0000\u028c\u0290\u0005 \u0000\u0000\u028d\u0291\u0005)\u0000"+
		"\u0000\u028e\u028f\u0005\'\u0000\u0000\u028f\u0291\u0005(\u0000\u0000"+
		"\u0290\u028d\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000"+
		"\u0291[\u0001\u0000\u0000\u0000\u0292\u0293\u0005i\u0000\u0000\u0293\u0294"+
		"\u0005F\u0000\u0000\u0294\u0295\u0005i\u0000\u0000\u0295\u0296\u0005\t"+
		"\u0000\u0000\u0296\u0297\u0003h4\u0000\u0297\u0298\u0005&\u0000\u0000"+
		"\u0298\u0299\u0005D\u0000\u0000\u0299\u029a\u0005\"\u0000\u0000\u029a"+
		"]\u0001\u0000\u0000\u0000\u029b\u029c\u0005i\u0000\u0000\u029c\u029d\u0005"+
		"\t\u0000\u0000\u029d\u029e\u0003j5\u0000\u029e\u029f\u0005:\u0000\u0000"+
		"\u029f\u02a0\u0003v;\u0000\u02a0\u02a1\u00052\u0000\u0000\u02a1\u02af"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005i\u0000\u0000\u02a3\u02a4\u0005"+
		"\t\u0000\u0000\u02a4\u02a5\u0003j5\u0000\u02a5\u02a6\u0005:\u0000\u0000"+
		"\u02a6\u02a7\u0003v;\u0000\u02a7\u02a8\u0005;\u0000\u0000\u02a8\u02a9"+
		"\u00052\u0000\u0000\u02a9\u02aa\u0005\\\u0000\u0000\u02aa\u02ab\u0005"+
		"`\u0000\u0000\u02ab\u02ac\u0007\u0002\u0000\u0000\u02ac\u02ad\u0005_\u0000"+
		"\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u029b\u0001\u0000\u0000"+
		"\u0000\u02ae\u02a2\u0001\u0000\u0000\u0000\u02af_\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005i\u0000\u0000\u02b1\u02b2\u0005[\u0000\u0000\u02b2\u02b3"+
		"\u0005V\u0000\u0000\u02b3\u02b4\u0005Z\u0000\u0000\u02b4\u02b5\u0003v"+
		";\u0000\u02b5a\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005\u0003\u0000\u0000"+
		"\u02b7\u02b9\u0005/\u0000\u0000\u02b8\u02ba\u0005\u0005\u0000\u0000\u02b9"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0003|>\u0000\u02bc\u02be\u0003"+
		"d2\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000"+
		"\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c0c\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005\u0004\u0000\u0000"+
		"\u02c2\u02c4\u00050\u0000\u0000\u02c3\u02c5\u0005\u0005\u0000\u0000\u02c4"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7\u0003v;\u0000\u02c7\u02c8\u0005"+
		"2\u0000\u0000\u02c8\u02c9\u0003|>\u0000\u02c9\u02e8\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0005\u0004\u0000\u0000\u02cb\u02cc\u0005\u0006\u0000"+
		"\u0000\u02cc\u02cd\u00056\u0000\u0000\u02cd\u02ce\u0005\u0007\u0000\u0000"+
		"\u02ce\u02d0\u0003h4\u0000\u02cf\u02d1\u0005\u0005\u0000\u0000\u02d0\u02cf"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d3\u0003v;\u0000\u02d3\u02d4\u00052"+
		"\u0000\u0000\u02d4\u02d5\u0003|>\u0000\u02d5\u02e8\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d7\u0005\u0004\u0000\u0000\u02d7\u02d8\u0005_\u0000\u0000\u02d8"+
		"\u02d9\u0005&\u0000\u0000\u02d9\u02da\u0007\u0002\u0000\u0000\u02da\u02db"+
		"\u0003v;\u0000\u02db\u02dc\u00052\u0000\u0000\u02dc\u02dd\u0003|>\u0000"+
		"\u02dd\u02e8\u0001\u0000\u0000\u0000\u02de\u02df\u0005\u0004\u0000\u0000"+
		"\u02df\u02e1\u00051\u0000\u0000\u02e0\u02e2\u0005\u0005\u0000\u0000\u02e1"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0003v;\u0000\u02e4\u02e5\u0005"+
		"2\u0000\u0000\u02e5\u02e6\u0003|>\u0000\u02e6\u02e8\u0001\u0000\u0000"+
		"\u0000\u02e7\u02c1\u0001\u0000\u0000\u0000\u02e7\u02ca\u0001\u0000\u0000"+
		"\u0000\u02e7\u02d6\u0001\u0000\u0000\u0000\u02e7\u02de\u0001\u0000\u0000"+
		"\u0000\u02e8e\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005\u0004\u0000\u0000"+
		"\u02ea\u02ef\u0003h4\u0000\u02eb\u02ec\u0005\u0002\u0000\u0000\u02ec\u02ee"+
		"\u0003h4\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000"+
		"\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f0g\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f8\u0003j5\u0000\u02f3\u02f8\u0003l6\u0000\u02f4\u02f8"+
		"\u0003n7\u0000\u02f5\u02f8\u0003p8\u0000\u02f6\u02f8\u0003r9\u0000\u02f7"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f7\u02f3\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f8i\u0001\u0000\u0000\u0000\u02f9\u02fa"+
		"\u0005a\u0000\u0000\u02fak\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005b"+
		"\u0000\u0000\u02fcm\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005c\u0000\u0000"+
		"\u02feo\u0001\u0000\u0000\u0000\u02ff\u0300\u0005d\u0000\u0000\u0300q"+
		"\u0001\u0000\u0000\u0000\u0301\u0302\u0005e\u0000\u0000\u0302s\u0001\u0000"+
		"\u0000\u0000\u0303\u0304\u0005f\u0000\u0000\u0304u\u0001\u0000\u0000\u0000"+
		"\u0305\u0306\u0007\u0005\u0000\u0000\u0306w\u0001\u0000\u0000\u0000\u0307"+
		"\u0308\u0003z=\u0000\u0308\u0309\u0005i\u0000\u0000\u0309\u030a\u0005"+
		"J\u0000\u0000\u030a\u030b\u0005\u0001\u0000\u0000\u030by\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0005K\u0000\u0000\u030d\u030e\u0005L\u0000\u0000\u030e"+
		"\u031b\u0005\u0001\u0000\u0000\u030f\u0310\u0005H\u0000\u0000\u0310\u0311"+
		"\u0005<\u0000\u0000\u0311\u0312\u0005\u001e\u0000\u0000\u0312\u0313\u0005"+
		"I\u0000\u0000\u0313\u031b\u0005\u0001\u0000\u0000\u0314\u0315\u0005M\u0000"+
		"\u0000\u0315\u0316\u0005N\u0000\u0000\u0316\u0317\u0005A\u0000\u0000\u0317"+
		"\u0318\u0005\u001f\u0000\u0000\u0318\u0319\u0005O\u0000\u0000\u0319\u031b"+
		"\u0005\u0001\u0000\u0000\u031a\u030c\u0001\u0000\u0000\u0000\u031a\u030f"+
		"\u0001\u0000\u0000\u0000\u031a\u0314\u0001\u0000\u0000\u0000\u031b{\u0001"+
		"\u0000\u0000\u0000\u031c\u031e\u0005\n\u0000\u0000\u031d\u031c\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u031d\u0001\u0000"+
		"\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320}\u0001\u0000\u0000"+
		"\u0000,\u0081\u0088\u008f\u0099\u00ba\u00fe\u0115\u0124\u0130\u0132\u013b"+
		"\u0149\u014b\u0159\u015b\u016c\u0170\u0189\u0198\u019c\u01a6\u01aa\u01b3"+
		"\u01c8\u01d2\u01df\u01fc\u021e\u022b\u0239\u0250\u0252\u0290\u02ae\u02b9"+
		"\u02bf\u02c4\u02d0\u02e1\u02e7\u02ef\u02f7\u031a\u031f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}