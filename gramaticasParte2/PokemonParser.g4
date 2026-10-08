parser grammar PokemonParser;

options{
    tokenVocab= PokemonLexer;
    language= Java;
}

program: setup end;

setup: SETUP coin_toss turn_decision draw_cards_init draw_cards_init play_cards*;

coin_toss: ID CHOSE (HEADS|TAILS) FOR THE OPENING COIN FLIP PUNTO win_coin;

win_coin: ID WON THE COIN TOSS PUNTO;

turn_decision: ID DECIDED TO GO FIRST PUNTO;

draw_cards_init: ID DREW SEVEN CARDS FOR THE OPENING HAND PUNTO RAYA SEVEN DRAWN CARDS PUNTO (descripcion_cartas)?;

descripcion_cartas: PUNTO_RELLENO ;

//al jugar una carta se puede mandar al bench, al active spot, o sin destino explicito
play_cards: ID PLAYED card_name (TO THE (BENCH|ACTIVE SPOT))? PUNTO;

//TODO: regla para reconocer lo que es una carta
card_name: ;

end: (concede|prize_cards) ID WINS PUNTO;

concede: OPPONENT CONCEDED PUNTO;

prize_cards: ALL PRIZE CARDS TAKEN PUNTO;

