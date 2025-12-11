package Dominio;

public class IncidenciaFisica extends Incidencia {
    private String idIncidenciaFisica;
    private String ubicacion;
    private String descripcionFisica;

    public IncidenciaFisica() {
        super();
        this.idIncidenciaFisica="Sin id";
        this.ubicacion="Sin ubicación";
        this.descripcionFisica="Sin descripcion";
    }

    public IncidenciaFisica(String idIncidencia, String idUsuario, String tipoIncidencia,String descripcion, String fechaRegistro, String estado, String referencia, String prioridad, String idIncidenciaFisica, String ubicacion, String descripcionFisica) {
        super(idIncidencia, idUsuario, tipoIncidencia, descripcion, fechaRegistro, estado, referencia, prioridad);
        this.idIncidenciaFisica = idIncidenciaFisica;
        this.ubicacion = ubicacion;
        this.descripcionFisica = descripcionFisica;
    }
    public String getIdIncidenciaFisica() {
        return idIncidenciaFisica; }
    public void setIdIncidenciaFisica(String idIncidenciaFisica) {
        this.idIncidenciaFisica = idIncidenciaFisica; }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getDescripcionFisica() {
        return descripcionFisica;
    }
    public void setDescripcionFisica(String descripcionFisica) {
        this.descripcionFisica = descripcionFisica;
    }
    public String toString() {
        return "IncidenciaFisica: idIncidenciaFisica=" + idIncidenciaFisica + ", ubicacion= " + ubicacion +
                ", descripcionFisica=" + descripcionFisica + ", base=" + super.toString() + "";
    }

}
