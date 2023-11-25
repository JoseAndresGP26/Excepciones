package org.example;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombreinst;
    List<Alumno>listalumnos;

    public Instituto(String nombreinst) {
        this.nombreinst = nombreinst;
        this.listalumnos = new ArrayList<>();
    }

    public String getNombreinst() {
        return nombreinst;
    }

    public void setNombreinst(String nombreinst) {
        this.nombreinst = nombreinst;
    }

    public List<Alumno> getListalumnos() {
        return listalumnos;
    }

    public void setListalumnos(List<Alumno> listalumnos) {
        this.listalumnos = listalumnos;
    }
    public void registraralumno(String alucodigo,String  nombres,int edad){
        Alumno alumno1 = new Alumno(alucodigo, nombres, edad);
        this.listalumnos.add(alumno1);
    }
    public Alumno buscaralumno (String alucodigo){
        for (Alumno y:listalumnos){
            if (y.getAlucodigo().equals(alucodigo))
                return y;

        }
        return null;
    }


    public void asignaralumno(String alucodigo){
        Alumno alumnos = buscaralumno(alucodigo);
}

    @Override
    public String toString() {
        return "Instituto{" +
                "nombreinst='" + nombreinst + '\'' +
                ", listalumnos=" + listalumnos +
                '}';
    }
}
