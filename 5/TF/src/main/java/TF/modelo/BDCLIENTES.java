package TF.modelo;

import TF.Main;

import java.util.ArrayList;
import java.util.List;

public class BDCLIENTES {
    private List<CLIENTES> listaclientes;

public BDCLIENTES (){
    this.listaclientes=new ArrayList<>();
}

    public List<CLIENTES> getListaclientes() {
        return listaclientes;
    }

    public void RegistrarClientes( CLIENTES clientesvariable){
    listaclientes.add(clientesvariable);
    }

    public boolean Encontrar1 (){

    return true;

    }

}
