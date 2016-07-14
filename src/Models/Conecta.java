package Models;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevDev
 */
public class Conecta {
      private static Connection con = null;
      private static String usuario  = "root";
      private static String pwd      = "root";
      private static String host     = "localhost:8889";
      private static String BD       = "interfaz";
      private static String url      = "jdbc:mysql://"+host+"/"+BD;
    
    public Conecta(){
       
    }
    public Connection getCon()
    {
      try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,pwd);
        
        }
        catch(SQLException ex) {
            System.out.printf("error en la conexion a la bd: "+ BD);
        } catch (ClassNotFoundException ex) {
              Logger.getLogger(Conecta.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;
    }
    
}
