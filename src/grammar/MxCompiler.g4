grammar MxCompiler;

program : def EOF;
def : ((varDef ';') | funcDef | classDef)*;

varDef : typename assignment (',' assignment)* ;
assignment : ID ('=' expr)? ;

block : '{' statement* '}';

statement : exprstmt ';'
          | varDef ';'
          | if
          | BREAK ';'
          | CONTINUE ';'
          | while
          | for
          | ';'
          | block
          | return;

arg_list : '(' (expr (',' expr)*)? ')' | '()';

exprstmt : expr;

expr : expr '.' ID arg_list?                                        #MemberExpr
     | ID                                                           #AtomExpr
     | value                                                        #AtomExpr
     | NEW typeID ('[' expr ']')+ ('[' ']')*                        #AtomExpr
     | NEW typename ('()')?                                         #AtomExpr
     | '(' expr ')'                                                 #AtomExpr
     | ID arg_list                                                  #FuncExpr
     | expr ('[' expr ']')+                                         #ArrayExpr
     | expr ('++' | '--')                                           #SelfExpr
     | <assoc=right> ('++' | '--') expr                             #SelfExpr
     | <assoc=right> ('+' | '-') expr                               #SelfExpr
     | <assoc=right> ('!' | '~') expr                               #SelfExpr
     | expr op=('*' | '/' | '%') expr                               #BinaryExpr_int
     | expr op=('+' | '-') expr                                     #BinaryExpr_int_string
     | expr op=('<<' | '>>') expr                                   #BinaryExpr_int
     | expr op=('<' | '>' | '<=' | '>=') expr                       #BinaryExpr_all
     | expr op=('==' | '!=') expr                                   #BinaryExpr_all
     | expr op='&' expr                                             #BinaryExpr_int_bool
     | expr op='^' expr                                             #BinaryExpr_int_bool
     | expr op='|' expr                                             #BinaryExpr_int_bool
     | expr op='&&' expr                                            #BinaryExpr_bool
     | expr op='||' expr                                            #BinaryExpr_bool
     | <assoc=right> expr '=' expr                                  #AssignExpr
     | '[' '&'? ']' func_list? '->' block arg_list                  #LambdaExpr
     ;

value : INT | STRING | TRUE | FALSE | ID | THIS | NULL;
typeID : TINT | TSTRING | TBOOL | ID | VOID;
typename : typeID ('[' ']')*;

//function
return : RETURN expr? ';';
func_list : '(' (typename ID (',' typename ID)*)? ')' | '()';
funcDef : typename ID  func_list  block ;

//if
if : IF '(' expr ')' statement else?;
else :ELSE statement;

//loop
while : WHILE '(' expr  ')' statement;
for : FOR '(' (initvar = varDef | initexpr = expr)? ';' (conditionexpr = expr)? ';'  (stpexpr = expr)? ')' statement;

//class
classDef : CLASS ID '{' (varDef ';' | funcDef | (ID '()' block) )* '}' ';';

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
