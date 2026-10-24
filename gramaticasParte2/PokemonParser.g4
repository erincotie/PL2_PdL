parser grammar PokemonParser;

options {
    tokenVocab = PokemonLexer;
    language = Java;
}

program
    : NEWLINE* setup (NEWLINE* turn_block)* NEWLINE* end NEWLINE* EOF
    ;

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
    : ID DECIDED TO GO (FIRST | SECOND) PUNTO
    ;

draw_cards_init
    : ID DREW number CARDS FOR THE OPENING HAND PUNTO
    ;

mulligan_reveal
    : RAYA ID REVEALED FROM MULLIGAN number
    ;

mulligan_bonus
    : ID DREW number MORE_WORD CARD BECAUSE ID TOOK AT LEAST number MULLIGAN PUNTO
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
    | special_condition_action
    | take_prize_action
    | knockout_action
    | card_added_to_hand
    | discarded_card_from_pokemon
    | damage_taken_action
    | heal_pokemon
    | end_turn
    | inactive_action
    ;

play_cards
    : ID PLAYED card_name (TO THE (BENCH | ACTIVE SPOT | STADIUM SPOT))? PUNTO
    ;

draw_action
    : ID DREW (A CARD | card_name) PUNTO
    ;

attach_energy
    : ID ATTACHED card_name TO pokemon_card ((IN | ON) THE (BENCH | ACTIVE SPOT))? PUNTO
    ;

evolve_pokemon
    : ID EVOLVED pokemon_card TO pokemon_card ((IN | ON) THE (BENCH | ACTIVE SPOT))? PUNTO
    ;

use_ability_or_attack
    : ID APOS_S pokemon_card USED attack_name
      (ON ID APOS_S pokemon_card FOR number DAMAGE)?
      PUNTO
      (damage_weakness_clause | damage_resistance_clause)?
    ;

damage_weakness_clause
    : ID APOS_S pokemon_card TOOK number MORE_WORD DAMAGE BECAUSE OF TIPOS_WEAK_RES WEAKNESS PUNTO
    ;

damage_resistance_clause
    : ID APOS_S pokemon_card TOOK RAYA number LESS DAMAGE BECAUSE OF TIPOS_WEAK_RES RESISTANCE PUNTO
    ;

retreat_action
    : ID RETREATED pokemon_card TO THE BENCH PUNTO
    ;

active_pokemon_update
    : (ID APOS_S)? pokemon_card IS NOW IN THE ACTIVE SPOT PUNTO
    ;

// Todos los estados especiales comparten la misma estructura textual.
// Asi se evita crear una regla distinta para cada estado.
special_condition_action
    : (ID APOS_S)? pokemon_card IS NOW special_condition PUNTO
    ;

special_condition
    : ASLEEP
    | BURNED
    | CONFUSED
    | PARALYZED
    | POISONED
    ;

take_prize_action
    : ID TOOK (A | number) PRIZE CARD? PUNTO
    | ID TOOK number PRIZE CARDS PUNTO
    ;

knockout_action
    : (ID APOS_S)? pokemon_card WAS K_O (PUNTO | EXCLAMACION)?
    ;

card_added_to_hand
    : (A_MAYUS CARD | card_name) WAS ADDED TO ID APOS_S HAND PUNTO
    ;

discarded_card_from_pokemon
    : card_name WAS DISCARDED FROM ID APOS_S pokemon_card PUNTO
    ;

damage_taken_action
    : (ID APOS_S)? pokemon_card TOOK number DAMAGE PUNTO
    | (ID APOS_S)? pokemon_card TOOK number MORE_WORD DAMAGE BECAUSE OF TIPOS_WEAK_RES WEAKNESS PUNTO
    ;

heal_pokemon
    : (ID APOS_S)? pokemon_card HEALED number DAMAGE PUNTO
    ;

inactive_action
    : ID DIDNT TAKE AN ACTION IN TIME PUNTO
    ;

end_turn
    : ID ENDED THEIR TURN PUNTO
    ;

// Primero se intentan reconocer los efectos habituales con reglas concretas.
// Si aparece un efecto nuevo, se permite una alternativa de reserva, pero solo
// en lineas secundarias que empiezan por guion. Las acciones principales de la
// partida siguen necesitando encajar en sus reglas especificas.
sub_effect
    : RAYA (known_sub_effect PUNTO? | unknown_sub_effect)
    ;

known_sub_effect
    : drawn_cards_effect
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
    | heal_pokemon_effect
    | special_condition_action
    | chose_effect
    ;

