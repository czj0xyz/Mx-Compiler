grammar MxCompiler;
@header {
    package antlr;
}

file : (func_ret|func_void)* func_main;
sentence : expr ';'
         | assignment ';'
         | if
         | BREAK ';'
         | CONTINUE ';'
         | while
         | for;
block : sentence | ';' | ('{' sentence* '}');

expr : expr '*' expr
     | expr '/' expr
     | expr '+' expr
     | expr '-' expr
     | '(' expr ')'
     | INT | ID;

assignment : announce '=' expr
           | ID '=' expr;
announce : typename ID;

//function
return_val : RETURN value ';';
return_void : RETURN ';';
func_main : TINT 'main()' '{' (sentence | return_val)* '}';
func_list : '(' announce (',' announce)* ')' | '()';
func_ret : typename ID  func_list  '{' (sentence | return_val)* '}' ;
func_void : VOID ID  func_list   '{' (sentence | return_void)* '}' ;
//if

if : IF '(' ((ID '=')? expr) ')' block else?;
else :ELSE block;
//loop
while : WHILE '(' ((ID '=')? expr)  ')' block;
for : FOR '(' assignment? ';' ((ID '=')? expr)? ';'  ((ID '=')? expr)? ')' block;


value : INT | STRING | TRUE | FALSE | ID;
typename : TINT | TSTRING | TBOOL | ID;

//----
WHILE : 'while';
FOR : 'for';
IF : 'if';
ELSE : 'else';
RETURN : 'return';
VOID : 'void';
BREAK : 'break';
CONTINUE : 'continue';

TINT : 'int';
TBOOL : 'bool';
TSTRING : 'string';


ID : START_LETTER LETTER*;
fragment LETTER : [0-9a-zA-Z] | '_';
fragment START_LETTER : [a-zA-Z] | '_';

INT : [1-9] [0-9]* | '0';

STRING : '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\';

LINE_INGORE : '//' .* [\n\r] -> skip;
WS : [ \n\t\r]+ -> skip;