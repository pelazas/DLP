package ast.types;

import ast.definitions.VariableDefinition;
import semantic.Visitor;

import java.util.List;

public class FunctionType extends AbstractType{

    private Type returnType;
    private List<VariableDefinition> variableDefinitions;
    public FunctionType(int line, int column, Type returnType, List<VariableDefinition> variableDefinitions) {
        super(line, column);
        this.returnType = returnType;
        this.variableDefinitions = variableDefinitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
