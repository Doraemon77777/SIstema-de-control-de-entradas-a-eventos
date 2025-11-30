package consola;

import java.util.Scanner;

public class GestionarVenta {

    private Scanner gevento = new Scanner(System.in);

    public void mostrar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Gestionar Venta ===");
            System.out.println("1. Crear venta - HU2.0");
            System.out.println("2. Consultar venta - HU2.1");
            System.out.println("3. Actualizar venta - HU2.2");
            System.out.println("4. Eliminar venta - HU2.3");
            System.out.println("5. Gestionar Comprobante - HU2.4");
            System.out.println("6. Salir");
            System.out.print("\n Seleccione una opción: ");

            String opcion = gevento.nextLine();

            switch (opcion) {
                case "1":
                    new CrearVenta().mostrarGV();
                    break;
                case "2":
                    new ConsultarVenta().mostrarGV();
                    break;
                case "3":
                    new ActualizarVenta().mostrarGV();
                    break;
                case "4":
                    new AnularVenta().mostrarGV();
                    break;
                case "5":
                    new GestionarComprobante().mostrarGV();
                    break;
                case "6":
                    salir = true;
                    Menu menu = new Menu();
                    menu.mostrarMenu();
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        }
    }
}