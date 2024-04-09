package ast.types;

import semantic.visitor.Visitor;

public class StructFieldType extends AbstractType{
    private String name;
    private Type type;
    private int offset;
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

    public int getOffset(){
        return this.offset;
    }
    public void setOffset(int offset){
        this.offset = offset;
    }

    @Override
    public int getNumberOfBytes(){
        return type.getNumberOfBytes();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }
}
