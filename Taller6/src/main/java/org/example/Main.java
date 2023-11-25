package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //A
        //B
        Empresa cine = new Empresa();
        Sala4d sala4da = new Sala4d("Sala4D002","Sala Larcomar",30,40,"aire-max-300","vib-max-450");
        Salaregular salaregA = new Salaregular("SalaR002","Sala Chorrillos",20,25,1.05);
        cine.registrarsala(sala4da);
        cine.registrarsala(salaregA);

        System.out.println("Salas Registradas");
        List<Sala> salasregister = cine.getSalas();
        for (Sala s:salasregister){
            System.out.println(s);
        }
        //C
        Salafactory salafactory = new Salafactory();
        Sala salaregularc = salafactory.crearsala("Regular");
        Sala sala4dc = salafactory.crearsala("4D");
        cine.registrarsala(salaregularc);
        cine.registrarsala(sala4dc);
        System.out.println("Salas registras conm factory");
        salasregister=cine.getSalas();
        for (Sala sa:salasregister){
            System.out.println(sa);
        }
        //D
        System.out.println("Usuando la consola");
        Consola console = Consola.getInstance();
        console.listarsalas(salasregister);
    }

}
