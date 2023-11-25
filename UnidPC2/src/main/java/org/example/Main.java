package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //B) Clases Instituto,Alumno y Curso
    Instituto ints1 = new Instituto("Acme");
    Alumno al1 = new Alumno ("AU001","Jose Andres",26);
    Alumno al2 = new Alumno("AU002","Leon Santos",25);
    Alumno al3 = new Alumno("AU003","Edward Luis",24);
    al1.registrarcurso("C001","Ciencias",16,true);
    al2.registrarcurso("P001","Programacion",17,false);
    al3.registrarcurso("SB01","Base de Datos",17,false);
    ints1.asignaralumno("AU001");
    ints1.asignaralumno("AU002");
    ints1.asignaralumno("AU003");
    //C)Creación del objeto y clases
    System.out.println(al1);
    System.out.println(al2);
    System.out.println(al3);

}
}
