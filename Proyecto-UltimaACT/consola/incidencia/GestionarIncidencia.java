package consola.incidencia;

public class GestionarIncidencia {

    private Incidencia[] incidencias;
    private int numIncidencias;

    public GestionarIncidencia() {
        this.incidencias = new Incidencia[20];
        this.numIncidencias = 0;
    }

    private static class Incidencia {
        int idIncidencia;
        int idUsuario;
        String tipoIncidencia;
        String descripcion;
        String fechaRegistro;
        String estado;
        String referencia;
        String prioridad;

        public Incidencia(int idIncidencia, int idUsuario, String tipoIncidencia,
                          String descripcion, String fechaRegistro, String estado,
                          String referencia, String prioridad) {

            this.idIncidencia = idIncidencia;
            this.idUsuario = idUsuario;
            this.tipoIncidencia = tipoIncidencia;
            this.descripcion = descripcion;
            this.fechaRegistro = fechaRegistro;
            this.estado = estado;
            this.referencia = referencia;
            this.prioridad = prioridad;
        }

        @Override
        public String toString() {
            return "ID: " + idIncidencia +
                    " | Usuario: " + idUsuario +
                    " | Tipo: " + tipoIncidencia +
                    " | Descripción: " + descripcion +
                    " | Fecha: " + fechaRegistro +
                    " | Estado: " + estado +
                    " | Referencia: " + referencia +
                    " | Prioridad: " + prioridad;
        }
    }

    public boolean crearIncidencia(int id, int idUsuario, String tipo, String descripcion,
                                   String fecha, String estado, String referencia,
                                   String prioridad) {

        if (numIncidencias >= incidencias.length) return false;

        incidencias[numIncidencias] = new Incidencia(
                id, idUsuario, tipo, descripcion, fecha, estado, referencia, prioridad
        );

        numIncidencias++;
        return true;
    }

    public boolean actualizarIncidencia(int id, int nuevoIdUsuario, String nuevoTipo,
                                        String nuevaDescripcion, String nuevaFecha,
                                        String nuevoEstado, String nuevaReferencia,
                                        String nuevaPrioridad) {

        Incidencia in = buscarIncidencia(id);
        if (in == null) return false;

        in.idUsuario = nuevoIdUsuario;
        in.tipoIncidencia = nuevoTipo;
        in.descripcion = nuevaDescripcion;
        in.fechaRegistro = nuevaFecha;
        in.estado = nuevoEstado;
        in.referencia = nuevaReferencia;
        in.prioridad = nuevaPrioridad;

        return true;
    }

    public boolean eliminarIncidencia(int id) {
        int pos = -1;

        for (int i = 0; i < numIncidencias; i++) {
            if (incidencias[i].idIncidencia == id) {
                pos = i;
                break;
            }
        }

        if (pos == -1) return false;

        for (int i = pos; i < numIncidencias - 1; i++) {
            incidencias[i] = incidencias[i + 1];
        }

        incidencias[numIncidencias - 1] = null;
        numIncidencias--;

        return true;
    }

    public Incidencia consultarIncidencia(int id) {
        return buscarIncidencia(id);
    }

    private Incidencia buscarIncidencia(int id) {
        for (int i = 0; i < numIncidencias; i++) {
            if (incidencias[i].idIncidencia == id) return incidencias[i];
        }
        return null;
    }
}
