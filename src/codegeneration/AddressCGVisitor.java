package codegeneration;

import ast.definitions.VariableDefinition;
import ast.expressions.Variable;
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
}