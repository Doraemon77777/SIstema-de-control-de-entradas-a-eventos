package consola;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CrearVenta {
    public void mostrarGV(){
    }

    public void crearVenta() {
        System.out.println("== CREAR VENTA ==");
        Scanner sc = new Scanner(System.in);

        // --- 1. Recolección de Datos ---

        System.out.print("Número de Compra: ");
        String numCompra = sc.nextLine();

        System.out.print("Comprador correo: ");
        String correo = sc.nextLine();

        System.out.print("Nombre del comprador: ");
        String nombreComprador = sc.nextLine();

        // Fecha asignada automáticamente por el sistema
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaCompra = fechaActual.format(formatter);
        System.out.println("Fecha de Compra (Sistema): " + fechaCompra);

        System.out.print("Cantidad de Boletos: ");
        String cantidadStr = sc.nextLine();

        System.out.print("Tipo de Boleto (General/VIP) [Opcional]: ");
        String tipoBoleto = sc.nextLine();


        // --- 2. Validaciones ---

        // A) Validación: Campos Vacíos (Obligatorios)
        // Se valida Número, Correo, Nombre y Cantidad. Tipo de boleto es Opcional.
        if (isNullOrEmpty(numCompra) || isNullOrEmpty(correo) ||
                isNullOrEmpty(nombreComprador) || isNullOrEmpty(cantidadStr)) {
            System.out.println("ERROR: Ingrese todos los campos obligatorios (Número, Correo, Nombre, Cantidad).");
            return;
        }

        // B) Validación: Correo del Comprador (Debe contener '@')
        if (!correo.contains("@")) {
            System.out.println("ERROR: El correo ingresado no es válido (falta '@').");
            return;
        }

        // C) Validación: Stock y Cantidad
        int cantidad = 0;
        int stockDisponible = 50; // SIMULACIÓN: Stock hardcodeado para pruebas

        try {
            cantidad = Integer.parseInt(cantidadStr);

            if (cantidad <= 0) {
                System.out.println("ERROR: La cantidad debe ser mayor a cero.");
                return;
            }

            // Validación: "La cantidad supera el stock"
            if (cantidad > stockDisponible) {
                System.out.println("ERROR: Boletos insuficientes. Stock disponible: " + stockDisponible);
                return;
            }

        } catch (NumberFormatException e) {
            System.out.println("ERROR: La cantidad debe ser un número válido.");
            return;
        }

        // --- 3. Éxito ---
        // Si llega aquí, pasó todas las validaciones lógicas.
        System.out.println("Venta registrada exitosamente.");
        System.out.println("Resumen: Compra #" + numCompra + " | Comprador: " + nombreComprador + " (" + correo + ") | Boletos: " + cantidad);
    }

    // Helper
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
