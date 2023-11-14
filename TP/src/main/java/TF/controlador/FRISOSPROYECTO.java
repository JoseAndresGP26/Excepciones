package TF.controlador;

import TF.modelo.Clientes;

public class FRISOSPROYECTO extends Clientes {
    private double PrecioFriso;
    private double alturafriso;
    private double espesorfriso;
    private double longitudfriso;
    public FRISOSPROYECTO(String nombreproyecto, String nombreempresa, String RUC, String numero, String nombreencargado, String primerapellido, String segundoapellido, String tipoEmpresa, String estadoCompra, double metroscuadrados, double precioFriso, double alturafriso, double espesorfriso, double longitudfriso) {
        super(nombreproyecto, nombreempresa, RUC, numero, nombreencargado, primerapellido, segundoapellido, tipoEmpresa, estadoCompra, metroscuadrados);
        PrecioFriso = precioFriso;
        this.alturafriso = alturafriso;
        this.espesorfriso = espesorfriso;
        this.longitudfriso = longitudfriso;
    }
    public double getPrecioFriso() {
        return PrecioFriso;
    }

    public double getAlturafriso() {
        return alturafriso;
    }

    public double getEspesorfriso() {
        return espesorfriso;
    }

    public double getLongitudfriso() {
        return longitudfriso;
    }
}
