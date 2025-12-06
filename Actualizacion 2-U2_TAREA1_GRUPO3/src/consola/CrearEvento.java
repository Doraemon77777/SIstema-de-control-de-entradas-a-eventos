package consola;

public class CrearEvento {
    public void mostrarGE(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("CREAR EVENTO");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Fecha: ");
            String fecha = sc.nextLine();

            if (nombre.equals("") || fecha.equals("")) {
                System.out.println("Datos incompletos");
                return;
            }

            System.out.println("Evento creado correctamente");
        } catch (Exception e) {
            System.out.println("Error al crear evento");
        }
    }
}
