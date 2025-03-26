package com.ejercicio1.proyectofinaled;

public class Main {

    public static void main(String[] args) {
       
        Lista lista1 = new Lista();
        
        Serializacion serial = new Serializacion();
       
        
         lista1.insertar(new Tiquete("Jose Rodriguez", "584728394017", 35, "Dolares", "Depositos", "A"));
         lista1.insertar(new Tiquete("Abby", "584728394017", 35, "Dolares", "Depositos", "A"));
         lista1.insertar(new Tiquete("Kenneth", "584728394017", 35, "Dolares", "Depositos", "A"));
         
          serial.serializarPila(lista1, "Config2.json");
        
        
        

        try {
           //  Login log = new Login();
            // log.validarUsuario();
             
          //  Sucursal sucursal = new Sucursal();
           // sucursal.crearCajas();
            // Menu menu = new Menu();
            // menu.desplegarMenuInicial();   
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
