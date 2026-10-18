// Generated from PokemonParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PokemonParser}.
 */
public interface PokemonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PokemonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PokemonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PokemonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(PokemonParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(PokemonParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#coin_toss}.
	 * @param ctx the parse tree
	 */
	void enterCoin_toss(PokemonParser.Coin_tossContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#coin_toss}.
	 * @param ctx the parse tree
	 */
	void exitCoin_toss(PokemonParser.Coin_tossContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#win_coin}.
	 * @param ctx the parse tree
	 */
	void enterWin_coin(PokemonParser.Win_coinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#win_coin}.
	 * @param ctx the parse tree
	 */
	void exitWin_coin(PokemonParser.Win_coinContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#turn_decision}.
	 * @param ctx the parse tree
	 */
	void enterTurn_decision(PokemonParser.Turn_decisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#turn_decision}.
	 * @param ctx the parse tree
	 */
	void exitTurn_decision(PokemonParser.Turn_decisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#draw_cards_init}.
	 * @param ctx the parse tree
	 */
	void enterDraw_cards_init(PokemonParser.Draw_cards_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#draw_cards_init}.
	 * @param ctx the parse tree
	 */
	void exitDraw_cards_init(PokemonParser.Draw_cards_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#descripcion_cartas}.
	 * @param ctx the parse tree
	 */
	void enterDescripcion_cartas(PokemonParser.Descripcion_cartasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#descripcion_cartas}.
	 * @param ctx the parse tree
	 */
	void exitDescripcion_cartas(PokemonParser.Descripcion_cartasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#play_cards}.
	 * @param ctx the parse tree
	 */
	void enterPlay_cards(PokemonParser.Play_cardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#play_cards}.
	 * @param ctx the parse tree
	 */
	void exitPlay_cards(PokemonParser.Play_cardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#card_name}.
	 * @param ctx the parse tree
	 */
	void enterCard_name(PokemonParser.Card_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#card_name}.
	 * @param ctx the parse tree
	 */
	void exitCard_name(PokemonParser.Card_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(PokemonParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(PokemonParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#concede}.
	 * @param ctx the parse tree
	 */
	void enterConcede(PokemonParser.ConcedeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#concede}.
	 * @param ctx the parse tree
	 */
	void exitConcede(PokemonParser.ConcedeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#prize_cards}.
	 * @param ctx the parse tree
	 */
	void enterPrize_cards(PokemonParser.Prize_cardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#prize_cards}.
	 * @param ctx the parse tree
	 */
	void exitPrize_cards(PokemonParser.Prize_cardsContext ctx);
}