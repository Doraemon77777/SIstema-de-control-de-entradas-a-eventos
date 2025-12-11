package Dominio;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empresa {

    private long idEmpresa;
    private String nombre;
    private String ruc;
    private String direccion;
    private String telefono;
    private String correo;
    private Evento[] eventos;
    private Usuario[] usuarios;
    private int numEvento;
    private int numUsuario;
    private boolean activa;

    private static final Pattern SOLO_LETRAS = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");
    private static final Pattern RUC_VALIDO = Pattern.compile("^[0-9]{13}$");
    private static final Pattern EMAIL_VALIDO = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern TELEFONO_VALIDO = Pattern.compile("^[0-9]{7,10}$");

    public Empresa() {
        this.idEmpresa = 0;
        this.nombre = "Sin nombre";
        this.ruc = "0000000000000";
        this.direccion = "Sin direccion";
        this.telefono = "0000000000";
        this.correo = "sincorreo@correo.com";
        this.numEvento = 0;
        this.numUsuario = 0;
        this.eventos = new Evento[3];
        this.usuarios = new Usuario[3];
        this.activa = true;
    }

    public Empresa(String idEmpresa, String nombre, String ruc, String direccion,
                   String telefono, String correo, Evento[] eventos) {

        setIdEmpresa(idEmpresa);
        setNombre(nombre);
        setRuc(ruc);
        setDireccion(direccion);
        setTelefono(telefono);
        setCorreo(correo);

        if (eventos == null) {
            this.eventos = new Evento[0];
        } else {
            this.eventos = eventos;
        }

        this.numEvento = eventos != null ? eventos.length : 0;
        this.usuarios = new Usuario[3];
        this.numUsuario = 0;
        this.activa = true;
    }

    public void nuevoUsuario(Usuario usuario) {
        if (usuario == null) return;
        if (numUsuario >= usuarios.length) {
            Usuario[] aux = new Usuario[usuarios.length + 1];
            System.arraycopy(usuarios, 0, aux, 0, usuarios.length);
            usuarios = aux;
        }
        usuarios[numUsuario++] = usuario;
    }

    public String consultarUsuarios() {
        String respuesta = "";
        for (int i = 0; i < numUsuario; i++) {
            respuesta += "[" + i + "] " + usuarios[i] + "\r\n";
        }
        return respuesta;
    }

    public Usuario buscarUsuario(int posicion) {
        if (posicion < 0 || posicion >= numUsuario) return null;
        return usuarios[posicion];
    }

    public boolean editarUsuario(int pos, Usuario usuario) {
        if (pos < 0 || pos >= usuarios.length || usuario == null) return false;
        usuarios[pos] = usuario;
        return true;
    }

    public boolean eliminarUsuario(int posicion) {
        if (posicion < 0 || posicion >= usuarios.length) return false;

        Usuario[] nuevo = new Usuario[usuarios.length - 1];

        if (posicion == 0) {
            System.arraycopy(usuarios, 1, nuevo, 0, usuarios.length - 1);
        } else if (posicion == usuarios.length - 1) {
            System.arraycopy(usuarios, 0, nuevo, 0, usuarios.length - 1);
        } else {
            System.arraycopy(usuarios, 0, nuevo, 0, posicion);
            System.arraycopy(usuarios, posicion + 1, nuevo, posicion, usuarios.length - posicion - 1);
        }

        usuarios = nuevo;
        numUsuario--;
        return true;
    }

    public void Evento(Evento evento) {
        if (evento == null) return;
        if (numEvento >= eventos.length) {
            Evento[] aux = new Evento[eventos.length + 1];
            System.arraycopy(eventos, 0, aux, 0, eventos.length);
            eventos = aux;
        }
        eventos[numEvento++] = evento;
    }

    public String consultarEventos() {
        String respuesta = "";
        for (int i = 0; i < numEvento; i++) {
            respuesta += "[" + i + "] " + eventos[i] + "\r\n";
        }
        return respuesta;
    }

    public Evento buscarEvento(int posicion) {
        if (posicion < 0 || posicion >= numEvento) return null;
        return eventos[posicion];
    }

    public boolean editarEvento(int posicion, Evento evento) {
        if (posicion < 0 || posicion >= eventos.length || evento == null) return false;
        eventos[posicion] = evento;
        return true;
    }

    public boolean eliminarEvento(int posicion) {
        if (posicion < 0 || posicion >= eventos.length) return false;

        Evento[] nuevo = new Evento[eventos.length - 1];

        if (posicion == 0) {
            System.arraycopy(eventos, 1, nuevo, 0, eventos.length - 1);
        } else if (posicion == eventos.length - 1) {
            System.arraycopy(eventos, 0, nuevo, 0, eventos.length - 1);
        } else {
            System.arraycopy(eventos, 0, nuevo, 0, posicion);
            System.arraycopy(eventos, posicion + 1, nuevo, posicion, eventos.length - posicion - 1);
        }

        eventos = nuevo;
        numEvento--;
        return true;
    }

    public void setIdEmpresa(String idEmpresa) {
        validarRegex(idEmpresa, SOLO_NUMEROS, "El idEmpresa debe ser numérico.");
        this.idEmpresa = Long.parseLong(idEmpresa);
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        validarRegex(nombre, SOLO_LETRAS, "El nombre solo puede contener letras.");
        this.nombre = nombre.trim();
    }

    public String getRuc() { return ruc; }

    public void setRuc(String ruc) {
        validarRegex(ruc, RUC_VALIDO, "El RUC debe tener exactamente 13 dígitos.");
        this.ruc = ruc;
    }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty())
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        this.direccion = direccion;
    }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) {
        validarRegex(telefono, TELEFONO_VALIDO, "El teléfono debe tener entre 7 y 10 dígitos.");
        this.telefono = telefono;
    }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) {
        validarRegex(correo, EMAIL_VALIDO, "Correo electrónico inválido.");
        this.correo = correo;
    }

    public Evento[] getEventos() { return eventos; }

    public void setEventos(Evento[] eventos) { this.eventos = eventos; }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    public String toString() {
        return "Empresa: idEmpresa=" + idEmpresa +
                ", nombre=" + nombre +
                ", ruc=" + ruc +
                ", direccion=" + direccion +
                ", telefono=" + telefono +
                ", correo=" + correo +
                ", eventos=" + Arrays.toString(eventos);
    }
}
