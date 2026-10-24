lexer grammar PokemonLexer;

// Signos de puntuacion y delimitadores
PUNTO: '.';
COMA: ',';
RAYA: '-';
PUNTO_RELLENO: '•';
DOS_PUNTOS: ':';
PARENTESIS_ABRIR: '(';
PARENTESIS_CERRAR: ')';
EXCLAMACION: '!';
APOS_S: ('\'' | '’') 's';
NEWLINE: '\r'? '\n';

// Palabras reservadas y expresiones comunes
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
SECOND: 'second';
DREW: 'drew';
DRAWN: 'drawn';
A: 'a';
A_MAYUS: 'A';
CARD: 'card';
CARDS: 'cards';
FOR: 'for';
THE: 'the';
OPENING: 'opening';
HAND: 'hand';
SEVEN: 'seven';
PLAYED: 'played';
DISCARDED: 'discarded';
TO: 'to';
ACTIVE: 'Active';
SPOT: 'Spot'
    | 'spot';
BENCH: 'Bench';
IN: 'in';
ON: 'on';
ATTACHED: 'attached';

EVOLVED: 'evolved';

USED: 'used';

DAMAGE_BREAKDOWN: 'Damage breakdown';

BASE_DAMAGE: 'Base damage';

TOTAL_DAMAGE: 'Total damage';

DAMAGE: 'damage';

DAMAGE_MAYUS: 'Damage';

BASE: 'base';

TOTAL: 'total';

ITEM: 'Item';

ATTACK: 'Attack';

WAS: 'was';

WERE: 'were';

K_O: 'Knocked Out';

TOOK: 'took';

MORE_WORD: 'more';

PRIZE: 'Prize';

ADDED: 'added';

SWITCHED: 'switched';

WITH: 'with';

BECOME: 'become';
POKEMON: 'Pok'[eé]'mon';
RETREATED: 'retreated';

SHUFFLED: 'shuffled';

THEIR: 'their';

DECK: 'deck';

MOVED: 'moved';

ENDED: 'ended';
ALL: [aA]'ll';
TAKEN: 'taken';

WINS: 'wins';

OPPONENT: 'Opponent';

CONCEDED: 'conceded';

NO: 'No'
    | 'no';

BENCHED: 'Benched' | 'benched';

BACKUP: 'backup';

AND: 'and';

IT: 'it';

THEM: 'them';

INTO: 'into';

PUT: 'put';

COUNTERS: 'counters';

DAMAGE_COUNTERS: 'damage counters';

FROM: 'from';

STADIUM: 'Stadium';

IS: 'is';

NOW: 'now';

MULLIGAN: 'Mulligan'
    | 'mulligan';

REVEALED: 'revealed';

BECAUSE: 'because';

AT: 'at';

LEAST: 'least';

WEAKNESS: 'Weakness'
    | 'weakness';

OF: 'of';

LESS: 'less';

RESISTANCE: 'Resistance'
    | 'resistance';

HEALED: 'healed';

DIDNT: 'didn\'t'
    | 'didn’t';

TAKE: 'take';

AN: 'an';

ACTION: 'action';

TIME: 'time';

TOO: 'too';

LONG: 'long';

INACTIVE: 'inactive';

SELECTED: 'selected';

ENERGY: 'Energy';

EXCITED: 'Excited';

RAN: 'ran';

OUT: 'out';

// Estados especiales del Pokemon. Se agrupan en tokens concretos para que
// el parser pueda reconocerlos con una sola regla reutilizable.
ASLEEP: 'Asleep'
    | 'asleep';

BURNED: 'Burned'
    | 'burned';

CONFUSED: 'Confused'
    | 'confused';

PARALYZED: 'Paralyzed'
    | 'paralyzed'
    | 'Paralysed'
    | 'paralysed';

POISONED: 'Poisoned'
    | 'poisoned';


// Tipos usados en clausulas de debilidad y resistencia
TIPOS_WEAK_RES: 'Grass'
    | 'Fire'
    | 'Psychic'
    | 'Fighting'
    | 'Metal'
    | 'Darkness'
    | 'Colorless'
    | 'Lightning'
    | 'Dragon'
    | 'Water'
    | 'Fairy';

