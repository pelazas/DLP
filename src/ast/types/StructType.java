package ast.types;

import ast.definitions.Definition;
import ast.errorhandler.ErrorHandler;
import semantic.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StructType extends AbstractType {

    private List<StructFieldType> structFields;
    public StructType(int line, int column, List<StructFieldType> structFields) {
        super(line, column);
        this.structFields = structFields;
        if(isDuplicated()){
            new ErrorType(line, column, "Duplicated fields in struct");
        }

    }

    private boolean isDuplicated(){
        for(int i = 0; i<structFields.size(); i++){
            StructFieldType type = structFields.get(i);
            for(int j = 0; j<structFields.size(); j++){
                if(structFields.get(j).getName().equals(type.getName()) && i!=j){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int getFieldOffset(String name){
        for(StructFieldType field: structFields){
            if(field.getName().equals(name)){
                return field.getOffset();
            }
        }
        assert false;
        return 0;
    }

    public List<StructFieldType> getStructFields(){
        return new ArrayList<>(structFields);
    }

    @Override
    public Type dot(String name, int line, int column) {
        for (StructFieldType structField : structFields) {
            if (structField.getName().equals(name)) {
                return structField.getType();
            }
        }
        return new ErrorType(line,column,
                "No struct field exists with name: "+name);
    }

    @Override
    public int getNumberOfBytes(){
        int counter = 0;
        for(StructFieldType sf: structFields){
            counter += sf.getNumberOfBytes();
        }
        return counter;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this,parameter);
    }

    @Override
    public String toString(){
        String structFieldsString = structFields.stream().map(structFieldType -> structFieldType.toString()).collect(Collectors.joining(", "));

        return "record("+ structFieldsString +")";
    }
}
