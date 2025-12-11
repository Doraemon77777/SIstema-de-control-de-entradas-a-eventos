package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TipoEntrada {

    private long idTipoEntrada;
    private String nombreTipo;
    private String descripcion;
    private double precio;

    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");

    public TipoEntrada() {
        this.idTipoEntrada = 0;
        this.nombreTipo = "Sin tipo";
        this.descripcion = "Sin descripción";
        this.precio = 0.0;
    }

    public TipoEntrada(String idTipoEntrada, String nombreTipo, String descripcion, double precio) {
        setIdTipoEntrada(idTipoEntrada);
        setNombreTipo(nombreTipo);
        setDescripcion(descripcion);
        setPrecio(precio);
    }

    public long getIdTipoEntrada() { return idTipoEntrada; }

    public void setIdTipoEntrada(String idTipoEntrada) {
        validarRegex(idTipoEntrada, SOLO_NUMEROS, "El idTipoEntrada debe ser numérico.");
        this.idTipoEntrada = Long.parseLong(idTipoEntrada);
    }

    public String getNombreTipo() { return nombreTipo; }

    public void setNombreTipo(String nombreTipo) {
        if (nombreTipo == null || nombreTipo.trim().isEmpty())
            throw new IllegalArgumentException("El nombre del tipo de entrada no puede estar vacío.");
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty())
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        this.descripcion = descripcion;
    }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) {
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        this.precio = precio;
    }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    public String toString() {
        return "TipoEntrada: idTipoEntrada=" + idTipoEntrada +
                ", nombreTipo=" + nombreTipo +
                ", descripcion=" + descripcion +
                ", precio=" + precio;
    }
}
