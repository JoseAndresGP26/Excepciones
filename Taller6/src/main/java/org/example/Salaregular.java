package org.example;

public class Salaregular extends Sala{
    private double factorincremento;

    public Salaregular(String codigo, String nombre, int capacidad, double preciobase, double factorincremento) {
        super(codigo, nombre, capacidad, preciobase);
        this.factorincremento = factorincremento;
    }

    public double getFactorincremento() {
        return factorincremento;
    }

    public void setFactorincremento(double factorincremento) {
        this.factorincremento = factorincremento;
    }

    @Override
    public double calcularprecio() {
        return getPreciobase()*factorincremento;
    }

    @Override
    public String toString() {
        return "Salaregular{" +
                "factorincremento=" + factorincremento +
                "Precio Venta Sala Regular = "+calcularprecio()+
                '}';
    }
}
