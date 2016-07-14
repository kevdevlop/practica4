/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author KevDev
 */
public class PrincipalFrame extends JFrame{
    public PanelActualizar viewAct;
    public PanelEliminar viewDelet;
    public PanelVer viewVer;
    public PanelInsertar viewInsert;
    
    public PrincipalFrame(){
        super("interfaz Alumnos CRUD");
        JTabbedPane panelPestaña = new JTabbedPane();
        panelPestaña.addTab( "Insertar",null,pestañaInsert(),"Primer panel" );
        
        panelPestaña.addTab( "Actualizar",null,pestañaActu(),"Segundo panel" );
        
        panelPestaña.addTab( "Eliminar",null,pestañaElim(),"tercer panel" );
        
        panelPestaña.addTab( "Ver",null,pestañaVer(),"Cuarto panel" );
        
        getContentPane().add( panelPestaña );
        
        
    }
    
    public JPanel pestañaInsert(){
         viewInsert = new PanelInsertar();
         
         return viewInsert;
    }
    
    public JPanel pestañaActu(){
         viewAct = new PanelActualizar();
         
         return viewAct;
    }
    
    public JPanel pestañaElim(){
         viewDelet = new PanelEliminar();
         
         return viewDelet;
    }
    
    public JPanel pestañaVer(){
         viewVer = new PanelVer();
         
         return viewVer;
    }
    
    public void escuchaBotones(ActionListener e){
        viewInsert.btnOk.addActionListener(e);
        viewAct.btnOk.addActionListener(e);
        viewDelet.btnOk.addActionListener(e);
        viewVer.btnOk.addActionListener(e);
       
    }
    
}
