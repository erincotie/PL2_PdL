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
APOS_S: ('\''|'’') 's'; // para permitir apóstrofes rectos (') y curvos (’)
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
IN: 'in'; //  

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




// CARTAS: un token por tipo de carta (pokemon, energia, item, supporter,
// stadium) y otro para ataques y habilidades.


CARTA_POKEMON:
    // Mazo Mega Lucario ex
      'Riolu'
    | 'Mega Lucario ex'
    | 'Makuhita'
    | 'Hariyama'
    | 'Okidogi'
    | 'Solrock'
    | 'Lunatone'
    // Mazo Mega Venusaur ex
    | 'Bulbasaur'
    | 'Ivysaur'
    | 'Mega Venusaur ex'
    | 'Chikorita'
    | 'Bayleef'
    | 'Meganium'
    | 'Teal Mask Ogerpon ex'
    // Mazo Steven's Metagross ex
    | 'Steven\'s Beldum'
    | 'Steven\'s Metang'
    | 'Steven\'s Metagross ex'
    | 'Genesect ex'
    | 'Mega Mawile ex'
    | 'Mega Skarmory ex'
    | 'Frillish'
    | 'Jellicent ex'
    // Mazo Mew ex
    | 'Mew ex'
    | 'Lillie\'s Clefairy ex'
    | 'Deino'
    | 'Zweilous'
    | 'Hydreigon ex'
    | 'Latios'
    | 'Mega Latias ex'
    | 'Genesect'                
    | 'Steven\'s Metagross'     
    // Mazo N's Zoroark ex
    | 'N\'s Zorua'
    | 'N\'s Zoroark ex'
    | 'N\'s Darumaka'
    | 'N\'s Darmanitan'
    | 'N\'s Reshiram'
    | 'N\'s Zekrom'
    | 'Pecharunt ex'
    // Mazo Dragapult ex
    | 'Dreepy'
    | 'Drakloak'
    | 'Dragapult ex'
    | 'Duskull'
    | 'Dusclops'
    | 'Dusknoir'
    // Mazo Mega Charizard X ex
    | 'Charmander'
    | 'Charmeleon'
    | 'Mega Charizard ex'
    | 'Mega Charizard Y ex'
    | 'Oricorio ex'
    | 'Reshiram'
    // Mazo Mega Manectric ex
    | 'Electrike'
    | 'Mega Manectric ex'
    | 'Tynamo'
    | 'Eelektrik'
    | 'Mega Eelektross ex'
    | 'Zekrom ex'
    | 'Zeraora'
    // Mazo Mega Sharpedo ex
    | 'Carvanha'
    | 'Mega Sharpedo ex'
    | 'Munkidori'
    | 'Seviper'
    | 'Toxel'
    | 'Toxtricity'
    // Comunes a varios mazos
    | 'Meowth ex'
    | 'Fezandipiti ex'
    // Del rival del log 2 del profesor
    | 'Fan Rotom'
    | 'Hoothoot'
    | 'Noctowl'
    ;

CARTA_ENERGIA:
      'Basic Grass Energy'
    | 'Basic Fire Energy'
    | 'Basic Psychic Energy'
    | 'Basic Fighting Energy'
    | 'Basic Metal Energy'        
    | 'Basic Darkness Energy'     
    | 'Basic Electric Energy'     
    // Energias especiales
    | 'Rocky Fighting Energy'
    | 'Neo Upper Energy'
    | 'Prism Energy'
    | 'Legacy Energy'
    ;

// Las herramientas (Pokemon Tool) se incluyen aqui porque son un tipo de Item
CARTA_ITEM:
      'Ultra Ball'
    | 'Poké Pad'
    | 'Night Stretcher'
    | 'Switch'
    | 'Rare Candy'
    | 'Buddy-Buddy Poffin'
    | 'Energy Recycler'
    | 'Energy Retrieval'
    | 'Energy Search'
    | 'Fighting Gong'
    | 'Premium Power Pro'
    | 'Prime Catcher'
    | 'Bug Catching Set'
    | 'Unfair Stamp'
    | 'Scramble Switch'
    | 'N\'s PP Up'
    | 'Redeemable Ticket'
    | 'Mega Signal'
    | 'Precious Trolley'
    | 'Secret Box'
    // Herramientas
    | 'Air Balloon'
    | 'Maximum Belt'
    | 'Binding Mochi'
    | 'Hero\'s Cape'
    | 'Powerglass'
    ;

