package consola;

import java.util.Scanner;

public class EliminarEvento {
    Scanner sc = new Scanner(System.in);

    public void mostrarGE(){
    }

    // Helper method (Mismo estilo del equipo)
    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public void eliminarEvento() {
        System.out.println("=== ELIMINAR EVENTO ===");

        // 1. Recolección de Datos
        System.out.print("Nombre de Evento a Eliminar: ");
        String nombreEvento = sc.nextLine();

        System.out.print("Motivo: ");
        String motivo = sc.nextLine();

        System.out.print("¿Seguro que desea eliminar este evento? (Si/No): ");
        String confirmacion = sc.nextLine();

        // 2. Validaciones

        // A) Validación: Campos Vacíos
        if (isNullOrEmpty(nombreEvento) || isNullOrEmpty(motivo) || isNullOrEmpty(confirmacion)) {
            System.out.println("ERROR: Existen campos vacíos. Complete todos los datos.");
            return;
        }

        // B) Validación: Evento con Ventas Activas
        // NOTA: Aquí iría la consulta a Base de Datos real.
        // SIMULACIÓN: Para probar esta validación, asumimos que si el evento se llama "EventoTop", tiene ventas.
        boolean tieneVentasActivas = (nombreEvento.equalsIgnoreCase("EventoTop"));

        if (tieneVentasActivas) {
            System.out.println("ERROR: El evento tiene ventas asociadas. No se puede eliminar, debe proceder a CANCELARLO.");
            return;
        }

        // C) Validación: Confirmación negativa
        if (!confirmacion.equalsIgnoreCase("Si")) {
            System.out.println("Operación cancelada por el usuario.");
            return;
        }

        // 3. Eliminación Exitosa (Simulada)
        // El sistema elimina permanentemente el registro
        System.out.println("Evento \"" + nombreEvento + "\" eliminado del sistema.");
    }
}
