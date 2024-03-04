package util;

import ast.expressions.Arithmetic;
import ast.expressions.Expression;
import ast.expressions.Modulus;

public class OperationFactory {

    public static Expression createOperation(int line, int column, String operator, Expression left, Expression right){
        switch (operator){
            case "*", "/":
                return new Arithmetic(line, column, operator, left, right);
            case "%":
                return new Modulus(line, column, left, right);
        }
        return null;
    }
}
