package consola;
import java.util.Scanner;

public class ConsultarUsuario {
 Scanner sc= new Scanner(System.in);
    public void mostrarGU(){

    }
    public void consultarUsuario() {
        System.out.println("=== CONSULTAR USUARIO ===");

        System.out.print("Criterio de Búsqueda (Individual/Grupal): ");
        String criterio = sc.nextLine();

        if (isNullOrEmpty(criterio)) {
            System.out.println("ERROR: Debe seleccionar un criterio de búsqueda (Individual o Grupal).");
            return;
        }

        // Normalizar entrada
        criterio = criterio.trim();

        if (criterio.equalsIgnoreCase("Individual")) {
            System.out.print("Nombre de Usuario (para búsqueda individual): ");
            String nombre = sc.nextLine();

            if (isNullOrEmpty(nombre)) {
                System.out.println("ERROR: En búsqueda individual debe ingresar el Nombre de Usuario.");
                return;
            }

            // Simulación de búsqueda individual (no funcional)
            System.out.println("Resultados de búsqueda (simulado) para usuario: " + nombre);
            System.out.println(" -> Usuario: " + nombre + " | Nombres: Juan | Apellidos: Pérez | Correo: ejemplo@dominio.com");
        } else if (criterio.equalsIgnoreCase("Grupal")) {
            // Simulación de búsqueda grupal (no funcional)
            System.out.println("Resultados de búsqueda grupal (simulado):");
            System.out.println("1) usuario1 - Juan Pérez - ejemplo1@dominio.com");
            System.out.println("2) usuario2 - María Gómez - ejemplo2@dominio.com");
            System.out.println("3) usuario3 - Luis Torres - ejemplo3@dominio.com");
        } else {
            System.out.println("ERROR: Criterio inválido. Ingrese 'Individual' o 'Grupal'.");
        }
    }
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
