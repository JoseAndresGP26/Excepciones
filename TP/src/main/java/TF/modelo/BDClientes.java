package TF.modelo;

import java.util.ArrayList;
import java.util.List;

public class BDClientes {
    private List<Clientes> listaclientes;

    public BDClientes (){
        this.listaclientes=new ArrayList<>();
    }

    public List<Clientes> getListaclientes() {
        return listaclientes;
    }

    public void RegistrarClientes( Clientes clientesvariable){
        listaclientes.add(clientesvariable);
    }

    public boolean Encontrar1 (){

        return true;
}
}
