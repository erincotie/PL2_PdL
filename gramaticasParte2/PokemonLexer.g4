lexer grammar PokemonLexer;

// Signos de puntuación
PUNTO: '.';
COMA: ',';
RAYA: '-';
PUNTO_RELLENO: '•';
DOS_PUNTOS: ':';
PARENTESIS_ABRIR: '(';
PARENTESIS_CERRAR: ')';
EXCLAMACION: '!';
APOS_S: ('\''|'’') 's';// para permitir apóstrofes rectos (') y curvos (’)
// Palabras reservadas
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
GO: 'go';
FIRST: 'first';

// Robo de cartas
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

// Jugar una carta y posiciones
PLAYED: 'played';
DISCARDED: 'discarded';
TO: 'to';
ACTIVE: 'Active';
SPOT: 'Spot';
BENCH: 'Bench';
IN: 'in'; //  añadido para frases como "in the Active Spot"

// Adjuntar energía y evolucionar Pokémon
ATTACHED: 'attached';
ON: 'on';
EVOLVED: 'evolved';

// Ataques y combate
USED: 'used';
DAMAGE: 'damage';
DAMAGE_MAYUS: 'Damage';
BASE: 'Base';
ITEM: 'Item';
TOTAL: 'Total';

// Consecuencias del combate
WAS: 'was';
K_O: 'Knocked Out !';
TOOK: 'took';
PRIZE: 'Prize';
A_MAYUS: 'A';
ADDED: 'added';

// Cambios de Pokémon activo
SWITCHED: 'switched';
WITH: 'with';
BECOME: 'become';
POKEMON: 'Pokemon';
RETREATED: 'retreated';

// Mecánica de mazo
SHUFFLED: 'shuffled';
THEIR: 'their';
DECK: 'deck';
MOVED: 'moved';

// Cierre de turno y partida
ENDED: 'ended';
ALL: 'All';
WERE: 'were';
TAKEN: 'taken';
WINS: 'wins';
OPPONENT: 'opponent';
CONCEDED: 'conceded';


CARTA:
    // --Pokémon de mazo Lucario ---
      'Basic Fighting Energy'
    | 'Rocky Fighting Energy'
    | 'Makuhita'
    | 'Okidogi'
    | 'Mega Lucario ex'
    | 'Riolu'
    | 'Solrock'
    | 'Meowth ex'
    | 'Lunatone'
    | 'Fezandipiti ex'
    | 'Hariyama'

    // --- Pokémon añadidos: mazo desconocido (necesarios para el log 2) 
    | 'Teal Mask Ogerpon ex'
    | 'Fan Rotom'
    | 'Hoothoot'
    | 'Noctowl'
    | 'Chikorita'   
    | 'Dragapult ex'
    | 'Dreepy'
    | 'Drakloak'
    // --- Entrenadores y Objetos de tu mazo original ---
    | 'Lillie\'s Determination'
    | 'Boss\'s Orders'
    | 'Fighting Gong'
    | 'Poké Pad'
    | 'Poke Pad'
    | 'Premium Power Pro'
    | 'Night Stretcher'
    | 'Prime Catcher'
    | 'Ultra Ball'
    | 'Switch'
    | 'Judge'
    | 'Tarragon'
    | 'Gravity Mountain'
    | 'Team Rocket\'s Petrel'
    | 'Air Balloon'
    | 'Salvatore'
    | 'Hilda'
    | 'Maximum Belt'

    // --- entrenadores y Objetos añadidos: mazo ?  ---
    | 'Buddy-Buddy Poffin'
    | 'Rare Candy'

    // --- enrgia de tu mazo original ---
    | 'Basic Psychic Energy'
    | 'Basic Fire Energy'
    | 'Neo Upper Energy'

    // - energia añadidas: mazo desconocido ---
    | 'Basic Grass Energy'

    // --- ataques y aabilidades de mazo Lucario
    | 'Last-Ditch Catch'
    | 'Aura Jab'
    | 'Flip the Script'
    | 'Mega Brave'
    | 'Lunar Cycle'
    | 'Heave-Ho Catcher'
    | 'Wild Press'

    // --- Ataques y habilidades mazo ? 
    | 'Teal Dance'
    | 'Fan Call'
    ;

// Números e Identificadores (Nombres de jugadores)
fragment DIGITO: [0-9];

fragment LETRA: [a-zA-ZáéíóúÁÉÍÓÚñÑ]; // <-  permite la 'é' y caracteres UTF-8 si no da error, igual deberia permitir numeros tambien??
NUM: DIGITO(DIGITO)*;
ID: LETRA(LETRA)*;

// Para ignorar espacios en blanco y saltos de línea
WS: [ \t\r\n]+ -> skip;