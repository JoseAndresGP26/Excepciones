package TF.modelo;

import TF.controlador.PRELOSAPROYECTO;

import java.util.List;

public class MainModelo {

    static PRELOSAPROYECTO prelosa1 = new PRELOSAPROYECTO("Binda","VYVBRAVO","20695626545","965489638","Luis","Abelardo","Garnoza","General","Licitacion",3000,25,true,"liso",true,true);
    static PRELOSAPROYECTO prelosa2 = new PRELOSAPROYECTO("Smith","Lumen","20678626545","987964588","Juan","Alejo","Abelardo","General","Cerrada",1000,25,false,"corrugada",false,true);
    static PRELOSAPROYECTO prelosa3 = new PRELOSAPROYECTO("Vivan","EyC","20689865959","987967878","Virgilio","Almeyda","Lujan","General","Licitación",2500,20,false,"corrugada",false,false);




    public static void MostrarClientesTotales() {

        BDCLIENTES bdatos = new BDCLIENTES();

        bdatos.RegistrarClientes(prelosa1);
        bdatos.RegistrarClientes(prelosa2);
        bdatos.RegistrarClientes(prelosa3);
        List<CLIENTES> clienteslistados = bdatos.getListaclientes();
        for (CLIENTES p : clienteslistados) {
            System.out.println("Empresa:" + p.getNombreempresa() + " Proyecto: " + p.getNombreproyecto() + " Nombre del encargado de: " + p.getNombreencargado() + " con un precio total de " + p.CalcularPrecio());
        }


    }

    public static void BuscarProyectosProductos(){
    }

    public static void Cambiarnombrecliente(){
    }

    public static void BuscarfacturaRUC(){
    }
    public static void BuscarVentaMaxima(){
    }






}
