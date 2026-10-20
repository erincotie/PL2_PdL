parser grammar PokemonParser;

options {
    tokenVocab = PokemonLexer;
    language = Java;
}

program: setup turn_block* end? EOF;//el EOF es para que antlr sepa que tras el end no puede quedar mas texto 
// --- SETUP INICIAL ---
setup: SETUP coin_toss turn_decision draw_cards_init draw_cards_init setup_actions*;

coin_toss: ID CHOSE (HEADS|TAILS) FOR THE OPENING COIN FLIP PUNTO win_coin;

win_coin: ID WON THE COIN TOSS PUNTO;

turn_decision: ID DECIDED TO GO FIRST PUNTO;

draw_cards_init: ID DREW SEVEN CARDS FOR THE OPENING HAND PUNTO RAYA SEVEN DRAWN CARDS PUNTO (descripcion_cartas)*;

// permite reconocer listas de cartas separadas por coma en la mano inicial (ej. "• Basic Fighting Energy, Makuhita, ...")
descripcion_cartas: PUNTO_RELLENO card_name (COMA card_name)*; //bullet_line y descripcion_cartas acepten cualquier secuencia de card_name separados por comas

setup_actions: play_cards;

//TODO: regla para reconocer lo que es una carta
card_name: pokemon_card | item_card | supporter_card | energy_card;

pokemon_card: mew_deck | zoroark_deck;

item_card: BUDDY_POFFIN | ENERGY_RECYCLER | NIGHT_STRETCHER | POKE_PAD | RARE_CANDY | SCRAMBLE_SWITCH | ULTRA_BALL | N_PP | TICKET | N_CASTLE;

supporter_card: BLACK_BELT | BOSS | DAWN | HILDA | LILLIE | TEAM_ROCKET | CYRANO | JANINE | JUDGE | AIR_BALLON | BINDING_MOCHI | HERO_CAPE | POWERGLASS;

energy_card: PRISM_ENERGY | BASIC_DARK | BASIC_METALLIC | BASIC_PSYCHIC;

mew_deck: LILLIE_CLEFAIRY | MEW | DEINO | ZWEILOUS | HYDREIGON | FEZANDIPITI | GENESECT | STEVEN_BELDUM | STEVEN_METANG | STEVEN_METAGROSS | LATIOS | MEGA_LATIAS | MEOWTH;

zoroark_deck: N_DARUMAKA | N_DARMANITAN | N_ZORUA | N_ZOROARK | PECHARUNT | N_RESHIRAM | N_ZEKROM | FEZANDIPITI | MEOWTH;

// --- ESTRUCTURA DE TURNOS ---
//  end_turn? es opcional porque el último turno no tiene "ended their turn"
turn_block: turn_header turn_action* end_turn?;//estructurar un turno completo de un jugador
turn_header: ID APOS_S TURN_MAYUS; //  reconoce "DudeJaden's Turn" o "DrCompiler's Turn"

turn_action: 
      play_cards
    | draw_action
    | attach_energy
    | evolve_pokemon
    | use_ability_or_attack
    | bullet_line   // <--- para reconocer líneas como "• Fan Rotom, Chikorita" sin punto final
    | sub_effect // capturar los efectos secundarios que empiezan con guion '-' (robar, barajar, etc.)
    ;
//  regla para las viñetas sin punto al final de línea
bullet_line: PUNTO_RELLENO card_name (COMA card_name)*;



play_cards: ID PLAYED card_name (TO THE (BENCH | ACTIVE SPOT))? PUNTO;

// rregla para el robo de carta al inicio de cada turno ("DudeJaden drew a card.")
draw_action: ID DREW (A CARD | card_name) PUNTO;

//  Regla para adjuntar energía ("attached Basic Fighting Energy to Riolu...")
attach_energy: ID ATTACHED card_name TO card_name (IN THE (BENCH | ACTIVE SPOT))? PUNTO;

// CRegla para evolucionar ("evolved Riolu to Mega Lucario ex...")
evolve_pokemon: ID EVOLVED card_name TO card_name (IN THE (BENCH | ACTIVE SPOT))? PUNTO;

//  regla para el uso de ataques o habilidades ("used Aura Jab on DrCompiler’s Makuhita for 130 damage.")
use_ability_or_attack: ID (APOS_S card_name)? USED card_name (ON ID APOS_S card_name FOR NUM DAMAGE)? PUNTO;

// Regla para procesar líneas secundarias de detalles de acción que empiezan con '-'
sub_effect: RAYA (ID | NUM | PUNTO_RELLENO) .*? PUNTO;

end_turn: ID ENDED THEIR TURN PUNTO;

// --- REGLAS AUXILIARES Y FIN DE PARTIDA ---

card_name: CARTA;

end: (OPPONENT CONCEDED | ALL PRIZE CARDS TAKEN) PUNTO ID WINS PUNTO;

concede: OPPONENT CONCEDED PUNTO;

prize_cards: ALL PRIZE CARDS TAKEN PUNTO;