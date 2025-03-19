
package com.ejercicio1.proyectofinaled;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;


public class Serializacion {
   

    public Serializacion() {
        
    }
        public void serializarLista(Lista lista, String archivo){
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            
            gson.toJson(lista,writer);
            
        } catch (Exception e) {
            e.printStackTrace();
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