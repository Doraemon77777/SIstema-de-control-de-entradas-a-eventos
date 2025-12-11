package consola;

import consola.sesion.IniciarSesion;
import consola.sesion.Menu;

public class SistemaDeControlDeEntradasAEventos {
    public static void main(String[] args) {

        System.out.println("          SISTEMA DE CONTROL DE ENTRADAS A EVENTOS  ");
        System.out.println("Iniciando sistema...");
        System.out.println(" ");

        new IniciarSesion().acceder();
    }
}
