package ast.types;

import semantic.visitor.Visitor;

public class VoidType extends AbstractType{
    public VoidType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}