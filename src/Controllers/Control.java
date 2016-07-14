/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Models.Empleado;
import Models.OperacionesBD;
import Views.PanelActualizar;
import Views.PanelEliminar;
import Views.PanelInsertar;
import Views.PanelVer;
import Views.PrincipalFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KevDev
 */
public class Control implements ActionListener{
    private final ArrayList<String> lista = new ArrayList<>();
    public PrincipalFrame principalView;
    
    public Control(PrincipalFrame view){
        this.principalView = view;
        principalView.escuchaBotones(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Empleado emp = new Empleado();
        OperacionesBD operations = new OperacionesBD();
        if(e.getSource()==principalView.viewInsert.btnOk){
            
            if(principalView.viewInsert.txtNombre.getText().equals("")||principalView.viewInsert.txtId.getText().equals("")||principalView.viewInsert.txtApe.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Completa todos los campos", "Campos Vacios", JOptionPane.INFORMATION_MESSAGE);
            }else{
                emp.setNoEmpleado(Integer.parseInt(principalView.viewInsert.txtId.getText()));
                emp.setNombre(principalView.viewInsert.txtNombre.getText());
                emp.setApellidos(principalView.viewInsert.txtApe.getText());
                emp.setInasistencias(Integer.parseInt(principalView.viewInsert.txtIna.getText()));
                emp.setRetardos(Integer.parseInt(principalView.viewInsert.txtRet.getText()));

                operations.insertarEmpleado(emp.getNoEmpleado(),emp.getNombre(),emp.getApeliidos(), emp.getInasistencias(),emp.getRetardos());
            }
            
        }    
        if(e.getSource()== principalView.viewAct.btnOk){
            
            if(principalView.viewAct.txtNombre.getText().equals("")||principalView.viewAct.txtId.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Completa todos los campos", "Campos Vacios", JOptionPane.INFORMATION_MESSAGE);
            }else{
                int eId=Integer.parseInt(principalView.viewAct.txtId.getText());
                String nombre=principalView.viewAct.txtNombre.getText();
                String apellidos=principalView.viewAct.txtApe.getText();
                operations.actualizarEmpleado(eId, nombre,apellidos);
            }
        }
        
        if(e.getSource() == principalView.viewDelet.btnOk){
            if(principalView.viewDelet.txtId.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Ingresa el No. Empleado", "Campos Vacios", JOptionPane.INFORMATION_MESSAGE);

            }else{
                int eId=Integer.parseInt(principalView.viewDelet.txtId.getText());
                operations.eliminarEmpleado(eId);
            }
        }
        if(e.getSource() == principalView.viewVer.btnOk){
            String result = "";
            
            for(int i =0 ;i<operations.listEmpleado().size();i++){
                
                result += "No. Empleado: "+operations.listEmpleado().get(i).getNoEmpleado()+"\n"
                        +"Nombre: "+operations.listEmpleado().get(i).getNombre()+"\n"
                        +"Apellidos: "+operations.listEmpleado().get(i).getApeliidos()+"\n"
                        +"Inasistencias: "+operations.listEmpleado().get(i).getInasistencias()+"\n"
                        +"Retardos: "+operations.listEmpleado().get(i).getRetardos()+"\n\n";
            }
            principalView.viewVer.txt_area.setText(result);
            
        }
    }
    
}
