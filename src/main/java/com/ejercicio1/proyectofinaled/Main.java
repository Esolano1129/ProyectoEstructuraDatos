
package com.ejercicio1.proyectofinaled;


public class Main {
    public static void main(String[] args) {
        
        try{
            
        Cola newCola = new Cola();
        
        //Serializacion desserializarPila = new Serializacion();
        //newCola = desserializarPila.desseralizarCola("Config.json");
        
        
        //Datos para Jsom
        newCola.encolar(new Tiquete("Jose Rodriguez","1099287732",35,"Dolares","Depositos","A"));
        newCola.encolar(new Tiquete("Carlos Ramirez","109123312",65,"Dolares","Retiros","P"));
        newCola.encolar(new Tiquete("Jose Salas","1091534212",28,"Colones","Cambio de Divisas","B"));
        newCola.encolar(new Tiquete("Maria Rojas","10123211546",45,"Colones","Depositos","A"));
        newCola.encolar(new Tiquete("Raquel Saborio","34523211546",37,"Dolares","Depositos","B"));
        newCola.encolar(new Tiquete("Hernan Gonzales","16565723312",75,"Dolares","Retiros","P"));
        newCola.encolar(new Tiquete("Mario Brenes","3452321223246",36,"Colones","Cambio de Divisas","A"));
        
       System.out.println("Elemento al frente: " + newCola.frente());
       System.out.println("Elemento eliminado: " + newCola.desencolar()); 
       System.out.println("Elemento al frente: " + newCola.frente());
        
        //Serializacion serializaCola = new Serializacion();
        //serializaCola.serializarCola(newCola, "Config.json");
        
      
        //Menu menu = new Menu();
        //menu.desplegarMenu();
        
        
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
       
       } 
}