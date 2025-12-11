package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncidenciaFisica extends Incidencia {

    private long idIncidenciaFisica;
    private String ubicacion;
    private String descripcionFisica;

    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");

    public IncidenciaFisica() {
        super();
        this.idIncidenciaFisica = 0;
        this.ubicacion = "Sin ubicación";
        this.descripcionFisica = "Sin descripción física";
    }

    public IncidenciaFisica(String idIncidencia, String idUsuario, String tipoIncidencia,
                            String descripcion, String fechaRegistro, String prioridad,
                            String idIncidenciaFisica, String ubicacion, String descripcionFisica) {
        super(idIncidencia, idUsuario, tipoIncidencia, descripcion, fechaRegistro, prioridad);
        setIdIncidenciaFisica(idIncidenciaFisica);
        setUbicacion(ubicacion);
        setDescripcionFisica(descripcionFisica);
    }

    public long getIdIncidenciaFisica() { return idIncidenciaFisica; }

    public void setIdIncidenciaFisica(String idIncidenciaFisica) {
        validarRegex(idIncidenciaFisica, SOLO_NUMEROS, "El idIncidenciaFisica debe ser numérico.");
        this.idIncidenciaFisica = Long.parseLong(idIncidenciaFisica);
    }

    public String getUbicacion() { return ubicacion; }

    public void setUbicacion(String ubicacion) {
        if (ubicacion == null || ubicacion.trim().isEmpty())
            throw new IllegalArgumentException("La ubicación no puede estar vacía.");
        this.ubicacion = ubicacion;
    }

    public String getDescripcionFisica() { return descripcionFisica; }

    public void setDescripcionFisica(String descripcionFisica) {
        if (descripcionFisica == null || descripcionFisica.trim().isEmpty())
            throw new IllegalArgumentException("La descripción física no puede estar vacía.");
        this.descripcionFisica = descripcionFisica;
    }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    public String toString() {
        return "IncidenciaFisica: idIncidenciaFisica=" + idIncidenciaFisica +
                ", ubicacion=" + ubicacion +
                ", descripcionFisica=" + descripcionFisica +
                ", base=" + super.toString();
    }
}
