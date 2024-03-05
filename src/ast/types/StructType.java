package ast.types;

import ast.errorhandler.ErrorHandler;

import java.util.List;

public class StructType extends AbstractType {

    private List<StructFieldType> structFields;
    public StructType(int line, int column, List<StructFieldType> structFields) {
        super(line, column);
        this.structFields = structFields;
        if(isDuplicated()){
            ErrorHandler.getInstance().addErrors(new ErrorType(line, column, "Duplicated fields in struct"));
        }

    }

    private boolean isDuplicated(){
        for(int i = 0; i<structFields.size(); i++){
            StructFieldType type = structFields.get(i);
            for(int j = 0; j<structFields.size(); j++){
                if(structFields.get(j).getName().equals(type.getName())){
                    return true;
                }
            }
        }
        return false;
    }
}
