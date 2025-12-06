package consola;

public class EliminarIncidencia {
    public void mostrarGI(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ELIMINAR INCIDENCIA");
            System.out.print("ID: ");
            String id = sc.nextLine();

            if (id.equals("")) {
                System.out.println("Dato inválido");
                return;
            }

            System.out.println("Incidencia eliminada");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
