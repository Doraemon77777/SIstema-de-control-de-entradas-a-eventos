package consola;

public class AnularVenta {
    public void mostrarGV(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ANULAR VENTA");
            System.out.print("ID Venta: ");
            String id = sc.nextLine();

            if (id.equals("")) {
                System.out.println("Dato inválido");
                return;
            }

            System.out.println("Venta anulada");
        } catch (Exception e) {
            System.out.println("Error al anular");
        }
    }
}
