package ast.types;

import semantic.Visitor;

public class IntegerType extends AbstractType{
    public IntegerType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
