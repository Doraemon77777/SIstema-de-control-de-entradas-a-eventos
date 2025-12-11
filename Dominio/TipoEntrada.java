package Dominio;

public class TipoEntrada {
    private String idTipoEntrada;
    private String nombreTipo;
    private String descripcion;
    private double precio;

    public TipoEntrada() {
        this.idTipoEntrada="Sin id";
        this.nombreTipo="Sin tipo";
        this.descripcion="Sin descripcion";
        this.precio = 0.0;
    }

    public TipoEntrada(String idTipoEntrada, String nombreTipo, String descripcion, Entrada[] entradas) {
        this.idTipoEntrada = idTipoEntrada;
        this.nombreTipo = nombreTipo;
        this.descripcion = descripcion;
        this.precio = precio;
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
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio; }



    public String toString() {
        return "TipoEntradas: idTipoEntrada=" + idTipoEntrada + ", nombreTipo=" + nombreTipo +
                ", descripcion=" + descripcion + ", entradas=";
    }
}
