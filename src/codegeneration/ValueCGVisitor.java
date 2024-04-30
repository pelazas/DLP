package codegeneration;

import ast.expressions.*;
import ast.types.Type;
import util.CodeGenerator;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void>{
    public ValueCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    /*
    * value[[IntLiteral: expression1 -> INT_CONSTANT]] =
    *   <pushi > INT_CONSTANT
    */
    public Void visit(IntLiteral intLiteral, Void param){
        cg.addLineOfCode("pushi " + intLiteral.getValue());
        return null;
    }

    /*
    * value[[CharacterLiteral: expression1 -> CHAR_CONSTANT]] =
    *   <pushb > CHAR_CONSTANT
    */
    public Void visit(CharacterLiteral characterLiteral, Void param){
        cg.addLineOfCode("pushb " + (int) characterLiteral.getValue());
        return null;
    }

    /*
    * value[[DoubleLiteral: expression1 -> DOUBLE_CONSTANT]] =
    *   <pushf > DOUBLE_CONSTANT
    */
    public Void visit(DoubleLiteral doubleLiteral, Void param){
        cg.addLineOfCode("pushf " + doubleLiteral.getValue());
        return null;
    }

    /*
    * value[[Variable: expression1 -> ID]] =
    *   address[[expression1]]
    *   <loadi >
    */
    public Void visit(Variable variable, Void param){
        variable.accept(cg.getAddressCGVisitor(), param);
        cg.addLineOfCode("load" + variable.getType().suffix());
        return null;
    }

    /*
     * value[[Arithmetic: expression1 -> expression2 expression3]] =
     *   value[[expression2]]
     *   expression2.type.convertTo(expression1.type);
     *   value[[expression3]]
     *   expression3.type.convertTo(expression1.type);
     *   switch(expression1.operation) {
     *       case("+"):
     *           <add> expression1.type.suffix()
     *           break;
     *       case("-"):
     *           <sub> expression1.type.suffix()
     *           break;
     *       case("*"):
     *           <mul> expression1.type.suffix()
     *           break;
     *       case("/"):
     *           <div> expression1.type.suffix()
     *           break;
     *       default: assert false;
     *   }
     */
    public Void visit(Arithmetic arithmetic, Void param){
        Expression left = arithmetic.getLeft();
        Expression right = arithmetic.getRight();

        left.accept(cg.getValueCGVisitor(), param);
        cg.addLineOfCode(left.getType().convertTo(arithmetic.getType()));
        right.accept(cg.getValueCGVisitor(), param);
        cg.addLineOfCode(right.getType().convertTo(arithmetic.getType()));

        switch (arithmetic.getOperator()){
            case "+":
                cg.addLineOfCode("add" + arithmetic.getType().suffix());
                break;
            case "-":
                cg.addLineOfCode("sub" + arithmetic.getType().suffix());
                break;
            case "*":
                cg.addLineOfCode("mul" + arithmetic.getType().suffix());
                break;
            case "/":
                cg.addLineOfCode("div" + arithmetic.getType().suffix());
                break;
            default: assert false;
        }
        return null;
    }

    /*
     * value[[Comparison: expression1 -> expression2 expression3]] =
     *   Type superType = expression2.type.superType();
     *   value[[expression2]]
     *   expression2.type.convertTo(superType)
     *   value[[expression3]]
     *   expression3.type.convertTo(superType)
     *
     *   switch(expression1.operator) {
     *       case ">":
     *           <gt> superType.suffix()
     *           break;
     *       case "<":
     *           <lt> superTYpe.suffix()
     *           break;
     *       case ">=":
     *           <ge> superType.suffix()
     *           break;
     *       case "<=":
     *           <le> superType.suffix()
     *           break;
     *       case "==":
     *           <eq> superType.suffix()
     *           break;
     *       case "!=":
     *           <ne> superType.suffix()
     *           break;
     *   }
     */
    public Void visit(Comparison comparison, Void param){
        Type superType = comparison.getLeft().getType().superType();

        comparison.getLeft().accept(cg.getValueCGVisitor(), param);
        comparison.getLeft().getType().convertTo(superType);
        comparison.getRight().accept(cg.getValueCGVisitor(), param);
        comparison.getRight().getType().convertTo(superType);

        switch (comparison.getOperator()){
            case ">":
                cg.addLineOfCode("gt" + superType.suffix());
                break;
            case "<":
                cg.addLineOfCode("lt" + superType.suffix());
                break;
            case ">=":
                cg.addLineOfCode("ge" + superType.suffix());
                break;
            case "<=":
                cg.addLineOfCode("le" + superType.suffix());
                break;
            case "==":
                cg.addLineOfCode("eq" + superType.suffix());
                break;
            case "!=":
                cg.addLineOfCode("ne" + superType.suffix());
                break;
            default: assert false;
        }
        return null;
    }

    /*
     * value[[Logical: expression1 -> expression2 expression3]] =
     *   value[[expression2]]
     *   value[[expression3]]
     *	switch(expression1.operator) {
     *		case "&&": <and>
     *			break;
     *		case "||": <or>
     *			break;
     *		default: assert false;
     *	}
     */
    public Void visit(LogicalOperator logical, Void param){
        logical.getLeft().accept(cg.getValueCGVisitor(), param);
        logical.getRight().accept(cg.getValueCGVisitor(), param);
        switch(logical.getOperator()){
            case "&&":
                cg.addLineOfCode("and");
                break;
            case "||":
                cg.addLineOfCode("or");
                break;
            default: assert false;
        }
        return null;
    }

    /*
     * value[[Cast: expression1 -> type expression2]] =
     *   value[[expression2]]
     *   expression2.type.convertTo(type);
     */
    public Void visit(Cast cast, Void param){
        cast.getExpression().accept(cg.getValueCGVisitor(), param);
        cg.addLineOfCode(cast.getExpression().getType().convertTo(cast.getCastingType()));
        return null;
    }

    /*
     * value[[Modulus: expression1 -> expression2 expression3]] =
     *   Type superType = expression2.getType.superType()
     *   value[[expression2]]
     *   expression2.type.convertTo(superType)
     *   value[[expression3]]
     *   expression3.type.convertTo(superType)
     *	 <mod> superType.suffix()
     */
    public Void visit(Modulus modulus, Void param){
        Type superType = modulus.getLeft().getType().superType();

        modulus.getLeft().accept(cg.getValueCGVisitor(), param);
        modulus.getLeft().getType().convertTo(superType);

        modulus.getRight().accept(cg.getValueCGVisitor(), param);
        modulus.getRight().getType().convertTo(superType);

        cg.addLineOfCode("mod" + superType.suffix());
        return null;
    }

    /*
     * value[[UnaryNot: expression1 -> expression2]] =
     *   value[[expression2]]
     *   <not>
     */
    public Void visit(UnaryNot unaryNot, Void param){
        unaryNot.getExpression().accept(cg.getValueCGVisitor(), param);
        cg.addLineOfCode("not");
        return null;
    }

    /*
    * value[[Indexing: expression1 -> expression2 expression3]]
    *   address[[expression1]]
    *   <load> expression1.type.suffix()
    */
    public Void visit(Indexing indexing, Void param){
        indexing.getArray().accept(cg.getAddressCGVisitor(),param);
        cg.addLineOfCode("load"+indexing.getType().suffix());
        return null;
    }

    /*
    * value[[FieldAccess: expression1 -> expression2 ID]]
    *   address[[expression1]]
    *   <load> expression1.type.suffix()
    */
    public Void visit(FieldAccess fieldAccess, Void param){
        fieldAccess.getExpression().accept(cg.getAddressCGVisitor(), param);
        cg.addLineOfCode("load"+fieldAccess.getType().suffix());
        return null;
    }

    /*
    * value[[FunctionInvocation: expression1 -> expression2 expression3*]] =
    *   expression3.forEach(exp -> value[[exp]]);
    *   <call > expression2.name
    */
    public Void visit(FunctionInvocation functionInvocation, Void param){
        return null;
    }
}
