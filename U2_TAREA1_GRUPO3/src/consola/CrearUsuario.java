package consola;

import java.util.Scanner;

public class CrearUsuario {
    Scanner sc = new Scanner(System.in);

    public void mostrarGU(){

    }
    public void crearUsuario() {
        System.out.println("== CREAR USUARIO ==");

        System.out.print("Nombres: ");
        String nombres = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Correo Electrónico: ");
        String correo = sc.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        System.out.print("Confirmar Contraseña: ");
        String confirmar = sc.nextLine();

        // Validaciones solicitadas:
        // 1) Campos vacíos
        if (isNullOrEmpty(nombres) || isNullOrEmpty(apellidos) ||
                isNullOrEmpty(correo) || isNullOrEmpty(contrasena) || isNullOrEmpty(confirmar)) {
            System.out.println("ERROR: Ingrese todos los campos obligatorios (Nombres, Apellidos, Correo, Contraseña, Confirmar Contraseña).");
            return;
        }

        // 2) Validación simple de correo: debe contener '@'
        if (!correo.contains("@")) {
            System.out.println("ERROR: El correo ingresado no es válido (falta '@').");
            return;
        }

        // (Opcional pero recomendable) Validar que contraseña y confirmación coincidan
        if (!contrasena.equals(confirmar)) {
            System.out.println("ERROR: La contraseña y la confirmación no coinciden.");
            return;
        }

        // Si llega aquí, pasó las validaciones básicas
        // Como no es funcional, no guardamos en BD; simulamos confirmación
        System.out.println("Usuario creado correctamente (simulado).");
        System.out.println("Nombres: " + nombres + " " + apellidos + " | Correo: " + correo);
    }

    // helper
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
}
