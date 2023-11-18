package org.example;

public class EdadInvalidadException extends Exception{
    public EdadInvalidadException(){
        super("La edad ingresada es invalida debe ser un valor positivo");
    }
    public EdadInvalidadException(String message){
        super(message);
    }
}
