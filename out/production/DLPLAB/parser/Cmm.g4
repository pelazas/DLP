grammar Cmm;	

@header {
    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;
    import util.*;
}

// -------- program --------
program returns [Program ast] locals [List<Definition> definitions = new ArrayList<>()]:
          ( v1=varDefinitions {$definitions.addAll($v1.ast);}
            | f1=funDefinition {$definitions.add($f1.ast);}
          )*
          m1=main EOF
          {
            $definitions.add($m1.ast);
            $ast = new Program(0, 0, $definitions);
          }
        ;

main returns [FuncDefinition ast]
        locals [VoidType t]:
        i='void' {$t = new VoidType($i.getLine(), $i.getCharPositionInLine()+1);} m='main' '(' ')' '{'fB=funcBlock'}'
            {$ast = new FuncDefinition($i.getLine(), $i.getCharPositionInLine()+1,
                new FunctionType($i.getLine(), $i.getCharPositionInLine()+1, $t, new ArrayList<>()),
                $m.text,
                $fB.ast.getVarDefinitions(),
                $fB.ast.getStatements()); }
        ;

funDefinition returns [FuncDefinition ast]:
        b1=returnType i1=ID '(' fP=funParams ')' '{' fB=funcBlock '}'
            {$ast = new FuncDefinition($b1.ast.getLine(), $b1.ast.getColumn(),
                                       new FunctionType($b1.ast.getLine(), $b1.ast.getColumn(), $b1.ast, $fP.ast),
                                       $i1.text,
                                       $fB.ast.getVarDefinitions(),
                                       $fB.ast.getStatements()); }
        ;
varDefinitions returns [List<Definition> ast = new ArrayList<>()]:
         t1=type i1=ID {$ast.add(new VariableDefinition($t1.ast.getLine(), $t1.ast.getColumn(), $t1.ast, $i1.text));}
                       (',' i2=ID {$ast.add(new VariableDefinition($t1.ast.getLine(), $t1.ast.getColumn(), $t1.ast, $i2.text));})* ';'
        ;
funcBlock returns [StmtVarDfnDTO ast]
    locals [List<VariableDefinition> variableDefinitions = new ArrayList<>(),
            List<Statement> statements = new ArrayList<>()]:
          (v1=varDefinitions {
            for(Definition v: $v1.ast){
                VariableDefinition var = (VariableDefinition) v;
                $variableDefinitions.add(var);
            }
          } )*
          (s1=statement {
            for(Statement stmt: $s1.ast){
                $statements.add(stmt);
            }
          } )*
          {$ast = new StmtVarDfnDTO($variableDefinitions, $statements);}
        ;

funParams returns [List<VariableDefinition> ast = new ArrayList<>()]:
        t1=type i1=ID {$ast.add(new VariableDefinition($t1.ast.getLine(), $t1.ast.getColumn(), $t1.ast, $i1.text));}
            (',' t2=type i2=ID {$ast.add(new VariableDefinition($t2.ast.getLine(), $t2.ast.getColumn(), $t2.ast, $i2.text));} )*
        |
        ;

// -------- expression --------
expression returns [Expression ast]:
          '(' e1=expression ')' { $ast = $e1.ast; }
        | e1=expression '[' e2=expression ']' { $ast = new Indexing($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
        | e1=expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(), $ID.text, $e1.ast);}
        | lp='(' t1=builtInType ')' e1=expression {$ast = new Cast($lp.getLine(), $lp.getCharPositionInLine()+1,$e1.ast,$t1.ast);}
        | op='-' e1=expression { $ast = new UnaryMinus($op.getLine(), $op.getCharPositionInLine()+1,$e1.ast);}
        | op='!' e1=expression {$ast = new UnaryNot($op.getLine(), $op.getCharPositionInLine()+1, $e1.ast);}
        | e1=expression op=('*'|'/'|'%') e2=expression {$ast = OperationFactory.createOperation($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast);}
        | e1=expression op=('+'|'-') e2=expression { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast );}
        | e1=expression op=('>'|'>='|'=='|'<='|'<'|'!=') e2=expression {$ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast);}
        | e1=expression op=('&&'|'||') e2=expression { $ast = new LogicalOperator($e1.ast.getLine(), $e1.ast.getColumn(), $op.text, $e1.ast, $e2.ast );}
        | ID '(' arguments ')' {$ast =
                    new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $arguments.ast, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text));}
        | i=INT_CONSTANT {$ast = new IntLiteral($i.getLine(),$i.getCharPositionInLine()+1, LexerHelper.lexemeToInt($i.text)); }
        | d=DOUBLE_CONSTANT { $ast = new DoubleLiteral($d.getLine(),$d.getCharPositionInLine()+1, LexerHelper.lexemeToReal($d.text));}
        | c=CHAR_CONSTANT { $ast = new CharacterLiteral($c.getLine(),$c.getCharPositionInLine()+1, LexerHelper.lexemeToChar($c.text));}
        | ID { $ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text); }
        ;

