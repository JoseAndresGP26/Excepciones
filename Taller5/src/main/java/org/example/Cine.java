package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private List<Sala> salas;
    public Cine(){
        this.salas= new ArrayList<>();
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void registrarsala(String codigo, Pelicula pelicula){
        Sala sala = new Sala(codigo,pelicula);
        salas.add(sala);
    }
    public Sala buscarsala(String codigo){
        for (Sala sala: salas){
            if (sala.getCodigo().equals(codigo)){
                return sala;
            }
        }return null;
    }
    public void asignarasientoasala(String codigo,int fila, String letra,String categoria)throws Exception{
        Sala sala = buscarsala(codigo);
        if (sala==null){
            throw new Exception("Sala no encontrada");
        }
        sala.registrarasiento(fila,letra,categoria);
    }
    public Sala obslmayorventaasiento4DX(){
        double maxventa=0;
        Sala maxsala=null;
        for (Sala sala:salas){
            if (sala.cuentaconasiento4DX()&&sala.obtenermontototal()>maxventa){
                maxventa=sala.obtenermontototal();
                maxsala=sala;
            }
        }return maxsala;
    }
}
