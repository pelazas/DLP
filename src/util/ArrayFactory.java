package util;

import ast.types.ArrayType;
import ast.types.Type;

public class ArrayFactory {
    public static ArrayType createArray(Type type, int size) {
        // we have to go from left to right, instead of right to left
        if (type instanceof ArrayType) {
            var array = (ArrayType) type;
            array.setType(createArray(array.getType(), size));
            return array;
        } else
            return new ArrayType(type.getLine(), type.getColumn(), size, type);
    }


}
