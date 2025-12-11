package Dominio;
import java.util.Arrays;

public class Usuario {
    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String contrasena;
    private String fechaRegistro;
    private Incidencia[] incidencias;
    private int numIncidencia;
    private Venta[] ventas;
    private int numVenta;

    public Usuario() {
        this.idUsuario = "Sin id";
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.correo = "Sin correos";
        this.contrasena = "Sin contraseña";
        this.fechaRegistro = "Sin fecha";
        this.incidencias = new Incidencia[3];
        this.numIncidencia=0;
        this.ventas = new Venta[3];
        this.numVenta=0;
    }

    public Usuario(String idUsuario, String nombres, String apellidos, String correo,
                   String contrasena, String rol, String estado, String fechaRegistro,
                   Incidencia[] incidencias) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
        this.incidencias = new Incidencia[3];
        this.numIncidencia=0;
        this.ventas = new Venta[3];
        this.numVenta=0;
    }

    //CRUD VENTAS

    //Nueva Venta
    public void nuevaVenta(Venta venta) {
        if (venta == null){
            return;}
        if(numVenta >= this.ventas.length){
            Venta[] aux = new Venta[ventas.length + 1];
            System.arraycopy(ventas, 0, aux, 0, ventas.length);
            ventas = aux;
        }
        ventas[numVenta] = venta;
        numVenta++;
    }

    //Consultar Venta
    public String consultarVentas() {
        String respuesta = ""; //iniamos un String vacio
        for (int i = 0; i < numVenta; i++) {
            respuesta += "[" + i + "] " + ventas[i] + "\r\n"; //imprimos la posicion y el contenido de esa posicion
        }
        return respuesta;
    }

    //Buscar Venta
    public Venta buscarUsuario(int posicion) {
        if (posicion < 0 || posicion >= numVenta){
            return null;
        }
        return ventas[posicion];
    }

    //Editar Venta
    public boolean editarVenta(int posicion, Venta venta) {
        if (posicion < 0 || posicion >= ventas.length || venta == null) {
            return false;
        }
        ventas[posicion] = venta;
        return true;
    }

    //Eliminar Venta

    public boolean eliminarVenta(int posicion) {
        if (posicion < 0 || posicion >= ventas.length) {
            return false;
        }

        Venta[] nuevo = new Venta [ventas.length - 1];

        if(posicion == 0){
            System.arraycopy(ventas, 1, nuevo, 0, ventas.length - 1);
        }else if(posicion == ventas.length - 1){
            System.arraycopy(ventas, 0, nuevo, 0, ventas.length - 1);
        }else{
            System.arraycopy(ventas, 0, nuevo, 0, posicion);
            System.arraycopy(ventas, posicion + 1, nuevo, posicion, numVenta - posicion - 1);
        }
        ventas = nuevo;
        numVenta--;
        return true;
    }

    //CRUD INCIDENCIAS

    //Nueva Incidencia
    public void nuevaIncidencia(Incidencia incidencia) {
        if (incidencia == null){
            return;}
        if(numIncidencia >= this.incidencias.length){
            Incidencia[] aux = new Incidencia[incidencias.length + 1];
            System.arraycopy(incidencias, 0, aux, 0, incidencias.length);
            incidencias = aux;
        }
        incidencias[numIncidencia] = incidencia;
        numIncidencia++;
    }

    //Consultar Incidencia
    public String consultarIncidencias() {
        String respuesta = ""; //iniamos un String vacio
        for (int i = 0; i < numIncidencia; i++) {
            respuesta += "[" + i + "] " + incidencias[i] + "\r\n"; //imprimos la posicion y el contenido de esa posicion
        }
        return respuesta;
    }

    //Buscar Incidencia
    public Incidencia buscarIncidencia(int posicion) {
        if (posicion < 0 || posicion >= numIncidencia){
            return null;
        }
        return incidencias[posicion];
    }

    //Editar Incidencia
    public boolean editarIncidencias(int posicion, Incidencia incidencia) {
        if (posicion < 0 || posicion >= incidencias.length || incidencia == null) {
            return false;
        }
        incidencias[posicion] = incidencia;
        return true;
    }

    //Eliminar Incidencia

    public boolean eliminarIncidencia(int posicion) {
        if (posicion < 0 || posicion >= incidencias.length) {
            return false;
        }

        Incidencia[] nuevo = new Incidencia[incidencias.length - 1];

        if(posicion == 0){
            System.arraycopy(incidencias, 1, nuevo, 0, incidencias.length - 1);
        }else if(posicion == incidencias.length - 1){
            System.arraycopy(incidencias, 0, nuevo, 0, incidencias.length - 1);
        }else{
            System.arraycopy(incidencias, 0, nuevo, 0, posicion);
            System.arraycopy(incidencias, posicion + 1, nuevo, posicion, numIncidencia - posicion - 1);
        }
        incidencias = nuevo;
        numIncidencia--;
        return true;
    }



    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Incidencia[] getIncidencias() {
        return incidencias;
    }
    public void setIncidencias(Incidencia[] incidencias) {
        this.incidencias = incidencias;
    }
    public String toString() {
        return "Usuaro: idUsuario=" + idUsuario + ", nombres=" + nombres + ", apellidos=" + apellidos +
                ", correo=" + correo + ", rol='" +
                ", fechaRegistro=" + fechaRegistro + ", incidencias=" + Arrays.toString(incidencias) + "";
    }
}
