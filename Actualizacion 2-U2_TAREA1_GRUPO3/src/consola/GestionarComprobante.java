/*package consola;
import java.util.Scanner;

public class GestionarComprobante {
    Venta v = new Venta();
    Scanner sc = new Scanner(System.in);

    public void mostrarGV(){
        int op = 0;
        do{
            try{
                System.out.println("=== GESTION DE COMPROBANTES ===");
                System.out.println("1. Consultar Venta");
                System.out.println("2. Generar Comprobante");
                System.out.println("3. Volver");
                System.out.print("Opción: ");
                op = Integer.parseInt(sc.nextLine());

                if(op == 1) v.consultarVenta();
                else if(op == 2) generarComprobante();
                else if(op == 3) System.out.println("Volviendo...");
                else System.out.println("Opción inválida");
            }catch(Exception e){
                System.out.println("Error, ingrese un número válido");
            }
        }while(op != 3);
    }

    private void generarComprobante(){
        try{
            System.out.print("Ingrese ID de venta: ");
            int id = Integer.parseInt(sc.nextLine());
            v.generarComprobante(id);
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }
    }
}

 */
