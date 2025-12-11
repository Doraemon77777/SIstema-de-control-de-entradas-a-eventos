package Dominio;

public class Comprobante {
    private String idComprobante;
    private String idVenta;
    private String fechaEmision;

    public Comprobante() {
        this.idComprobante="Sin id";
        this.idVenta="Si id Venta";
        this.fechaEmision="Sin fecha";
    }

    public Comprobante(String idComprobante, String idVenta, String fechaEmision) {
        this.idComprobante = idComprobante;
        this.idVenta = idVenta;
        this.fechaEmision = fechaEmision;
    }

    public String getIdComprobante() { return idComprobante; }
    public void setIdComprobante(String idComprobante) { this.idComprobante = idComprobante; }
    public String getIdVenta() { return idVenta; }
    public void setIdVenta(String idVenta) { this.idVenta = idVenta; }
    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }

    public String toString() {
        return "Comprobante: idComprobante= " + idComprobante + ", idVenta= " + idVenta +
                ", fechaEmision= " + fechaEmision ;
    }
}
