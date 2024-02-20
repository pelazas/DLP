grammar Cmm;	

expression: ID
        | INT_CONSTANT
        | DOUBLE_CONSTANT
        | CHAR_CONSTANT
        | '(' expression ')'
        | expression '.' ID
        | expression ('*'|'/') expression
        | expression ('+'|'-') expression
        | expression ('&&'|'||') expression
        | expression '[' expression ']'
        | '-' expression
        | '!' expression
        | expression ('>'|'>='|'=='|'<='|'<'|'!=') expression
        | ID '(' params? ')'
        //| '(' type ')' expression
        ;

statement:'if' '(' expression ')' block ('else' block)?
        | ID '(' params? ')' ';'
        | expression '=' expression ';'
        | 'write' '(' params ')' ';'
        | 'read' '(' params ')' ';'
        | 'while' '(' expression ')' block
        | 'return' expression ';'
        ;

type: builtInType'[' INT_CONSTANT ']'
        | 'struct' '{' (varDefinition ';' )* '}' ID
        | builtInType
        ;
builtInType:'char'
           | 'int'
           | 'double'
           ;
returnType: builtInType|'void';

definition: varDefinition
        | returnType ID '(' (varDefinition (',' varDefinition)*)? ')' block
        ;

params:(expression (',' expression)*)
    ;

varDefinition: type ID
        ;

block: statement*
        | '{' statement* '}'
        ;


fragment
LETTER: [a-zA-Z]
    ;
fragment
DIGIT: [0-9]
    ;
fragment
SIGN: ('+'|'-')
    ;
fragment
WHITE_SPACES: ' '+
    ;
fragment
NEW_LINE: '\n' | '\r' | '\r' '\n'
    ;
fragment
ONE_LINE_COMMENT: '/''/' (.*)? (NEW_LINE|'EOF')
    ;
fragment
MULTIPLE_LINE_COMMENT:'/''*' (.*)? '*''/' (NEW_LINE|'EOF')
    ;
fragment
TABULAR: ('\t')
    ;

INT_CONSTANT: '0'
    | [1-9] DIGIT*
    ;
ID: (LETTER | '_') (LETTER | DIGIT | '_')*
    ;
DOUBLE_CONSTANT: DIGIT* '.' DIGIT* (('e'|'E') SIGN? INT_CONSTANT)?
    | INT_CONSTANT ('e'|'E') SIGN? INT_CONSTANT
    ;
CHAR_CONSTANT: '\'' . '\''
    | '\'' '\\' INT_CONSTANT '\''
    ;
WS: (NEW_LINE|ONE_LINE_COMMENT|WHITE_SPACES|TABULAR|MULTIPLE_LINE_COMMENT)+ -> skip
    ;
