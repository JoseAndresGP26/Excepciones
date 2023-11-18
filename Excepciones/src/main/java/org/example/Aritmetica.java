package org.example;

public class Aritmetica {
    public static int numerador = 10;
    public static int denominador =0;
    public static float division;

    public static void main(String[] args) {
        try {
            division = numerador / denominador;
        }catch (NullPointerException ex) {
            System.out.println("El denominador no debe ser nulo");

    }catch (ArithmeticException ex)

    {
        System.out.println("El denominador debe ser dirente de cero");
        division=2;
    }
        System.out.println(division);
    }

}
