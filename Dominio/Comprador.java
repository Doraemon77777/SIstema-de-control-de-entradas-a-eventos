package Dominio;

public class Comprador {
    private String idComprador;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String telefono;
    public Comprador() {
    }
    public Comprador(String idComprador, String nombres, String apellidos,
                     String cedula, String correo, String telefono) {
        this.idComprador = idComprador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }
    public String getIdComprador() {
        return idComprador;
    }
    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
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
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String toString() {
        return "Comprador: idComprador= " + idComprador + ", nombres= " + nombres +", apellidos= " + apellidos + ", cedula= " + cedula+ ", correo= " +correo+
                ", telefono= " + telefono + "";
    }
}
