package org.example;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.addcliente(new Cliente("Jimy"));
        tienda.addcliente(new Cliente("Jaime"));
        tienda.addcliente(new Cliente("Luis"));
        System.out.println(tienda.getNumcliente());
        Silla silla=new Silla();
        silla.addpata("Negro",10f);
        silla.addpata("Negro",10f);
        silla.addpata("Negro",10f);
        silla.addpata("Negro",10f);
        System.out.println(silla.getNumpatas());
    }
}