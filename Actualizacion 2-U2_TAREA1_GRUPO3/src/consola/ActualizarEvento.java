package consola;

public class ActualizarEvento {
    public void mostrarGE(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ACTUALIZAR EVENTO");
            System.out.print("ID del evento: ");
            String id = sc.nextLine();

            System.out.print("Nuevo nombre: ");
            String nombre = sc.nextLine();

            if (id.equals("") || nombre.equals("")) {
                System.out.println("Datos inválidos");
                return;
            }

            System.out.println("Evento actualizado");
        } catch (Exception e) {
            System.out.println("Error al actualizar");
        }
    }
}

    }
}
