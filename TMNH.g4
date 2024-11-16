grammar TMNH;

prog: statement+;

statement
    : VARIABLE assign_op expr NEWLINE
    | array NEWLINE
    | conditional NEWLINE
    | function_def NEWLINE
    | function_call NEWLINE
    ;

arithmetic
    : VARIABLE assign_op expr math_op expr
    | VARIABLE assign_op expr math_op VARIABLE
    | VARIABLE assign_op expr
    ;

expr
    : expr math_op expr 
    | STRING
    | NUMBER
    | VARIABLE
    | array
    | function_call
    ;

array
    : VARIABLE assign_op '[' list ']';

list
    : expr (',' expr)*;

conditional
    : IF condition* COLON NEWLINE WHITESPACE block
    | IF '(' condition* ')' COLON NEWLINE WHITESPACE block
      (ELIF condition* COLON NEWLINE WHITESPACE block)*
      (ELSE COLON NEWLINE WHITESPACE block)?
    ;

block
    : statement+;

condition
    : condition AND condition
    | condition OR condition
    | NOT condition
    | expr conditional_op expr
    ;

function_def
    : VARIABLE '(' parameters? ')' COLON NEWLINE
    ;

parameters
    : VARIABLE (',' VARIABLE)*;

function_call
    : VARIABLE '(' arguments? ')' NEWLINE
    ;

arguments
    : expr (',' expr)*;

math_op
    : '+'
    | '-'
    | '*'
    | '/'
    | '%'
    ;

assign_op
    : '+='
    | '-='
    | '*='
    | '/='
    | '='
    ;

conditional_op
    : '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    ;

IF
    : 'if'
    ;
ELIF
    : 'elif'
    ;
ELSE
    : 'else'
    ;

AND
    : 'and';
OR
    : 'or';
NOT
    : 'not';

VARIABLE
    : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER
    : [0-9]+('.'[0-9]+)?;
STRING
    :   '"' (~['"\r\n])* '"'   // double quotes
    |   '\'' (~['\r\n])* '\''   // single quotes
    ;
COLON
    : ':';
NEWLINE
    : '\r'? '\n';

INDENT
    : [ \t]+ -> channel(HIDDEN);

DEDENT
    : [ \t]+ -> channel(HIDDEN);

WHITESPACE
    : [ \t\r]+ -> channel(HIDDEN);
