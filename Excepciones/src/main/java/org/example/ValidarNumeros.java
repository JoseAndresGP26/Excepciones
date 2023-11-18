package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {

                System.out.println("Ingresar un numero");
                int input = sc.nextInt();
                System.out.println("Numero ingresado es: " + input);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Haz ingresado una letra o valor diferente a un numero");
                sc.next();
            }
        }
    }
}
