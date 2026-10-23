parser grammar PokemonParser;

options {
    tokenVocab = PokemonLexer;
    language = Java;
}

// Un programa consta de la configuracion inicial, los turnos y el final.
program
    : NEWLINE* setup turn_block* end NEWLINE* EOF
    ;

// ------------------------------------------------------------
// Configuracion inicial
// ------------------------------------------------------------
setup
    : SETUP line_end setup_entry*
    ;

setup_entry
    : coin_toss line_end
    | win_coin line_end
    | turn_decision line_end
    | draw_cards_init line_end
    | sub_effect line_end
    | mulligan_reveal line_end
    | mulligan_bonus line_end
    | take_mulligan_action line_end
    | turn_action line_end
    | bullet_line line_end
    ;

coin_toss
    : ID CHOSE (HEADS | TAILS) FOR THE OPENING COIN FLIP PUNTO
    ;

win_coin
    : ID WON THE COIN TOSS PUNTO
    ;

turn_decision
    : ID DECIDED TO GO FIRST PUNTO
    ;

draw_cards_init
    : ID DREW SEVEN CARDS FOR THE OPENING HAND PUNTO
    ;

// Ejemplo: - Cards revealed from Mulligan 1
mulligan_reveal
    : RAYA ID REVEALED FROM MULLIGAN number
    ;

// Ejemplo: Riverflow2018 drew 1 more card because Solrak06_ took at least 1 mulligan.
mulligan_bonus
    : ID DREW number MORE_WORD CARD BECAUSE ID TOOK AT LEAST number MULLIGAN PUNTO
    ;

take_mulligan_action
    : ID TOOK A MULLIGAN PUNTO
    ;

// ------------------------------------------------------------
// Turnos
// ------------------------------------------------------------
turn_block
    : turn_header line_end turn_entry*
    ;

turn_header
    : ID APOS_S TURN_MAYUS
    ;

turn_entry
    : turn_action line_end
    | damage_breakdown
    | sub_effect line_end
    | bullet_line line_end
    | mulligan_reveal line_end
    | mulligan_bonus line_end
    ;

turn_action
    : play_cards
    | draw_action
    | attach_energy
    | evolve_pokemon
    | use_ability_or_attack
    | retreat_action
    | active_pokemon_update
    | take_prize_action
    | knockout_action
    | card_added_to_hand
    | discarded_card_from_pokemon
    | damage_taken_action
    | end_turn
    ;

play_cards
    : ID PLAYED card_name (TO THE (BENCH | ACTIVE SPOT | STADIUM SPOT))? PUNTO
    ;

draw_action
    : ID DREW (A CARD | card_name) PUNTO
    ;

// Se permiten tanto "in the Active Spot" como "on the Bench".
// Aunque el nombre de la regla es attach_energy, tambien admite objetos como Air Balloon.
attach_energy
    : ID ATTACHED card_name TO pokemon_card ((IN | ON) THE (BENCH | ACTIVE SPOT))? PUNTO
    ;

evolve_pokemon
    : ID EVOLVED pokemon_card TO pokemon_card ((IN | ON) THE (BENCH | ACTIVE SPOT))? PUNTO
    ;

use_ability_or_attack
    : ID APOS_S pokemon_card USED attack_name
      (ON ID APOS_S pokemon_card FOR number DAMAGE)? PUNTO
      damage_weakness_clause?
    ;

// Aparece en la misma linea que algunos ataques.
damage_weakness_clause
    : ID APOS_S pokemon_card TOOK number MORE_WORD DAMAGE BECAUSE OF (ID | FIGHTING) WEAKNESS PUNTO
    ;

retreat_action
    : ID RETREATED pokemon_card TO THE BENCH PUNTO
    ;

// Ejemplos: "DrCompiler's Mega Lucario ex is now in the Active Spot."
// y tambien "Mega Lucario ex is now in the Active Spot."
active_pokemon_update
    : (ID APOS_S)? pokemon_card IS NOW IN THE ACTIVE SPOT PUNTO
    ;

take_prize_action
    : ID TOOK (A | number) PRIZE CARD? PUNTO
    | ID TOOK number PRIZE CARDS PUNTO
    ;

knockout_action
    : (ID APOS_S)? pokemon_card WAS K_O
    ;

card_added_to_hand
    : (A_MAYUS CARD | card_name) WAS ADDED TO ID APOS_S HAND PUNTO
    ;

discarded_card_from_pokemon
    : card_name WAS DISCARDED FROM ID APOS_S pokemon_card PUNTO
    ;

damage_taken_action
    : (ID APOS_S)? pokemon_card TOOK number DAMAGE PUNTO
    | (ID APOS_S)? pokemon_card TOOK number MORE_WORD DAMAGE BECAUSE OF (ID | FIGHTING) WEAKNESS PUNTO
    ;

end_turn
    : ID ENDED THEIR TURN PUNTO
    ;

// ------------------------------------------------------------
// Subefectos: todos empiezan por el guion "-".
// ------------------------------------------------------------
sub_effect//  Faltan subefectos fijo
    : RAYA (
          drawn_cards_effect
        | draw_and_play_effect
        | draw_and_play_named_effect
        | draw_number_effect
        | draw_single_card_effect
        | draw_named_card_effect
        | shuffle_deck_effect
        | shuffle_cards_into_deck_effect
        | shuffle_named_card_into_deck_effect
        | evolve_pokemon_effect
        | discard_number_effect
        | discard_named_card_effect
        | discard_from_pokemon_effect
        | discard_named_from_pokemon_effect
        | put_damage_counters_effect
        | switch_active_pokemon_effect
        | attach_card_effect
        | move_card_to_hand_effect
        | damage_taken_effect
        | mulligan_reveal_effect
      ) PUNTO
    ;

