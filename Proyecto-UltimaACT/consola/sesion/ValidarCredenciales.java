package consola.sesion;

public class ValidarCredenciales {
    public static boolean esValido(String usuario, String contrasena) {
        return usuario.equals("ASOCIVIL") && contrasena.equals("Doraemon1");
    }
}
