package Dominio;
import java.util.Arrays;

public class Usuario {
    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String contrasena;
    private String rol;
    private String estado;
    private String fechaRegistro;
    private Incidencia[] incidencias;

    public Usuario() {
        this.incidencias = new Incidencia[0];
    }

    public Usuario(String idUsuario, String nombres, String apellidos, String correo,
                   String contrasena, String rol, String estado, String fechaRegistro,
                   Incidencia[] incidencias) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.incidencias = incidencias == null ? new Incidencia[0] : incidencias;
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
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
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
                ", correo=" + correo + ", rol='" + rol + ", estado=" + estado +
                ", fechaRegistro=" + fechaRegistro + ", incidencias=" + Arrays.toString(incidencias) + "";
    }
}
