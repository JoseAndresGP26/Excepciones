package org.example;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws
            EdadInvalidadException {
        if (edad<=0){
            throw new EdadInvalidadException("La edad no puede ser negativo");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}
