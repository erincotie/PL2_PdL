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






//Números y letras
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
NUM: DIGITO(DIGITO)*;
ID: LETRA(LETRA)*;


//Para ignorar espacios
WS: [ \t\r\n]+ -> skip;