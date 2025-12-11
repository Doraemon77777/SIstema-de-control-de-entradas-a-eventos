package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Entrada {

    private long idEntrada;
    private long idEvento;
    private TipoEntrada tipoEntrada;
    private double precio;
    private boolean activa;

    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");

    public Entrada() {
        this.idEntrada = 0;
        this.idEvento = 0;
        this.tipoEntrada = null;
        this.precio = 0.0;
        this.activa = true;
    }

    public Entrada(String idEntrada, String idEvento, TipoEntrada tipoEntrada, double precio) {
        setIdEntrada(idEntrada);
        setIdEvento(idEvento);
        setTipoEntrada(tipoEntrada);
        setPrecio(precio);
        this.activa = true;
    }

    public long getIdEntrada() { return idEntrada; }

    public void setIdEntrada(String idEntrada) {
        validarRegex(idEntrada, SOLO_NUMEROS, "El idEntrada debe ser numérico.");
        this.idEntrada = Long.parseLong(idEntrada);
    }

    public long getIdEvento() { return idEvento; }

    public void setIdEvento(String idEvento) {
        validarRegex(idEvento, SOLO_NUMEROS, "El idEvento debe ser numérico.");
        this.idEvento = Long.parseLong(idEvento);
    }

    public TipoEntrada getTipoEntrada() { return tipoEntrada; }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        if (tipoEntrada == null)
            throw new IllegalArgumentException("El tipo de entrada no puede ser nulo.");
        this.tipoEntrada = tipoEntrada;
    }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) {
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        this.precio = precio;
    }

    public boolean isActiva() { return activa; }

    public void setActiva(boolean activa) { this.activa = activa; }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    public String toString() {
        return "Entrada: idEntrada=" + idEntrada +
                ", idEvento=" + idEvento +
                ", tipoEntrada=" + (tipoEntrada != null ? tipoEntrada.getNombreTipo() : "null") +
                ", precio=" + precio +
                ", activa=" + activa;
    }
}