// Alternativa de reserva para efectos no catalogados (por ejemplo, una
// habilidad nueva). Exige un primer token reconocible y consume solo el resto
// de ESA linea: nunca puede tragarse el siguiente turno ni el resto del log.
// Es deliberadamente menos estricta que known_sub_effect, pero queda limitada
// a lineas con guion; no hace que cualquier accion principal sea valida.
unknown_sub_effect
    : (ID | NUM | CARTA_POKEMON | CARTA_ENERGIA | CARTA_ITEM | CARTA_SUPPORTER
      | CARTA_STADIUM | ATAQUE | DAMAGE_BREAKDOWN | BASE_DAMAGE | TOTAL_DAMAGE
      | PUNTO_RELLENO | PARENTESIS_ABRIR | A | A_MAYUS | CARD | CARDS | DREW
      | DRAWN | DISCARDED | ATTACHED | HEALED | CHOSE | IS | DECK | ENERGY
      | PRIZE | WAS | WERE | TOOK | MOVED | SHUFFLED | EVOLVED | USED | OPPONENT
      | ASLEEP | BURNED | CONFUSED | PARALYZED | POISONED)
      (~NEWLINE)+
    ;

chose_effect
    : ID CHOSE attack_name
    ;

drawn_cards_effect
    : number DRAWN CARDS
    ;

draw_number_effect
    : ID DREW number (CARD | CARDS)
    ;

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

shuffle_named_card_into_deck_effect
    : ID SHUFFLED card_name INTO THEIR DECK
    ;

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
    : ID PUT number (DAMAGE_COUNTERS | COUNTERS) ON ID APOS_S pokemon_card
    ;

switch_active_pokemon_effect
    : ID APOS_S pokemon_card WAS SWITCHED WITH ID APOS_S pokemon_card TO BECOME THE ACTIVE POKEMON
    ;

attach_card_effect
    : ID ATTACHED card_name TO pokemon_card ((ON | IN) THE (BENCH | ACTIVE SPOT))?
    ;

move_card_to_hand_effect
    : ID MOVED ID APOS_S (number (CARD | CARDS) | card_name) TO THEIR HAND
    ;

damage_taken_effect
    : ID APOS_S pokemon_card TOOK number DAMAGE
    | ID APOS_S pokemon_card TOOK number MORE_WORD DAMAGE BECAUSE OF TIPOS_WEAK_RES WEAKNESS
    | ID APOS_S pokemon_card TOOK RAYA number LESS DAMAGE BECAUSE OF TIPOS_WEAK_RES RESISTANCE
    ;

mulligan_reveal_effect
    : ID REVEALED FROM MULLIGAN number
    ;

heal_pokemon_effect
    : (ID APOS_S)? pokemon_card HEALED number DAMAGE
    ;

damage_breakdown
    : RAYA DAMAGE_BREAKDOWN DOS_PUNTOS? line_end damage_breakdown_entry+
    ;

damage_breakdown_entry
    : PUNTO_RELLENO number (SELECTED | ATTACHED) ENERGY DOS_PUNTOS number DAMAGE line_end
    | PUNTO_RELLENO number PRIZE CARDS DOS_PUNTOS? number DAMAGE line_end
    | PUNTO_RELLENO BASE_DAMAGE DOS_PUNTOS? number DAMAGE line_end
    | PUNTO_RELLENO PARENTESIS_ABRIR ITEM PARENTESIS_CERRAR card_name DOS_PUNTOS? RAYA? number DAMAGE line_end
    | PUNTO_RELLENO PARENTESIS_ABRIR ATTACK PARENTESIS_CERRAR attack_name DOS_PUNTOS? RAYA? number DAMAGE line_end
    | PUNTO_RELLENO WEAKNESS TO TIPOS_WEAK_RES DOS_PUNTOS? RAYA? number DAMAGE line_end
    | PUNTO_RELLENO RESISTANCE TO TIPOS_WEAK_RES DOS_PUNTOS? RAYA? number DAMAGE line_end
    | PUNTO_RELLENO TOTAL_DAMAGE DOS_PUNTOS? number DAMAGE line_end
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
    : OPPONENT CONCEDED PUNTO
    | OPPONENT TOOK ALL OF THEIR PRIZE CARDS PUNTO
    | ALL PRIZE CARDS TAKEN PUNTO
    | NO BENCHED POKEMON FOR BACKUP PUNTO
    | OPPONENT WAS INACTIVE FOR TOO LONG PUNTO
    | OPPONENT APOS_S DECK RAN OUT OF CARDS PUNTO
    | NO BENCHED POKEMON FOR BACKUP PUNTO
    ;

line_end
    : NEWLINE+
    ;