CARTA_SUPPORTER:
      'Lillie\'s Determination'
    | 'Boss\'s Orders'
    | 'Judge'
    | 'Dawn'
    | 'Hilda'
    | 'Team Rocket\'s Petrel'
    | 'Tarragon'
    | 'Salvatore'
    | 'Lana\'s Aid'
    | 'Colress\'s Tenacity'
    | 'Wally\'s Compassion'
    | 'Black Belt\'s Training'
    | 'Cyrano'
    | 'Janine\'s Secret Art'
    | 'Crispin'
    | 'Canari'
    | 'Carmine'
    | 'Iris\'s Fighting Spirit'
    | 'Grimsley\'s Move'
    | 'Firebreather'              // DUDA: comprobar que es Supporter
    ;

CARTA_STADIUM:
      'Forest of Vitality'
    | 'Grand Tree'
    | 'Full Metal Lab'
    | 'Gravity Mountain'
    | 'N\'s Castle'
    | 'Jamming Tower'
    | 'Academy at Night'
    | 'Battle Cage'
    ;

// Ataques y habilidades de los Pokemon
ATAQUE:
    // Mazo Mega Lucario ex
      'Aura Jab'
    | 'Mega Brave'
    | 'Lunar Cycle'
    | 'Heave-Ho Catcher'
    | 'Wild Press'
    // Mazo Mega Venusaur ex
    | 'Bind Down'
    | 'Razor Leaf'
    | 'Solar Transfer'
    | 'Jungle Dump'
    | 'Push Down'
    | 'Wild Growth'
    | 'Solar Beam'
    | 'Teal Dance'
    | 'Myriad Leaf Shower'
    // Mazo Steven's Metagross ex
    | 'Ram'
    | 'Metal Slash'
    | 'X-Boot'
    | 'Metal Stomp'
    | 'Metallic Signal'
    | 'Protect Charge'
    | 'Gobble Down'
    | 'Huge Bite'
    | 'Sonic Ripper'
    | 'Oceanic Gloom'
    | 'Oceanic Curse'
    | 'Power Press'
    // Mazo Mew ex
    | 'Fairy Zone'
    | 'Full Moon Rondo'
    | 'Memory Helix'
    | 'Teleportation Burst'
    | 'Stomp Off'
    | 'Bite'
    | 'Darkness Fang'
    | 'Crashing Headbutt'
    | 'Obsidian'
    | 'Lustrous Assist'
    | 'Dragon Claw'
    | 'Strafe'
    | 'Illusory Impulse'
    // Mazo N's Zoroark ex
    | 'Rolling Tackle'
    | 'Flare'
    | 'Back Draft'
    | 'Flamebody Cannon'
    | 'Scratch'
    | 'Trade'
    | 'Night Joker'
    | 'Subjugating Chains'
    | 'Irritated Outburst'
    | 'Powerful Rage'
    | 'Virtuous Flame'
    | 'Shred'
    | 'Rampaging Thunder'
    // Comunes a varios mazos
    | 'Last-Ditch Catch'
    | 'Tuck Tail'
    | 'Flip the Script'
    | 'Cruel Arrow'
    // Del rival del log 2 del profesor
    | 'Fan Call'
    // PENDIENTE: ataques de Dragapult ex, Mega Charizard X ex,
    // Mega Manectric ex y Mega Sharpedo ex
    ;

// Números e Identificadores (nombres de jugadores)
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-ZáéíóúÁÉÍÓÚñÑ];
NUM: DIGITO+;
ID: (LETRA | DIGITO | '_')+;

// Para ignorar espacios en blanco y saltos de línea
WS: [ \t\r\n]+ -> skip;
