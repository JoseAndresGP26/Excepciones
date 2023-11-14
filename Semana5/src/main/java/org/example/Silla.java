package org.example;

public class Silla {
    private Pata[] patas;
    private int numpatas=0;

    public Silla() {
        patas = new Pata[4];
    }
    public void addpata(String color, float peso){
        patas[numpatas]=new Pata(color, peso);
        this.numpatas++;
    }

    public int getNumpatas() {
        return numpatas;
    }
}
