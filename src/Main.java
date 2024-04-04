import ast.Program;
import ast.errorhandler.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import parser.*;

import org.antlr.v4.runtime.*;
import semantic.visitor.IdentificationVisitor;
import semantic.visitor.TypeCheckingVisitor;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }

		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);

		if(parser.getNumberOfSyntaxErrors()>0){
			return;
		}
		Program ast = parser.program().ast;

		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(), null);

		if(ErrorHandler.getInstance().anyErrors()){
			ErrorHandler.getInstance().showErrors(System.err);
			return;
		}
		IntrospectorModel model=new IntrospectorModel("Program", ast);
		new IntrospectorView("Introspector", model);
	}
	

}
