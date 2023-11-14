package TF.controlador;

import TF.modelo.Clientes;

public class PARAPETOPROYECTO extends Clientes {
    private double alturaparapeto;

    private boolean TieneAceroreforzadoparapeto;
    public PARAPETOPROYECTO(String nombreproyecto, String nombreempresa, String RUC, String numero, String nombreencargado, String primerapellido, String segundoapellido, String tipoEmpresa, String estadoCompra, double metroscuadrados, double alturaparapeto, boolean tieneAceroreforzadoparapeto) {
        super(nombreproyecto, nombreempresa, RUC, numero, nombreencargado, primerapellido, segundoapellido, tipoEmpresa, estadoCompra, metroscuadrados);
        this.alturaparapeto = alturaparapeto;
        TieneAceroreforzadoparapeto = tieneAceroreforzadoparapeto;
    }
    public double getAlturaparapeto() {
        return alturaparapeto;
    }

    public boolean isTieneAceroreforzadoparapeto() {
        return TieneAceroreforzadoparapeto;
    }
}
