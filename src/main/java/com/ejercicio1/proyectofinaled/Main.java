package com.ejercicio1.proyectofinaled;

public class Main {

    public static void main(String[] args) throws Exception {    
        
        Serializacion serial = new Serializacion();
        serial.serializarUsuarios("usuariosDB.json");
        
        try {
          Login log = new Login();
          log.validarUsuario();
             
         
           
          Menu menu = new Menu();
          menu.desplegarMenuInicial();   
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
