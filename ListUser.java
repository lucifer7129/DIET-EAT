/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diet.eat;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Angel
 */

public class ListUser {
    
    private List<User> datos;
    
    public ListUser(){
        
        datos = new ArrayList<>();
    }
    
 public int buscar (String User){
  
     int n= -1;
     for (int i=0; i< datos.size(); i++){
         if(datos.get(i).getNombre().equals(User)){
             n=i;
             break;
         }
     }
     return n;
 }
 
 public boolean insert(User nombre){
     if(buscar(nombre.getNombre())==-1){
         datos.add(nombre);
         return true;
     }else{
         return false;
     }
 }
 
 public boolean Update(User user){
     
     if(buscar(user.getNombre())!=-1){
         User usernew = obtener(user.getNombre());
         
         usernew.setPassword(user.getPassword());
         usernew.setNombre(user.getNombre());
        
         return true;
     }else{
         return false;
     }
 }
  public boolean Delete(String user){
      if(buscar(user)!=-1){
          datos.remove(buscar(user));
          
          return true;
      }else{
          return false;
      }
  
 }
 public User obtener (String User){
     if(buscar(User) !=-1){
         return datos.get(buscar(User));
     }else{
         return null;
     }
 }
 
}


 
