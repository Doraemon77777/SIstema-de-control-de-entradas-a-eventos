package Dominio;
public class Incidencia {
    private String idIncidencia;
    private String idUsuario;
    private String tipoIncidencia;
    private String descripcion;
    private String fechaRegistro;
    private String estado;
    private String referencia;
    private String prioridad;
    public Incidencia() {
    }

    public Incidencia(String idIncidencia, String idUsuario, String tipoIncidencia,String descripcion, String fechaRegistro, String estado,String referencia, String prioridad)
    {
        this.idIncidencia = idIncidencia;
        this.idUsuario = idUsuario;
        this.tipoIncidencia = tipoIncidencia;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.referencia = referencia;
        this.prioridad = prioridad;
    }

    public String getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(String idIncidencia) {
        this.idIncidencia = idIncidencia;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getTipoIncidencia() {
        return tipoIncidencia;
    }
    public void setTipoIncidencia(String tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String toString() {
        return "Incidencia: idIncidencia=" + idIncidencia + ", idUsuario=" + idUsuario +
                ", tipoIncidencia=" + tipoIncidencia + ", descripcion=" + descripcion +
                ", fechaRegistro=" + fechaRegistro + ", estado=" + estado +
                ", referencia=" + referencia + ", prioridad=" + prioridad + "";
    }
}
