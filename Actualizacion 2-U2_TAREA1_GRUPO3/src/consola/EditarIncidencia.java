package consola;

public class EditarIncidencia {
    public void mostrarGI(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("EDITAR INCIDENCIA");
            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Nueva descripción: ");
            String d = sc.nextLine();
            if (id.equals("") || d.equals("")) {
                System.out.println("Datos inválidos");
                return;
            }
            System.out.println("Incidencia actualizada");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
