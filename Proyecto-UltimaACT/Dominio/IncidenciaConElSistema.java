package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncidenciaConElSistema extends Incidencia {

    private long idIncidenciaSistema;
    private String moduloAfectado;
    private String detalleTecnico;

    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");

    public IncidenciaConElSistema() {
        super();
        this.idIncidenciaSistema = 0;
        this.moduloAfectado = "Sin datos";
        this.detalleTecnico = "Sin detalles técnicos";
    }

    public IncidenciaConElSistema(String idIncidencia, String idUsuario, String tipoIncidencia,
                                  String descripcion, String fechaRegistro, String prioridad,
                                  String idIncidenciaSistema, String moduloAfectado, String detalleTecnico) {
        super(idIncidencia, idUsuario, tipoIncidencia, descripcion, fechaRegistro, prioridad);
        setIdIncidenciaSistema(idIncidenciaSistema);
        setModuloAfectado(moduloAfectado);
        setDetalleTecnico(detalleTecnico);
    }

    public long getIdIncidenciaSistema() { return idIncidenciaSistema; }

    public void setIdIncidenciaSistema(String idIncidenciaSistema) {
        validarRegex(idIncidenciaSistema, SOLO_NUMEROS, "El idIncidenciaSistema debe ser numérico.");
        this.idIncidenciaSistema = Long.parseLong(idIncidenciaSistema);
    }

    public String getModuloAfectado() { return moduloAfectado; }

    public void setModuloAfectado(String moduloAfectado) {
        if (moduloAfectado == null || moduloAfectado.trim().isEmpty())
            throw new IllegalArgumentException("El módulo afectado no puede estar vacío.");
        this.moduloAfectado = moduloAfectado;
    }

    public String getDetalleTecnico() { return detalleTecnico; }

    public void setDetalleTecnico(String detalleTecnico) {
        if (detalleTecnico == null || detalleTecnico.trim().isEmpty())
            throw new IllegalArgumentException("El detalle técnico no puede estar vacío.");
        this.detalleTecnico = detalleTecnico;
    }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    public String toString() {
        return "IncidenciaConElSistema: idIncidenciaSistema=" + idIncidenciaSistema +
                ", moduloAfectado=" + moduloAfectado +
                ", detalleTecnico=" + detalleTecnico +
                ", base=" + super.toString();
    }
}
