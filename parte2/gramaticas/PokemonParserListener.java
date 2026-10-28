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
	 * Enter a parse tree produced by {@link PokemonParser#common_entry}.
	 * @param ctx the parse tree
	 */
	void enterCommon_entry(PokemonParser.Common_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#common_entry}.
	 * @param ctx the parse tree
	 */
	void exitCommon_entry(PokemonParser.Common_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#setup_entry}.
	 * @param ctx the parse tree
	 */
	void enterSetup_entry(PokemonParser.Setup_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#setup_entry}.
	 * @param ctx the parse tree
	 */
	void exitSetup_entry(PokemonParser.Setup_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#turn_entry}.
	 * @param ctx the parse tree
	 */
	void enterTurn_entry(PokemonParser.Turn_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#turn_entry}.
	 * @param ctx the parse tree
	 */
	void exitTurn_entry(PokemonParser.Turn_entryContext ctx);
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
	 * Enter a parse tree produced by {@link PokemonParser#mulligan_reveal}.
	 * @param ctx the parse tree
	 */
	void enterMulligan_reveal(PokemonParser.Mulligan_revealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#mulligan_reveal}.
	 * @param ctx the parse tree
	 */
	void exitMulligan_reveal(PokemonParser.Mulligan_revealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#mulligan_bonus}.
	 * @param ctx the parse tree
	 */
	void enterMulligan_bonus(PokemonParser.Mulligan_bonusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#mulligan_bonus}.
	 * @param ctx the parse tree
	 */
	void exitMulligan_bonus(PokemonParser.Mulligan_bonusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#take_mulligan_action}.
	 * @param ctx the parse tree
	 */
	void enterTake_mulligan_action(PokemonParser.Take_mulligan_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#take_mulligan_action}.
	 * @param ctx the parse tree
	 */
	void exitTake_mulligan_action(PokemonParser.Take_mulligan_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#turn_block}.
	 * @param ctx the parse tree
	 */
	void enterTurn_block(PokemonParser.Turn_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#turn_block}.
	 * @param ctx the parse tree
	 */
	void exitTurn_block(PokemonParser.Turn_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#turn_header}.
	 * @param ctx the parse tree
	 */
	void enterTurn_header(PokemonParser.Turn_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#turn_header}.
	 * @param ctx the parse tree
	 */
	void exitTurn_header(PokemonParser.Turn_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#turn_action}.
	 * @param ctx the parse tree
	 */
	void enterTurn_action(PokemonParser.Turn_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#turn_action}.
	 * @param ctx the parse tree
	 */
	void exitTurn_action(PokemonParser.Turn_actionContext ctx);
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
	 * Enter a parse tree produced by {@link PokemonParser#draw_action}.
	 * @param ctx the parse tree
	 */
	void enterDraw_action(PokemonParser.Draw_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#draw_action}.
	 * @param ctx the parse tree
	 */
	void exitDraw_action(PokemonParser.Draw_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#draw_object}.
	 * @param ctx the parse tree
	 */
	void enterDraw_object(PokemonParser.Draw_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#draw_object}.
	 * @param ctx the parse tree
	 */
	void exitDraw_object(PokemonParser.Draw_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#attach_energy}.
	 * @param ctx the parse tree
	 */
	void enterAttach_energy(PokemonParser.Attach_energyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#attach_energy}.
	 * @param ctx the parse tree
	 */
	void exitAttach_energy(PokemonParser.Attach_energyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#evolve_pokemon}.
	 * @param ctx the parse tree
	 */
	void enterEvolve_pokemon(PokemonParser.Evolve_pokemonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#evolve_pokemon}.
	 * @param ctx the parse tree
	 */
	void exitEvolve_pokemon(PokemonParser.Evolve_pokemonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#retreat_action}.
	 * @param ctx the parse tree
	 */
	void enterRetreat_action(PokemonParser.Retreat_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#retreat_action}.
	 * @param ctx the parse tree
	 */
	void exitRetreat_action(PokemonParser.Retreat_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#special_condition}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_condition(PokemonParser.Special_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#special_condition}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_condition(PokemonParser.Special_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#pokemon_checkup_block}.
	 * @param ctx the parse tree
	 */
	void enterPokemon_checkup_block(PokemonParser.Pokemon_checkup_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#pokemon_checkup_block}.
	 * @param ctx the parse tree
	 */
	void exitPokemon_checkup_block(PokemonParser.Pokemon_checkup_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#pokemon_checkup_entry}.
	 * @param ctx the parse tree
	 */
	void enterPokemon_checkup_entry(PokemonParser.Pokemon_checkup_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#pokemon_checkup_entry}.
	 * @param ctx the parse tree
	 */
	void exitPokemon_checkup_entry(PokemonParser.Pokemon_checkup_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#take_prize_action}.
	 * @param ctx the parse tree
	 */
	void enterTake_prize_action(PokemonParser.Take_prize_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#take_prize_action}.
	 * @param ctx the parse tree
	 */
	void exitTake_prize_action(PokemonParser.Take_prize_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#knockout_action}.
	 * @param ctx the parse tree
	 */
	void enterKnockout_action(PokemonParser.Knockout_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#knockout_action}.
	 * @param ctx the parse tree
	 */
	void exitKnockout_action(PokemonParser.Knockout_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#card_added_to_hand}.
	 * @param ctx the parse tree
	 */
	void enterCard_added_to_hand(PokemonParser.Card_added_to_handContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#card_added_to_hand}.
	 * @param ctx the parse tree
	 */
	void exitCard_added_to_hand(PokemonParser.Card_added_to_handContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#damage_taken}.
	 * @param ctx the parse tree
	 */
	void enterDamage_taken(PokemonParser.Damage_takenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#damage_taken}.
	 * @param ctx the parse tree
	 */
	void exitDamage_taken(PokemonParser.Damage_takenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#use_ability_or_attack}.
	 * @param ctx the parse tree
	 */
	void enterUse_ability_or_attack(PokemonParser.Use_ability_or_attackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#use_ability_or_attack}.
	 * @param ctx the parse tree
	 */
	void exitUse_ability_or_attack(PokemonParser.Use_ability_or_attackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#damage_taken_clause}.
	 * @param ctx the parse tree
	 */
	void enterDamage_taken_clause(PokemonParser.Damage_taken_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#damage_taken_clause}.
	 * @param ctx the parse tree
	 */
	void exitDamage_taken_clause(PokemonParser.Damage_taken_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#heal_pokemon}.
	 * @param ctx the parse tree
	 */
	void enterHeal_pokemon(PokemonParser.Heal_pokemonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#heal_pokemon}.
	 * @param ctx the parse tree
	 */
	void exitHeal_pokemon(PokemonParser.Heal_pokemonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#inactive_action}.
	 * @param ctx the parse tree
	 */
	void enterInactive_action(PokemonParser.Inactive_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#inactive_action}.
	 * @param ctx the parse tree
	 */
	void exitInactive_action(PokemonParser.Inactive_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#end_turn}.
	 * @param ctx the parse tree
	 */
	void enterEnd_turn(PokemonParser.End_turnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#end_turn}.
	 * @param ctx the parse tree
	 */
	void exitEnd_turn(PokemonParser.End_turnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#sub_effect}.
	 * @param ctx the parse tree
	 */
	void enterSub_effect(PokemonParser.Sub_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#sub_effect}.
	 * @param ctx the parse tree
	 */
	void exitSub_effect(PokemonParser.Sub_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#move_damage_counters_effect}.
	 * @param ctx the parse tree
	 */
	void enterMove_damage_counters_effect(PokemonParser.Move_damage_counters_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#move_damage_counters_effect}.
	 * @param ctx the parse tree
	 */
	void exitMove_damage_counters_effect(PokemonParser.Move_damage_counters_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#pokemon_status}.
	 * @param ctx the parse tree
	 */
	void enterPokemon_status(PokemonParser.Pokemon_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#pokemon_status}.
	 * @param ctx the parse tree
	 */
	void exitPokemon_status(PokemonParser.Pokemon_statusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#chose_effect}.
	 * @param ctx the parse tree
	 */
	void enterChose_effect(PokemonParser.Chose_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#chose_effect}.
	 * @param ctx the parse tree
	 */
	void exitChose_effect(PokemonParser.Chose_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#drawn_cards_effect}.
	 * @param ctx the parse tree
	 */
	void enterDrawn_cards_effect(PokemonParser.Drawn_cards_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#drawn_cards_effect}.
	 * @param ctx the parse tree
	 */
	void exitDrawn_cards_effect(PokemonParser.Drawn_cards_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#discard_effect}.
	 * @param ctx the parse tree
	 */
	void enterDiscard_effect(PokemonParser.Discard_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#discard_effect}.
	 * @param ctx the parse tree
	 */
	void exitDiscard_effect(PokemonParser.Discard_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#discard_from_pokemon}.
	 * @param ctx the parse tree
	 */
	void enterDiscard_from_pokemon(PokemonParser.Discard_from_pokemonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#discard_from_pokemon}.
	 * @param ctx the parse tree
	 */
	void exitDiscard_from_pokemon(PokemonParser.Discard_from_pokemonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#shuffle_effect}.
	 * @param ctx the parse tree
	 */
	void enterShuffle_effect(PokemonParser.Shuffle_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#shuffle_effect}.
	 * @param ctx the parse tree
	 */
	void exitShuffle_effect(PokemonParser.Shuffle_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#put_damage_counters_effect}.
	 * @param ctx the parse tree
	 */
	void enterPut_damage_counters_effect(PokemonParser.Put_damage_counters_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#put_damage_counters_effect}.
	 * @param ctx the parse tree
	 */
	void exitPut_damage_counters_effect(PokemonParser.Put_damage_counters_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#switch_active_pokemon_effect}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_active_pokemon_effect(PokemonParser.Switch_active_pokemon_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#switch_active_pokemon_effect}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_active_pokemon_effect(PokemonParser.Switch_active_pokemon_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#move_card_to_hand_effect}.
	 * @param ctx the parse tree
	 */
	void enterMove_card_to_hand_effect(PokemonParser.Move_card_to_hand_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#move_card_to_hand_effect}.
	 * @param ctx the parse tree
	 */
	void exitMove_card_to_hand_effect(PokemonParser.Move_card_to_hand_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#damage_breakdown}.
	 * @param ctx the parse tree
	 */
	void enterDamage_breakdown(PokemonParser.Damage_breakdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#damage_breakdown}.
	 * @param ctx the parse tree
	 */
	void exitDamage_breakdown(PokemonParser.Damage_breakdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#damage_breakdown_entry}.
	 * @param ctx the parse tree
	 */
	void enterDamage_breakdown_entry(PokemonParser.Damage_breakdown_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#damage_breakdown_entry}.
	 * @param ctx the parse tree
	 */
	void exitDamage_breakdown_entry(PokemonParser.Damage_breakdown_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#breakdown_label}.
	 * @param ctx the parse tree
	 */
	void enterBreakdown_label(PokemonParser.Breakdown_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#breakdown_label}.
	 * @param ctx the parse tree
	 */
	void exitBreakdown_label(PokemonParser.Breakdown_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#bullet_line}.
	 * @param ctx the parse tree
	 */
	void enterBullet_line(PokemonParser.Bullet_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#bullet_line}.
	 * @param ctx the parse tree
	 */
	void exitBullet_line(PokemonParser.Bullet_lineContext ctx);
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
	 * Enter a parse tree produced by {@link PokemonParser#pokemon_card}.
	 * @param ctx the parse tree
	 */
	void enterPokemon_card(PokemonParser.Pokemon_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#pokemon_card}.
	 * @param ctx the parse tree
	 */
	void exitPokemon_card(PokemonParser.Pokemon_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#energy_card}.
	 * @param ctx the parse tree
	 */
	void enterEnergy_card(PokemonParser.Energy_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#energy_card}.
	 * @param ctx the parse tree
	 */
	void exitEnergy_card(PokemonParser.Energy_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#item_card}.
	 * @param ctx the parse tree
	 */
	void enterItem_card(PokemonParser.Item_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#item_card}.
	 * @param ctx the parse tree
	 */
	void exitItem_card(PokemonParser.Item_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#supporter_card}.
	 * @param ctx the parse tree
	 */
	void enterSupporter_card(PokemonParser.Supporter_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#supporter_card}.
	 * @param ctx the parse tree
	 */
	void exitSupporter_card(PokemonParser.Supporter_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#stadium_card}.
	 * @param ctx the parse tree
	 */
	void enterStadium_card(PokemonParser.Stadium_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#stadium_card}.
	 * @param ctx the parse tree
	 */
	void exitStadium_card(PokemonParser.Stadium_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#attack_name}.
	 * @param ctx the parse tree
	 */
	void enterAttack_name(PokemonParser.Attack_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#attack_name}.
	 * @param ctx the parse tree
	 */
	void exitAttack_name(PokemonParser.Attack_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PokemonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PokemonParser.NumberContext ctx);
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
	 * Enter a parse tree produced by {@link PokemonParser#end_reason}.
	 * @param ctx the parse tree
	 */
	void enterEnd_reason(PokemonParser.End_reasonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#end_reason}.
	 * @param ctx the parse tree
	 */
	void exitEnd_reason(PokemonParser.End_reasonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#line_end}.
	 * @param ctx the parse tree
	 */
	void enterLine_end(PokemonParser.Line_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#line_end}.
	 * @param ctx the parse tree
	 */
	void exitLine_end(PokemonParser.Line_endContext ctx);
}