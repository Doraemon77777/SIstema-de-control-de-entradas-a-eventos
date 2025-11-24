package consola;

import java.util.Scanner;

public class GestionarVenta {

    private Scanner gevento = new Scanner(System.in);

    public void mostrar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Gestionar Venta ===");
            System.out.println("1. Registrar venta");
            System.out.println("2. Consultar venta");
            System.out.println("3. Actualizar venta");
            System.out.println("4. Anular venta");
            System.out.println("5. Gestionar Comprobante");
            System.out.println("6. Salir");
            System.out.print("\n Seleccione una opción: ");

            String opcion = gevento.nextLine();

            switch (opcion) {
                case "1":
                    new RegistrarVenta().mostrarGV();
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