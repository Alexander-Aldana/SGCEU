public class UsuarioDueno extends Usuario {

    public UsuarioDueno(String nombre, String username, String contrasena) {
        super(nombre, username, contrasena);
    }

    @Override
    public void mostrarMenuAutorizado() {
        System.out.println("\n=== MENÚ DEL ADMINISTRADOR / DUEÑO ===");
        System.out.println("Bienvenido, Sr(a). " + getNombre());
        System.out.println("[1] Ver Informes Completos de Ventas");
        System.out.println("[2] Desglose de Métodos de Pago (Efectivo vs Tarjeta)");
        System.out.println("[3] Monitorear Cuentas de Destino (Saldos Bancarios)");
        System.out.println("[4] Gestionar Inventarios y Precios");
        System.out.println("[5] Configuración Avanzada del Sistema");
    }
}
