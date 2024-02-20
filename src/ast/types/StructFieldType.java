package ast.types;

public class StructFieldType extends AbstractType{
    private String name;
    private Type type;
    public StructFieldType(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }
}
