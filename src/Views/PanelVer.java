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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author KevDev
 */
public class PanelVer extends JPanel{
    public JButton btnOk;
    //public JTable tabla;
    JScrollPane scrollPane;
    public JTextArea txt_area;
    public PanelVer(){
        
        
        //String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de Practica", "Soltero(a)"};
        txt_area = new JTextArea(20,30);
        txt_area.setEditable(false);
        scrollPane = new JScrollPane(txt_area);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        btnOk = new JButton("OK");
        
        btnOk = new JButton("Ok");
        
       
        add(btnOk);
        add(scrollPane);
    }
    
    
}