// -------- statement --------
statement returns [List<Statement> ast = new ArrayList<>()]:
         if='if' '(' e1=expression ')' b1=block {$ast.add(new IfElse($if.getLine(), $if.getCharPositionInLine()+1, $e1.ast, $b1.ast));}
            ('else' b2=block {((IfElse)$ast.get(0)).setElseBlock($b2.ast);})?
        | ID '(' arguments ')' ';' {$ast.add(new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $arguments.ast, new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text)));}
        | e1=expression '=' e2=expression ';' { $ast.add(new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast));}
        | w='write' params ';' {
            for(Expression e: $params.ast){
                $ast.add(new Write($w.getLine(), $w.getCharPositionInLine()+1, e));
            }
          }
        | r='read' params ';' {
            for(Expression e: $params.ast){
                $ast.add(new Read($r.getLine(), $r.getCharPositionInLine()+1,e));
            }
        }
        | w='while' '(' e1=expression ')' b1=block {$ast.add(new While($w.getLine(), $w.getCharPositionInLine()+1, $e1.ast, $b1.ast));}
        | r='return' e1=expression ';' {$ast.add(new Return($r.getLine(), $r.getCharPositionInLine()+1, $e1.ast));}
        ;
params returns [List<Expression> ast = new ArrayList<>()]:
    (e1=expression {$ast.add($e1.ast);} (',' e2=expression {$ast.add($e2.ast);}  )*)
        ;
arguments returns [List<Expression> ast = new ArrayList<>()]:
         p1=params {$ast = $p1.ast;}
        |
        ;
block returns[List<Statement> ast = new ArrayList<>()]:
         (s1=statement {$ast.addAll($s1.ast);} )*
        | '{' (s1=statement {$ast.addAll($s1.ast);} )* '}'
        ;

// -------- type --------
type returns[Type ast]:
         t1=type'[' i=INT_CONSTANT ']' {
            $ast = ArrayFactory.createArray($t1.ast, LexerHelper.lexemeToInt($i.text));
         }
        | s='struct' '{' sf=structFields  '}' {$ast = new StructType($s.getLine(), $s.getCharPositionInLine()+1,$sf.ast);}
        | b1=builtInType {$ast = $b1.ast;}
        ;
builtInType returns[Type ast]:
             t1='char' {$ast = new CharacterType($t1.getLine(), $t1.getCharPositionInLine()+1);}
           | t1='int' {$ast = new IntegerType($t1.getLine(), $t1.getCharPositionInLine()+1);}
           | t1='double' {$ast = new DoubleType($t1.getLine(), $t1.getCharPositionInLine()+1);}
           ;
returnType returns[Type ast]:
         b1=builtInType {$ast = $b1.ast;}
        | t1='void' {$ast = new VoidType($t1.getLine(), $t1.getCharPositionInLine()+1);}
        ;
structFields returns[List<StructFieldType> ast = new ArrayList<>()]:
        (t1=type n1=ID {$ast.add(new StructFieldType($t1.ast.getLine(), $t1.ast.getColumn(), $t1.ast, $n1.text));}
            (',' n2=ID {$ast.add(new StructFieldType($t1.ast.getLine(), $t1.ast.getColumn(), $t1.ast, $n2.text));}  )*';'  )*
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