drawn_cards_effect
    : number DRAWN CARDS
    ;

draw_number_effect
    : ID DREW number (CARD | CARDS)
    ;

// Ejemplo: "- PJPJPJPJPJPJ drew a card."
draw_single_card_effect
    : ID DREW A CARD
    ;

draw_named_card_effect
    : ID DREW card_name
    ;

draw_and_play_effect
    : ID DREW number (CARD | CARDS) AND PLAYED THEM TO THE (BENCH | ACTIVE SPOT)
    ;
draw_and_play_named_effect
    : ID DREW card_name AND PLAYED IT TO THE (BENCH | ACTIVE SPOT)
    ;
shuffle_deck_effect
    : ID SHUFFLED THEIR DECK
    ;

shuffle_cards_into_deck_effect
    : ID SHUFFLED (number CARDS | A CARD) INTO THEIR DECK
    ;

// Ejemplo: "- DrCompiler shuffled Drakloak into their deck."
shuffle_named_card_into_deck_effect
    : ID SHUFFLED card_name INTO THEIR DECK
    ;

// Evolución registrada como subefecto de una carta de Objeto.
evolve_pokemon_effect
    : ID EVOLVED pokemon_card TO pokemon_card ((IN | ON) THE (BENCH | ACTIVE SPOT))?
    ;

discard_number_effect
    : ID DISCARDED number (CARD | CARDS)
    ;

discard_named_card_effect
    : ID DISCARDED card_name
    ;

discard_from_pokemon_effect
    : number (CARD | CARDS) (WAS | WERE) DISCARDED FROM ID APOS_S pokemon_card
    ;

discard_named_from_pokemon_effect
    : card_name WAS DISCARDED FROM ID APOS_S pokemon_card
    ;

put_damage_counters_effect
    : ID PUT number COUNTERS ON ID APOS_S pokemon_card
    ;

switch_active_pokemon_effect
    : ID APOS_S pokemon_card WAS SWITCHED WITH ID APOS_S pokemon_card TO BECOME THE ACTIVE POKEMON
    ;

attach_card_effect
    : ID ATTACHED card_name TO pokemon_card ((ON | IN) THE (BENCH | ACTIVE SPOT))
    ;

move_card_to_hand_effect
    : ID MOVED ID APOS_S card_name TO THEIR HAND
    ;

damage_taken_effect
    : ID APOS_S pokemon_card TOOK number DAMAGE
    | ID APOS_S pokemon_card TOOK number MORE_WORD DAMAGE BECAUSE OF (ID | FIGHTING) WEAKNESS
    ;

mulligan_reveal_effect
    : ID REVEALED FROM MULLIGAN number
    ;


// ------------------------------------------------------------
// Desglose del daño. Las entradas internas usan viñeta (•), no guion.
// Se admiten los formatos con y sin dos puntos observados en los logs.
// ------------------------------------------------------------
damage_breakdown
    : RAYA DAMAGE_BREAKDOWN DOS_PUNTOS? line_end damage_breakdown_entry+
    ;

damage_breakdown_entry
    : PUNTO_RELLENO BASE_DAMAGE DOS_PUNTOS? number DAMAGE line_end
    | PUNTO_RELLENO PARENTESIS_ABRIR ITEM PARENTESIS_CERRAR card_name DOS_PUNTOS? number DAMAGE line_end
    | PUNTO_RELLENO WEAKNESS TO (ID | FIGHTING) number DAMAGE line_end
    | PUNTO_RELLENO TOTAL_DAMAGE DOS_PUNTOS? number DAMAGE line_end
    ;

// ------------------------------------------------------------
// Listas de cartas con viñeta, lista de cartas separadas por coma
// ------------------------------------------------------------
bullet_line
    : PUNTO_RELLENO card_name (COMA card_name)*
    ;

// ------------------------------------------------------------
// Clasificacion de cartas
// ------------------------------------------------------------
card_name// yo diria que faltan tipos Pokémon Tool, Special Energy... sobretodo PokemonTool me suena haberla visto 
    : pokemon_card
    | energy_card
    | item_card
    | supporter_card
    | stadium_card
    ;

pokemon_card
    : CARTA_POKEMON
    ;

energy_card
    : CARTA_ENERGIA
    ;

item_card
    : CARTA_ITEM
    ;

supporter_card
    : CARTA_SUPPORTER
    ;

stadium_card
    : CARTA_STADIUM
    ;

attack_name
    : ATAQUE
    ;

number
    : NUM
    | SEVEN
    ;

// ------------------------------------------------------------
// Final de la partida
// ------------------------------------------------------------
end
    : end_reason ID WINS PUNTO
    ;

end_reason
    : OPPONENT CONCEDED PUNTO
    | ALL PRIZE CARDS TAKEN PUNTO
    | NO BENCHED POKEMON FOR BACKUP PUNTO
    ;

line_end
    : NEWLINE+
    ;
