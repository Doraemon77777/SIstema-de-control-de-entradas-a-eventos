package Dominio;
public class AppMain {
    public static void main(String[] args) {

        TipoEntradas vip = new TipoEntradas("T1", "VIP", "Acceso vip", null);

        TipoEntradas general = new TipoEntradas("T2", "General", "Acceso general", null);
        Entradas e1 = new Entradas("E1", "EV1", vip, 5.0, 50, 50);
        Entradas e2 = new Entradas("E2", "EV1", general, 3.0, 200, 200);

        vip.setEntradas(new Entradas[]{e1});
        general.setEntradas(new Entradas[]{e2});
        Usuario admin = new Usuario("U1", "Jose", "Lopez", "Lopezzzz@gmail.com", "pass", "admin", "activo", "2025-11-24", null);
        Empresa empresa = new Empresa("ASOCIVIL12", "AsoCivil", "999999999", "Universidad Central", "00000000000", "asocivil111@gmail.com", null);
        Evento evento = new Evento("EV1", "Fiestas de Navidad", "2025-12-24", "16:00", 1000, "Universidad Central", "activo",
                "Un concierto para divertirse xd", new Entradas[]{e1, e2}, empresa, admin);

        empresa.setEventos(new Evento[]{evento});
        Comprador compr = new Comprador("C1", "Gustambo", "Jimenez", "172212134", "gustambo22@gmail.com", "098846465");
        Comprobante comprob = new Comprobante("COMP1", "V1", "2025-11-24", "Factura", "emitido");
        Venta venta = new Venta("V1", admin.getIdUsuario(), evento.getIdEvento(), compr,
                "2025-11-24", 2, "VIP", "Efectivo", "confirmada", e1.getPrecio() * 2,
                new Entradas[]{e1}, comprob);
        System.out.println();
        System.out.println("                     Bienvenido a nuestro Sistema");
        System.out.println();
        System.out.println(empresa);
        System.out.println();
        System.out.println(evento);
        System.out.println();
        System.out.println(vip);
        System.out.println();
        System.out.println(general);
        System.out.println();
        System.out.println(venta);
        System.out.println();
        System.out.println(compr);
    }
}
