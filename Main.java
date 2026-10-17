import java.util.Scanner;

public class Main {
    // Simulamos la base de datos de usuarios del sistema
    private static Usuario[] baseDatosUsuarios = new Usuario[2];

    public static void main(String[] args) {
        // Registramos un dueño y un empleado en el sistema
        baseDatosUsuarios[0] = new UsuarioDueno("Alexander Aldana", "alex_admin", "admin123");
        baseDatosUsuarios[1] = new UsuarioEmpleado("Carlos Pérez", "carlos_emp", "empleado456");

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== PUNTO DE VENTA (POS) - INICIO DE SESIÓN ===");
        System.out.print("Usuario: ");
        String userDigitado = teclado.nextLine();
        System.out.print("Contraseña: ");
        String passDigitada = teclado.nextLine();

        // Ejecutamos el flujo de autenticación
        iniciarSesion(userDigitado, passDigitada);
        
        teclado.close();
    }

    public static void iniciarSesion(String user, String pass) {
        Usuario usuarioLogueado = null;

        // Buscamos si las credenciales coinciden con algún usuario
        for (Usuario u : baseDatosUsuarios) {
            if (u.autenticar(user, pass)) {
                usuarioLogueado = u;
                break;
            }
        }

        if (usuarioLogueado != null) {
            System.out.println("\n[SISTEMA]: ¡Inicio de sesión exitoso!");
            
            // AQUÍ OCURRE EL POLIMORFISMO:
            // No nos importa si es dueño o empleado, invocamos el método general 
            // y la máquina virtual de Java ejecutará el menú que le corresponde a cada uno.
            usuarioLogueado.mostrarMenuAutorizado();

        } else {
            System.out.println("\n[ERROR]: Usuario o contraseña incorrectos.");
        }
    }
}
