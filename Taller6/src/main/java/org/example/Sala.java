package org.example;

public abstract class Sala {
    private String codigo;
    private String nombre;
    private int capacidad;
    private double preciobase;

    public Sala(String codigo, String nombre, int capacidad, double preciobase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.preciobase = preciobase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }
    public abstract double calcularprecio();
    public double calcularventatotal(){
        return calcularprecio()*capacidad;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", preciobase=" + preciobase +
                ", Calcular Precio =" + calcularprecio()+
                "Calcular Venta Total = "+calcularventatotal()+
                '}';
    }
}
