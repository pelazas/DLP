package ast.types;

import semantic.visitor.Visitor;

public class StructFieldType extends AbstractType{
    private String name;
    private Type type;
    public StructFieldType(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public Type getType(){
        return this.type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
