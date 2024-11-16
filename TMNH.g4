grammar TMNH;

// program start 'prog'
prog: (block | line)* EOF; // deliverables are either a block or a line of code !!

// upper logic
block: if_else_block;

if_else_block: if_statement ((TAB+)* elif_statement)* ((TAB+)* else_statement)?;

line: statement? EOL;

statement
	: arithmetic
    | assignment
	| array
	; 

assignment: VARIABLE assign_op expr;

arithmetic
    : '(' arithmetic ')'
    | '-' arithmetic
    | arithmetic (MULTIPLY | DIVIDE | MOD) arithmetic+
    | arithmetic (PLUS | MINUS) arithmetic+
    | NUMBER
    | VARIABLE
    ;

expr
    : expr conditional_op expr
    | arithmetic
	| STRING
	| array
	;	

// lower logic
array: VARIABLE assign_op '[' list ']';
list: expr (',' expr)*;

// general operators
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

// handle if block logic
expression: '('? ('not')? (expr (conditional_op expr)*) ')'? (('and'|'or') '('? expression ')'?)*;
scoped_code: ((TAB+)(block|line))+;
if_statement
    : ((IF expression (':')) EOL 
    | (IF ('(') expression ('):')) EOL) scoped_code
    ;
elif_statement
    : ((ELIF expression (':')) EOL 
    | (ELIF ('(') expression ('):')) EOL) scoped_code
    ;
else_statement: ELSE COLON EOL scoped_code;

// conditional block reqs
IF: 'if';
ELSE: 'else';
ELIF: 'elif';

// arithmetic operators
DIVIDE : '/';
MULTIPLY : '*';
MOD : '%';
PLUS : '+';
MINUS : '-';

// variables, numbers, strings
NUMBER: [0-9]+('.'[0-9]+)?;
VARIABLE: [a-zA-Z_][a-zA-Z_0-9]*;
STRING
    :   '"' (~['"\r\n])* '"'   // double quotes
    |   '\'' (~['\r\n])* '\''   // single quotes
    ;

//syntax
TAB: '    ' | '\t';
EOL: [\n\r]+;
COLON: ':';
WHITESPACE: [ ]+? -> skip;

