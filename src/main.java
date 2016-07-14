
import Controllers.Control;
import Views.PrincipalFrame;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevDev
 */
public class main {
    public static void main(String[] args) {
        PrincipalFrame view = new PrincipalFrame();
        Control control = new Control(view);
        view.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        view.setSize( 450, 400 );
        view.setLocationRelativeTo(null);
        view.setVisible( true );
        view.pack();
        
        
    }
    
    
}
