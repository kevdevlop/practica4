/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author KevDev
 */
public class Empleado {
    public int noEmpleado;
    public String nombre;
    public String apellidos;
    public int retardos;
    public int inasistencias;
      
    public Empleado() {
        this.noEmpleado = 0;
        this.nombre = "";
        this.apellidos = "";
        this.retardos = 0;
        this.inasistencias = 0;
      
    }
    
    public int getNoEmpleado(){
        return noEmpleado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApeliidos(){
        return apellidos;
    }
   
    public int getRetardos(){
        return retardos;
    }
    public int getInasistencias(){
        return inasistencias;
    }
  
    public void setNoEmpleado(int noEmpleado){
        this.noEmpleado = noEmpleado;
    }
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setRetardos(int retardos){
        this.retardos = retardos;
    }
    public void setInasistencias(int inasistencias){
        this.inasistencias = inasistencias;
    }
   
}
