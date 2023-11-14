package TF.modelo;

public class Clientes {
    private String nombreproyecto;
    private String nombreempresa;

    private String RUC;

    private String Numero;
    private String nombreencargado;

    private String primerapellido;
    private String segundoapellido;

    private String TipoEmpresa;

    private String EstadoCompra;

    private double  metroscuadrados;
    public Clientes(String nombreproyecto, String nombreempresa, String RUC, String numero, String nombreencargado, String primerapellido, String segundoapellido, String tipoEmpresa, String estadoCompra, double metroscuadrados) {
        this.nombreproyecto = nombreproyecto;
        this.nombreempresa = nombreempresa;
        this.RUC = RUC;
        Numero = numero;
        this.nombreencargado = nombreencargado;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        TipoEmpresa = tipoEmpresa;
        EstadoCompra = estadoCompra;
        this.metroscuadrados = metroscuadrados;
    }

    public String getNombreproyecto() {
        return nombreproyecto;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public String getRUC() {
        return RUC;
    }

    public String getNumero() {
        return Numero;
    }

    public String getNombreencargado() {
        return nombreencargado;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public String getTipoEmpresa() {
        return TipoEmpresa;
    }

    public String getEstadoCompra() {
        return EstadoCompra;
    }

    public double getMetroscuadrados() {
        return metroscuadrados;
    }


    public double CalcularPrecio(){
        return metroscuadrados;
    }
}
