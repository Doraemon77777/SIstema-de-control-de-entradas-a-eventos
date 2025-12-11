package consola.usuario;

public class GestionarUsuario {

    private Usuario[] usuarios;
    private int numUsuarios;

    public GestionarUsuario() {
        this.usuarios = new Usuario[20];
        this.numUsuarios = 0;
    }

    private static class Usuario {
        int idUsuario;
        String nombres;
        String apellidos;
        String correo;
        String contraseña;
        String rol;
        String estado;
        String fechaRegistro;

        public Usuario(int idUsuario, String nombres, String apellidos, String correo,
                       String contraseña, String rol, String estado, String fechaRegistro) {

            this.idUsuario = idUsuario;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.correo = correo;
            this.contraseña = contraseña;
            this.rol = rol;
            this.estado = estado;
            this.fechaRegistro = fechaRegistro;
        }

        public String toString() {
            return "ID: " + idUsuario +
                    " | Nombres: " + nombres +
                    " | Apellidos: " + apellidos +
                    " | Correo: " + correo +
                    " | Rol: " + rol +
                    " | Estado: " + estado +
                    " | Registro: " + fechaRegistro;
        }
    }

    public boolean crearUsuario(int idUsuario, String nombres, String apellidos,
                                String correo, String contraseña, String rol,
                                String estado, String fechaRegistro) {

        if (numUsuarios >= usuarios.length) return false;

        usuarios[numUsuarios] = new Usuario(
                idUsuario, nombres, apellidos, correo, contraseña,
                rol, estado, fechaRegistro
        );

        numUsuarios++;
        return true;
    }

    public boolean actualizarUsuario(int idUsuario, String nombres, String apellidos,
                                     String correo, String contraseña, String rol,
                                     String estado, String fechaRegistro) {

        Usuario u = buscarUsuario(idUsuario);
        if (u == null) return false;

        u.nombres = nombres;
        u.apellidos = apellidos;
        u.correo = correo;
        u.contraseña = contraseña;
        u.rol = rol;
        u.estado = estado;
        u.fechaRegistro = fechaRegistro;

        return true;
    }

    public boolean eliminarUsuario(int idUsuario) {

        int pos = -1;

        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].idUsuario == idUsuario) {
                pos = i;
                break;
            }
        }

        if (pos == -1) return false;

        for (int i = pos; i < numUsuarios - 1; i++) {
            usuarios[i] = usuarios[i + 1];
        }

        usuarios[numUsuarios - 1] = null;
        numUsuarios--;

        return true;
    }

    public Usuario consultarUsuario(int idUsuario) {
        return buscarUsuario(idUsuario);
    }

    private Usuario buscarUsuario(int idUsuario) {
        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].idUsuario == idUsuario) return usuarios[i];
        }
        return null;
    }
}
