package TF.vista;

import TF.modelo.MainModelo;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int select = -1;
    public static void main(String[] args) {
// Crear un programa que permita hacer las 4 operaciones básicas
        ///Nuevo Repositorio

        System.out.printf("Elija una opción para hacer: \n 1. Mostrar todos los clientes de la lista" +
                "\n 2. Buscar todos los proyectos de un producto   \n" +
                " 3. Cambiar nombre a cliente\n " +
                "4. Buscar cliente y factura por RUC \n" +
                " 5. Buscar venta máxima \n" +
                " 0.Salir\n");
        /// obtener la variable pro consola
        select =Integer.parseInt(sc.nextLine());
        switch (select) {
            case 1:
                MainModelo.MostrarClientesTotales();
                break;
            case 2:
                MainModelo.BuscarProyectosProductos();
                break;
            case 3:
                MainModelo.Cambiarnombrecliente();
                break;
            case 4:
                MainModelo.BuscarfacturaRUC();
                break;
            case 5:
                MainModelo.BuscarVentaMaxima();
                break;
            case 0:
                System.out.println("Adios");
            default:
                System.out.println("Opción no reconocida");
                break;
        }
    }

}