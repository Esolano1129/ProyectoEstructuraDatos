
package com.ejercicio1.proyectofinaled;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Serializacion {
   
    Lista newLista = new Lista();

    public Serializacion() {
        Cola newCola = new Cola();
        
        
        //Datos para Jsom
            newCola.encolar(new Tiquete("Jose Rodriguez", "584728394017", 35, "Dolares", "Depositos", "A"));
            newCola.encolar(new Tiquete("Carlos Ramirez", "103948576210", 65, "Dolares", "Retiros", "P"));
            newCola.encolar(new Tiquete("Jose Salas", "928347561983", 28, "Colones", "Cambio de Divisas", "B"));
            newCola.encolar(new Tiquete("Raquel Saborio", "487562039184", 37, "Dolares", "Depositos", "B"));
            newCola.encolar(new Tiquete("Hernan Gonzales", "639820457102", 75, "Dolares", "Retiros", "P"));
            newCola.encolar(new Tiquete("Mario Brenes", "159384762945", 36, "Colones", "Cambio de Divisas", "A"));
            
            newCola.MoverTiquetesaLista(newLista, newLista, newLista);
            //serializarLista(newLista, "Config.json");
            generarUsuarios();
            
    }
       /* public void serializarLista(Lista lista, String archivo){
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            String json = "";
            Nodo cabezaTemp = lista.cabeza;
            while(cabezaTemp != null){
               
                Tiquete tkt = cabezaTemp.getDato();
                String datos = gson.toJson(tkt.toString());
                System.out.println("JSON \n "+datos);
                //String nombreTkt = tkt.getNombre();
                json = json + " " + datos;
                cabezaTemp = cabezaTemp.getSiguiente();
            }
            
             gson.toJson(json,writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }*/
          public void serializarPila(Lista lista, String archivo){
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(lista,writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        public void generarUsuarios(){
            
             Gson gson = new GsonBuilder().create();
             try (FileWriter writer = new FileWriter("usuarios.json")) {
                 Usuario abby = new Usuario("abby", "1234");
                 //Usuario edgardo = new Usuario("edgardo", "1234");
                
                 gson.toJson(abby,writer);
                 //gson.toJson(edgardo ,writer);
             } catch (IOException ex) {
            Logger.getLogger(Serializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public Lista desseralizarLista(String archivo){
        Gson gson = new GsonBuilder().create();
        try (FileReader reader = new FileReader(archivo)) {            
            return gson.fromJson(reader, Lista.class);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}