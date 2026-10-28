parser grammar PokemonParser;

options {
    tokenVocab = PokemonLexer;
    language = Java;
}

program
    : NEWLINE* setup
      (NEWLINE* (turn_block | pokemon_checkup_block))*
      NEWLINE* end NEWLINE* EOF
    ;

setup
    : SETUP line_end setup_entry*
    ;

common_entry
    : (turn_action | sub_effect | bullet_line | mulligan_bonus | mulligan_reveal) line_end
    ;

setup_entry
    : (coin_toss | win_coin | turn_decision | draw_cards_init | take_mulligan_action) line_end | common_entry
    ;

turn_entry
    : damage_breakdown| common_entry
    ;

coin_toss
    : ID CHOSE (HEADS | TAILS) FOR THE OPENING COIN FLIP PUNTO
    ;

win_coin
    : ID WON THE COIN TOSS PUNTO
    ;

turn_decision
    : ID DECIDED TO GO (FIRST | SECOND) PUNTO
    ;

draw_cards_init
    : ID DREW number CARDS FOR THE OPENING HAND PUNTO
    ;

mulligan_reveal
    : RAYA CARDS_MAYUS REVEALED FROM MULLIGAN number
    ;

mulligan_bonus
    : ID DREW number MORE_WORD (CARD|CARDS) BECAUSE ID TOOK AT LEAST number MULLIGAN PUNTO
    ;

take_mulligan_action
    : ID TOOK A MULLIGAN PUNTO
    ;

turn_block
    : turn_header line_end turn_entry*
    ;

turn_header
    : ID APOS_S TURN_MAYUS number?
    ;

turn_action
    : (draw_action | attach_energy | evolve_pokemon | heal_pokemon
       | discard_from_pokemon | pokemon_status | damage_taken) PUNTO?
    | play_cards
    | use_ability_or_attack
    | retreat_action
    | take_prize_action
    | knockout_action
    | card_added_to_hand
    | inactive_action
    | end_turn
    ;

play_cards
    : ID PLAYED card_name (TO THE (BENCH | ACTIVE SPOT | STADIUM SPOT))? PUNTO
    ;

draw_action
    : ID DREW draw_object (AND PLAYED (THEM | IT) TO THE (BENCH | ACTIVE SPOT))?
    ;

draw_object
    : number (CARD | CARDS)
    | A CARD
    | card_name
    ;


attach_energy
    : ID ATTACHED card_name TO pokemon_card ((IN | ON) THE (BENCH | ACTIVE SPOT))? PUNTO
    ;

evolve_pokemon
    : ID EVOLVED pokemon_card TO pokemon_card ((IN | ON) THE (BENCH | ACTIVE SPOT))? PUNTO
    ;

retreat_action
    : ID RETREATED pokemon_card TO THE BENCH PUNTO
    ;


special_condition
    : ASLEEP
    | BURNED
    | CONFUSED
    | PARALYZED
    | POISONED
    ;

// Bloque Pokémon Checkup
pokemon_checkup_block
    : POKEMON CHECKUP line_end pokemon_checkup_entry+
    ;

// Ej.: 1 damage counter was placed on andresg85's Mega Venusaur ex for the Special Condition Poisoned.
pokemon_checkup_entry
    : number (DAMAGE_COUNTER | DAMAGE_COUNTERS | COUNTERS)
      WAS PLACED ON (ID APOS_S)? pokemon_card
      FOR THE SPECIAL CONDITION special_condition PUNTO line_end
    ;
take_prize_action
    : ID TOOK (A | number) PRIZE (CARD | CARDS)? PUNTO
    ;

knockout_action
    : (ID APOS_S)? pokemon_card WAS K_O (PUNTO | EXCLAMACION)?
    ;

card_added_to_hand
    : (A_MAYUS CARD | card_name) WAS ADDED TO ID APOS_S HAND PUNTO
    ;

damage_taken
    : (ID APOS_S)? pokemon_card TOOK
      (RAYA number LESS | number MORE_WORD | number) DAMAGE
      (BECAUSE OF TIPOS_WEAK_RES (WEAKNESS | RESISTANCE))?
    ;

use_ability_or_attack
    : ID APOS_S pokemon_card USED attack_name
      (ON ID APOS_S pokemon_card FOR number DAMAGE)?
      PUNTO damage_taken_clause?
    ;

