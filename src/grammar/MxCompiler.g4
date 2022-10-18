grammar MxCompiler;

program : def EOF;
def : ((varDef ';') | funcDef | classDef)*;

varDef : typename assignment (',' assignment)* ;
assignment : ID ('=' expr)? ;

statement : expr ';'
          | varDef ';'
          | if
          | BREAK ';'
          | CONTINUE ';'
          | while
          | for
          | ';'
          | '{' statement* '}'
          | return;

arg_list : '(' (expr (',' expr)*)? ')' | '()';

expr : expr '.' ID arg_list?                                        #MemberExpr
     | ID                                                           #AtomExpr
     | value                                                        #AtomExpr
     | ID arg_list                                                  #FuncExpr
     | expr ('[' expr ']')+                                         #ArrayExpr
     | NEW typename                                                 #AtomExpr
     | '(' expr ')'                                                 #AtomExpr
     | expr ('++' | '--')                                           #SelfExpr
     | <assoc=right> ('++' | '--') expr                             #SelfExpr
     | <assoc=right> ('+' | '-') expr                               #SelfExpr
     | <assoc=right> ('!' | '~') expr                               #SelfExpr
     | <assoc=right> expr '=' expr                                  #AssignExpr
     | expr ('*' | '/' | '%') expr                                  #BinaryExpr
     | expr ('+' | '-') expr                                        #BinaryExpr
     | expr ('<<' | '>>') expr                                      #BinaryExpr
     | expr ('<' | '>' | '<=' | '>=') expr                          #BinaryExpr
     | expr ('==' | '!=') expr                                      #BinaryExpr
     | expr '&' expr                                                #BinaryExpr
     | expr '^' expr                                                #BinaryExpr
     | expr '|' expr                                                #BinaryExpr
     | expr '&&' expr                                               #BinaryExpr
     | expr '||' expr                                               #BinaryExpr
     | '[' '&'? ']' func_list? '->' '{' statement* '}' arg_list?    #LambdaExpr
     ;

value : INT | STRING | TRUE | FALSE | ID | THIS | NULL;
typename : (TINT | TSTRING | TBOOL | ID) ('[' value? ']')*;

//function
return : RETURN expr? ';';
func_list : '(' (typename ID (',' typename ID)*)? ')' | '()';
func_ret : typename ID  func_list  '{' statement* '}' ;
func_void : VOID ID func_list   '{' statement* '}' ;
funcDef : func_void | func_ret;

//if
if : IF '(' expr ')' statement else?;
else :ELSE statement;

//loop
while : WHILE '(' expr  ')' statement;
for : FOR '(' (varDef | expr)? ';' expr? ';'  expr? ')' statement;

//class
classDef : CLASS ID '{' (varDef ';' | funcDef | (ID '()' '{' statement* '}') )* '}' ';';

//----
NEW : 'new';
THIS : 'this';
CLASS : 'class';
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
NULL : 'null';

TRUE : 'true';
FALSE : 'false';

ID : START_LETTER LETTER*;
fragment LETTER : [0-9a-zA-Z] | '_';
fragment START_LETTER : [a-zA-Z] | '_';

INT : [1-9] [0-9]* | '0';

STRING : '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\';

LINE_IGNORE : '//' .*? [\n\r] -> skip;
BLOCK_IGNORE : '/*' .*? '*/' -> skip;
WS : [ \n\t\r]+ -> skip;

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';
CloseParen : '()';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
Minus : '-';
Mul : '*';
Div : '/';
Mod : '%';
PlusPlus : '++';
MinusMinus : '--';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';
