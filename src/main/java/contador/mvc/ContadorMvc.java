package contador.mvc;

import contador.mvc.controlador.Controlador;
import contador.mvc.modelo.Contador;
import contador.mvc.vista.Vista;

public class ContadorMvc {

    public static void main(String[] args) {
        
        Vista vista = new Vista();
        Contador contador = new Contador();
        Controlador controlador = new Controlador(vista, contador);
        
        vista.setActionListener(controlador);
        
        java.awt.EventQueue.invokeLater(() -> {
            vista.setVisible(true);
        });
    }
}
