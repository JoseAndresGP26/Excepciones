package org.example;

import javax.print.DocFlavor;

public class Salafactory {
    public Sala crearsala(String tipo, String...args){
        if (tipo.equals("Regular")){
            return new Salaregular("SR001","SalaReg1",50,20,0.5);
        } else if (tipo.equals("4D")) {
            return new Sala4d("S4D001","Sala4D1",30,50,"aire-max-300","vib-max-450");

        }
            return null;
    }
}
