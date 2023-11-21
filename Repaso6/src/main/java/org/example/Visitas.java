package org.example;

public class Visitas {
    private String fecha;
    private String motivo;
    private double monto;

    public Visitas(String fecha, String motivo, double monto) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Visitas{" +
                "fecha='" + fecha + '\'' +
                ", motivo='" + motivo + '\'' +
                ", monto=" + monto +
                '}';
    }
}
