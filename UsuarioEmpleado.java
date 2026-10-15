public class UsuarioEmpleado extends Usuario {

    public UsuarioEmpleado(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("Perfil de EMPLEADO. Nombre: " + getNombre() + " (Acceso restringido a tareas)");
    }
}
