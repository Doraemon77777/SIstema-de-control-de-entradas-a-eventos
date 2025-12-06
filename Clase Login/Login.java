package consola;

import java.util.Scanner;

public class Login {
    private String usuario;
    private String contrasena;
    private Scanner sc = new Scanner(System.in);

    public void acceder() {
        System.out.print("Ingrese  el usuario: ");
        user = sc.nextLine();
        System.out.print("Ingrese la contraseña: ");
        pass = sc.nextLine();
        try {
            if(user.equals("ASOCIVIL") && pass.equals("tengohambre12")) {
                Menu m = new Menu();
                m.mostrarMenu();
            } else {
                System.out.println("Datos incorrectos");
                acceder();
            }
        } catch(Exception e) {
            System.out.println("Error");
            acceder();
        }
    }
}
