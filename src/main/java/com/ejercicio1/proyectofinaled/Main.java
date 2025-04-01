package com.ejercicio1.proyectofinaled;

public class Main {

    public static void main(String[] args) throws Exception {    
        //Deserealizamos el json con los datos al iniciar el programa
        Serializacion serial = new Serializacion();
       // serial.serializarUsuarios("usuariosDB.json");
        
        try {
            //Llamamos al Login y validamos el username y password
          Login log = new Login();
          log.validarUsuario();
             
         
           //Desplegamos el menú inicial
          Menu menu = new Menu();
          menu.desplegarMenuInicial();   
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