damage_taken_clause : damage_taken PUNTO ;

heal_pokemon
    : (ID APOS_S)? pokemon_card HEALED number DAMAGE PUNTO
    ;

inactive_action
    : ID DIDNT TAKE AN ACTION IN TIME PUNTO
    ;

end_turn
    : ID ENDED THEIR TURN PUNTO
    ;

sub_effect
    : RAYA (draw_action | attach_energy | evolve_pokemon | heal_pokemon
            | discard_from_pokemon | pokemon_status | damage_taken
            | drawn_cards_effect | shuffle_effect | discard_effect
            | put_damage_counters_effect | switch_active_pokemon_effect
            | move_card_to_hand_effect | move_damage_counters_effect | chose_effect) PUNTO?
    ;

// Ej.: - Franster2900 moved 3 damage counters from Franster2900's Mega Darkrai ex to Franster2900's Mega Venusaur ex.
move_damage_counters_effect
    : ID MOVED number (DAMAGE_COUNTER | DAMAGE_COUNTERS | COUNTERS)
      FROM ID APOS_S pokemon_card
      TO ID APOS_S pokemon_card
    ;
pokemon_status
    : (ID APOS_S)? pokemon_card IS NOW (IN THE ACTIVE SPOT | special_condition)
    ;

chose_effect
    : ID CHOSE attack_name
    ;

drawn_cards_effect
    : number DRAWN CARDS
    ;

discard_effect
    : ID DISCARDED (number (CARD | CARDS) | card_name)
    ;

discard_from_pokemon
    : (number (CARD | CARDS) | card_name) (WAS | WERE) DISCARDED FROM ID APOS_S pokemon_card
    ;

shuffle_effect
    : ID SHUFFLED (THEIR DECK
                  | (number CARDS | A CARD | card_name) INTO THEIR DECK)
    ;

put_damage_counters_effect
    : ID PUT number (DAMAGE_COUNTERS | COUNTERS) ON ID APOS_S pokemon_card
    ;

switch_active_pokemon_effect
    : ID APOS_S pokemon_card WAS SWITCHED WITH ID APOS_S pokemon_card TO BECOME THE ACTIVE POKEMON
    ;

move_card_to_hand_effect
    : ID MOVED ID APOS_S (number (CARD | CARDS) | card_name) TO THEIR HAND
    ;

damage_breakdown
    : RAYA DAMAGE_BREAKDOWN DOS_PUNTOS? line_end damage_breakdown_entry+
    ;

damage_breakdown_entry
    : PUNTO_RELLENO breakdown_label DOS_PUNTOS? RAYA? number DAMAGE line_end
    ;

breakdown_label
    : number (SELECTED | ATTACHED) ENERGY
    | number PRIZE CARDS
    | number (DAMAGE_COUNTER | DAMAGE_COUNTERS | COUNTERS) // Ej.: 7 damage counters: 350 damage
    | BASE_DAMAGE
    | PARENTESIS_ABRIR ITEM PARENTESIS_CERRAR card_name
    | PARENTESIS_ABRIR ATTACK PARENTESIS_CERRAR attack_name
    | (WEAKNESS | RESISTANCE) TO TIPOS_WEAK_RES
    | TOTAL_DAMAGE
    ;

bullet_line
    : PUNTO_RELLENO card_name (COMA card_name)*
    ;

card_name
    : pokemon_card
    | energy_card
    | item_card
    | supporter_card
    | stadium_card
    ;

pokemon_card: CARTA_POKEMON;
energy_card: CARTA_ENERGIA;
item_card: CARTA_ITEM;
supporter_card: CARTA_SUPPORTER;
stadium_card: CARTA_STADIUM;
attack_name: ATAQUE;

number
    : NUM
    | SEVEN
    ;

end
    : end_reason ID WINS PUNTO
    ;

end_reason
    : OPPONENT (CONCEDED | TOOK ALL OF THEIR PRIZE CARDS
              | WAS INACTIVE FOR TOO LONG
              | APOS_S DECK RAN OUT OF CARDS) PUNTO
    | ALL PRIZE CARDS TAKEN PUNTO
    | NO BENCHED POKEMON FOR BACKUP PUNTO
    ;

line_end
    : NEWLINE+
    ;