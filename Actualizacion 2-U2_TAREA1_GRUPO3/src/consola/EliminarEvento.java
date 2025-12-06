package consola;

public class EliminarEvento {
    public void mostrarGE(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ELIMINAR EVENTO");
            System.out.print("ID del evento: ");
            String id = sc.nextLine();

            if (id.equals("")) {
                System.out.println("ID inválido");
                return;
            }

            System.out.println("Evento eliminado");
        } catch (Exception e) {
            System.out.println("Error al eliminar");
        }
    }
}
