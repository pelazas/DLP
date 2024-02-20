package ast.types;

import java.util.List;

public class StructType extends AbstractType {

    private List<StructFieldType> structFields;
    public StructType(int line, int column, List<StructFieldType> structFields) {
        super(line, column);
        this.structFields = structFields;
    }
}
