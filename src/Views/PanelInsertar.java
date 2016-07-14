/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author KevDev
 */
public class PanelInsertar extends JPanel{
    public JButton btnOk;
    public JTextField txtId, txtNombre,txtApe,txtIna, txtRet;
    public PanelInsertar(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets= new Insets(5,10,0,10);
        
        JLabel labelId, labelNombre, labelAp,labelIna,labelRet;
        
        btnOk = new JButton("OK");
        
        labelId = new JLabel("No empleado: ", SwingConstants.RIGHT);
        labelId.setForeground(Color.blue);
        c.gridx =0;
        c.gridy =0;
        add(labelId, c);
        txtId = new JTextField(14);
        c.gridx = 1;
        add(txtId, c);
        
        
        labelNombre = new JLabel("Nombre(s): ", SwingConstants.RIGHT);
        labelNombre.setForeground(Color.blue);
        c.gridx =0;
        c.gridy =1;
        add(labelNombre, c);
        txtNombre = new JTextField(14);
        c.gridx = 1;
        add(txtNombre, c);
        
        labelAp= new JLabel("Apellidos: ", SwingConstants.RIGHT);
        labelAp.setForeground(Color.blue);
        c.gridx =0;
        c.gridy =2;
        add(labelAp, c);
        txtApe = new JTextField(14);
        c.gridx = 1;
        add(txtApe, c);
        
        labelIna= new JLabel("Inasistencias: ", SwingConstants.RIGHT);
        labelIna.setForeground(Color.blue);
        c.gridx =0;
        c.gridy =3;
        add(labelIna, c);
        txtIna = new JTextField(14);
        c.gridx = 1;
        add(txtIna, c);
        
        labelRet= new JLabel("Retardos: ", SwingConstants.RIGHT);
        labelRet.setForeground(Color.blue);
        c.gridx =0;
        c.gridy =4;
        add(labelRet, c);
        txtRet = new JTextField(14);
        c.gridx = 1;
        add(txtRet, c);
        
        btnOk = new JButton("Ok");
        c.gridx = 0;
        c.gridy = 5;
        add(btnOk,c);
    }
    
    
}
