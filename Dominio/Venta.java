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
    private Comprobante comprobante;
    private Entrada[] entradaVendidas;
    private Comprador[] compradores;
    private int numComprador;

    public Venta() {
        this.idVenta="Sin id";
        this.idUsuario="Sin id Usuario";
        this.idEvento="Sin id evento";
        this.comprador=null; // 1:1 con Comprador
        this.fechaVenta="Sin fecha";
        this.cantidadBoletos=0;
        this.tipoEntrada="Sin tipo entrada";
        this.metodoPago="Sin metodo de pago";
        this.estadoVenta="Sin estado";
        this.total=0.0;
        this.comprobante=null;
        this.entradaVendidas = new Entrada[0];
        this.compradores= new Comprador[3];
        this.numComprador=0;
        this.uuidBoleto = UUID.randomUUID().toString();
    }
    public Venta(String idVenta, String idUsuario, String idEvento, Comprador comprador,
                 String fechaVenta, int cantidadBoletos, String tipoEntrada,
                 String metodoPago, String estadoVenta, double total,
                 Entrada[] entradaVendidas, Comprobante comprobante) {
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
        this.entradaVendidas = entradaVendidas == null ? new Entrada[0] : entradaVendidas;
        this.comprobante = comprobante;
        this.uuidBoleto = UUID.randomUUID().toString();
        this.entradaVendidas = new Entrada[0];
        this.compradores= new Comprador[3];
        this.numComprador=0;
    }

    //CRUD COMPRADORES

    //Nuevo Comprador
    public void nuevoComprador(Comprador comprador) {
        if (comprador == null){
            return;}
        if(numComprador >= this.compradores.length){
            Comprador[] aux = new Comprador[compradores.length + 1];
            System.arraycopy(compradores, 0, aux, 0, compradores.length);
            compradores = aux;
        }
        compradores[numComprador] = comprador;
        numComprador++;
    }

    //Consultar Comprador
    public String consultarCompradores() {
        String respuesta = ""; //iniamos un String vacio
        for (int i = 0; i < numComprador; i++) {
            respuesta += "[" + i + "] " + compradores[i] + "\r\n"; //imprimos la posicion y el contenido de esa posicion
        }
        return respuesta;
    }

    //Buscar Comprador
    public Comprador buscarComprador(int posicion) {
        if (posicion < 0 || posicion >= numComprador){
            return null;
        }
        return compradores[posicion];
    }

    //Editar Comprador
    public boolean editarComprador(int posicion, Comprador comprador) {
        if (posicion < 0 || posicion >= compradores.length || comprador == null) {
            return false;
        }
        compradores[posicion] = comprador;
        return true;
    }

    //Eliminar Comprador

    public boolean eliminarComprador(int posicion) {
        if (posicion < 0 || posicion >= compradores.length) {
            return false;
        }

        Comprador[] nuevo = new Comprador [compradores.length - 1];

        if(posicion == 0){
            System.arraycopy(compradores, 1, nuevo, 0, compradores.length - 1);
        }else if(posicion == compradores.length - 1){
            System.arraycopy(compradores, 0, nuevo, 0, compradores.length - 1);
        }else{
            System.arraycopy(compradores, 0, nuevo, 0, posicion);
            System.arraycopy(compradores, posicion + 1, nuevo, posicion, numComprador - posicion - 1);
        }
        compradores = nuevo;
        numComprador--;
        return true;
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
    public Entrada[] getEntradasVendidas() {
        return entradaVendidas;
    }
    public void setEntradasVendidas(Entrada[] entradaVendidas) {
        this.entradaVendidas = entradaVendidas;
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
                ", entradasVendidas=" + Arrays.toString(entradaVendidas) +
                ", comprobante=" + (comprobante != null ? comprobante.getIdComprobante() : "null") + " ";
    }

}
