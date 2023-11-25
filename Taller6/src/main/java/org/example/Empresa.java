package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Sala> salas;

    public Empresa(){
        this.salas=new ArrayList<>();
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
    public void registrarsala(Sala sala){
        this.salas.add(sala);
    }
}
