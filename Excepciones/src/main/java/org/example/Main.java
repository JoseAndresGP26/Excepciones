package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Persona objPer1 = new Persona("Luis", 30);
            Persona objPer2 = new Persona("Marcos", -1);
        } catch (EdadInvalidadException e) {
            System.out.println(e.getMessage());

        }

    }
}
