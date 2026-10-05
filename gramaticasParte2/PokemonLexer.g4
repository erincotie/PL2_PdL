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
//Bloque inicial -> Setup y Turnos
SETUP: 'Setup';
TURN: 'turn';
TURN_MAYUS: 'Turn';

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
KNOCKED: 'Knocked';
OUT: 'Out';
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



//Números y letras
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
NUM: DIGITO(DIGITO)*;
ID: LETRA(LETRA)*;


//Para ignorar espacios
WS: [ \t\r\n]+ -> skip;