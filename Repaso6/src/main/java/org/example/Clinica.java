package org.example;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    public List<Mascotas> listamascotas;

    public Clinica() {
        listamascotas = new ArrayList<>();
    }

    public List<Mascotas> getListamascotas() {
        return listamascotas;
    }

    public void setListamascotas(List<Mascotas> listamascotas) {
        this.listamascotas = listamascotas;
    }
    public void registrarmascota(String documento, String nombre, double edad){
        Mascotas mascotas = new Mascotas(documento,nombre,edad);
        this.listamascotas.add(mascotas);
    }
//////Clase Mascota con la lista de visitas

    public Mascotas buscarmascosta (String documento){
        for (Mascotas y:listamascotas){
            if (y.getDocumento().equals(documento))
                return y;

        }
        return null;
    }

    public void asignarhistorial(String documento, HistorialMascota historialseleccionado){
        Mascotas mascotas = buscarmascosta(documento);
        mascotas.part1asignarhistorial(historialseleccionado);

    }



}
