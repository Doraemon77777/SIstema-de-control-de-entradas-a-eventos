package consola.sesion;

import consola.evento.GestionarEvento;
import consola.incidencia.GestionarIncidencia;
import consola.usuario.GestionarUsuario;
import consola.venta.GestionarVenta;

import java.util.Scanner;

public class Menu {

    private Scanner ingresar = new Scanner(System.in);

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Gestionar Usuarios");
            System.out.println("2. Gestionar Eventos");
            System.out.println("3. Gestionar Ventas");
            System.out.println("4. Gestionar Incidencias");
            System.out.println("5. Salir");
            System.out.println(" ");
            System.out.print("Seleccione una opción: ");

            String opcion = ingresar.nextLine();

            switch (opcion) {
                case "1":
                    submenuUsuarios();
                    break;

                case "2":
                    submenuEventos();
                    break;

                case "3":
                    new GestionarVenta().mostrar();
                    break;

                case "4":
                    submenuIncidencias();
                    break;

                case "5":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida...");
            }
        }
    }


    private void submenuEventos() {
        GestionarEvento ge = new GestionarEvento();
        boolean salirEven = false;

        while (!salirEven) {
            System.out.println("\n=== GESTIONAR EVENTOS ===");
            System.out.println("1. Crear Evento");
            System.out.println("2. Actualizar Evento");
            System.out.println("3. Eliminar Evento");
            System.out.println("4. Consultar Evento");
            System.out.println("5. Regresar");
            System.out.print("Seleccione una opción: ");

            String opcion = ingresar.nextLine();

            switch (opcion) {

                case "1":
                    System.out.println("Se pedirán los atributos necesarios para Crear Evento.");

                    System.out.print("ID: ");
                    int idc = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Nombres: ");
                    String nom = ingresar.nextLine();

                    System.out.print("Fecha: ");
                    String fec = ingresar.nextLine();

                    System.out.print("Hora: ");
                    String hora = ingresar.nextLine();

                    System.out.print("Aforo Máximo: ");
                    int aforo = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Ubicación: ");
                    String ubic = ingresar.nextLine();

                    System.out.print("Estado: ");
                    String est = ingresar.nextLine();

                    System.out.print("Descripción: ");
                    String des = ingresar.nextLine();

                    if (ge.crearEvento(idc, nom, fec, hora, aforo, ubic, est, des))
                        System.out.println("Evento creado");
                    else
                        System.out.println("No se pudo crear el evento");

                    break;

                case "2":
                    System.out.println("Se pedirán los atributos necesarios para Actualizar Evento.");

                    System.out.print("ID: ");
                    int ida = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Nuevo nombre: ");
                    String nn = ingresar.nextLine();

                    System.out.print("Nueva fecha: ");
                    String nf = ingresar.nextLine();

                    System.out.print("Nueva hora: ");
                    String nh = ingresar.nextLine();

                    System.out.print("Nuevo aforo máximo: ");
                    int na = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Nueva ubicación: ");
                    String nu = ingresar.nextLine();

                    System.out.print("Nuevo estado: ");
                    String nes = ingresar.nextLine();

                    System.out.print("Nueva descripción: ");
                    String nde = ingresar.nextLine();

                    if (ge.actualizarEvento(ida, nn, nf, nh, na, nu, nes, nde))
                        System.out.println("Evento actualizado");
                    else
                        System.out.println("No se encontró ese evento");

                    break;

                case "3":
                    System.out.println("Se pedirá el ID para eliminar Evento.");

                    System.out.print("ID: ");
                    int ide = Integer.parseInt(ingresar.nextLine());

                    if (ge.eliminarEvento(ide))
                        System.out.println("Evento eliminado");
                    else
                        System.out.println("No existe ese ID");

                    break;

                case "4":
                    System.out.println("Se pedirá el ID para consultar Evento.");

                    System.out.print("ID: ");
                    int idb = Integer.parseInt(ingresar.nextLine());

                    var ev = ge.consultarEvento(idb);

                    if (ev != null)
                        System.out.println(ev);
                    else
                        System.out.println("No existe ese evento");

                    break;

                case "5":
                    salirEven = true;
                    break;
            }
        }
    }

    private void submenuUsuarios() {

        GestionarUsuario gu = new GestionarUsuario();
        boolean salirUsu = false;

        while (!salirUsu) {
            System.out.println("\n=== GESTIONAR USUARIOS ===");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Actualizar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Consultar Usuario");
            System.out.println("5. Regresar");
            System.out.print("Seleccione una opción: ");

            String opcion = ingresar.nextLine();

            switch (opcion) {

                case "1":   // CREAR USUARIO

                    System.out.print("ID: ");
                    int id = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Nombres: ");
                    String nom = ingresar.nextLine();

                    System.out.print("Apellidos: ");
                    String ape = ingresar.nextLine();

                    System.out.print("Correo: ");
                    String correo = ingresar.nextLine();
                    if (!validarCorreo(correo)) {
                        System.out.println("Correo inválido.");
                        break;
                    }

                    System.out.print("Contraseña: ");
                    String contra = ingresar.nextLine();
                    if (!validarContrasena(contra)) {
                        System.out.println("Contraseña inválida.");
                        break;
                    }

                    System.out.print("Rol (admin/cliente): ");
                    String rol = ingresar.nextLine();
                    if (!rol.matches("admin|cliente")) {
                        System.out.println("Rol inválido.");
                        break;
                    }

                    System.out.print("Estado (activo/inactivo): ");
                    String estado = ingresar.nextLine();
                    if (!estado.matches("activo|inactivo")) {
                        System.out.println("Estado inválido.");
                        break;
                    }

                    System.out.print("Fecha Registro (YYYY-MM-DD): ");
                    String fechaReg = ingresar.nextLine();
                    if (!validarFecha(fechaReg)) {
                        System.out.println("Fecha inválida.");
                        break;
                    }

                    if (gu.crearUsuario(id, nom, ape, correo, contra, rol, estado, fechaReg))
                        System.out.println("Usuario creado.");
                    else
                        System.out.println("No se pudo crear.");

                    break;

                case "2":   // ACTUALIZAR

                    System.out.print("ID: ");
                    int idu = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Nuevos nombres: ");
                    String nn = ingresar.nextLine();

                    System.out.print("Nuevos apellidos: ");
                    String na = ingresar.nextLine();

                    System.out.print("Nuevo correo: ");
                    String nc = ingresar.nextLine();
                    if (!validarCorreo(nc)) {
                        System.out.println("Correo inválido.");
                        break;
                    }

                    System.out.print("Nueva contraseña: ");
                    String ncon = ingresar.nextLine();
                    if (!validarContrasena(ncon)) {
                        System.out.println("Contraseña inválida.");
                        break;
                    }

                    System.out.print("Nuevo rol: ");
                    String nr = ingresar.nextLine();
                    if (!nr.matches("admin|cliente")) {
                        System.out.println("Rol inválido.");
                        break;
                    }

                    System.out.print("Nuevo estado: ");
                    String ne = ingresar.nextLine();
                    if (!ne.matches("activo|inactivo")) {
                        System.out.println("Estado inválido.");
                        break;
                    }

                    System.out.print("Nueva fecha (YYYY-MM-DD): ");
                    String nf = ingresar.nextLine();
                    if (!validarFecha(nf)) {
                        System.out.println("Fecha inválida.");
                        break;
                    }

                    if (gu.actualizarUsuario(idu, nn, na, nc, ncon, nr, ne, nf))
                        System.out.println("Usuario actualizado.");
                    else
                        System.out.println("No se encontró ese ID.");

                    break;

                case "3":   // ELIMINAR
                    System.out.print("ID: ");
                    int ide = Integer.parseInt(ingresar.nextLine());

                    if (gu.eliminarUsuario(ide))
                        System.out.println("Usuario eliminado.");
                    else
                        System.out.println("No existe ese usuario.");
                    break;

                case "4":   // CONSULTAR
                    System.out.print("ID: ");
                    int idb = Integer.parseInt(ingresar.nextLine());

                    var usuario = gu.consultarUsuario(idb);
                    if (usuario != null)
                        System.out.println(usuario);
                    else
                        System.out.println("No existe ese usuario.");
                    break;

                case "5":
                    salirUsu = true;
                    break;
            }
        }
    }
    private boolean validarCorreo(String correo) {
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$");
    }

    private boolean validarContrasena(String c) {
        return c.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{6,}$");
    }

    private boolean validarFecha(String f) {
        return f.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }

    private void submenuIncidencias() {
        GestionarIncidencia gi = new GestionarIncidencia();
        boolean salirIn = false;

        while (!salirIn) {
            System.out.println("\n=== GESTIONAR INCIDENCIAS ===");
            System.out.println("1. Crear Incidencia");
            System.out.println("2. Actualizar Incidencia");
            System.out.println("3. Eliminar Incidencia");
            System.out.println("4. Consultar Incidencia");
            System.out.println("5. Regresar");
            System.out.print("Seleccione una opción: ");

            String opcion = ingresar.nextLine();

            switch (opcion) {

                case "1":
                    System.out.print("ID Incidencia: ");
                    int idc = Integer.parseInt(ingresar.nextLine());

                    System.out.print("ID Usuario: ");
                    int idu = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Tipo Incidencia: ");
                    String tipo = ingresar.nextLine();

                    System.out.print("Descripción: ");
                    String desc = ingresar.nextLine();

                    System.out.print("Fecha Registro: ");
                    String fecha = ingresar.nextLine();

                    System.out.print("Estado: ");
                    String est = ingresar.nextLine();

                    System.out.print("Referencia: ");
                    String ref = ingresar.nextLine();

                    System.out.print("Prioridad: ");
                    String pri = ingresar.nextLine();

                    if (gi.crearIncidencia(idc, idu, tipo, desc, fecha, est, ref, pri))
                        System.out.println("Incidencia creada");
                    else
                        System.out.println("No se pudo crear la incidencia");

                    break;

                case "2":
                    System.out.print("ID Incidencia: ");
                    int ida = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Nuevo ID Usuario: ");
                    int nidU = Integer.parseInt(ingresar.nextLine());

                    System.out.print("Nuevo Tipo: ");
                    String nt = ingresar.nextLine();

                    System.out.print("Nueva Descripción: ");
                    String nd = ingresar.nextLine();

                    System.out.print("Nueva Fecha: ");
                    String nf = ingresar.nextLine();

                    System.out.print("Nuevo Estado: ");
                    String nes = ingresar.nextLine();

                    System.out.print("Nueva Referencia: ");
                    String nref = ingresar.nextLine();

                    System.out.print("Nueva Prioridad: ");
                    String npri = ingresar.nextLine();

                    if (gi.actualizarIncidencia(ida, nidU, nt, nd, nf, nes, nref, npri))
                        System.out.println("Incidencia actualizada");
                    else
                        System.out.println("No existe esa incidencia");

                    break;

                case "3":
                    System.out.print("ID Incidencia: ");
                    int ide = Integer.parseInt(ingresar.nextLine());

                    if (gi.eliminarIncidencia(ide))
                        System.out.println("Incidencia eliminada");
                    else
                        System.out.println("ID no encontrado");

                    break;

                case "4":
                    System.out.print("ID Incidencia: ");
                    int idb = Integer.parseInt(ingresar.nextLine());

                    var in = gi.consultarIncidencia(idb);

                    if (in != null)
                        System.out.println(in);
                    else
                        System.out.println("No existe esa incidencia");

                    break;

                case "5":
                    salirIn = true;
                    break;
            }
        }
    }



}
