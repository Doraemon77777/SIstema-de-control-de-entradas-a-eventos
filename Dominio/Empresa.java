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
        private Usuario[] usuarios;
        private int numEvento;
        private int numUsuario;


        public Empresa() {
            this.idEmpresa="Sin id";
            this.nombre="Sin nombre";
            this.ruc="Sin ruc";
            this.direccion="Sin direccion";
            this.telefono="Sin telefono";
            this.correo="Sin correo";
            this.numEvento = 0;
            this.numUsuario = 0;
            this.eventos = new Evento[3];
            this.usuarios = new Usuario[3];
        }

        public Empresa(String idEmpresa, String nombre, String ruc, String direccion,String telefono, String correo, Evento[] eventos) {
            this.idEmpresa = idEmpresa;
            this.nombre = nombre;
            this.ruc = ruc;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correo = correo;
            this.numEvento = 0;
            this.numUsuario = 0;
            if (eventos == null) {
                this.eventos = new Evento[0];
            } else {
                this.eventos = eventos;
            }
        }

        //CRUD USUARIOS

        //Nuevo Usuario
        public void nuevoUsuario(Usuario usuario) {
            if (usuario == null){
                return;}
            if(numUsuario >= this.usuarios.length){
                Usuario[] aux = new Usuario[usuarios.length + 1];
                System.arraycopy(usuarios, 0, aux, 0, usuarios.length);
                usuarios = aux;
            }
            usuarios[numUsuario] = usuario;
            numUsuario++;
        }

        //Consultar
        public String consultarUsuarios() {
            String respuesta = ""; //iniamos un String vacio
            for (int i = 0; i < numUsuario; i++) {
                respuesta += "[" + i + "] " + usuarios[i] + "\r\n"; //imprimos la posicion y el contenido de esa posicion
            }
            return respuesta;
        }

        //Buscar Usuario
        public Usuario buscarUsuario(int posicion) {
            if (posicion < 0 || posicion >= numUsuario){
                return null;
            }
            return usuarios[posicion];
        }

        //Editar Usuario
        public boolean editarUsuario(int pos, Usuario usuario) {
            if (pos < 0 || pos >= usuarios.length || usuario == null) {
                return false;
            }
            usuarios[pos] = usuario;
            return true;
        }

        //Eliminar Usuario

        public boolean eliminarUsuario(int posicion) {
            if (posicion < 0 || posicion >= usuarios.length) {
                return false;
            }

            Usuario[] nuevo = new Usuario [usuarios.length - 1];

            if(posicion == 0){
                System.arraycopy(usuarios, 1, nuevo, 0, usuarios.length - 1);
            }else if(posicion == usuarios.length - 1){
                System.arraycopy(usuarios, 0, nuevo, 0, usuarios.length - 1);
            }else{
                System.arraycopy(usuarios, 0, nuevo, 0, posicion);
                System.arraycopy(usuarios, posicion + 1, nuevo, posicion, numUsuario - posicion - 1);
            }
            usuarios = nuevo;
            numUsuario--;
            return true;
        }

        //CRUD EVENTOS

        //Nuevo Evento
        public void Evento(Evento evento) {
            if (evento == null){
                return;}
            if(numEvento >= this.eventos.length){
                Evento[] aux = new Evento [eventos.length + 1];
                System.arraycopy(eventos, 0, aux, 0, eventos.length);
                eventos = aux;
            }
            eventos[numEvento] = evento;
            numEvento++;
        }

        //Consultar Evento
        public String consultarEventos() {
            String respuesta = ""; //iniamos un String vacio
            for (int i = 0; i < numEvento; i++) {
                respuesta += "[" + i + "] " + eventos[i] + "\r\n"; //imprimos la posicion y el contenido de esa posicion
            }
            return respuesta;
        }

        //Buscar Evento
        public Evento buscarEvento(int posicion) {
            if (posicion < 0 || posicion >= numEvento){
                return null;
            }
            return eventos[posicion];
        }

        //Editar Evento
        public boolean editarEvento(int posicion, Evento evento) {
            if (posicion < 0 || posicion >= eventos.length || evento == null) {
                return false;
            }
            eventos[posicion] = evento;
            return true;
        }

        //Eliminar Evento

        public boolean eliminarEvento(int posicion) {
            if (posicion < 0 || posicion >= eventos.length) {
                return false;
            }

            Evento[] nuevo = new Evento [eventos.length - 1];

            if(posicion == 0){
                System.arraycopy(eventos, 1, nuevo, 0, eventos.length - 1);
            }else if(posicion == eventos.length - 1){
                System.arraycopy(eventos, 0, nuevo, 0, eventos.length - 1);
            }else{
                System.arraycopy(eventos, 0, nuevo, 0, posicion);
                System.arraycopy(eventos, posicion + 1, nuevo, posicion, numEvento - posicion - 1);
            }
            eventos = nuevo;
            numEvento--;
            return true;
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


