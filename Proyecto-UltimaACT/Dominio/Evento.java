package Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Evento {

    private long idEvento;
    private String nombres;
    private String fecha;
    private String hora;
    private int aforoMaximo;
    private String ubicacion;
    private String estado;
    private String descripcion;
    private Empresa empresa;
    private boolean activa;

    private static final Pattern SOLO_NUMEROS = Pattern.compile("^[0-9]+$");
    private static final Pattern SOLO_LETRAS = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    private static final Pattern FECHA_VALIDO = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    private static final Pattern HORA_VALIDO = Pattern.compile("^([01]?\\d|2[0-3]):[0-5]\\d$");

    public Evento(String ev1, String fiestasDeNavidad, String date, String time, int i, String universidadCentral, String activo, String unConciertoParaDivertirse, Entrada[] entradas, Empresa empresa) {
        this.idEvento = 0;
        this.nombres = "Sin nombres";
        this.fecha = "1900-01-01";
        this.hora = "00:00";
        this.aforoMaximo = 0;
        this.ubicacion = "Sin Ubicación";
        this.estado = "Sin estado";
        this.descripcion = "Sin descripción";
        this.empresa = null;
        this.activa = true;
    }

    public Evento(String idEvento, String nombres, String fecha, String hora, int aforoMaximo,
                  String ubicacion, String estado, String descripcion, Empresa empresa) {

        setIdEvento(idEvento);
        setNombres(nombres);
        setFecha(fecha);
        setHora(hora);
        setAforoMaximo(aforoMaximo);
        setUbicacion(ubicacion);
        setEstado(estado);
        setDescripcion(descripcion);
        setEmpresa(empresa);
        this.activa = true;
    }

    public long getIdEvento() { return idEvento; }

    public void setIdEvento(String idEvento) {
        validarRegex(idEvento, SOLO_NUMEROS, "El idEvento debe ser numérico.");
        this.idEvento = Long.parseLong(idEvento);
    }

    public String getNombres() { return nombres; }

    public void setNombres(String nombres) {
        validarRegex(nombres, SOLO_LETRAS, "El nombre del evento solo puede contener letras.");
        this.nombres = nombres.trim();
    }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) {
        validarRegex(fecha, FECHA_VALIDO, "La fecha debe tener formato YYYY-MM-DD.");
        this.fecha = fecha;
    }

    public String getHora() { return hora; }

    public void setHora(String hora) {
        validarRegex(hora, HORA_VALIDO, "La hora debe tener formato HH:MM 24h.");
        this.hora = hora;
    }

    public int getAforoMaximo() { return aforoMaximo; }

    public void setAforoMaximo(int aforoMaximo) {
        if (aforoMaximo < 0)
            throw new IllegalArgumentException("El aforo máximo no puede ser negativo.");
        this.aforoMaximo = aforoMaximo;
    }

    public String getUbicacion() { return ubicacion; }

    public void setUbicacion(String ubicacion) {
        if (ubicacion == null || ubicacion.trim().isEmpty())
            throw new IllegalArgumentException("La ubicación no puede estar vacía.");
        this.ubicacion = ubicacion;
    }

    public String getEstado() { return estado; }

    public void setEstado(String estado) {
        validarRegex(estado, SOLO_LETRAS, "El estado solo puede contener letras.");
        this.estado = estado.trim();
    }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty())
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        this.descripcion = descripcion;
    }

    public Empresa getEmpresa() { return empresa; }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean isActiva() { return activa; }

    public void setActiva(boolean activa) { this.activa = activa; }

    private void validarRegex(String valor, Pattern pattern, String mensajeError) {
        if (valor == null || valor.trim().isEmpty())
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        Matcher m = pattern.matcher(valor);
        if (!m.matches())
            throw new IllegalArgumentException(mensajeError);
    }

    public String toString() {
        return "Evento: idEvento=" + idEvento +
                ", nombres=" + nombres +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", aforoMaximo=" + aforoMaximo +
                ", ubicacion=" + ubicacion +
                ", estado=" + estado +
                ", descripcion=" + descripcion +
                ", empresa=" + (empresa != null ? empresa.getNombre() : "null") +
                ", activa=" + activa;
    }
}
