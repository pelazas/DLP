package codegeneration;

/*
* value[[IntLiteral: expression1 -> INT_CONSTANT]] =
*   <pushi > INT_CONSTANT
*
* value[[CharacterLiteral: expression1 -> CHAR_CONSTANT]] =
*   <pushb > (int) CHAR_CONSTANT
*
* value[[DoubleLiteral: expression1 -> DOUBLE_CONSTANT]] =
*   <pushf > DOUBLE_CONSTANT
*
* value[[Variable: expression1 -> ID]] =
*   address[[expression1]]
*   <loadi >
*
* value[[Arithmetic: expression1 -> expression2 expression3]] =
*   value[[expression2]]
*   expression2.type.convertTo(expression1.type);
*   value[[expression3]]
*   expression3.type.convertTo(expression1.type);
*   switch(expression1.operation) {
*       case("+"):
*           <add> expression1.type.suffix()
*           break;
*       case("-"):
*           <sub> expression1.type.suffix()
*           break;
*       case("*"):
*           <mul> expression1.type.suffix()
*           break;
*       case("/"):
*           <div> expression1.type.suffix()
*           break;
*       default: assert false;
*   }
*
* value[[Comparison: expression1 -> expression2 expression3]] =
*   Type superType = expression2.type.superType(expression1.type);
*   value[[expression2]]
*   expression2.type.convertTo(superType)
*   value[[expression3]]
*   expression3.type.convertTo(superType)
*
*   switch(expression1.operator) {
*       case ">":
*           <gt> superType.suffix()
*           break;
*       case "<":
*           <lt> superTYpe.suffix()
*           break;
*       case ">=":
*           <ge> superType.suffix()
*           break;
*       case "<=":
*           <le> superType.suffix()
*           break;
*       case "==":
*           <eq> superType.suffix()
*           break;
*       case "!=":
*           <ne> superType.suffix()
*   }
*
* value[[Logical: expression1 -> expression2 expression3]] =
*   value[[expression2]]
*   value[[expression3]]
*	switch(expression1.operator) {
*		case "&&": <and>
*			break;
*		case "||": <or>
*			break;
*		default: assert false;
*	}
*
* value[[Cast: expression1 -> type expression2]] =
*   expression2.type.convertTo(type);
*
*/

public class ValueCGVisitor //extends AbstractCGVisitor<Void,Void>{
{
}
