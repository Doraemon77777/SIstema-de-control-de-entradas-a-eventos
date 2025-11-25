package Dominio;

import java.util.Arrays;

public class TipoEntradas {
    private String idTipoEntrada;
    private String nombreTipo;
    private String descripcion;

    // Relation 1 -> Entradas (0..*)
    private Entradas[] entradas;

    public TipoEntradas() {
        this.entradas = new Entradas[0];
    }

    public TipoEntradas(String idTipoEntrada, String nombreTipo, String descripcion, Entradas[] entradas) {
        this.idTipoEntrada = idTipoEntrada;
        this.nombreTipo = nombreTipo;
        this.descripcion = descripcion;
        this.entradas = entradas == null ? new Entradas[0] : entradas;
    }

    public String getIdTipoEntrada() {
        return idTipoEntrada;
    }
    public void setIdTipoEntrada(String idTipoEntrada) {
        this.idTipoEntrada = idTipoEntrada; }
    public String getNombreTipo() {
        return nombreTipo;
    }
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo; }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Entradas[] getEntradas() {
        return entradas; }
    public void setEntradas(Entradas[] entradas) {
        this.entradas = entradas;
    }

    public String toString() {
        return "TipoEntradas: idTipoEntrada=" + idTipoEntrada + ", nombreTipo=" + nombreTipo +
                ", descripcion=" + descripcion + ", entradas=" + Arrays.toString(entradas) ;
    }
}
