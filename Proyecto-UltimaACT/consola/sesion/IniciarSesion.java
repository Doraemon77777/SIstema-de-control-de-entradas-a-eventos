package consola.sesion;

import java.util.Scanner;

import java.util.Scanner;

public class IniciarSesion {
    private Scanner sc = new Scanner(System.in);

    public void acceder() {
        boolean exito = false;

        while(!exito) {
            System.out.print("Ingrese el usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Ingrese la contraseña: ");
            String contrasena = sc.nextLine();

            // Usando la clase ValidarCredenciales
            if(ValidarCredenciales.esValido(usuario, contrasena)) {
                Menu m = new Menu();
                m.mostrarMenu();
                exito = true; // salir del while
            } else {
                System.out.println("Datos incorrectos, intente nuevamente.");
            }
        }
    }
}
