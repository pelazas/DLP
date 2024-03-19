package ast.types;

import ast.definitions.VariableDefinition;
import semantic.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{

    private Type returnType;
    private List<VariableDefinition> variableDefinitions;
    public FunctionType(int line, int column, Type returnType, List<VariableDefinition> variableDefinitions) {
        super(line, column);
        this.returnType = returnType;
        this.variableDefinitions = variableDefinitions;
    }

    public List<VariableDefinition> getVariableDefinitions(){
        return new ArrayList<>(variableDefinitions);
    }

    public Type getReturnType(){
        return this.returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
