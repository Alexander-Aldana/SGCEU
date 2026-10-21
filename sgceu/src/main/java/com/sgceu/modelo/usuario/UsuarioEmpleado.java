package com.sgceu.modelo.usuario;
public class UsuarioEmpleado extends Usuario {

    public UsuarioEmpleado(String nombre, String username, String contrasena) {
        super(nombre, username, contrasena);
    }

    @Override
    public void mostrarMenuAutorizado() {
        System.out.println("\n=== MENÚ DE EMPLEADO ===");
        System.out.println("Empleado activo: " + getNombre());
        System.out.println("[1] Registrar Nueva Venta");
        System.out.println("[2] Consultar Historial de Ventas del Turno");
        System.out.println("[3] Consultar Inventario de Productos");
        System.out.println("[4] Ver Total de Caja General (Información Limitada)");
        System.out.println("(!) Nota: Los detalles de cuentas y medios de pago están bloqueados.");
    }
}
