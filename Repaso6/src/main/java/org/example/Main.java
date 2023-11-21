package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clinica clinica1 = new Clinica();
        clinica1.registrarmascota("76507940", "Lazi",12);
        clinica1.registrarmascota("75640794", "Beto", 3);
        clinica1.registrarmascota("74796502","Blackie",1);
        HistorialMascota historia1 = new HistorialMascota("MC1");
        historia1.registrarvisita("25-Marzo","Control",300);
        historia1.registrarvisita("30-Octubre","Saneamiento",400);
        HistorialMascota historia2 = new HistorialMascota("MC2");
        historia2.registrarvisita("18-Noviembre","Visita",100);
        historia2.registrarvisita("26-Febrero","Control",200);
        HistorialMascota historia3 = new HistorialMascota("MC3");
        historia3.registrarvisita("15-Abril","Visita",800);
        historia3.registrarvisita("20-Diciembre","Control",600);
clinica1.asignarhistorial("76507940",historia1);
clinica1.asignarhistorial("75640794",historia2);
clinica1.asignarhistorial("74796502",historia3);
        System.out.println("Registrados");
        List<Mascotas> mascotasregistradas = clinica1.getListamascotas();
        for (Mascotas v:mascotasregistradas){
            System.out.println(v);
        }
    }
}
