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
attach_energy: ID ATTACHED card_name TO pokemon_card (IN THE (BENCH | ACTIVE SPOT))? PUNTO;

// CRegla para evolucionar ("evolved Riolu to Mega Lucario ex...")
evolve_pokemon: ID EVOLVED pokemon_card TO pokemon_card (IN THE (BENCH | ACTIVE SPOT))? PUNTO;

//  regla para el uso de ataques o habilidades ("used Aura Jab on DrCompiler’s Makuhita for 130 damage.")
use_ability_or_attack: ID (APOS_S pokemon_card)? USED attack_name (ON ID APOS_S pokemon_card FOR NUM DAMAGE)? PUNTO;

// Regla para procesar líneas secundarias de detalles de acción que empiezan con '-'
sub_effect: RAYA (ID | NUM | PUNTO_RELLENO) .*? PUNTO;

end_turn: ID ENDED THEIR TURN PUNTO;

// --- REGLAS AUXILIARES Y FIN DE PARTIDA ---

// Una carta puede ser de cualquiera de los 5 tipos.
// Donde solo tiene sentido un tipo concreto (por ejemplo, evolucionar
// un Pokemon) se usa directamente la regla de ese tipo.
card_name: pokemon_card | energy_card | item_card | supporter_card | stadium_card;

pokemon_card: CARTA_POKEMON;
energy_card: CARTA_ENERGIA;
item_card: CARTA_ITEM;
supporter_card: CARTA_SUPPORTER;
stadium_card: CARTA_STADIUM;

attack_name: ATAQUE;

end: (OPPONENT CONCEDED | ALL PRIZE CARDS TAKEN) PUNTO ID WINS PUNTO;

concede: OPPONENT CONCEDED PUNTO;

prize_cards: ALL PRIZE CARDS TAKEN PUNTO;
