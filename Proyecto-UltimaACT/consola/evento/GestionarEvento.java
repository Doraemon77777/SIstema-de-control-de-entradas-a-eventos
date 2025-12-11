package consola.evento;

public class GestionarEvento {

    private Evento[] eventos;
    private int numEventos;

    public GestionarEvento() {
        this.eventos = new Evento[20];
        this.numEventos = 0;
    }
    private static class Evento {
        int idEvento;
        String nombres;
        String fecha;
        String hora;
        int aforoMaximo;
        String ubicacion;
        String estado;
        String descripcion;

        public Evento(int idEvento, String nombres, String fecha, String hora, int aforoMaximo, String ubicacion, String estado, String descripcion) {
            this.idEvento = idEvento;
            this.nombres = nombres;
            this.fecha = fecha;
            this.hora = hora;
            this.aforoMaximo = aforoMaximo;
            this.ubicacion = ubicacion;
            this.estado = estado;
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "ID: " + idEvento +
                    " | Nombre: " + nombres +
                    " | Fecha: " + fecha +
                    " | Hora: " + hora +
                    " | Aforo: " + aforoMaximo +
                    " | Ubicación: " + ubicacion +
                    " | Estado: " + estado +
                    " | Descripción: " + descripcion;
        }
    }


    public boolean crearEvento(int idEvento, String nombres, String fecha, String hora,
                               int aforoMaximo, String ubicacion, String estado, String descripcion) {

        if (numEventos >= eventos.length) return false;

        eventos[numEventos] = new Evento(
                idEvento, nombres, fecha, hora,
                aforoMaximo, ubicacion, estado, descripcion
        );
        numEventos++;
        return true;
    }

    public boolean actualizarEvento(int idEvento, String nuevosNombres, String nuevaFecha, String nuevaHora,
                                    int nuevoAforo, String nuevaUbicacion, String nuevoEstado, String nuevaDescripcion) {

        Evento ev = buscarEvento(idEvento);
        if (ev == null) return false;

        ev.nombres = nuevosNombres;
        ev.fecha = nuevaFecha;
        ev.hora = nuevaHora;
        ev.aforoMaximo = nuevoAforo;
        ev.ubicacion = nuevaUbicacion;
        ev.estado = nuevoEstado;
        ev.descripcion = nuevaDescripcion;

        return true;
    }

    public boolean eliminarEvento(int idEvento) {
        int pos = -1;

        for (int i = 0; i < numEventos; i++) {
            if (eventos[i].idEvento == idEvento) {
                pos = i;
                break;
            }
        }

        if (pos == -1) return false;

        for (int i = pos; i < numEventos - 1; i++) {
            eventos[i] = eventos[i + 1];
        }

        eventos[numEventos - 1] = null;
        numEventos--;

        return true;
    }

    public Object consultarEvento(int idEvento) {
        return buscarEvento(idEvento);
    }

    private Evento buscarEvento(int idEvento) {
        for (int i = 0; i < numEventos; i++) {
            if (eventos[i].idEvento == idEvento) return eventos[i];
        }
        return null;
    }
}
