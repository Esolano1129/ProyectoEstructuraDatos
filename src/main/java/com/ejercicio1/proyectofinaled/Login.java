
package com.ejercicio1.proyectofinaled;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Login {

    public void validarUsuario(){
        
        String Username = JOptionPane.showInputDialog("Ingrese su usuario: ");
        String Password = JOptionPane.showInputDialog("Ingrese su contraseña: ");
     
  
        
        /*Gson gson = new GsonBuilder().create();
        try (FileReader reader = new FileReader("usuarios.json")) { 
            System.out.println("ANTES DE FALLO");
   
            Usuario usuarios = gson.fromJson(reader, Usuario.class);
            //System.out.println("USUARIOS: "+ usuarios.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        
        if (Username.equals("Edgardo") && Password.equals("123")) {
            JOptionPane.showMessageDialog(null, "¡Login exitoso!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        }
    }
}
