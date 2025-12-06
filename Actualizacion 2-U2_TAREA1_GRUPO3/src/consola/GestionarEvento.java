package consola;

import java.util.Scanner;

public class GestionarEvento {

    private Scanner gevento = new Scanner(System.in);

    public void mostrar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Gestionar Evento ===");
            System.out.println("1. Crear Evento");
            System.out.println("2. Actualizar Evento");
            System.out.println("3. Eliminar Evento");
            System.out.println("4. Consultar Evento");
            System.out.println("5. Salir");
            System.out.print("\n Seleccione una opción: ");

            String opcion = gevento.nextLine();

            switch (opcion) {
                case "1":
                    new CrearEvento().mostrarGE();
                    break;
                case "2":
                    new ActualizarEvento().mostrarGE();
                    break;
                case "3":
                    new EliminarEvento().mostrarGE();
                    break;
                case "4":
                    new ConsultarEvento().mostrarGE();
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
