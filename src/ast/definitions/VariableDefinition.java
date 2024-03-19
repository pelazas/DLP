package ast.definitions;


import ast.types.Type;
import semantic.visitor.Visitor;

public class VariableDefinition extends AbstractDefinition {
    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
