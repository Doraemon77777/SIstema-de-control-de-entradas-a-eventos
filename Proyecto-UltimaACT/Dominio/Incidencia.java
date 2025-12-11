package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Incidencia {

    private long idIncidencia;
    private long idUsuario;
    private String tipoIncidencia;
    private String descripcion;
    private String fechaRegistro;
    private String prioridad;
    private boolean activa;

    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");
    private static final Pattern SOLO_LETRAS = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    private static final Pattern FECHA_VALIDO = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

    public Incidencia() {
        this.idIncidencia = 0;
        this.idUsuario = 0;
        this.tipoIncidencia = "No definido";
        this.descripcion = "Sin descripción";
        this.fechaRegistro = "1900-01-01";
        this.prioridad = "Normal";
        this.activa = true;
    }

    public Incidencia(String idIncidencia, String idUsuario, String tipoIncidencia,
                      String descripcion, String fechaRegistro, String prioridad) {

        setIdIncidencia(idIncidencia);
        setIdUsuario(idUsuario);
        setTipoIncidencia(tipoIncidencia);
        setDescripcion(descripcion);
        setFechaRegistro(fechaRegistro);
        setPrioridad(prioridad);
        this.activa = true;
    }

    public long getIdIncidencia() { return idIncidencia; }

    public void setIdIncidencia(String idIncidencia) {
        validarRegex(idIncidencia, SOLO_NUMEROS, "El idIncidencia debe ser numérico.");
        this.idIncidencia = Long.parseLong(idIncidencia);
    }

    public long getIdUsuario() { return idUsuario; }

    public void setIdUsuario(String idUsuario) {
        validarRegex(idUsuario, SOLO_NUMEROS, "El idUsuario debe ser numérico.");
        this.idUsuario = Long.parseLong(idUsuario);
    }

    public String getTipoIncidencia() { return tipoIncidencia; }

    public void setTipoIncidencia(String tipoIncidencia) {
        validarRegex(tipoIncidencia, SOLO_LETRAS, "El tipo de incidencia solo puede contener letras.");
        this.tipoIncidencia = tipoIncidencia.trim();
    }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty())
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        this.descripcion = descripcion;
    }

    public String getFechaRegistro() { return fechaRegistro; }

    public void setFechaRegistro(String fechaRegistro) {
        validarRegex(fechaRegistro, FECHA_VALIDO, "La fecha debe tener formato YYYY-MM-DD.");
        this.fechaRegistro = fechaRegistro;
    }

    public String getPrioridad() { return prioridad; }

    public void setPrioridad(String prioridad) {
        validarRegex(prioridad, SOLO_LETRAS, "La prioridad solo puede contener letras.");
        this.prioridad = prioridad.trim();
    }

    public boolean isActiva() { return activa; }

    public void setActiva(boolean activa) { this.activa = activa; }

    private void validarRegex(String valor, Pattern pattern, String error) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(error);
    }

    public String toString() {
        return "Incidencia: idIncidencia=" + idIncidencia +
                ", idUsuario=" + idUsuario +
                ", tipoIncidencia=" + tipoIncidencia +
                ", descripcion=" + descripcion +
                ", fechaRegistro=" + fechaRegistro +
                ", prioridad=" + prioridad +
                ", activa=" + activa;
    }
}
