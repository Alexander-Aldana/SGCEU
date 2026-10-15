public class Main {
    public static void main(String[] args) {
        // Creamos una lista o arreglo de la clase padre 'Usuario'
        Usuario[] listaUsuarios = new Usuario[2];

        // Aquí ocurre el polimorfismo: guardamos objetos hijos en variables del tipo padre
        listaUsuarios[0] = new UsuarioDueno("Alexander");
        listaUsuarios[1] = new UsuarioEmpleado("Carlos");

        // Recorremos la lista y ejecutamos el mismo método
        for (Usuario u : listaUsuarios) {
            u.mostrarPerfil(); // Cada objeto responde de forma diferente según su tipo
        }
    }
}