// Catalogo de cartas Pokemon conocidas
CARTA_POKEMON: 'Riolu'
    | 'Mega Lucario ex'
    | 'Lucario'
    | 'Makuhita'
    | 'Hariyama'
    | 'Okidogi'
    | 'Solrock'
    | 'Lunatone'
    | 'Bulbasaur'
    | 'Ivysaur'
    | 'Mega Venusaur ex'
    | 'Chikorita'
    | 'Bayleef'
    | 'Meganium'
    | 'Teal Mask Ogerpon ex'
    | 'Steven\'s Beldum'
    | 'Steven\'s Metang'
    | 'Steven\'s Metagross ex'
    | 'Genesect ex'
    | 'Mega Mawile ex'
    | 'Mega Skarmory ex'
    | 'Frillish'
    | 'Jellicent ex'
    | 'Mew ex'
    | 'Lillie\'s Clefairy ex'
    | 'Deino'
    | 'Zweilous'
    | 'Hydreigon ex'
    | 'Latios'
    | 'Mega Latias ex'
    | 'N\'s Zorua'
    | 'N\'s Zoroark ex'
    | 'N\'s Darumaka'
    | 'N\'s Darmanitan'
    | 'N\'s Reshiram'
    | 'N\'s Zekrom'
    | 'Pecharunt ex'
    | 'Dreepy'
    | 'Drakloak'
    | 'Dragapult ex'
    | 'Duskull'
    | 'Dusclops'
    | 'Dusknoir'
    | 'Charmander'
    | 'Charmeleon'
    | 'Mega Charizard X ex'
    | 'Mega Charizard Y ex'
    | 'Mega Charizard ex'
    | 'Charizard'
    | 'Oricorio ex'
    | 'Reshiram'
    | 'Electrike'
    | 'Mega Manectric ex'
    | 'Tynamo'
    | 'Eelektrik'
    | 'Mega Eelektross ex'
    | 'Zekrom ex'
    | 'Zeraora'
    | 'Carvanha'
    | 'Mega Sharpedo ex'
    | 'Munkidori'
    | 'Seviper'
    | 'Toxel'
    | 'Toxtricity'
    | 'Meowth ex'
    | 'Fezandipiti ex'
    | 'Fan Rotom'
    | 'Hoothoot'
    | 'Noctowl'
    | 'Eelektross ex'
    | 'Pikachu'
    | 'Pikachu ex'
    | 'Pidgey'
    | 'Pidgeotto'
    | 'Pidgeot ex'
    | 'Beldum'
    | 'Metang'
    | 'Metagross ex'
    | 'Wellspring Mask Ogerpon ex'
    | 'Cornerstone Mask Ogerpon ex'
    | 'Hearthflame Mask Ogerpon ex'
    | 'Mimikyu'
    | 'Gengar ex'
    | 'Gastly'
    | 'Haunter'
    | 'Snorlax'
    | 'Bibarel'
    | 'Bidoof'
    | 'Miraidon ex'
    | 'Iron Hands ex'
    | 'Iron Thorns ex'
    | 'Walking Wake ex'
    | 'Flutter Mane'
    | 'Raging Bolt ex'
    | 'Roaring Moon ex'
    | 'Gholdengo ex'
    | 'Charizard ex'
    | 'Dedenne'
    | 'Ditto'
    | 'Manaphy'
    | 'Radiant Greninja'
    | 'Greninja ex'
    | 'Greninja'
    | 'Froakie'
    | 'Frogadier'
    | 'Drilbur'
    | 'Excadrill'
    | 'Minccino'
    | 'Cinccino'
    | 'Jirachi'
    | 'Mewtwo'
    | 'Mew'
    | 'Pawmi'
    | 'Pawmo'
    | 'Pawmot'
    | 'Tandemaus'
    | 'Maushold'
    | 'Ponyta'
    | 'Rapidash'
    | 'Natu'
    | 'Xatu'
    | 'Cleffa'
    | 'Clefairy'
    | 'Clefable'
    | 'Moltres'
    | 'Zapdos'
    | 'Articuno'
    | 'Eevee'
    | 'Vaporeon'
    | 'Jolteon'
    | 'Flareon'
    | 'Sylveon'
    | 'Umbreon'
    | 'Espeon'
    | 'Leafeon'
    | 'Glaceon'
    | 'Garchomp ex'
    | 'Gible'
    | 'Gabite'
    | 'Ralts'
    | 'Kirlia'
    | 'Gardevoir ex'
    | 'Gardevoir'
    | 'Bloodmoon Ursaluna ex'
    | 'Ursaluna'
    | 'Scream Tail'
    | 'Klefki'
    | 'Lumineon V'
    | 'Squawkabilly ex'
    | 'Comfey'
    | 'Cramorant'
    | 'Sableye'
    | 'Radiant Charizard'
    | 'Baxcalibur'
    | 'Frigibax'
    | 'Arctibax'
    | 'Palkia VSTAR'
    | 'Origin Forme Palkia VSTAR'
    | 'Dialga VSTAR'
    | 'Origin Forme Dialga VSTAR'
    | 'Terapagos ex'
    | 'Cinderace ex'
    | 'Ceruledge ex'
    | 'Porygon'
    | 'Porygon2'
    | 'Porygon-Z'
    | 'Ludicolo'
    | 'Lotad'
    | 'Lombre'
    | 'Teddiursa'
    | 'Ursaring'
    | 'Magnezone'
    | 'Magnemite'
    | 'Magneton'
    | 'Mareep'
    | 'Flaaffy'
    | 'Ampharos'
    | 'Mawile'
    | 'Skarmory'
    | 'Miraidon'
    | 'Meltan'
    | 'Melmetal'
    | 'Togepi'
    | 'Togetic'
    | 'Togekiss'
    | 'Wiglett'
    | 'Wugtrio'
    | 'Paldean Wooper'
    | 'Clodsire ex'
    | 'Shuppet'
    | 'Banette'
    | 'Banette ex'
    | 'Drifloon'
    | 'Drifblim'
    | 'Ceruledge'
    | 'Entei'
    | 'Suicune'
    | 'Raikou'
    | 'Absol'
    | 'Absol ex'
    | 'Buneary'
    | 'Lopunny'
    | 'Murkrow'
    | 'Honchkrow'
    | 'Poochyena'
    | 'Mightyena'
    | 'Zorua'
    | 'Zoroark'
    | 'Darumaka'
    | 'Darmanitan'
    | 'Snorunt'
    | 'Froslass'
    | 'Bergmite'
    | 'Avalugg'
    | 'Glimmet'
    | 'Glimmora'
    | 'Pawniard'
    | 'Bisharp'
    | 'Kingambit'
    | 'Varoom'
    | 'Revavroom'
    | 'Rookidee'
    | 'Corvisquire'
    | 'Corviknight'
    | 'Mankey'
    | 'Primeape'
    | 'Annihilape'
    | 'Machop'
    | 'Machoke'
    | 'Machamp'
    | 'Sandshrew'
    | 'Sandslash'
    | 'Cubone'
    | 'Marowak'
    | 'Geodude'
    | 'Graveler'
    | 'Golem'
    | 'Onix'
    | 'Steelix'
    | 'Rhyhorn'
    | 'Rhydon'
    | 'Rhyperior'
    | 'Gligar'
    | 'Gliscor'
    | 'Larvitar'
    | 'Pupitar'
    | 'Tyranitar'
    | 'Cyndaquil'
    | 'Quilava'
    | 'Typhlosion'
    | 'Totodile'
    | 'Croconaw'
    | 'Feraligatr'
    | 'Treecko'
    | 'Grovyle'
    | 'Sceptile'
    | 'Torchic'
    | 'Combusken'
    | 'Blaziken'
    | 'Mudkip'
    | 'Marshtomp'
    | 'Swampert'
    | 'Mega Darkrai ex'
    | 'Brute Bonnet';

