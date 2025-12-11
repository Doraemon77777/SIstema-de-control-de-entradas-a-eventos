package Dominio;
import java.util.Arrays;
public class Evento {

        private String idEvento;
        private String nombres;
        private String fecha;
        private String hora;
        private int aforoMaximo;
        private String ubicacion;
        private String estado;
        private String descripcion;
        private Empresa empresa;


        public Evento() {
            this.nombres="Sin nombres";
            this.fecha= "Sin fecha";
            this.hora="Sin hora";
            this.aforoMaximo=0;
            this.ubicacion="Sin Ubicación";
            this.estado="Sin estado";
            this.descripcion="Sin Descripcion";
            this.empresa = null;

        }

        public Evento(String idEvento, String nombres, String fecha, String hora, int aforoMaximo, String ubicacion, String estado, String descripcion,
                      Entrada[] entradas, Empresa empresa) {
            this.idEvento = idEvento;
            this.nombres = nombres;
            this.fecha = fecha;
            this.hora = hora;
            this.aforoMaximo = aforoMaximo;
            this.ubicacion = ubicacion;
            this.estado = estado;
            this.descripcion = descripcion;
            this.empresa = empresa;

        }




        public String getIdEvento() {
            return idEvento;
        }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }
    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public String toString() {
            return "Evento: idEvento=" + idEvento + ", nombres=" + nombres + ", fecha= " + fecha +
                    ", hora=" + hora + ", aforoMaximo=" + aforoMaximo + ", ubicacion=" + ubicacion +
                    ", estado=" + estado + ", descripcion=" + descripcion +
                    ", empresa=" + (empresa != null ? empresa.getNombre() : "null");
        }
}
