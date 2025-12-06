package consola;

public class ConsultarIncidencia {
    public void mostrarGI(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("CONSULTAR INCIDENCIA");
            System.out.print("ID: ");
            String id = sc.nextLine();

            if (id.equals("")) {
                System.out.println("Dato inválido");
                return;
            }

            System.out.println("Incidencia encontrada");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
