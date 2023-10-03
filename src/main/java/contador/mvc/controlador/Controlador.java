package contador.mvc.controlador;

import contador.mvc.modelo.Contador;
import contador.mvc.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    
    private final Vista vista;
    private final Contador contador; //modelo

    public Controlador(Vista vista, Contador contador) {
        this.vista = vista;
        this.contador = contador;
    }
    
    public void iniciarControlador(){
        vista.setActionListener(this);
        vista.setVisible(true);
        mostrarContador();
    }
    
    public void mostrarContador(){
        int numero = contador.getContador();
        vista.mostrarContador(numero);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if(command.equals("+")){
            contador.incrementar();
        } else if (command.equals("-")){
            contador.decrementar();
        }
        
        mostrarContador();
    }
    
}
