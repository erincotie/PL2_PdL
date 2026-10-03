lexer grammar CminusLexer;

/*
Primero, defino las palabras reservadas del lenguaje como sus propios tokens
Deben estar reservadas y escritas en minusculas
*/

ELSE: 'else';
IF: 'if';
INT: 'int';
RETURN: 'return';
VOID: 'void';
WHILE: 'while';
//Ampliacion con el uso del bucle for y el tipo char y bool
FOR: 'for';
CHAR_TIPO: 'char';
BOOL: 'bool';
INPUT: 'input';
OUTPUT: 'output';
TRUE: 'true';
FALSE: 'false';

//Otros tokens especiales serán los ID y los NUM que se componen de fragmentos

//Ampliacion para añadir un caracter, que debe estar entre comillas simples
CHAR: '\'' . '\'';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
ID: LETRA(LETRA)*;
NUM: DIGITO(DIGITO)*;

//Definimos los simbolos especiales, para evitar el uso de literales en el parser

SUMA: '+';
RESTA: '-';
MULT: '*';
DIV: '/';
//Ampliacion con el uso del modulo
MODULO: '%';
MENORIGUAL: '<=';
MENOR: '<';
MAYORIGUAL: '>=';
MAYOR: '>';
IGUALDAD: '==';
NOIGUAL: '!=';
//Amplacion para incluir los operadores logicos
OP_AND: '&&';
OP_OR: '||';
OP_NOT:'!';
ASIG: '=';
PUNTOCOMA: ';';
COMA: ',';
PARENTESIS_ABRIR: '(';
PARENTESIS_CERRAR: ')';
CORCH_ABRIR: '[';
CORCH_CERRAR: ']';
LLAVES_ABRIR: '{';
LLAVES_CERRAR: '}';

/*
Regla del comentario, solo pueden usar la estructura del comentario multilinea
aunque sea solo de una, utilizamos el video sobre comentarios y adaptamos el codigo
*/

COMENTARIOABRIR: '/*'-> pushMode(COMENTARIO_MODE);

mode COMENTARIO_MODE;
COMENTARIOCERRAR: '*/'-> popMode;
TEXTOCOMENTARIO: .-> skip;

// Acordarse de salir del modo usando DEFAULT_MODE!!!
mode DEFAULT_MODE;

/*
Ultima regla de lexer debe ser una para saltarse los espacios en blanco, 
que pueden ser blancos, retornos de linea y tabulaciones
Los espacios en blanco se ignoran a menos que separen ids, num, etc.
*/

WS: [ \t\r\n]+ -> skip;



