package TF.controlador;

import TF.modelo.CLIENTES;

public class PRELOSAPROYECTO extends CLIENTES {

    ////
    private double alturaprelosa;
    ////

    ////
    private boolean EsMaciza;
    ////

    //corrugado o liso
    private String tipoacero;
    //corrugado o liso

    private boolean mechas;

    ////
    private boolean HayAcero;

    ////
    public PRELOSAPROYECTO(String nombreproyecto, String nombreempresa, String RUC, String numero, String nombreencargado, String primerapellido, String segundoapellido, String tipoEmpresa, String estadoCompra, double metroscuadrados, double alturaprelosa, boolean esMaciza, String tipoacero, boolean mechas, boolean hayAcero) {
        super(nombreproyecto, nombreempresa, RUC, numero, nombreencargado, primerapellido, segundoapellido, tipoEmpresa, estadoCompra, metroscuadrados);
        this.alturaprelosa = alturaprelosa;
        EsMaciza = esMaciza;
        this.tipoacero = tipoacero;
        this.mechas = mechas;
        HayAcero = hayAcero;
    }

    public double getAlturaprelosa() {
        return alturaprelosa;
    }

    public boolean isEsMaciza() {
        return EsMaciza;
    }

    public String getTipoacero() {
        return tipoacero;
    }

    public boolean isMechas() {
        return mechas;
    }

    public boolean isHayAcero() {
        return HayAcero;
    }

    @Override
    public double CalcularPrecio() {
        if (isEsMaciza()) {

            if (isHayAcero()) {

                if (tipoacero.toLowerCase().equals("corrugado")) {
                    return super.CalcularPrecio() * 48.50;
                } else if (tipoacero.toLowerCase().equals("liso")) {
                    return super.CalcularPrecio() * 50.00;
                }
            } else {
                return super.CalcularPrecio() * 45.00;
            }

        } else {
            if (isHayAcero()) {
                if (mechas) {
                    if (alturaprelosa == 20.00) {
                        return super.CalcularPrecio() * 64.00;
                    } else if (alturaprelosa == 25) {
                        return super.CalcularPrecio() * 70.00;
                    } else if (alturaprelosa == 30) {
                        return super.CalcularPrecio() * 77.00;
                    }
                }else {
                    if (alturaprelosa == 20.00) {
                        return super.CalcularPrecio() * 60.00;
                    } else if (alturaprelosa == 25) {
                        return super.CalcularPrecio() * 68.00;
                    } else if (alturaprelosa == 30) {
                        return super.CalcularPrecio() * 75.00;
                    }
                }



            } else {
                if (alturaprelosa == 20.00) {
                    return super.CalcularPrecio() * 53.00;
                } else if (alturaprelosa == 25) {
                    return super.CalcularPrecio() * 55.00;
                } else if (alturaprelosa == 30) {
                    return super.CalcularPrecio() * 57.00;
                }


            }



        }
        return super.CalcularPrecio();
    }
}
