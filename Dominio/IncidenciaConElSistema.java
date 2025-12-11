package Dominio;
public class IncidenciaConElSistema extends Incidencia {
    private String idIncidenciaSistema;
    private String moduloAfectado;
    private String detalleTecnico;

    public IncidenciaConElSistema() {
        super();
        this.idIncidenciaSistema="Sin id Sistema";
        this.moduloAfectado="Sin datos";
        this.detalleTecnico="Sin detalles tecnico";
    }

    public IncidenciaConElSistema(String idIncidencia, String idUsuario, String tipoIncidencia,String descripcion, String fechaRegistro, String estado,String referencia, String prioridad,
                                  String idIncidenciaSistema, String moduloAfectado, String detalleTecnico)
    {
        super(idIncidencia, idUsuario, tipoIncidencia, descripcion, fechaRegistro, estado, referencia, prioridad);
        this.idIncidenciaSistema = idIncidenciaSistema;
        this.moduloAfectado = moduloAfectado;
        this.detalleTecnico = detalleTecnico;
    }

    public String getIdIncidenciaSistema() {
        return idIncidenciaSistema;
    }
    public void setIdIncidenciaSistema(String idIncidenciaSistema) {
        this.idIncidenciaSistema = idIncidenciaSistema;
    }
    public String getModuloAfectado() {
        return moduloAfectado;
    }
    public void setModuloAfectado(String moduloAfectado) {
        this.moduloAfectado = moduloAfectado;
    }
    public String getDetalleTecnico() {
        return detalleTecnico;
    }
    public void setDetalleTecnico(String detalleTecnico) {
        this.detalleTecnico = detalleTecnico;
    }

    public String toString() {
        return "IncidenciaConElSistema: idIncidenciaSistema=" + idIncidenciaSistema +
                ", moduloAfectado=" + moduloAfectado + ", detalleTecnico=" + detalleTecnico +
                ", base=" + super.toString() + "";
    }
}
