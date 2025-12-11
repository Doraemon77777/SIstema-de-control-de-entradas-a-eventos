package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprador {

    private long idComprador;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String telefono;
    private boolean activo;

    private static final Pattern SOLO_LETRAS = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");
    private static final Pattern EMAIL_VALIDO = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern CEDULA_VALIDO = Pattern.compile("^[0-9]{5,12}$");

    public Comprador() {
        this.idComprador = 0;
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.cedula = "00000";
        this.correo = "sincorreo@correo.com";
        this.telefono = "0";
        this.activo = true;
    }

    public Comprador(long idComprador, String nombres, String apellidos,
                     String cedula, String correo, String telefono, boolean activo) {

        setIdComprador(idComprador);
        setNombres(nombres);
        setApellidos(apellidos);
        setCedula(cedula);
        setCorreo(correo);
        setTelefono(telefono);
        setActivo(activo);
    }

    public long getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(long idComprador) {
        if (idComprador <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor que 0");
        }
        this.idComprador = idComprador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        validarSoloLetras(nombres, "Los nombres solo deben contener letras.");
        this.nombres = nombres.trim();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        validarSoloLetras(apellidos, "Los apellidos solo deben contener letras.");
        this.apellidos = apellidos.trim();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        validarRegex(cedula, CEDULA_VALIDO, "La cédula no es válida. Debe contener entre 5 y 12 dígitos.");
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        validarRegex(correo, EMAIL_VALIDO, "Correo electrónico inválido.");
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        validarRegex(telefono, SOLO_NUMEROS, "El teléfono solo debe contener números.");
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private void validarSoloLetras(String valor, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");

        Matcher m = SOLO_LETRAS.matcher(valor);

        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");

        Matcher m = pattern.matcher(valor);

        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    @Override
    public String toString() {
        return "Comprador {" +
                "id=" + idComprador +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", activo=" + activo +
                '}';
    }
}
