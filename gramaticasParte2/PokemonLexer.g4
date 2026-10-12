lexer grammar PokemonLexer;

//Signos de puntuación
PUNTO: '.';
COMA: ',';
RAYA: '-';
PUNTO_RELLENO: '•';
DOS_PUNTOS: ':';
PARENTESIS_ABRIR: '(';
PARENTESIS_CERRAR: ')';
EXCLAMACION: '!';

//Palabras reservadas
//Bloque inicial -> Setup, coin toss y decidir Turnos
SETUP: 'Setup';
TURN: 'turn';
TURN_MAYUS: 'Turn';
CHOSE: 'chose';
HEADS: 'heads';
TAILS: 'tails';
COIN: 'coin';
FLIP: 'flip';
WON: 'won';
TOSS: 'toss';
DECIDED: 'decided';
GO:'go';
FIRST: 'first';

//Robo de cartas
DREW: 'drew';
DRAWN: 'drawn';
A: 'a';
CARD: 'card';
CARDS: 'cards';
FOR: 'for';
THE: 'the';
OPENING: 'opening';
HAND: 'hand';
SEVEN: '7';
//faltan para los nombres de las cartas

//Jugar una carta
PLAYED: 'played';
DISCARDED: 'discarded';
TO: 'to';
ACTIVE: 'Active';
SPOT: 'Spot';
BENCH: 'Bench';

//Adjuntar energía y evolucionar pokemon
ATTACHED: 'attached';
ON: 'on';
EVOLVED: 'evolved';
//faltan los nombres de los pokemon


//Ataques
USED: 'used';
DAMAGE: 'damage';
DAMAGE_MAYUS: 'Damage';
//Desglose del ataque
BASE: 'Base';
ITEM: 'Item';
TOTAL: 'Total';

//Consecuencias del combate
WAS: 'was';
K_O: 'Knocked Out !';
TOOK: 'took';
PRIZE: 'Prize';
A_MAYUS: 'A';
ADDED: 'added';

//Cambios de Pokemon activo
SWITCH: 'Switch';
SWITCHED: 'switched';
WITH: 'with';
BECOME: 'become';
POKEMON: 'Pokemon';
RETREATED: 'retreated';

//Mecanica de mazo
SHUFFLED: 'shuffled';
THEIR: 'their';
DECK: 'deck';
MOVED: 'moved';

//Cierre de turno y partida
ENDED: 'ended';
ALL: 'All';
WERE: 'were';
TAKEN: 'taken';
WINS: 'wins';
OPPONENT: 'opponent';
CONCEDED: 'conceded';

//CARTAS DEL MAZO MEW EX
//Pokemons
LILLIE_CLEFAIRY: 'Lillie''s Clefairy ex';
MEW: 'Mew ex';
DEINO: 'Deino';
ZWEILOUS: 'Zweilous';
HYDREIGON: 'Hydreigon ex';
FEZANDIPITI: 'Fezandipiti ex';
GENESECT: 'Genesect ex';
STEVEN_BELDUM: 'Steven''s Beldum';
STEVEN_METANG: 'Steven''s Metang';
STEVEN_METAGROSS: 'Steven''s Metagross ex';
LATIOS: 'Latios';
MEGA_LATIAS: 'Mega Latias ex';
MEOWTH: 'Meowth ex';
//Items
BUDDY_POFFIN: 'Buddy-Buddy Poffin';
ENERGY_RECYCLER: 'Energy Recycler';
NIGHT_STRETCHER: 'Night Stretcher';
POKE_PAD: 'Poké Pad'; 
RARE_CANDY: 'Rare Candy';
SCRAMBLE_SWITCH: 'Scramble Switch';
ULTRA_BALL: 'Ultra Ball';
//Supporter
BLACK_BELT: 'Black Belt''s Training';
BOSS: 'Boss''s Orders';
DAWN: 'Dawn';
HILDS: 'Hilda';
LILLIE: 'Lillie''s Determination';
TEAM_ROCKET: 'Team Rocket''s Petrel';
//Energy
PRISM_ENERGY: 'Prism Energy';
BASIC_DARK: 'Basic Dark Energy';
BASIC_METALLIC: 'Basic Metallic Energy';
BASIC_PSYCHIC: 'Basic Psychic Energy';





//Números y letras
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
NUM: DIGITO(DIGITO)*;
ID: LETRA(LETRA)*;


//Para ignorar espacios
WS: [ \t\r\n]+ -> skip;