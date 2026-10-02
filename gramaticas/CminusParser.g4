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

type_specifier: INT | VOID;

fun_declaration: type_specifier ID PARENTESIS_ABRIR params PARENTESIS_CERRAR compound_stmt;

params: param_list | VOID;

param_list: param (COMA param)*;

param: (type_specifier ID) | (type_specifier ID CORCH_ABRIR CORCH_CERRAR);

compound_stmt: LLAVES_ABRIR local_declarations statement_list LLAVES_CERRAR;

local_declarations: var_declaration*;

statement_list: statement*;

statement: expression_stmt | compound_stmt | selection_stmt | iteration_stmt | return_stmt;

expression_stmt: (expression PUNTOCOMA) | PUNTOCOMA;

selection_stmt: (IF PARENTESIS_ABRIR expression PARENTESIS_CERRAR statement) | 
                (IF PARENTESIS_ABRIR expression PARENTESIS_CERRAR statement ELSE statement);

iteration_stmt: WHILE PARENTESIS_ABRIR expression PARENTESIS_CERRAR statement;

//si se puede implementar la recursividad, como en el ejemplo 06 es necesario
// modificar esta linea para permitir return funcion(args) -> call
return_stmt: (RETURN PUNTOCOMA) | (RETURN (expression | call) PUNTOCOMA);

expression: (var ASIG expression) | simple_expression;

var: ID | (ID CORCH_ABRIR expression CORCH_CERRAR);

simple_expression: (add_expression relop add_expression) | add_expression;

relop: MAYOR | MAYORIGUAL | MENOR | MENORIGUAL | IGUALDAD | NOIGUAL;

add_expression: term (addop term)*;

addop: SUMA | RESTA;

term: factor(mulop factor)*;

mulop: MULT | DIV;

factor: (PARENTESIS_ABRIR expression PARENTESIS_CERRAR) | var | call | NUM;

call: (ID |INPUT | OUTPUT) PARENTESIS_ABRIR args PARENTESIS_CERRAR;

args: arg_list?;

arg_list: expression (COMA expression)*;
