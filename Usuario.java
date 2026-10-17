public class Usuario {
    private String nombre;
    private String username;
    private String contrasena;

    public Usuario(String nombre, String username, String contrasena) {
        this.nombre = nombre;
        this.username = username;
        this.contrasena = contrasena;
    }

    public String getNombre() { return nombre; }
    public String getUsername() { return username; }
    
    // Método para validar las credenciales en el inicio de sesión
    public boolean autenticar(String user, String pass) {
        return this.username.equals(user) && this.contrasena.equals(pass);
    }

    // Este método lo sobrescribirá cada hijo para mostrar sus accesos de forma polimórfica
    public void mostrarMenuAutorizado() {
        System.out.println("Acceso básico al sistema.");
    }
}

