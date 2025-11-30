package consola;
import java.util.Scanner;

public class ConsultarEvento {
    Scanner sc = new Scanner(System.in);
    public void mostrarGE(){
    }

    public void consultarEvento() {
        System.out.println("=== CONSULTAR EVENTO ===");

        // 1. Recolección de Datos
        System.out.print("Nombre Evento a Consultar: ");
        String nombreEvento = sc.nextLine();

        // 2. Validaciones

        // A) Validación: Campos Vacíos
        if (isNullOrEmpty(nombreEvento)) {
            System.out.println("ERROR: Ingrese Campos Obligatorio de Nombre Evento.");
            return;
        }

        // B) Validación: Eventos no Existentes (Simulación)
        // LÓGICA: Para probar este error, asumiremos que si el usuario escribe "Desconocido", el evento no existe.
        // En un sistema real, esto sería una consulta a la BD.
        if (nombreEvento.equalsIgnoreCase("Desconocido")) {
            System.out.println("ERROR: Evento no Existente.");
            return;
        }

        // 3. Resultado de la Consulta (Simulado)
        System.out.println(">> Evento encontrado en el sistema.");
        System.out.println("   Nombre: " + nombreEvento);
        System.out.println("   Fecha: 2025-11-20 | Estado: Activo | Entradas Vendidas: 150/200");

        // 4. Ejecución de Sub-procesos Obligatorios (Reporte y PDF)
        // HU1.3.0 - Generar Reporte Evento
        generarReporteEvento(nombreEvento);
    }

    // Método para simular el sub-proceso HU1.3.0
    private void generarReporteEvento(String nombre) {
        System.out.println("... [HU1.3.0] Iniciando generación de reporte para \"" + nombre + "\" ...");
        System.out.println("   - Recopilando estadísticas de asistencia...");
        System.out.println("   - Calculando ingresos totales...");

        // HU1.3.0.0 - Exportar un PDF (Obligatorio dentro del reporte)
        exportarPDF();
    }

    // Método para simular el sub-proceso HU1.3.0.0
    private void exportarPDF() {
        System.out.println("... [HU1.3.0.0] Exportando documento final ...");
        System.out.println("SUCCESS: Reporte generado y exportado a PDF correctamente. Entregado al usuario.");
    }

    // Helper
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
