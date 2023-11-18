package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String codigo;
    private List<Asiento> asientos;
    private Pelicula pelicula;

    public Sala(String codigo, Pelicula pelicula) {
        this.codigo = codigo;
        this.asientos = new ArrayList<>();
        this.pelicula = pelicula;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    public void registrarasiento(int fila, String letra, String categoria){
        Asiento asiento= new Asiento(fila,letra,categoria);
        asientos.add(asiento);
    }
    public double obtenermontototal(){
        double sumatotal=0;
        for (Asiento asiento:asientos){
            sumatotal+=asiento.obtenerprecio();
        }
        return sumatotal;
    }
    public boolean cuentaconasiento4DX(){
        for (Asiento asiento: asientos){
            if (asiento.getCategoria().equals("4DX")){
                return true;
            }

        }return false;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigo='" + codigo + '\'' +
                ", asientos=" + asientos +
                ", pelicula=" + pelicula +
                ", montototal= "+ obtenermontototal()+
                ", existe asiento 4DX: "+cuentaconasiento4DX()+
                '}';
    }
}
