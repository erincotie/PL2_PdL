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

CARTA_ITEMS:
    'Scramble Switch'
    | 'Buddy-Buddy Poffin'
    | 'Rare Candy'  
    |'N\'s PP Up'
    |'Redeemable Ticket'
    |'N\'s Castle'
    |'Premium Power Pro'
    |'Energy Search'
    |'Secret Box'
    |'Energy Retrieval'
    |'Mega Signal'
    |'Precious Trolley'
    |'Battle Cage'
    |'Firebreather'
    | 'Fighting Gong'
    | 'Poké Pad'
    | 'Night Stretcher'
    | 'Prime Catcher'
    | 'Ultra Ball'
    | 'Switch'
    | 'Air Balloon'  
    | 'Bug Catching Set'
    ;

CARTA_SUPPORTERS:
    'Lillie\'s Determination'
    | 'Boss\'s Orders'
    | 'Judge'
    | 'Salvatore'
    | 'Hilda' 
    | 'Dawn'
    | 'Lana\'s Aid'
    | 'Colress\'s Tenacity'
    | 'Wally\'s Compassion'
    |'Black Belt\'s Training'  
    |'Cyrano'
    |'Janine\'s Secret Art'
    |'Binding Mochi'
    |'Hero\'s Cape'
    |'Powerglass'
    |'Tarragon'
    |'Team Rocket\'s Petrel'  
    |'Grimsley\'s Move'
    |'Crispin'
    |'Canari'
    |'Carmine'
    |'Iris\'s Fighting Spirit'
    ;
CARTA_STADIUMS:
    'Academy at Night'
    | 'Gravity Mountain'
    |'Jamming Tower'
    ;
CARTA_ENERGIA:
      'Basic Fighting Energy'
    | 'Rocky Fighting Energy'
    | 'Basic Psychic Energy'
    | 'Basic Fire Energy'
    | 'Neo Upper Energy'
    | 'Basic Grass Energy'
    | 'Basic Metal Energy'
    |'Prism Energy'
    |'Basic Dark Energy'
    |'Basic Electric Energy'
    |'Legacy Energy'
    ;

CARTA_POKEMON:
    // --Pokémon de mazo Lucario ---
    'Hariyama'
    | 'Teal Mask Ogerpon ex'
    | 'Fan Rotom'
    | 'Hoothoot'
    | 'Noctowl'
    | 'Chikorita'          

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
    | 'Grand Tree'
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
    // Entrenadores
    | 'Full Metal Lab'
    | 'Energy Recycler'
    | 'Unfair Stamp'
    // Ataques y habilidades
    | 'Ram'
    | 'X-Boot'
    | 'Gobble Down'
    | 'Huge Bite'
    | 'Sonic Ripper'
    | 'Protect Charge'
    | 'Oceanic Gloom'
    | 'Oceanic Curse'
    | 'Power Press'
    //---------
    //Mazo Mew
    //Pokemon
    | 'Lillie\'s Clefairy ex'
    | 'Mew ex'
    | 'Deino'
    | 'Zweilous'
    | 'Hydreigon ex'
    | 'Genesect'
    | 'Steven\'s Metagross'
    | 'Latios'
    | 'Mega Latias ex'    
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
    //Ataques y habilidades
    |'Rolling Tackle'
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

    //-------------------
    //Pokemon mazo Lucario ex
    |'Lunatone'
    |'Makuhita'
    |'Okidogi'
    |'Riolu'
    |'Mega Lucario ex'
    |'Solrock'
    |'Fezandipiti ex'
    |'Meowth ex'
    //Tool
    |'Maximum Belt'

    //-------------
    //Pokemon mazo Dragapult
    |'Duskull'
    |'Dusclops'
    |'Dusknoir'
    |'Dreepy'
    |'Drakloak'
    |'Dragapult ex'
    

    //-----------
    //Pokemon del mazo Metagross
    |'Frillish'
    |'Jellicent ex'
    |'Genesect ex'
    |'Mega Mawile ex'
    |'Mega Skarmory ex'
    
    //------------
    //Pokemon mazo Charizard
    |'Charmander'
    |'Charmaleon'
    |'Mega Charizard ex'
    |'Mega Charizard Y ex'
    |'Oricorio ex'
    |'Reshiram'

    //-------------
    //Pokemons mazo Manectric
    |'Electrike'
    |'Mega Manectric ex'
    |'Tynamo'
    |'Eelektrik'
    |'Mega Eelektross ex'
    |'Zekrom ex'
    |'Zeraora'    

    //---------
    //Pokemon mazo sharpedo
    |'Munkidori'
    |'Carvanha'
    |'Mega Sharpedo ex'
    |'Seviper'
    |'Toxel'
    |'Toxtricity'

    ;

    

// Números e Identificadores (Nombres de jugadores)
fragment DIGITO: [0-9];

fragment LETRA: [a-zA-ZáéíóúÁÉÍÓÚñÑ]; // <-  permite la 'é' y caracteres UTF-8 si no da error, igual deberia permitir numeros tambien??
NUM: DIGITO(DIGITO)*;
ID: LETRA(LETRA)*;

// Para ignorar espacios en blanco y saltos de línea
WS: [ \t\r\n]+ -> skip;
