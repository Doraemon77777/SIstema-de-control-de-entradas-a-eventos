package consola;

public class ConsultarVenta {
    public void mostrarGV(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("CONSULTAR VENTA");
            System.out.print("ID Venta: ");
            String id = sc.nextLine();

            if (id.equals("")) {
                System.out.println("Dato inválido");
                return;
            }

            System.out.println("Venta encontrada");
        } catch (Exception e) {
            System.out.println("Error al consultar");
        }
    }
}
