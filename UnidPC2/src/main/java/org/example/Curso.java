package org.example;

public class Curso {
    private String codigo;
    private String nombre;
    private int notafinal;
    private boolean es_electivo;

    public Curso(String codigo, String nombre, int notafinal, boolean es_electivo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notafinal = notafinal;
        this.es_electivo = es_electivo;
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

    public int getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }

    public boolean isEs_electivo() {
        return es_electivo;
    }

    public void setEs_electivo(boolean es_electivo) {
        this.es_electivo = es_electivo;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", notafinal=" + notafinal +
                ", es_electivo=" + es_electivo +
                '}';
    }
}
