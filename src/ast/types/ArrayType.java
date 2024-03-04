package ast.types;

public class ArrayType extends AbstractType{

    private int size;
    private Type type;
    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }


    public void setType(Type t){
        this.type = t;
    }
    public Type getType(){
        return this.type;
    }
}
