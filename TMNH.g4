grammar TMNH;

prog: statement+;

statement
	: VARIABLE assign_op expr
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
	| 'and'
	| 'or'
	| 'not'
	;

VARIABLE
	: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER
	: [0-9]+('.'[0-9]+)?;
STRING  
	: '"' (~['"\r\n])* '"';
WHITESPACE
	: [ \n\r]+ -> skip;