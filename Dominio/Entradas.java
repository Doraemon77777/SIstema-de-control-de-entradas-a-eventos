package Dominio;
public class Entradas {
    private String idEntrada;
    private String idEvento;
    private TipoEntradas tipoEntrada;
    private double precio;
    private int stock;
    private int disponibles;

    public Entradas() {

    }

    public Entradas(String idEntrada, String idEvento, TipoEntradas tipoEntrada,
                    double precio, int stock, int disponibles) {
        this.idEntrada = idEntrada;
        this.idEvento = idEvento;
        this.tipoEntrada = tipoEntrada;
        this.precio = precio;
        this.stock = stock;
        this.disponibles = disponibles;
    }
    public String getIdEntrada() {

        return idEntrada;
    }

    public void setIdEntrada(String idEntrada) {


        this.idEntrada = idEntrada;
    }

    public String getIdEvento() {


        return idEvento;
    }

    public void setIdEvento(String idEvento) {

        this.idEvento = idEvento;
    }

    public TipoEntradas getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntradas tipoEntrada) {

        this.tipoEntrada = tipoEntrada;
    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }public int getStock() {

        return stock;
    }
    public void setStock(int stock) {

        this.stock = stock;
    }

    public int getDisponibles() {

        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }
    public String toString() {
        return "Entradas: idEntrada=" + idEntrada + ", idEvento= " + idEvento + ", tipoEntrada= " +
                (tipoEntrada != null ? tipoEntrada.getNombreTipo() : "null") +
                ", precio=" + precio + ", stock=" + stock + ", disponibles=" + disponibles + " ";
    }
}
