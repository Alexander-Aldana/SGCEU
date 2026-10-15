public class UsuarioDueno extends Usuario {
    
    public UsuarioDueno(String nombre) {
        super(nombre); // Llama al constructor del padre
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("Perfil de DUEÑO. Nombre: " + getNombre() + " (Tiene control total del sistema)");
    }
}
