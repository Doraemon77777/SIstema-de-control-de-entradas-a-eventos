package consola;

import java.util.Scanner;

public class GestionarUsuario {

    private Scanner gevento = new Scanner(System.in);

    public void mostrar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Gestionar Usuario ===");
            System.out.println("1. Gestionar Ingreso HU0.0");
            System.out.println("2. Crear Usuario - HU0.1");
            System.out.println("3. Eliminar Usuario - HU0.2");
            System.out.println("4. Actualizar Usuario - HU0.3");
            System.out.println("5. Consultar Usuario - HU0.4");
            System.out.println("6. Salir");
            System.out.print("\n Seleccione una opción: ");

            String opcion = gevento.nextLine();

            switch (opcion) {
                case "1":
                    new GestionarIngreso().mostrarGU();
                    break;
                case "2":
                    new CrearUsuario().crearUsuario();
                    break;
                case "3":
                    new EliminarUsuario().eliminarUsuario();
                    break;
                case "4":
                    new ActualizarUsuario().actualizarUsuario();
                    break;
                case "5":
                    new ConsultarUsuario().consultarUsuario();
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