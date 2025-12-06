package consola;

import java.util.Scanner;
import java.util.UUID;

public class             GestionarIngreso {

    Scanner sc = new Scanner(System.in);

    public void mostrarGU(){
        GestionarIngreso guiSesion = new GestionarIngreso();
        guiSesion.iniciarSesion();

        guiSesion.cerrarSesion();
    }
    public void iniciarSesion() {
        System.out.println("=== INICIAR SESIÓN ===");

        System.out.print("Correo: ");
        String correo = sc.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        // Validación HU0.0.0
        if (correo == null || correo.trim().isEmpty() ||
                contrasena == null || contrasena.trim().isEmpty()) {

            System.out.println("ERROR: Ingrese Credenciales");
            return;  // No continúa hasta que complete los campos
        }

        // ID de sesión autogenerado
        String idSesion = UUID.randomUUID().toString();

        System.out.println("Inicio de sesión correcto.");
        System.out.println("ID de Sesión asignado: " + idSesion);
    }
    public void cerrarSesion() {
        System.out.println("=== CERRAR SESIÓN ===");

        System.out.print("Ingrese el ID de Sesión: ");
        String idSesion = sc.nextLine();

        // Validación HU0.0.1: campo obligatorio
        if (idSesion == null || idSesion.trim().isEmpty()) {
            System.out.println("ERROR: Debe ingresar el ID de Sesión");
            return;
        }

        // Como el sistema no es funcional, simulamos el cierre
        System.out.println("La sesión con ID " + idSesion + " se ha cerrado correctamente.");
    }
}
