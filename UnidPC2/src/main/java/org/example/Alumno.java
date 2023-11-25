package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String alucodigo;
    private String  nombres;
    private int edad;
    List<Curso> listacursos;

    public Alumno(String alucodigo, String nombres, int edad) {
        this.alucodigo = alucodigo;
        this.nombres = nombres;
        this.edad = edad;
        this.listacursos = new ArrayList<>();
    }

    public String getAlucodigo() {
        return alucodigo;
    }

    public void setAlucodigo(String alucodigo) {
        this.alucodigo = alucodigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Curso> getListacursos() {
        return listacursos;
    }

    public void setListacursos(List<Curso> listacursos) {
        this.listacursos = listacursos;
    }
    public void registrarcurso(String codigo,String nombre,int notafinal, boolean es_electivo){
        Curso curso1 = new Curso(codigo, nombre, notafinal, es_electivo);
        this.listacursos.add(curso1);
    }
    public Curso buscarcurso (String codigo){
        for (Curso y:listacursos){
            if (y.getCodigo().equals(codigo))
                return y;

        }
        return null;
    }


    public void asignarcurso(String codigo){
        Curso cursos = buscarcurso(codigo);
}


    @Override
    public String toString() {
        return "Alumno{" +
                "alucodigo='" + alucodigo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", edad=" + edad +
                ", listacursos=" + listacursos +
                '}';
    }
}
