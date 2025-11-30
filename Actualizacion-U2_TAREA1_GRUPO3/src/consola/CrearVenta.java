package consola;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrearVenta {
    public void mostrarGV(){
    }

    public void crearVenta() {
        System.out.println("== REGISTRAR VENTA (CREAR) ==");
        Scanner sc = new Scanner(System.in);

        // --- 1. Recolección de Datos ---

        System.out.print("Número de Compra: ");
        String numCompra = sc.nextLine();

        System.out.print("Usuario (ID o Correo): ");
        String usuario = sc.nextLine();

        // Fecha asignada automáticamente por el sistema (Requerimiento)
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaCompra = fechaActual.format(formatter);
        System.out.println("Fecha de Compra (Sistema): " + fechaCompra);

        System.out.print("Tipo de Boleto (General/VIP) [Opcional]: ");
        String tipoBoleto = sc.nextLine();

        System.out.print("Cantidad de Boletos: ");
        String cantidadStr = sc.nextLine();

        System.out.print("Confirmación de términos (Acepto/No): ");
        String confirmacion = sc.nextLine();


        // --- 2. Validaciones ---

        // A) Validación: No ha iniciado sesión (Simulada)
        // Si no se ingresa un usuario válido, simulamos que no hay sesión activa.
        if (isNullOrEmpty(usuario)) {
            System.out.println("ERROR: No ha iniciado sesión. El sistema redirige al Login...");
            return;
        }

        // B) Validación: Campos Vacíos (Generales)
        if (isNullOrEmpty(numCompra) || isNullOrEmpty(cantidadStr) || isNullOrEmpty(confirmacion)) {
            System.out.println("ERROR: Ingrese todos los campos obligatorios.");
            return;
        }

        // C) Validación: Confirmación de Términos
        if (!confirmacion.equalsIgnoreCase("Acepto")) {
            System.out.println("ERROR: Debe aceptar los términos y políticas para proceder.");
            return;
        }

        // D) Validación: Stock y Cantidad
        int cantidad = 0;
        int stockDisponible = 50; // SIMULACIÓN: Stock hardcodeado para pruebas

        try {
            cantidad = Integer.parseInt(cantidadStr);

            if (cantidad <= 0) {
                System.out.println("ERROR: La cantidad debe ser mayor a cero.");
                return;
            }

            // Validación específica: "La cantidad supera el stock"
            if (cantidad > stockDisponible) {
                System.out.println("ERROR: Boletos insuficientes. Stock disponible: " + stockDisponible);
                return;
            }

        } catch (NumberFormatException e) {
            System.out.println("ERROR: La cantidad debe ser un número válido.");
            return;
        }

        // E) Validación: El pago no es aprobado (Simulación Interactiva)
        // Preguntamos al tester si quiere simular un pago exitoso o fallido
        System.out.print(">> Simulador Pasarela de Pago: ¿Aprobar pago? (Si/No): ");
        String estadoPago = sc.nextLine();

        if (!estadoPago.equalsIgnoreCase("Si")) {
            System.out.println("ERROR: El pago no fue aprobado por la entidad financiera. Operación cancelada.");
            return; // No descuenta boletos, sale del método.
        }

        // --- 3. Éxito ---
        // Si llega aquí, todo es válido.
        System.out.println("Venta registrada exitosamente.");
        System.out.println("Resumen: Compra #" + numCompra + " | Usuario: " + usuario + " | Total Boletos: " + cantidad);
    }

    // Helper (Estilo del equipo)
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
