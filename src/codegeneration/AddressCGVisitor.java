package codegeneration;

import ast.definitions.VariableDefinition;
import ast.expressions.FieldAccess;
import ast.expressions.Indexing;
import ast.expressions.Variable;
import ast.types.StructType;
import util.CodeGenerator;


public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    public AddressCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    /*
     * address[[Variable: expression1 -> ID]] =
     *   <pusha > exp.definition.offset
     */
    @Override
    public Void visit(Variable variable, Void param){
        VariableDefinition definition = (VariableDefinition) variable.getDefinition();
        cg.addLineOfCode("pusha " + definition.getOffset());
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
        indexing.getArray().accept(cg.getAddressCGVisitor(),param);
        indexing.getIndex().accept(cg.getValueCGVisitor(), param);
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
        fieldAccess.getExpression().accept(cg.getAddressCGVisitor(), param);
        cg.addLineOfCode("pushi "+((StructType) fieldAccess.getExpression().getType()).getFieldOffset(fieldAccess.getName()));
        cg.addLineOfCode("addi");
        return null;
    }
}