// Catalogo de energias conocidas
CARTA_ENERGIA: 'Basic Grass Energy'
    | 'Basic Fire Energy'
    | 'Basic Psychic Energy'
    | 'Basic Fighting Energy'
    | 'Basic Metal Energy'
    | 'Basic Darkness Energy'
    | 'Basic Electric Energy'
    | 'Basic Lightning Energy'
    | 'Basic Water Energy'
    | 'Basic Fairy Energy'
    | 'Rocky Fighting Energy'
    | 'Neo Upper Energy'
    | 'Prism Energy'
    | 'Legacy Energy'
    | 'Double Turbo Energy'
    | 'Jet Energy'
    | 'Reversal Energy'
    | 'Luminous Energy'
    | 'Therapeutic Energy'
    | 'Mist Energy'
    | 'Gift Energy'
    | 'V Guard Energy'
    | 'Horror Psychic Energy'
    | 'Lucky Energy'
    | 'Capture Energy'
    | 'Speed Lightning Energy'
    | 'Powerful Colorless Energy';

// Catalogo de objetos conocidos
CARTA_ITEM: 'Ultra Ball'
    | 'Poké Pad'
    | 'Poke Pad'
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
    | 'Air Balloon'
    | 'Maximum Belt'
    | 'Binding Mochi'
    | 'Hero\'s Cape'
    | 'Powerglass'
    | 'Super Rod'
    | 'Nest Ball'
    | 'Great Ball'
    | 'Level Ball'
    | 'Heavy Ball'
    | 'Counter Catcher'
    | 'Earthen Vessel'
    | 'Technical Machine: Evolution'
    | 'Technical Machine: Devolution'
    | 'Technical Machine: Turbo Energize'
    | 'Technical Machine: Crisis Punch'
    | 'Rescue Board'
    | 'Float Stone'
    | 'Choice Belt'
    | 'Exp. Share'
    | 'Rock Chestplate'
    | 'Defiance Band'
    | 'Bravery Charm'
    | 'Ancient Booster Energy Capsule'
    | 'Future Booster Energy Capsule'
    | 'Pokémon Catcher'
    | 'Pokemon Catcher'
    | 'Pal Pad'
    | 'Lost Vacuum'
    | 'Trekking Shoes'
    | 'Battle VIP Pass'
    | 'Forest Seal Stone'
    | 'Tool Scrapper'
    | 'Enhanced Hammer'
    | 'Switch Cart'
    | 'Pokégear 3.0'
    | 'Pokegear 3.0'
    | 'Dark Bell';

