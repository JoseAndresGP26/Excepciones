package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //A
        //B
        Cine cine   =new Cine();
        Pelicula PeliculaA= new Pelicula("Toy Store");
        cine.registrarsala("S001",PeliculaA);
        try {
            cine.asignarasientoasala("COD001",1,"A","4DX");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        List<Sala> salasregistradas = cine.getSalas();
        for (Sala sala:salasregistradas){
            System.out.println(sala);
        }
        //C
        Sala salaMayorVenta=cine.obslmayorventaasiento4DX();
        System.out.println("La sala con mayor venta de al menos un asiento 4DX"+salaMayorVenta);
        //D
        try {
            cine.asignarasientoasala("123456",3,"C","Regular");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
