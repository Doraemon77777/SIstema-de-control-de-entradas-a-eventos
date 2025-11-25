package Dominio;
import java.util.Arrays;
public class Empresa {
        private String idEmpresa;
        private String nombre;
        private String ruc;
        private String direccion;
        private String telefono;
        private String correo;

        private Evento[] eventos;

        public Empresa() {
            this.eventos = new Evento[0];
        }
        public Empresa(String idEmpresa, String nombre, String ruc, String direccion,String telefono, String correo, Evento[] eventos) {
            this.idEmpresa = idEmpresa;
            this.nombre = nombre;
            this.ruc = ruc;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correo = correo;
            if (eventos == null) {
                this.eventos = new Evento[0];
            } else {
                this.eventos = eventos;
            }
        }
    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Evento[] getEventos() {
        return eventos;
    }

        public void setEventos(Evento[] eventos) {
            this.eventos = eventos;
        }

        public String toString() {
            return "Empresa: idEmpresa=" + idEmpresa +" , nombre=" +nombre+", ruc=" + ruc+", direccion=" + direccion +
                    ", telefono=" + telefono+ ", correo=" + correo+ ", eventos=" + Arrays.toString(eventos)+
                    "";
        }
    }


