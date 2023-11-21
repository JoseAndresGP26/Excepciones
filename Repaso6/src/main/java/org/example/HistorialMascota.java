package org.example;

import java.util.ArrayList;
import java.util.List;

public class HistorialMascota {
    private String codigo;
    public List<Visitas> listasvisitas;

    public HistorialMascota(String codigo) {
        this.codigo = codigo;
        listasvisitas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Visitas> getListasvisitas() {
        return listasvisitas;
    }

    public void setListasvisitas(List<Visitas> listasvisitas) {
        this.listasvisitas = listasvisitas;
    }
    public void registrarvisita(String fecha, String motivo, double monto){
        Visitas visita1 = new Visitas(fecha, motivo, monto);
        listasvisitas.add(visita1);

    }

    public double calcularmontototal() {
        double montototal=0;
        for (Visitas v:listasvisitas){
            montototal = montototal + v.getMonto();
        }
       return montototal;
    }

    @Override
    public String toString() {
        return "HistorialMascota{" +
                "codigo='" + codigo + '\'' +
                ", listasvisitas=" + listasvisitas +
                ", montototal= "+calcularmontototal()+
                '}';
    }
}
