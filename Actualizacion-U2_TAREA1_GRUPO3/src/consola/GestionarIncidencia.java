package consola;

import java.util.Scanner;

public class GestionarIncidencia {

    private Scanner gevento = new Scanner(System.in);

    public void mostrar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Gestionar Incidencia ===");
            System.out.println("1. Iniciar Incidencia - HU3.0");
            System.out.println("2. Consultar Incidencia - HU3.1");
            System.out.println("3. Editar Incidencia - HU3.2");
            System.out.println("4. Eliminar Incidencia - HU3.3");
            System.out.println("5. Salir");
            System.out.print("\n Seleccione una opción: ");

            String opcion = gevento.nextLine();

            switch (opcion) {
                case "1":
                    new IniciarIncidencia().mostrarGI();
                    break;
                case "2":
                    new ConsultarIncidencia().mostrarGI();
                    break;
                case "3":
                    new EditarIncidencia().mostrarGI();
                    break;
                case "4":
                    new  EliminarIncidencia().mostrarGI();
                    break;
                case "5":
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