package consola;

import java.util.Scanner;

public class Menu {
    private Scanner ingresar = new Scanner(System.in);

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Gestionar Usuarios - HU0");
            System.out.println("2. Gestionar Eventos - HU1");
            System.out.println("3. Gestionar Ventas - HU2");
            System.out.println("4. Gestionar Incidencias - HU3");
            System.out.println("5. Salir");
            System.out.println(" ");
            System.out.print("Seleccione una opción: ");

            String opcion = ingresar.nextLine();

            switch (opcion) {
                case "1":
                    new GestionarUsuario().mostrar();
                    break;
                case "2":
                    new GestionarEvento().mostrar();
                    break;
                case "3":
                    new GestionarVenta().mostrar();
                    break;
                case "4":
                    new GestionarIncidencia().mostrar();
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        }
    }
}
