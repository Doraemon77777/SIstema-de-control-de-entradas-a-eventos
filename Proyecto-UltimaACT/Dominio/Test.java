package Dominio;

public class Test {
    public static void main(String[] args) {

        TipoEntrada vip = new TipoEntrada("1", "VIP", "Acceso VIP", 5.0);
        TipoEntrada general = new TipoEntrada("2", "General", "Acceso General", 3.0);

        Entrada e1 = new Entrada("1", "EV1", vip, vip.getPrecio());
        Entrada e2 = new Entrada("2", "EV1", general, general.getPrecio());

        Usuario admin = new Usuario("U1", "Jose", "Lopez", "Lopezzzz@gmail.com", "pass", "admin", "activo", "2025-11-24", null);

        Empresa empresa = new Empresa("ASOCIVIL12", "AsoCivil", "999999999", "Universidad Central", "00000000000", "asocivil111@gmail.com", null);

        Evento evento = new Evento("EV1", "Fiestas de Navidad", "2025-12-24", "16:00", 1000, "Universidad Central", "activo",
                "Un concierto para divertirse", new Entrada[]{e1, e2}, empresa);

        empresa.Evento(evento); // agregamos evento a la empresa

        Comprador compr = new Comprador(1, "Gustambo", "Jimenez", "172212134", "gustambo22@gmail.com", "098846465",true);

        Comprobante comprob = new Comprobante("COMP1", "V1", "2025-11-24");

        Venta venta = new Venta("V1", admin.getIdUsuario(), evento.getIdEvento(), compr,
                "2025-11-24", 2, "VIP", "Efectivo", "confirmada", e1.getTipoEntrada().getPrecio() * 2,
                new Entrada[]{e1}, comprob);

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
