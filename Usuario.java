public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método polimórfico que cambiará según el tipo de usuario
    public void mostrarPerfil() {
        System.out.println("Perfil de Usuario Genérico: " + nombre);
    }
}
