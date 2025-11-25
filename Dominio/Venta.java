package Dominio;

import java.util.Arrays;
import java.util.UUID;
public class Venta {
    private String idVenta;
    private String idUsuario;
    private String idEvento;
    private Comprador comprador; // 1:1 con Comprador
    private String fechaVenta;
    private int cantidadBoletos;
    private String tipoEntrada;
    private String metodoPago;
    private String estadoVenta;
    private double total;
    private String uuidBoleto;
    private Entradas[] entradasVendidas;
    private Comprobante comprobante;

    public Venta() {
        this.entradasVendidas = new Entradas[0];
        this.uuidBoleto = UUID.randomUUID().toString();
    }
    public Venta(String idVenta, String idUsuario, String idEvento, Comprador comprador,
                 String fechaVenta, int cantidadBoletos, String tipoEntrada,
                 String metodoPago, String estadoVenta, double total,
                 Entradas[] entradasVendidas, Comprobante comprobante) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.comprador = comprador;
        this.fechaVenta = fechaVenta;
        this.cantidadBoletos = cantidadBoletos;
        this.tipoEntrada = tipoEntrada;
        this.metodoPago = metodoPago;
        this.estadoVenta = estadoVenta;
        this.total = total;
        this.entradasVendidas = entradasVendidas == null ? new Entradas[0] : entradasVendidas;
        this.comprobante = comprobante;
        this.uuidBoleto = UUID.randomUUID().toString();
    }

    public String getIdVenta() {

        return idVenta;
    }
    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }
    public Comprador getComprador() {
        return comprador;
    }
    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }
    public String getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }
    public String getTipoEntrada() {
        return tipoEntrada;
    }
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    public String getEstadoVenta() {
        return estadoVenta;
    }
    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getUuidBoleto() {
        return uuidBoleto;
    }
    public Entradas[] getEntradasVendidas() {
        return entradasVendidas;
    }
    public void setEntradasVendidas(Entradas[] entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }
    public Comprobante getComprobante() {
        return comprobante;
    }
    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }
    public String toString() {
        return "Venta: idVenta=" + idVenta + ", idUsuario= " + idUsuario + ", idEvento=" + idEvento +
                ", comprador= " + (comprador != null ? comprador.getNombres() : "null") +
                ", fechaVenta= " + fechaVenta + ", cantidadBoletos=" + cantidadBoletos +
                ", tipoEntrada=" + tipoEntrada + ", metodoPago=" + metodoPago +
                ", estadoVenta=" + estadoVenta + ", total=" + total + ", uuidBoleto=" + uuidBoleto +
                ", entradasVendidas=" + Arrays.toString(entradasVendidas) +
                ", comprobante=" + (comprobante != null ? comprobante.getIdComprobante() : "null") + " ";
    }

}
