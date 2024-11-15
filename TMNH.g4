grammar TMNH;

prog: statement+;

statement
	: VARIABLE assign_op expr
	| array
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
	;	

array
	: VARIABLE assign_op '[' list ']';

list
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
	| 'and'
	| 'or'
	| 'not'
	;

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