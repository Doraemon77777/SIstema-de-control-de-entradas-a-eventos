package consola;
import java.util.Scanner;

public class IniciarIncidencia {
    Incidencia i = new Incidencia();
    Scanner sc = new Scanner(System.in);

    public void mostrarGI(){
        int op = 0;
        do{
            try{
                System.out.println("=== REGISTRO DE INCIDENCIAS ===");
                System.out.println("1. Ingresar Incidencia");
                System.out.println("2. Consultar Incidencia");
                System.out.println("3. Volver");
                System.out.print("Opción: ");
                op = Integer.parseInt(sc.nextLine());

                if(op == 1) i.registrarIncidencia();
                else if(op == 2) i.consultarIncidencia();
                else if(op == 3) System.out.println("Volviendo");
                else System.out.println("Opción inválida");
            }catch(Exception e){
                System.out.println("ingrese solo números");
            }
        }while(op != 3);
    }
}
