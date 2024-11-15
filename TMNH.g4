grammar TMNH;

prog: statement+;

statement
	: VARIABLE assign_op expr SEMICOLON
	| array SEMICOLON
    | logical_expr SEMICOLON
	| conditional
	| function_def
	| function_call SEMICOLON
	; 

arithmetic
	: VARIABLE assign_op expr math_op expr
	| VARIABLE assign_op expr math_op VARIABLE
	| VARIABLE assign_op expr
	;

logical_expr
    : expr AND expr
    | expr OR expr
    | NOT expr
    ;

expr
	: expr math_op expr 
	| STRING
	| NUMBER
	| VARIABLE
	| array
	| function_call
    | logical_expr
	;	

array
	: VARIABLE assign_op '[' list ']';

list
	: expr (',' expr)*;

conditional
    : IF '(' logical_expr ')' block (ELIF '(' logical_expr ')' block)* (ELSE block)?
    ;


condition
	: expr conditional_op expr
	| NOT expr
	| expr AND expr
	| expr OR expr
	;

function_def
	: VARIABLE '(' parameters? ')' block
	;

parameters
	: VARIABLE (',' VARIABLE)*
	;

function_call
	: VARIABLE '(' arguments? ')'
	;

arguments
	: expr (',' expr)*;

block
    : '{' statement* '}'
    ;

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

SEMICOLON
    : ';';
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
WHITESPACE
	: [ \n\r]+ -> skip;
	

IF
	:'if'
	;
ELIF
	:'elif'
	;
ELSE
	:'else'
	;