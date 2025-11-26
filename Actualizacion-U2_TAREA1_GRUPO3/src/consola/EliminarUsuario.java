package consola;

import java.util.Scanner;

public class EliminarUsuario {
    Scanner sc = new Scanner(System.in);

    public void mostrarGU(){

    }
    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    public void eliminarUsuario() {
        System.out.println("=== ELIMINAR USUARIO ===");

        System.out.print("Nombre del Usuario a Eliminar: ");
        String usuario = sc.nextLine();

        System.out.print("Motivo de Baja: ");
        String motivo = sc.nextLine();

        System.out.print("¿Seguro que desea eliminar este usuario? (Si/No): ");
        String confirmacion = sc.nextLine();

        // Validación HU0.2: campos vacíos
        if (isNullOrEmpty(usuario) || isNullOrEmpty(motivo) || isNullOrEmpty(confirmacion)) {
            System.out.println("ERROR: Existen campos vacíos. Complete todos los datos.");
            return;
        }

        // Validación confirmación
        if (!confirmacion.equalsIgnoreCase("Si")) {
            System.out.println("Operación cancelada por el usuario.");
            return;
        }

        // Como el sistema no es funcional, simulamos la eliminación.
        System.out.println("El usuario \"" + usuario + "\" ha sido eliminado exitosamente (simulado).");
    }
}
