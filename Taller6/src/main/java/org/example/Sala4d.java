package org.example;

public class Sala4d extends Sala{
    private String modelosisaire;
    private String modelomotorvibracion;

    public Sala4d(String codigo, String nombre, int capacidad, double preciobase, String modelosisaire, String modelomotorvibracion) {
        super(codigo, nombre, capacidad, preciobase);
        this.modelosisaire = modelosisaire;
        this.modelomotorvibracion = modelomotorvibracion;
    }

    public String getModelosisaire() {
        return modelosisaire;
    }

    public void setModelosisaire(String modelosisaire) {
        this.modelosisaire = modelosisaire;
    }

    public String getModelomotorvibracion() {
        return modelomotorvibracion;
    }

    public void setModelomotorvibracion(String modelomotorvibracion) {
        this.modelomotorvibracion = modelomotorvibracion;
    }


    public double porcentajeadicional(){
        if (modelosisaire.equals("aire-max-300")){
            if (modelomotorvibracion.equals("vib-max-550")){
                return 0.25;
            }else if (modelomotorvibracion.equals("vib-max-450")) {
          return 0.22;
            } else if (modelomotorvibracion.equals("vib-reg-300")) {
              return 0.18;
            }
        } else if (modelosisaire.equals("aire-plus-250")) {
            if (modelomotorvibracion.equals("vib-max-550")){
                return 0.25;
            }else if (modelomotorvibracion.equals("vib-max-450")) {
                return 0.22;
            } else if (modelomotorvibracion.equals("vib-reg-300")) {
                return 0.18;
            }
        } else if (modelosisaire.equals("aire-reg-100")) {
            if (modelomotorvibracion.equals("vib-max-550")){
                return 0.10;
            }else if (modelomotorvibracion.equals("vib-max-450")) {
                return 0.08;
            } else if (modelomotorvibracion.equals("vib-reg-300")) {
                return 0.05;
            }
        }return 0;
    }
    @Override
    public double calcularprecio() {
        return getPreciobase()*(1+porcentajeadicional());
    }

    @Override
    public String toString() {
        return "Sala4d{" +
                "modelosisaire='" + modelosisaire + '\'' +
                ", modelomotorvibracion='" + modelomotorvibracion + '\'' +
                "Calcular Precio Sala4D = "+calcularprecio()+
                '}';
    }
}
