parser grammar CminusParser;

options{
    tokenVocab= CminusLexer;
    language= Java;
}

program: declaration_list;

declaration_list: (comentario | declaration)+;

declaration: var_declaration | fun_declaration;

comentario: COMENTARIOABRIR COMENTARIOCERRAR;

var_declaration: (type_specifier ID PUNTOCOMA )| 
                (type_specifier ID CORCH_ABRIR NUM CORCH_CERRAR PUNTOCOMA);

// Ampliación: tipos char y bool
type_specifier: INT | VOID | CHAR_TIPO | BOOL;

fun_declaration: type_specifier ID PARENTESIS_ABRIR params PARENTESIS_CERRAR compound_stmt;

params: param_list | VOID;

param_list: param (COMA param)*;

param: (type_specifier ID) | (type_specifier ID CORCH_ABRIR CORCH_CERRAR);

compound_stmt: LLAVES_ABRIR local_declarations statement_list LLAVES_CERRAR;

local_declarations: var_declaration*;

statement_list: statement*;

statement: expression_stmt | compound_stmt | selection_stmt | while_stmt | return_stmt | for_stmt;

expression_stmt: (expression PUNTOCOMA) | PUNTOCOMA;

selection_stmt: IF PARENTESIS_ABRIR expression PARENTESIS_CERRAR statement (ELSE statement)?;

// Ampliación: bucle for
while_stmt: WHILE PARENTESIS_ABRIR expression PARENTESIS_CERRAR 
                ((LLAVES_ABRIR statement LLAVES_CERRAR) | statement);

for_stmt: FOR PARENTESIS_ABRIR condiciones_for_stmt PARENTESIS_CERRAR
            ((LLAVES_ABRIR statement LLAVES_CERRAR) | statement);

condiciones_for_stmt: var ASIG expression PUNTOCOMA var relop expression PUNTOCOMA var ASIG expression;

return_stmt: (RETURN PUNTOCOMA) | (RETURN (expression | call) PUNTOCOMA);

expression: (var ASIG expression) | simple_expression;

var: ID | (ID CORCH_ABRIR expression CORCH_CERRAR);

// Sin paréntesis solo se admite un operador relacional (especificación de C−)
simple_expression: add_expression (relop add_expression)?;

// Ampliación: && y || con la misma prioridad que los operadores de comparación
relop: MAYOR | MAYORIGUAL | MENOR | MENORIGUAL | IGUALDAD | NOIGUAL | OP_AND | OP_OR;

add_expression: term (addop term)*;

addop: SUMA | RESTA;

term: factor(mulop factor)*;

// Ampliación: módulo (%), con la misma prioridad que * y /
mulop: MULT | DIV | MODULO;

// Ampliación: menos unario y operador lógico !
factor: RESTA factor | OP_NOT? ((PARENTESIS_ABRIR expression PARENTESIS_CERRAR) | var | call | NUM | TRUE | CHAR | FALSE);

call: (ID |INPUT | OUTPUT) PARENTESIS_ABRIR args PARENTESIS_CERRAR;

args: arg_list?;

arg_list: expression (COMA expression)*;
