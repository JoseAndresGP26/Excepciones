package org.example;

public class Mascotas {
    private String documento;
    private String nombre;
    private double edad;

    public Mascotas(String documento, String nombre, double edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    private HistorialMascota historialseleccionado;

    public Mascotas(HistorialMascota historialseleccionado) {
        this.historialseleccionado = historialseleccionado;
    }

    public HistorialMascota getHistorialseleccionado() {
        return historialseleccionado;
    }

    public void setHistorialseleccionado(HistorialMascota historialseleccionado) {
        this.historialseleccionado = historialseleccionado;
    }
    public void part1asignarhistorial(HistorialMascota historialseleccionado){
        this.historialseleccionado=historialseleccionado;
    }
    public String obtenerprioridad(){
        if (historialseleccionado.calcularmontototal()>3000){
            return "Alta";
        } else if (historialseleccionado.calcularmontototal()>=1000&& historialseleccionado.calcularmontototal()<=3000) {
            return "Media";
        }else {
            return "Baja";
        }
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", historialseleccionado=" + historialseleccionado +
                ", prioridad de "+obtenerprioridad()+
                '}';
    }
}
