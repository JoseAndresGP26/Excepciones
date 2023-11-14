package org.example;

public class Tienda {
    private Cliente[] clientes = new Cliente[3];
    private int numcliente=0;

    //a. Obetener la cantidad de clientes.
    public void addcliente(Cliente cliente){
        clientes[numcliente]=cliente;
        this.numcliente++;
    }

    public int getNumcliente() {
        return numcliente;
    }
}
