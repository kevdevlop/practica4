/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KevDev
 */
public class OperacionesBD {
    Conecta con;
    public OperacionesBD(){
        con = new Conecta();
    }
    public void insertarEmpleado(int noEmpleado,String nombre, String apellidos, int inasistencias, int retardos){
        
        Statement stmt = null;
        try{
            Connection accesoDB = con.getCon();
            stmt = accesoDB.createStatement();
            
            //CallableStatement insert = accesoDB.prepareCall("{call sp_InsertEmpleado(?,?,?,?,?)}");
           PreparedStatement insert = accesoDB.prepareStatement("INSERT INTO Empleado(No_empleado,Nombre,Apellidos,Inasistencias,Retardos) VALUES(?,?,?,?,?)");
           /*cs.setInt(1, noEmpleado);
           cs.setString(2, nombre);
           cs.setString(3, apellidos);
           cs.setInt(4, inasistencias);
           cs.setInt(5, retardos);
           int res = cs.executeUpdate();*/
           insert.setInt(5, retardos);
           insert.setInt(4, inasistencias);
           insert.setString(3, apellidos);
           insert.setString(2, nombre);
           insert.setInt(1, noEmpleado);
           int res = insert.executeUpdate();
           System.out.print("\n"+res);
           if(res > 0){
                JOptionPane.showMessageDialog(null,"Empleado "+nombre+" agregado correctamente");
           }
        } catch (SQLException e) {
             System.out.println("error: failed to create a connection object.");
            e.printStackTrace();
        
        }catch(Exception e){
            System.out.print("Error en la insercion");
        }
    }
    
    public void actualizarEmpleado(int noEmpleado, String nombre, String apellidos){
        Statement stmt = null;
        
        try{
            Connection accesoDB = con.getCon();
            PreparedStatement updateEmp = accesoDB.prepareStatement("UPDATE Empleado SET Nombre = ?, Apellidos = ? WHERE No_empleado = ?");
            updateEmp.setInt(3,noEmpleado);
            updateEmp.setString(1,nombre);
            updateEmp.setString(2, apellidos);
            int res = updateEmp.executeUpdate();
      
            if(res > 0)
                JOptionPane.showMessageDialog(null,"Empleado con No. Empleado: " + noEmpleado + "  modificado");
            else 
               JOptionPane.showMessageDialog(null, "numero de empleado desconocido", "Modificar empleado",
                    JOptionPane.ERROR_MESSAGE);
        } catch(SQLException e){
            System.out.println("error: failed to create a connection object.");
            e.printStackTrace();
        } catch(Exception e){
            
        }
      
        
    }
    
    public void eliminarEmpleado(int noEmpleado){
        Statement stmt = null;
        System.out.print(noEmpleado+"\n");
        try{
            Connection accesoDB = con.getCon();
            stmt = accesoDB.createStatement(); 
            
            PreparedStatement updateEmp = accesoDB.prepareStatement("DELETE FROM Empleado WHERE No_empleado = ?");
            updateEmp.setInt(1, noEmpleado);
            int res = updateEmp.executeUpdate();
            
      
            if(res > 0)
                JOptionPane.showMessageDialog(null,"Alumno con No. Empleado: " + noEmpleado + "  eliminado");
            else if(res == 0)
               JOptionPane.showMessageDialog(null, "numero de empleado desconocido", "Borrar Empleado",
                    JOptionPane.ERROR_MESSAGE);
        } catch(SQLException e){
            System.out.println("error: failed to create a connection object.");
            e.printStackTrace();
        } catch(Exception e){
            
        }
    }

    public ArrayList<Empleado> listEmpleado(){
        ArrayList listaEmpleado = new ArrayList();
        Empleado emp;
        
        try{
            Connection accesoDB = con.getCon();
            PreparedStatement stmt;
            stmt = accesoDB.prepareStatement("SELECT * FROM Empleado ");
            ResultSet res = stmt.executeQuery();
            
            while(res.next()){
                emp = new Empleado();
                emp.setNoEmpleado(Integer.parseInt(res.getString(1)));
                emp.setNombre(res.getString(2));
                emp.setApellidos(res.getString(3));
                emp.setInasistencias(Integer.parseInt(res.getString(4)));
                emp.setRetardos(Integer.parseInt(res.getString(5)));
                listaEmpleado.add(emp);
            }
            
        } catch(Exception e){
            
        }
        return listaEmpleado;
    }
}
