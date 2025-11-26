package consola;

import java.util.Scanner;

public class ActualizarUsuario {
    Scanner sc = new Scanner(System.in);

    public void mostrarGU(){

    }
    public void actualizarUsuario() {
        System.out.println("=== ACTUALIZAR USUARIO ===");

        // Identificador obligatorio: Nombre (o correo) del usuario a actualizar
        System.out.print("Nombre del Usuario a Actualizar (identificador): ");
        String identificador = sc.nextLine();

        if (isNullOrEmpty(identificador)) {
            System.out.println("ERROR: Debe indicar el usuario a actualizar.");
            return;
        }

        System.out.println("Ingrese los nuevos datos. Si deja un campo vacío, se mantendrá el valor actual.");
        System.out.print("Nombres del Usuario (Corrección) [Opcional]: ");
        String nuevosNombres = sc.nextLine();

        System.out.print("Apellidos del Usuario (Corrección) [Opcional]: ");
        String nuevosApellidos = sc.nextLine();

        System.out.print("Correo Electrónico (Corrección) [Opcional]: ");
        String nuevoCorreo = sc.nextLine();

        System.out.print("Contraseña (Corrección) [Opcional]: ");
        String nuevaContrasena = sc.nextLine();

        System.out.print("Confirmar Contraseña (Corrección) [Opcional]: ");
        String confirmarContrasena = sc.nextLine();

        // Validaciones
        // 1) Si se ingresó correo, validar que tenga '@'
        if (!isNullOrEmpty(nuevoCorreo) && !nuevoCorreo.contains("@")) {
            System.out.println("ERROR: El correo ingresado no es válido (falta '@'). Actualización cancelada.");
            return;
        }

        // 2) Si se ingresó una contraseña nueva, debe coincidir con la confirmación (si se provee confirmación)
        if (!isNullOrEmpty(nuevaContrasena) || !isNullOrEmpty(confirmarContrasena)) {
            if (isNullOrEmpty(nuevaContrasena) || isNullOrEmpty(confirmarContrasena)) {
                System.out.println("ERROR: Para cambiar la contraseña debe ingresar ambos campos (contraseña y confirmación).");
                return;
            }
            if (!nuevaContrasena.equals(confirmarContrasena)) {
                System.out.println("ERROR: La contraseña y la confirmación no coinciden. Actualización cancelada.");
                return;
            }
        }

        // Simulación de actualización (no funcional)
        System.out.println("Actualizando usuario \"" + identificador + "\" ...");

        // Mostrar qué campos serán actualizados (simulado)
        if (!isNullOrEmpty(nuevosNombres)) {
            System.out.println(" - Nombres actualizado a: " + nuevosNombres);
        } else {
            System.out.println(" - Nombres: (sin cambios)");
        }

        if (!isNullOrEmpty(nuevosApellidos)) {
            System.out.println(" - Apellidos actualizado a: " + nuevosApellidos);
        } else {
            System.out.println(" - Apellidos: (sin cambios)");
        }

        if (!isNullOrEmpty(nuevoCorreo)) {
            System.out.println(" - Correo actualizado a: " + nuevoCorreo);
        } else {
            System.out.println(" - Correo: (sin cambios)");
        }

        if (!isNullOrEmpty(nuevaContrasena)) {
            System.out.println(" - Contraseña: (actualizada)");
        } else {
            System.out.println(" - Contraseña: (sin cambios)");
        }

        System.out.println("Actualización simulada completada.");
    }
    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
