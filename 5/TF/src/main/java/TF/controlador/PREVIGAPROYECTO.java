package TF.controlador;

import TF.modelo.CLIENTES;

public class PREVIGAPROYECTO extends CLIENTES {
    private double  precioprelosa;

    private String Alturapreviga;

    private String anchoprevigo;

    private boolean Tieneanclaje;

    public PREVIGAPROYECTO(String nombreproyecto, String nombreempresa, String RUC, String numero, String nombreencargado, String primerapellido, String segundoapellido, String tipoEmpresa, String estadoCompra, double metroscuadrados, double precioprelosa, String alturapreviga, String anchoprevigo, boolean tieneanclaje) {
        super(nombreproyecto, nombreempresa, RUC, numero, nombreencargado, primerapellido, segundoapellido, tipoEmpresa, estadoCompra, metroscuadrados);
        this.precioprelosa = precioprelosa;
        Alturapreviga = alturapreviga;
        this.anchoprevigo = anchoprevigo;
        Tieneanclaje = tieneanclaje;
    }

    public double getPrecioprelosa() {
        return precioprelosa;
    }

    public String getAlturapreviga() {
        return Alturapreviga;
    }

    public String getAnchoprevigo() {
        return anchoprevigo;
    }

    public boolean isTieneanclaje() {
        return Tieneanclaje;
    }
}
