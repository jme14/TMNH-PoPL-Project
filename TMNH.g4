grammar TMNH;

// program start 'prog'
prog: expr (NEWLINE | expr | TAB NEWLINE)* EOF; // removed 'line', too complicated with in-line comments & loops, so reworked this

// upper logic
expr
    : assignment
    | block
    ;

block: (if_else_block | for_loop | while_loop);

arithmetic
    : LEFT_PARENTHESIS arithmetic RIGHT_PARENTHESIS
    | '-' arithmetic
    | arithmetic (MULTIPLY | DIVIDE | MOD) arithmetic+
    | arithmetic (PLUS | MINUS) arithmetic+
    | NUMBER
    | variable
    ;

// assignments; reworked this, also had issues w/ comments
assignment: variable assign_op (variable | arithmetic | array | string);

// loops
for_loop: FOR variable IN iterable COLON (NEWLINE TAB expr)+;
while_loop: WHILE condition_statement COLON (NEWLINE TAB expr)+;

// if-else blocks; old version broke within loops, so it's been completely reworked 
// also removed 'scoped_code' and 'expression' (redundant as well), added new 'conditions' 
if_else_block: if_statement (NEWLINE)* (TAB)* (else_statement | elif_statement | );
if_statement: IF condition_statement COLON (NEWLINE TAB expr)+;
elif_statement: ELIF condition_statement COLON (NEWLINE TAB expr)+ (NEWLINE else_statement | NEWLINE elif_statement | );
else_statement: ELSE COLON (NEWLINE TAB expr)+;
condition
    : variable conditional_op variable
    | NOT variable
    | char
    | LEFT_PARENTHESIS condition RIGHT_PARENTHESIS
    ;
condition_statement: condition ( AND condition | OR condition)*;

// new variable / string definitions
variable
    : char
    | array
    | string
    ;
string: char (char)*; // redefined string to be simpler (no explicit quote handling)
char: (NUMBER | TEXT_SEQUENCE);

// iterables
iterable
    : variable
    | range_expr
    | array
    | string
    ;
range_expr: RANGE LEFT_PARENTHESIS range_params RIGHT_PARENTHESIS;
range_params: char (COMMA char)*;

// arrays
array: LEFT_SQ_BRACKET (array_chars)* RIGHT_SQ_BRACKET; // combined lists into just 'arrays'
array_chars: (char COMMA | char);

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

// loop block reqs 
WHILE: 'while';
FOR: 'for';
IN: 'in';

// conditional block reqs
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
AND: 'and';
OR: 'or';
NOT: 'not';

// arithmetic operators
DIVIDE : '/';
MULTIPLY : '*';
MOD : '%';
PLUS : '+';
MINUS : '-';

// variables, numbers, strings, terms
RANGE: 'range';
NUMBER: [0-9]+('.'[0-9]+)?;
TEXT_SEQUENCE: [A-Za-z"._'0-9]+;

// syntax
TAB: ('    ')+ | ('\t')+; // added parenthesis to fix console errors
ESCAPE: [\r]+ -> skip; // removed previous EOL definition, split into escape & newline
NEWLINE: '\n';
WHITESPACE: [ ]+? -> skip;

COLON: ':';
COMMA: ',';
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
LEFT_SQ_BRACKET: '[';
RIGHT_SQ_BRACKET: ']';

// comments -> skips in tree generation
COMMENT: '#' ~[\r\n]* -> skip;
BLOCK_COMMENT: ('\'\'\'' .*? '\'\'\'' | '"""' .*? '"""') -> skip;
