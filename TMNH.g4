grammar TMNH;

prog: statement;

statement
	: VARIABLE assign_op expr
	; 

expr
	: expr math_op expr 
	| STRING
	| NUMBER
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


VARIABLE
	: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER
	: [0-9]+;
STRING  
	: '"' (~['"\r\n])* '"';

