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

    // --- Mazo Mega Venusaur ex ---
    // Pokémon
    | 'Bulbasaur'
    | 'Ivysaur'
    | 'Mega Venusaur ex'
    | 'Bayleef'
    | 'Meganium'
    // Entrenadores
    | 'Forest of Vitality'
    | 'Bug Catching Set'
    | 'Dawn'
    | 'Lana\'s Aid'
    | 'Colress\'s Tenacity'
    | 'Grand Tree'
    | 'Wally\'s Compassion'
    // Ataques y habilidades
    | 'Bind Down'
    | 'Razor Leaf'
    | 'Solar Transfer'
    | 'Jungle Dump'
    | 'Push Down'
    | 'Wild Growth'
    | 'Solar Beam'
    | 'Myriad Leaf Shower'
    | 'Cruel Arrow'
    | 'Tuck Tail'

        // --- Mazo Steven's Metagross ex ---
    // Pokémon
    | 'Steven\'s Beldum'
    | 'Steven\'s Metang'
    | 'Steven\'s Metagross ex'
    | 'Mega Mawile ex'
    | 'Mega Skarmory ex'
    | 'Genesect ex'
    | 'Frillish'
    | 'Jellicent ex'
    // Entrenadores
    | 'Full Metal Lab'
    | 'Energy Recycler'
    | 'Unfair Stamp'
    // Energía 
    | 'Basic Metal Energy'
    // Ataques y habilidades
    | 'Ram'
    | 'Metal Slash'
    | 'X-Boot'
    | 'Metal Stomp'
    | 'Gobble Down'
    | 'Huge Bite'
    | 'Sonic Ripper'
    | 'Metallic Signal'
    | 'Protect Charge'
    | 'Oceanic Gloom'
    | 'Oceanic Curse'
    | 'Power Press'
    //---------
    //Mazo Mew
    //Pokemon
    | 'Lillie\'s Clefairy ex'
    | ' Mew ex'
    | 'Deino'
    | 'Zweilous'
    | 'Hydreigon ex'
    | 'Genesect'
    | 'Steven\'s Beldium'
    | 'Steven\'s Metagross'
    | 'Latios'
    | 'Mega Latias ex'
    //Items
    |'Scramble Switch'
    //Supporter
    |'Black Belt\'s Training'
    //Energy
    |'Prism Energy'
    |'Basic Dark Energy'
    | 'Basic Metallic Energy'
    //Ataques y habilidades
    |'Fairy Zone'
    |'Full Moon Rondo'
    |'Memory Helix'
    |'Teleportation Burst'
    |'Stomp Off'
    |'Bite'
    | 'Darkness Fang'
    |'Crashing Headbutt'
    |'Obsidian'
    |'Metallic Signal'
    |'Protect Charge'
    |'Ram'
    |'Metal Slash'
    |'X-Boot'
    |'Metal Stomp'
    |'Lustrous Assist'
    |'Dragon Claw'
    |'Strafe'
    |'Illusory Impulse';
    //---------
    //Mazo Zoroark ex
    //Pokemons
    |'N\'s Darumaka'
    |'N\'s Darmanitan'
    |'N\'s Zorua'
    |'N\'s Zoroark ex'
    |'Pecharunt ex'
    |'N\'s Reshiram'
    |'N\'s Zekrom'
    //Items
    |'N\'s PP Up'
    |'Redeemable Ticket'
    |'N\'s Castle'
    //Supporter
    |'Cyrano'
    |'Janine\'s Secret Art'
    |'Air Ballon'
    |'Binding Mochi'
    |'Hero\'s Cape'
    |'Powerglass'
    //Ataques y habilidades
    |'Rollong Tackle'
    |'Flare'
    |'Back Draft'
    |'Flamebody Cannon'
    |'Scratch'
    |'Trade'
    |'Night Joker'
    |'Subjugating Chains'
    |'Irritated Outburst'
    |'Powerful Rage'
    |'Virtuous Flame'
    | 'Shred'
    |'Rampaging Thunder'



    ;

    

// Números e Identificadores (Nombres de jugadores)
fragment DIGITO: [0-9];

fragment LETRA: [a-zA-ZáéíóúÁÉÍÓÚñÑ]; // <-  permite la 'é' y caracteres UTF-8 si no da error, igual deberia permitir numeros tambien??
NUM: DIGITO(DIGITO)*;
ID: LETRA(LETRA)*;

// Para ignorar espacios en blanco y saltos de línea
WS: [ \t\r\n]+ -> skip;
