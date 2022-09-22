grammar MxCompiler;
@header {
    package antlr;
}

file : sentence+;
sentence : expr ';';

expr : expr '*' expr
     | expr '/' expr
     | expr '+' expr
     | expr '-' expr
     | NAME '=' expr
     | INT | FLOAT | NAME;

INT : [1-9] [0-9]* | '0';

FLOAT : ([0-9]+) '.'
      | ([0-9]*) '.' ([0-9]+);

fragment LETTER : [0-9a-zA-Z] | '_';
fragment START_LETTER : [a-zA-Z] | '_';
NAME : START_LETTER LETTER* ;



LINE_INGORE : '//' .* [\n\r] -> skip;
WS : [ \n\t\r]+ -> skip;