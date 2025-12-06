package consola;

public class ActualizarVenta {
    public void mostrarGV(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ACTUALIZAR VENTA");
            System.out.print("ID Venta: ");
            String id = sc.nextLine();

            if (id.equals("")) {
                System.out.println("Dato inválido");
                return;
            }

            System.out.println("Venta actualizada");
        } catch (Exception e) {
            System.out.println("Error al actualizar");
        }
    }
}
