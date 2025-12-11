package consola.venta;

import consola.sesion.Menu;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GestionarVenta {

    private Scanner sc = new Scanner(System.in);
    private Venta[] ventas = new Venta[100];
    private int numVentas = 0;

    // Patrones de validación
    private static final Pattern PATRON_ID = Pattern.compile("^\\d{1,6}$"); // 1 a 6 dígitos
    private static final Pattern PATRON_NOMBRE_PRODUCTO = Pattern.compile("^[A-Za-záéíóúñÁÉÍÓÚÑ\\s]{2,50}$"); // Solo letras y espacios, 2-50 caracteres
    private static final Pattern PATRON_CANTIDAD = Pattern.compile("^\\d{1,5}$"); // 1 a 5 dígitos
    private static final Pattern PATRON_PRECIO = Pattern.compile("^\\d{1,6}(\\.\\d{1,2})?$"); // Hasta 6 enteros y 2 decimales
    private static final Pattern PATRON_OPCION_MENU = Pattern.compile("^[1-5]$"); // Solo opciones 1-5

    private static class Venta {
        int id;
        String producto;
        int cantidad;
        double precio;

        public Venta(int id, String producto, int cantidad, double precio) {
            this.id = id;
            this.producto = producto;
            this.cantidad = cantidad;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    " | Producto: " + producto +
                    " | Cantidad: " + cantidad +
                    " | Precio: " + precio;
        }
    }

    public void mostrar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Gestionar Venta ===");
            System.out.println("1. Crear venta");
            System.out.println("2. Actualizar venta");
            System.out.println("3. Eliminar venta");
            System.out.println("4. Consultar venta");
            System.out.println("5. Salir");
            System.out.print("\nSeleccione una opción: ");

            String opcion = sc.nextLine();

            // Validar opción del menú
            Matcher matcherOpcion = PATRON_OPCION_MENU.matcher(opcion);
            if (!matcherOpcion.matches()) {
                System.out.println("Opción inválida. Debe ser un número entre 1 y 5");
                continue;
            }

            switch (opcion) {
                case "1":
                    crearVenta();
                    break;
                case "2":
                    actualizarVenta();
                    break;
                case "3":
                    eliminarVenta();
                    break;
                case "4":
                    consultarVenta();
                    break;
                case "5":
                    salir = true;
                    new Menu().mostrarMenu();
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        }
    }

    public void crearVenta() {
        System.out.println("\n=== CREAR VENTA ===");

        // Validar ID
        int id = 0;
        while (true) {
            System.out.print("ID (1-6 dígitos): ");
            String idStr = sc.nextLine();
            Matcher matcherId = PATRON_ID.matcher(idStr);

            if (!matcherId.matches()) {
                System.out.println("ID inválido. Debe tener entre 1 y 6 dígitos.");
                continue;
            }

            id = Integer.parseInt(idStr);

            // Verificar si el ID ya existe
            if (buscarVenta(id) != null) {
                System.out.println("Error: El ID ya existe. Por favor, ingrese un ID diferente.");
                continue;
            }

            break;
        }

        // Validar Producto
        String producto = "";
        while (true) {
            System.out.print("Producto (solo letras, 2-50 caracteres): ");
            producto = sc.nextLine();
            Matcher matcherProducto = PATRON_NOMBRE_PRODUCTO.matcher(producto);

            if (matcherProducto.matches()) {
                break;
            }
            System.out.println("Producto inválido. Solo letras y espacios, entre 2 y 50 caracteres.");
        }

        // Validar Cantidad
        int cantidad = 0;
        while (true) {
            System.out.print("Cantidad (1-5 dígitos): ");
            String cantidadStr = sc.nextLine();
            Matcher matcherCantidad = PATRON_CANTIDAD.matcher(cantidadStr);

            if (matcherCantidad.matches()) {
                cantidad = Integer.parseInt(cantidadStr);
                if (cantidad > 0) {
                    break;
                }
            }
            System.out.println("Cantidad inválida. Debe ser un número entre 1 y 99999.");
        }

        // Validar Precio
        double precio = 0;
        while (true) {
            System.out.print("Precio (máximo 6 enteros y 2 decimales): ");
            String precioStr = sc.nextLine();
            Matcher matcherPrecio = PATRON_PRECIO.matcher(precioStr);

            if (matcherPrecio.matches()) {
                precio = Double.parseDouble(precioStr);
                if (precio > 0) {
                    break;
                }
            }
            System.out.println("Precio inválido. Ejemplo válido: 125.50 o 100");
        }

        ventas[numVentas] = new Venta(id, producto, cantidad, precio);
        numVentas++;

        System.out.println("Venta creada correctamente");
    }

    public void consultarVenta() {
        System.out.println("\n=== CONSULTAR VENTA ===");

        int id = 0;
        while (true) {
            System.out.print("ID de la venta (1-6 dígitos): ");
            String idStr = sc.nextLine();
            Matcher matcherId = PATRON_ID.matcher(idStr);

            if (matcherId.matches()) {
                id = Integer.parseInt(idStr);
                break;
            }
            System.out.println("ID inválido. Debe tener entre 1 y 6 dígitos.");
        }

        Venta v = buscarVenta(id);

        if (v != null) {
            System.out.println(v);
        } else {
            System.out.println("La venta no existe");
        }
    }

    public void actualizarVenta() {
        System.out.println("\n=== ACTUALIZAR VENTA ===");

        int id = 0;
        while (true) {
            System.out.print("ID de la venta (1-6 dígitos): ");
            String idStr = sc.nextLine();
            Matcher matcherId = PATRON_ID.matcher(idStr);

            if (matcherId.matches()) {
                id = Integer.parseInt(idStr);
                break;
            }
            System.out.println("ID inválido. Debe tener entre 1 y 6 dígitos.");
        }

        int pos = buscarPosicion(id);

        if (pos == -1) {
            System.out.println("La venta no existe");
            return;
        }

        // Validar Producto
        String producto = "";
        while (true) {
            System.out.print("Nuevo producto (solo letras, 2-50 caracteres): ");
            producto = sc.nextLine();
            Matcher matcherProducto = PATRON_NOMBRE_PRODUCTO.matcher(producto);

            if (matcherProducto.matches()) {
                break;
            }
            System.out.println("Producto inválido. Solo letras y espacios, entre 2 y 50 caracteres.");
        }

        // Validar Cantidad
        int cantidad = 0;
        while (true) {
            System.out.print("Nueva cantidad (1-5 dígitos): ");
            String cantidadStr = sc.nextLine();
            Matcher matcherCantidad = PATRON_CANTIDAD.matcher(cantidadStr);

            if (matcherCantidad.matches()) {
                cantidad = Integer.parseInt(cantidadStr);
                if (cantidad > 0) {
                    break;
                }
            }
            System.out.println("Cantidad inválida. Debe ser un número entre 1 y 99999.");
        }

        // Validar Precio
        double precio = 0;
        while (true) {
            System.out.print("Nuevo precio (máximo 6 enteros y 2 decimales): ");
            String precioStr = sc.nextLine();
            Matcher matcherPrecio = PATRON_PRECIO.matcher(precioStr);

            if (matcherPrecio.matches()) {
                precio = Double.parseDouble(precioStr);
                if (precio > 0) {
                    break;
                }
            }
            System.out.println("Precio inválido. Ejemplo válido: 125.50 o 100");
        }

        ventas[pos] = new Venta(id, producto, cantidad, precio);

        System.out.println("Venta actualizada");
    }

    public void eliminarVenta() {
        System.out.println("\n=== ELIMINAR VENTA ===");

        int id = 0;
        while (true) {
            System.out.print("ID de la venta (1-6 dígitos): ");
            String idStr = sc.nextLine();
            Matcher matcherId = PATRON_ID.matcher(idStr);

            if (matcherId.matches()) {
                id = Integer.parseInt(idStr);
                break;
            }
            System.out.println("ID inválido. Debe tener entre 1 y 6 dígitos.");
        }

        int pos = buscarPosicion(id);

        if (pos == -1) {
            System.out.println("La venta no existe");
            return;
        }

        ventas[pos] = null;

        System.out.println("Venta eliminada");
    }

    private Venta buscarVenta(int id) {
        for (int i = 0; i < numVentas; i++) {
            if (ventas[i] != null && ventas[i].id == id) {
                return ventas[i];
            }
        }
        return null;
    }

    private int buscarPosicion(int id) {
        for (int i = 0; i < numVentas; i++) {
            if (ventas[i] != null && ventas[i].id == id) {
                return i;
            }
        }
        return -1;
    }

    // Método adicional para limpiar arreglo (recomendado para mejor gestión)
    private void compactarArreglo() {
        Venta[] temp = new Venta[100];
        int j = 0;
        for (int i = 0; i < numVentas; i++) {
            if (ventas[i] != null) {
                temp[j++] = ventas[i];
            }
        }
        ventas = temp;
        numVentas = j;
    }
}