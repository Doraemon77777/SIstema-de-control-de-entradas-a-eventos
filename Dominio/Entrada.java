package Dominio;
public class Entrada {
    private String idEntrada;
    private String idEvento;
    private TipoEntrada tipoEntrada;

    public Entrada() {
        this.idEntrada = "Sin id";
        this.idEvento = "Sin id Evento";
        this.tipoEntrada = null;

    }

    public Entrada(String idEntrada, String idEvento, TipoEntrada tipoEntrada,
                   double precio) {
        this.idEntrada = idEntrada;
        this.idEvento = idEvento;
        this.tipoEntrada = tipoEntrada;

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

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {

        this.tipoEntrada = tipoEntrada;
    }


    public String toString () {
        return "Entradas: idEntrada=" + idEntrada + ", idEvento= " + idEvento + ", tipoEntrada= " +
                (tipoEntrada != null ? tipoEntrada.getNombreTipo() : "null") +
                ", precio=" + " ";
    }
}
