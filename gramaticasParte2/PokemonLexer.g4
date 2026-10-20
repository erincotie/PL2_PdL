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

//CARTAS DEL MAZO MEW EX
//Pokemons junto a sus ataques
LILLIE_CLEFAIRY: 'Lillie''s Clefairy ex';
FAIRY_ZONE: 'Fairy Zone';
FULL_MOON: 'Full Moon Rondo';

MEW: 'Mew ex';
MEMORY: 'Mmeory Helix';
TELEPORTATION: 'Teleportation Burst';

DEINO: 'Deino';
STOMP_OFF: 'Stomp Off';
BITE: 'Bite';

ZWEILOUS: 'Zweilous';
DARKNESS_FANG: 'Darkness Fang';

HYDREIGON: 'Hydreigon ex';
CRASHING_HEADBUTT: 'Crashing Headbutt';
OBSIDIAN: 'Obsidian';

FEZANDIPITI: 'Fezandipiti ex';
FLIP_SCRIPT: 'Flip the Script';
CRUEL_ARROW: 'Cruel Arrow';

GENESECT: 'Genesect ex';
METALLIC_SIGNAL: 'Metallic Signal';
PROTECT_CHARGE: 'Protect Charge';

STEVEN_BELDUM: 'Steven''s Beldum';
RAM: 'Ram';

STEVEN_METANG: 'Steven''s Metang';
METAL_SLASH: 'Metal Slash';

STEVEN_METAGROSS: 'Steven''s Metagross ex';
X_BOOT: 'X-Boot';
METAL_STOMP: 'Metal Stomp';

LATIOS: 'Latios';
LUSTROUS_ASSIST: 'Lustrous Assist';
DRAGON_CLAW: 'Dragon Claw';

MEGA_LATIAS: 'Mega Latias ex';
STRAFE: 'Strafe';
ILLUSORY_IMPULSE: 'Illusory Impulse';

MEOWTH: 'Meowth ex';
LAST_DITCH: 'Last-Ditch Catch';
TUCK_TAIL: 'Tuck Tail';

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
HILDA: 'Hilda';
LILLIE: 'Lillie''s Determination';
TEAM_ROCKET: 'Team Rocket''s Petrel';
//Energy
PRISM_ENERGY: 'Prism Energy';
BASIC_DARK: 'Basic Dark Energy';
BASIC_METALLIC: 'Basic Metallic Energy';
BASIC_PSYCHIC: 'Basic Psychic Energy';

//CARTAS DEL MAZO ZOROARK EX
//Pokemons y sus ataques
N_DARUMAKA: 'N''s Darumaka';
ROLLING_TACKLE: 'Rollong Tackle';
FLARE: 'Flare';

N_DARMANITAN: 'N''s Darmanitan';
BACK_DRAFT: 'Back Draft';
FLAMEBODY_CANNON: 'Flamebody Cannon';

N_ZORUA: 'N''s Zorua';
SCRATCH: 'Scratch';

N_ZOROARK: 'N''s Zoroark ex';
TRADE: 'Trade';
NIGHT_JOKER: 'Night Joker';

PECHARUNT: 'Pecharunt ex';
SUBJUGATING_CHAINS: 'Subjugating Chains';
IRRITATED_OUTBURST: 'Irritated Outburst';

N_RESHIRAM: 'N''s Reshiram';
POWERFUL_RAGE: 'Powerful Rage';
VIRTUOUS_FLAME: 'Virtuous Flame';

N_ZEKROM: 'N''s Zekrom';
SHRED: 'Shred';
RAMPAGING_THUNDER: 'Rampaging Thunder';

//Items
N_PP: 'N''s PP Up';
TICKET: 'Redeemable Ticket';
N_CASTLE: 'N''s Castle';
//Supporter
CYRANO: 'Cyrano';
JANINE: 'Janine''s Secret Art';
JUDGE: 'Judge';
AIR_BALLON: 'Air Ballon';
BINDING_MOCHI: 'Binding Mochi';
HERO_CAPE: 'Hero''s Cape';
POWERGLASS: 'Powerglass';





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