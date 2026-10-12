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
card_name: pokemon_card | item_card | supporter_card | energy_card;

pokemon_card: mew_deck | zoroark_deck;

item_card: BUDDY_POFFIN | ENERGY_RECYCLER | NIGHT_STRETCHER | POKE_PAD | RARE_CANDY | SCRAMBLE_SWITCH | ULTRA_BALL | N_PP | TICKET | N_CASTLE;

supporter_card: BLACK_BELT | BOSS | DAWN | HILDA | LILLIE | TEAM_ROCKET | CYRANO | JANINE | JUDGE | AIR_BALLON | BINDING_MOCHI | HERO_CAPE | POWERGLASS;

energy_card: PRISM_ENERGY | BASIC_DARK | BASIC_METALLIC | BASIC_PSYCHIC;

mew_deck: LILLIE_CLEFAIRY | MEW | DEINO | ZWEILOUS | HYDREIGON | FEZANDIPITI | GENESECT | STEVEN_BELDUM | STEVEN_METANG | STEVEN_METAGROSS | LATIOS | MEGA_LATIAS | MEOWTH;

zoroark_deck: N_DARUMAKA | N_DARMANITAN | N_ZORUA | N_ZOROARK | PECHARUNT | N_RESHIRAM | N_ZEKROM | FEZANDIPITI | MEOWTH;

end: (concede|prize_cards) ID WINS PUNTO;

concede: OPPONENT CONCEDED PUNTO;

prize_cards: ALL PRIZE CARDS TAKEN PUNTO;

