package tockens;

import javax.swing.WindowConstants;


public class Principal {

 
    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
}
