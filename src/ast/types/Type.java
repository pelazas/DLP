package ast.types;

import ast.ASTNode;

import java.util.List;

public interface Type extends ASTNode {
    Type arithmetic(Type type, int line, int column);

    Type modulus(Type type, int line, int column);

    Type logical(Type type, int line, int column);

    Type comparison(Type type, int line, int column);

    Type unaryMinus(int line, int column);

    Type unaryNot(int line, int column);

    Type castTo(Type castingType, int line, int column);

    Type squareBrackets(Type type, int line, int column);

    Type parenthesis(List<Type> parameters, int line, int column);

    void mustBeAssignableTo(Type type, int line, int column);

    void mustBeReadable(int line, int column);

    void mustBeWriteable(int line, int column);

    void mustBeBoolean(int line, int column);

    void mustBeReturnable(Type returnType, int line, int column);

    Type dot(String name, int line, int column);
}
