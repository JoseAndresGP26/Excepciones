package TF;


import TF.modelo.MainModelo;

import java.util.Scanner;
//Muestra la información que quieres mostrar, de la clase alumnos, la lista alumnos mostrará el código nombre y apellido
// si voy a hacer un sistema en donde.
// modelo ess  datos que voy a guaardar en base de datos
//controaldor ess es la logica, los metodos
//vista ess  donde se genera el usuario

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int select = -1;
    public static void main(String[] args) {
        // Crear un programa que permita hacer las 4 operaciones básicas

        System.out.printf("Elija una opción para hacer \n 1. Mostrar todos los clientes de la lista" +  //operar facturas
                "\n 2. Buscar todos los proyectos de un producto   \n" +                                 //Ingresar nuevo cliente
                " 3.Cambiar nombre a cliente\n " +                                // Cambiar nombre usuario
                "4. Buscar cliente y factura por RUC \n" +                                   //BUscar cliente
                "5. Buscar ventra máxima \n" +                                  //BUscar venta maxima
                "0.Salir\n");
        /// obtener la variable pro consola
        select = Integer.parseInt(sc.nextLine());
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