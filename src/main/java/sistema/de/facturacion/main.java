package sistema.de.facturacion;

import interfaz.Login;

/**
 * Hello world!
 *
 */
public class main 
{
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);  // Crea e muestra la ventana de inicio de sesión
        });
    }
}
