package consola;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CrearEvento {
    public void mostrarGE(){
    }//fin metodo mostrarGE
    public void crearEvento() {
        System.out.println("== CREAR EVENTO ==");
        Scanner sc = new Scanner(System.in);

        // 1. Recolección de Datos (Campos)
        System.out.print("Nombre del Evento: ");
        String nombreEvento = sc.nextLine();

        System.out.print("Fecha del Evento (YYYY-MM-DD): ");
        String fechaEventoStr = sc.nextLine();

        System.out.print("Hora del Evento (HH:MM): ");
        String horaEvento = sc.nextLine();

        System.out.print("Aforo Máximo: ");
        String aforoStr = sc.nextLine(); // Leemos como String para validar si está vacío primero

        System.out.print("Ubicación: ");
        String ubicacion = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        // Campo Opcional (No se validará si está vacío)
        System.out.print("Descripción (Opcional): ");
        String descripcion = sc.nextLine();

        // 2. Validaciones

        // A) Validación: Campos Vacíos (Solo los obligatorios)
        if (isNullOrEmpty(nombreEvento) || isNullOrEmpty(fechaEventoStr) ||
                isNullOrEmpty(horaEvento) || isNullOrEmpty(aforoStr) ||
                isNullOrEmpty(ubicacion) || isNullOrEmpty(estado)) {

            System.out.println("ERROR: Ingrese Campos Obligatorio de Evento.");
            return;
        }

        // B) Validación: Aforo Inválido (Debe ser numérico y mayor a 0)
        int aforo = 0;
        try {
            aforo = Integer.parseInt(aforoStr);
            if (aforo <= 0) {
                System.out.println("ERROR: El aforo debe ser un número positivo mayor a cero.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR: El aforo debe ser un número válido.");
            return;
        }

        // C) Validación: Fallo de Fechas (Debe ser posterior a hoy)
        try {
            // Parseamos la fecha ingresada (Formato ISO: Año-Mes-Dia)
            LocalDate fechaEvento = LocalDate.parse(fechaEventoStr);
            LocalDate fechaActual = LocalDate.now();

            // Si la fecha del evento es anterior (isBefore) o igual (isEqual) a hoy
            // El requerimiento dice "posterior a la actual", así que hoy no cuenta.
            if (!fechaEvento.isAfter(fechaActual)) {
                System.out.println("ERROR: La fecha del evento debe ser posterior a la actual.");
                return;
            }
        } catch (DateTimeParseException e) {
            System.out.println("ERROR: Formato de fecha inválido. Use el formato YYYY-MM-DD (ej: 2025-12-31).");
            return;
        }

        // Si llega aquí, pasó todas las validaciones
        System.out.println("Evento creado correctamente (simulado).");
        System.out.println("Evento: " + nombreEvento + " | Fecha: " + fechaEventoStr + " | Aforo: " + aforo);
    }

    // Helper method (igual al de tu equipo)
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

}// fin clases
