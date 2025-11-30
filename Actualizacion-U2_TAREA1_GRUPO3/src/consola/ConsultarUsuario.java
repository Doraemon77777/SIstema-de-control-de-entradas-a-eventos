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

            // Generar Reporte para este usuario específico
            generarReporteUsuario(nombre);

        } else if (criterio.equalsIgnoreCase("Grupal")) {
            // Simulación de búsqueda grupal (no funcional)
            System.out.println("Resultados de búsqueda grupal (simulado):");
            System.out.println("1) usuario1 - Juan Pérez - ejemplo1@dominio.com");
            System.out.println("2) usuario2 - María Gómez - ejemplo2@dominio.com");
            System.out.println("3) usuario3 - Luis Torres - ejemplo3@dominio.com");

            // Generar Reporte General
            generarReporteUsuario("Lista General de Usuarios");

        } else {
            System.out.println("ERROR: Criterio inválido. Ingrese 'Individual' o 'Grupal'.");
        }
    }

    // Método para simular el sub-proceso de Generación de Reporte (Adaptado a Usuarios)
    private void generarReporteUsuario(String contexto) {
        System.out.println("... [HU0.4.1] Iniciando generación de reporte para \"" + contexto + "\" ...");
        System.out.println("   - Recopilando historial de actividad...");
        System.out.println("   - Verificando permisos y roles...");

        // Sub-proceso Exportar PDF (Obligatorio)
        exportarPDF();
    }

    // Método para simular la exportación a PDF
    private void exportarPDF() {
        System.out.println("... [HU0.4.1.0] Exportando documento final ...");
        System.out.println("SUCCESS: Reporte generado y exportado a PDF correctamente. Entregado al usuario.");
    }

    // Helper
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
