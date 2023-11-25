package org.example;

import java.util.List;

public class Consola {
    private static Consola instance = new Consola();

    private Consola(){}

    public static Consola getInstance(){
        return instance;
    }
    public void listarsalas(List<Sala>salas){
        for (Sala s:salas){
            System.out.println(s);
        }
    }
}
