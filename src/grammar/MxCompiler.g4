grammar MxCompiler;
@header {
    package antlr;
}

file : (func_ret|func_void)* func_main;
sentence : expr ';';

expr : expr '*' expr
     | expr '/' expr
     | expr '+' expr
     | expr '-' expr
     | ID '=' expr
     | INT | ID;

announce : TYPE_NAME ID;

func_main : 'int main()' '{' sentence* '}';
func_list : '(' announce (',' announce)* ')' | '()';
func_ret : TYPE_NAME ID  func_list  '{' sentence* '}' ;
func_void : 'void' ID  func_list   '{' sentence* '}' ;

TYPE_NAME :  'bool' | 'string' | TYPE_INT;
TYPE_INT : 'int';
INT : [1-9] [0-9]* | '0';

fragment LETTER : [0-9a-zA-Z] | '_';
fragment START_LETTER : [a-zA-Z] | '_';
ID : START_LETTER LETTER* ;




LINE_INGORE : '//' .* [\n\r] -> skip;
WS : [ \n\t\r]+ -> skip;