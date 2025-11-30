package consola;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ActualizarEvento {
    Scanner sc = new Scanner(System.in);

    public void mostrarGE(){
    }//Fin metodo mostrarGE

    public void actualizarEvento() {
        System.out.println("=== ACTUALIZAR EVENTO ===");

        // 1. Identificador obligatorio
        System.out.print("Nombre del Evento a Actualizar (Origen): ");
        String idEvento = sc.nextLine();

        if (isNullOrEmpty(idEvento)) {
            System.out.println("ERROR: Ingrese Campos Obligatorio de Evento (Debe indicar el evento a actualizar).");
            return;
        }

        // Datos actuales simulados (para contexto visual)
        int entradasVendidas = 100; // DATO SIMULADO según tu caso de uso
        System.out.println(">> Evento encontrado. Entradas vendidas actualmente: " + entradasVendidas);
        System.out.println("Ingrese los nuevos datos (Corrección). Si deja un campo vacío, se mantendrá el valor actual.");

        // 2. Recolección de datos (Corrección)
        System.out.print("Nombre del Evento (Corrección) [Opcional]: ");
        String nuevoNombre = sc.nextLine();

        System.out.print("Fecha del Evento (YYYY-MM-DD) [Opcional]: ");
        String nuevaFechaStr = sc.nextLine(); // "Fecha del Usuario" en tu lista, corregido a Fecha Evento por contexto

        System.out.print("Hora del Evento (HH:MM) [Opcional]: ");
        String nuevaHora = sc.nextLine();

        System.out.print("Aforo Máximo (Corrección) [Opcional]: ");
        String nuevoAforoStr = sc.nextLine();

        System.out.print("Ubicación (Corrección) [Opcional]: ");
        String nuevaUbicacion = sc.nextLine();

        System.out.print("Estado (Corrección) [Opcional]: ");
        String nuevoEstado = sc.nextLine();

        System.out.print("Descripción (Corrección) [Opcional]: ");
        String nuevaDescripcion = sc.nextLine();


        // 3. Validaciones

        // A) Validación: Fallo de Fechas (Solo si el usuario ingresó una nueva fecha)
        if (!isNullOrEmpty(nuevaFechaStr)) {
            try {
                LocalDate fechaEvento = LocalDate.parse(nuevaFechaStr);
                LocalDate fechaActual = LocalDate.now();

                if (!fechaEvento.isAfter(fechaActual)) {
                    System.out.println("ERROR: La fecha del evento debe ser posterior a la actual.");
                    return;
                }
            } catch (DateTimeParseException e) {
                System.out.println("ERROR: Formato de fecha inválido. Use YYYY-MM-DD.");
                return;
            }
        }

        // B) Validación: Aforo (Solo si el usuario ingresó un nuevo aforo)
        if (!isNullOrEmpty(nuevoAforoStr)) {
            try {
                int nuevoAforo = Integer.parseInt(nuevoAforoStr);

                // Validación 1: Aforo Inválido (Positivo mayor a cero)
                if (nuevoAforo <= 0) {
                    System.out.println("ERROR: El aforo debe ser un número positivo mayor a cero.");
                    return;
                }

                // Validación 2: Conflicto de Aforo (Nueva capacidad vs Ventas realizadas)
                if (nuevoAforo < entradasVendidas) {
                    System.out.println("ERROR: No se puede reducir el aforo por debajo de la cantidad de entradas vendidas (" + entradasVendidas + ").");
                    return;
                }

            } catch (NumberFormatException e) {
                System.out.println("ERROR: El aforo debe ser un número válido.");
                return;
            }
        }

        // 4. Simulación de Actualización Exitosa
        System.out.println("Evento actualizado correctamente (Simulado).");

        // Resumen de cambios
        if (!isNullOrEmpty(nuevoNombre)) System.out.println(" - Nombre actualizado a: " + nuevoNombre);
        if (!isNullOrEmpty(nuevaFechaStr)) System.out.println(" - Fecha actualizada a: " + nuevaFechaStr);
        if (!isNullOrEmpty(nuevoAforoStr)) System.out.println(" - Aforo actualizado a: " + nuevoAforoStr);
        else System.out.println(" - Aforo: (Sin cambios, mantiene capacidad para " + entradasVendidas + " ventas)");

    }

    // Helper (Igual al de tu equipo)
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

}// Fin clase ActualizarEvento
