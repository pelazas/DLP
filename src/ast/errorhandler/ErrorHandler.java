package ast.errorhandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler errorHandler;
    private List<ErrorType> errorTypeList;

    private ErrorHandler(){
        errorTypeList = new ArrayList<>();
    }

    public static ErrorHandler getInstance() {
        if(errorHandler == null){
            errorHandler = new ErrorHandler();
        }
        return errorHandler;
    }

    public boolean anyErrors(){
        return this.errorTypeList.size()>0;
    }

    public void showErrors(PrintStream out){
        for(ErrorType e: errorTypeList){
            out.println(e.toString());
        }
    }

    public void addErrors(ErrorType err){
        this.errorTypeList.add(err);
    }
}
