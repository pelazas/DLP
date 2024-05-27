package codegeneration;

import ast.definitions.VariableDefinition;
import ast.expressions.FieldAccess;
import ast.expressions.Indexing;
import ast.expressions.Variable;
import ast.types.StructType;
import util.CodeGenerator;


public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cg;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor){
        this.valueCGVisitor = valueCGVisitor;
    }

    /*
     * address[[Variable: expression1 -> ID]] =
     *   if(exp.definition.scope == 0)
     *      <pusha > exp.definition.offset
     *   else {
     *      <push bp>
     *      <pushi > exp.definition.offset
     *      <addi>
     *   }
     */
    @Override
    public Void visit(Variable variable, Void param){
        VariableDefinition definition = (VariableDefinition) variable.getDefinition();
        if(definition.getScope() == 0)
            cg.addLineOfCode("pusha " + definition.getOffset());
        else {
            cg.addLineOfCode("push bp");
            cg.addLineOfCode("pushi " + definition.getOffset());
            cg.addLineOfCode("addi");
        }
        return null;
    }

    /*
    * address[[Indexing: expression1 -> expression2 expression3]]
    *   address[[expression2]]
    *   value[[expression3]]
    *   <pushi > expression1.type.numberOfBytes()
    *   <muli>
    *   <addi>
    */
    @Override
    public Void visit(Indexing indexing, Void param){
        indexing.getArray().accept(this,param);
        indexing.getIndex().accept(this.valueCGVisitor, param);
        cg.addLineOfCode("pushi "+ indexing.getType().getNumberOfBytes());
        cg.addLineOfCode("muli");
        cg.addLineOfCode("addi");
        return null;
    }

    /*
     * address[[FieldAccess: expression1 -> expression2 ID]]
     *   address[[expression2]]
     *   <pushi > expression2.type.getFieldOffset(ID)
     *   <addi>
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param){
        fieldAccess.getExpression().accept(this, param);
        cg.addLineOfCode("pushi "+((StructType) fieldAccess.getExpression().getType()).getFieldOffset(fieldAccess.getName()));
        cg.addLineOfCode("addi");
        return null;
    }
}