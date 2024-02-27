grammar Cmm;	

@header {
    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;
}

// -------- program --------
program: ( definition )*
        ;
definition: varDefinition
        | returnType ID '(' (type ID (',' type ID)*)? ')' '{' funcBlock '}'
        ;
varDefinition: type ID (',' ID)* ';'
        ;
funcBlock: (varDefinition | statement)* ('return' expression ';')?
        ;

// -------- expression --------
expression returns [Expression ast]:
          ID { $ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text); }
        | INT_CONSTANT {$ast = new IntLiteral($ID.getLine(),$ID.getCharPositionInLine()+1, LexerHelper.lexemeToInt($ID.text)); }
        | DOUBLE_CONSTANT { $ast = new DoubleLiteral($ID.getLine(),$ID.getCharPositionInLine()+1, LexerHelper.lexemeToReal($DOUBLE_CONSTANT.text));}
        | CHAR_CONSTANT { $ast = new CharacterLiteral($ID.getLine(),$ID.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        | '(' e1=expression ')' { $ast = $e1.ast; }
        | e1=expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(), $ID.text, $e1.ast);}
        | e1=expression ('*'|'/'|'%') e2=expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast );}
        | e1=expression op=('+'|'-') e2=expression { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast );}
        | e1=expression op=('&&'|'||') e2=expression { $ast = new LogicalOperator($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast );}
        | e1=expression '[' e2=expression ']' { $ast = new Indexing($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
        | op='-' e1=expression { $ast = new UnaryMinus($op.getLine(), $op.getCharPositionInLine()+1,$e1.ast);}
        | op='!' e1=expression {$ast = new UnaryNot($op.getLine(), $op.getCharPositionInLine()+1, $e1.ast);}
        | e1=expression op=('>'|'>='|'=='|'<='|'<'|'!=') e2=expression {$ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast);}
        | ID '(' arguments ')' {$ast =
            new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $params.ast, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text));}
        | lp='(' t1=builtInType ')' e1=expression {$ast = new Cast($lp.getLine(), $lp.getCharPositionInLine()+1,$e1.ast,$t1.ast);}
        ;

// -------- statement --------
statement returns [Statement ast]:
         if='if' '(' e1=expression ')' b1=block {$ast = new IfElse($if.getLine(), $if.getCharPositionInLine()+1, $e1.ast, $b1.ast);}
            ('else' b2=block {((IfElse) $ast).setElseBlock($b2.ast);})?
        | ID '(' arguments ')' ';' {$ast =
            new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $params.ast, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text));}
        | e1=expression '=' e2=expression ';' { $ast = new Assignment($e1.getLine(), $e1.getColumn(), $e1.ast, $e2.ast);}
        | w='write'  params  ';' //{ $ast = new Write($w.getLine(), $w.getCharPositionInLine()+1,);}
        | 'read'  params  ';'
        | 'while' '(' expression ')' block
        | 'return' expression ';'
        ;
params returns [List<Expression> ast = new ArrayList<>()]:
    (e1=expression {$ast.add($e1.ast);} (',' e2=expression {$ast.add($e2.ast);}  )*)
        ;
arguments: params // TODO: HACER ESTO
        |
        ;
block returns[List<Statement> ast = new ArrayList<>()]:
         (s1=statement {$ast.add($s1.ast);} )*
        | '{' (s1=statement {$ast.add($s1.ast);} )* '}'
        ;

// -------- type --------
type: builtInType'[' INT_CONSTANT ']'
        | 'struct' '{' (varDefinition  )* '}' ID
        | builtInType
        ;
builtInType returns[Type ast]:
             t1='char' {$ast = new CharacterType($t1.getLine(), $t1.getCharPositionInLine()+1);}
           | t1='int' {$ast = new IntegerType($t1.getLine(), $t1.getCharPositionInLine()+1);}
           | t1='double' {$ast = new DoubleType($t1.getLine(), $t1.getCharPositionInLine()+1);}
           ;
returnType: builtInType|'void';

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
ONE_LINE_COMMENT: '//' .*? (NEW_LINE|EOF)
    ;
fragment
MULTIPLE_LINE_COMMENT:'/''*' .*? '*''/' (NEW_LINE|EOF)
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
    | '\'\\n\''
    | '\'\\t\''
    ;
WS: (NEW_LINE|ONE_LINE_COMMENT|WHITE_SPACES|TABULAR|MULTIPLE_LINE_COMMENT)+ -> skip
    ;