// Catalogo de Supporters conocidos
CARTA_SUPPORTER: 'Lillie\'s Determination'
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
    | 'Arven'
    | 'Grimsley\'s Move'
    | 'Firebreather'
    | 'Professor\'s Research'
    | 'Iono'
    | 'Marnie'
    | 'Penny'
    | 'Colress'
    | 'Roxanne'
    | 'Bruno'
    | 'Erika\'s Invitation'
    | 'Korrina\'s Focus'
    | 'Clavell'
    | 'Eri'
    | 'Geeta'
    | 'Nemona'
    | 'Atticus'
    | 'Larry'
    | 'Saguaro'
    | 'Tulip'
    | 'Jacq'
    | 'Rika';

// Catalogo de estadios conocidos
CARTA_STADIUM: 'Forest of Vitality'
    | 'Grand Tree'
    | 'Full Metal Lab'
    | 'Gravity Mountain'
    | 'N\'s Castle'
    | 'Jamming Tower'
    | 'Academy at Night'
    | 'Battle Cage'
    | 'Artazon'
    | 'Town Store'
    | 'PokéStop'
    | 'PokeStop'
    | 'Collapsed Stadium'
    | 'Path to the Peak'
    | 'Temple of Sinnoh'
    | 'Beach Court'
    | 'Mesagoza'
    | 'Pokémon League Headquarters'
    | 'Team Rocket\'s Factory';

// Catalogo de ataques conocidos
ATAQUE: 'Aura Jab'
    | 'Mega Brave'
    | 'Lunar Cycle'
    | 'Heave-Ho Catcher'
    | 'Wild Press'
    | 'Bind Down'
    | 'Razor Leaf'
    | 'Solar Transfer'
    | 'Jungle Dump'
    | 'Excited Turbo'
    | 'Push Down'
    | 'Wild Growth'
    | 'Solar Beam'
    | 'Teal Dance'
    | 'Myriad Leaf Shower'
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
    | 'Power Gem'
    | 'Virtuous Flame'
    | 'Shred'
    | 'Rampaging Thunder'
    | 'Last-Ditch Catch'
    | 'Last Ditch Catch'
    | 'Tuck Tail'
    | 'Flip the Script'
    | 'Cruel Arrow'
    | 'Fan Call'
    | 'Greedy Fang'
    | 'Hungry Jaws'
    | 'Sinister Surge'
    | 'Light Punch'
    | 'Slash'
    | 'Recon Directive'
    | 'Cursed Blast'
    | 'Phantom Dive'
    | 'Flash Ray'
    | 'Riotous Blasting'
    | 'Dynamotor'
    | 'Panic Mask'
    | 'Jet Headbutt'
    | 'Lightning Ball'
    | 'Thunder Lance'
    | 'Sparkling Shoes'
    | 'Energy Press'
    | 'Spiral Shot'
    | 'Phantom Transformation'
    | 'Shadow Bullet'
    | 'Painful Spoons'
    | 'Mind Bend'
    | 'Miracle Force'
    | 'Draconic Rush'
    | 'Dragon Launcher'
    | 'Tera Raid'
    | 'Rampage Blaze'
    | 'Incinerate'
    | 'Infernal Reign'
    | 'Roaring Scream'
    | 'Crunch'
    | 'Spinning Attack'
    | 'Thunder Wave'
    | 'Thunderbolt'
    | 'Electro Ball'
    | 'Quick Attack'
    | 'Energy Loop'
    | 'Energy Burst'
    | 'Psychic Embrace'
    | 'Mirage Step'
    | 'Lost Mine'
    | 'Moonlight Shuriken'
    | 'Star Requiem'
    | 'Inferno X';

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-ZáéíóúÁÉÍÓÚñÑüÜ];
NUM: DIGITO+;
ID: (LETRA | DIGITO | '_')+;
WS: [ \t]+ -> skip;

// Ultimo recurso del lexer: conserva un caracter no contemplado por las
// reglas anteriores. El parser solo tolera estos caracteres dentro de la
// alternativa generica de los efectos con guion, no en toda la partida.
OTRO: .;
