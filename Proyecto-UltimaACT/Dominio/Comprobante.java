package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprobante {

    private long idComprobante;
    private long idVenta;
    private String fechaEmision;
    private boolean activo;

    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");
    private static final Pattern FECHA_VALIDO = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

    public Comprobante() {
        this.idComprobante = 0;
        this.idVenta = 0;
        this.fechaEmision = "1900-01-01";
        this.activo = true;
    }

    public Comprobante(String idComprobante, String idVenta, String fechaEmision) {
        setIdComprobante(idComprobante);
        setIdVenta(idVenta);
        setFechaEmision(fechaEmision);
        this.activo = true;
    }

    public long getIdComprobante() { return idComprobante; }

    public void setIdComprobante(String idComprobante) {
        validarRegex(idComprobante, SOLO_NUMEROS, "El idComprobante solo debe contener números.");
        this.idComprobante = Long.parseLong(idComprobante);
    }

    public long getIdVenta() { return idVenta; }

    public void setIdVenta(String idVenta) {
        validarRegex(idVenta, SOLO_NUMEROS, "El idVenta solo debe contener números.");
        this.idVenta = Long.parseLong(idVenta);
    }

    public String getFechaEmision() { return fechaEmision; }

    public void setFechaEmision(String fechaEmision) {
        validarRegex(fechaEmision, FECHA_VALIDO, "La fecha debe estar en formato YYYY-MM-DD.");
        this.fechaEmision = fechaEmision;
    }

    public boolean isActivo() { return activo; }

    public void setActivo(boolean activo) { this.activo = activo; }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    @Override
    public String toString() {
        return "Comprobante {" +
                "idComprobante=" + idComprobante +
                ", idVenta=" + idVenta +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", activo=" + activo +
                '}';
    }
}
