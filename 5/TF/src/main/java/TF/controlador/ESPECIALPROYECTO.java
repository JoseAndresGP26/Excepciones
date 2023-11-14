package TF.controlador;

import TF.modelo.CLIENTES;

public class ESPECIALPROYECTO  extends CLIENTES {
    private double ancho;
    private double largo;
    private double espesor;
    private  boolean tieneesquinas;
    private boolean EsIrregular;
    private boolean tieneacero;

    public ESPECIALPROYECTO(String nombreproyecto, String nombreempresa, String RUC, String numero, String nombreencargado, String primerapellido, String segundoapellido, String tipoEmpresa, String estadoCompra, double metroscuadrados, double ancho, double largo, double espesor, boolean tieneesquinas, boolean esIrregular, boolean tieneacero) {
        super(nombreproyecto, nombreempresa, RUC, numero, nombreencargado, primerapellido, segundoapellido, tipoEmpresa, estadoCompra, metroscuadrados);
        this.ancho = ancho;
        this.largo = largo;
        this.espesor = espesor;
        this.tieneesquinas = tieneesquinas;
        EsIrregular = esIrregular;
        this.tieneacero = tieneacero;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getEspesor() {
        return espesor;
    }

    public boolean isTieneesquinas() {
        return tieneesquinas;
    }

    public boolean isEsIrregular() {
        return EsIrregular;
    }

    public boolean isTieneacero() {
        return tieneacero;
    }


}
