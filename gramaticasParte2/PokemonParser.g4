parser grammar PokemonParser;

options{
    tokenVocab= PokemonLexer;
    language= Java;
}

program: setup end;

setup: SETUP coin_toss turn_decision draw_cards draw_cards;

coin_toss: ID CHOSE (HEADS|TAILS) FOR THE OPENING COIN FLIP PUNTO win_coin;

win_coin: ID WON THE COIN TOSS PUNTO;

turn_decision: ID DECIDED TO GO FIRST PUNTO;

draw_cards: ID DREW SEVEN CARDS FOR THE OPENING HAND PUNTO RAYA SEVEN DRAWN CARDS PUNTO (descripcion_cartas)?;

descripcion_cartas: PUNTO_RELLENO ;

end: ID WINS PUNTO;

