package ast.types;

import ast.definitions.VariableDefinition;

import java.util.List;

public class FunctionType extends AbstractType{

    private Type returnType;
    private List<VariableDefinition> variableDefinitions;
    public FunctionType(int line, int column, Type returnType, List<VariableDefinition> variableDefinitions) {
        super(line, column);
        this.returnType = returnType;
        this.variableDefinitions = variableDefinitions;
    }
}
