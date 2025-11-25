package Dominio;

public class Comprobante {
    private String idComprobante;
    private String idVenta;
    private String fechaEmision;
    private String tipoComprobante;
    private String estadoComprobante;

    public Comprobante() {}

    public Comprobante(String idComprobante, String idVenta, String fechaEmision,
                       String tipoComprobante, String estadoComprobante) {
        this.idComprobante = idComprobante;
        this.idVenta = idVenta;
        this.fechaEmision = fechaEmision;
        this.tipoComprobante = tipoComprobante;
        this.estadoComprobante = estadoComprobante;
    }

    public String getIdComprobante() { return idComprobante; }
    public void setIdComprobante(String idComprobante) { this.idComprobante = idComprobante; }
    public String getIdVenta() { return idVenta; }
    public void setIdVenta(String idVenta) { this.idVenta = idVenta; }
    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }
    public String getTipoComprobante() { return tipoComprobante; }
    public void setTipoComprobante(String tipoComprobante) { this.tipoComprobante = tipoComprobante; }
    public String getEstadoComprobante() { return estadoComprobante; }
    public void setEstadoComprobante(String estadoComprobante) { this.estadoComprobante = estadoComprobante; }
    public String toString() {
        return "Comprobante: idComprobante= " + idComprobante + ", idVenta= " + idVenta +
                ", fechaEmision= " + fechaEmision + ", tipoComprobante= " + tipoComprobante +
                ", estadoComprobante= " + estadoComprobante + "";
    }
}
