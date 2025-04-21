package com.ejercicio1.proyectofinaled;

import com.ejercicio1.proyectofinaled.Grafos.Grafo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;

public class Serializacion {

    Lista newLista = new Lista();

    public Serializacion() {
        Cola newCola = new Cola();

        //Datos para Json
//        newLista.insertar(new Tiquete("Jose Rodriguez", "584728394017", 35, "Dolares","3:00:00","3:01:00", "Depositos", "A"));
//        newLista.insertar(new Tiquete("Carlos Ramirez", "103948576210", 65, "Dolares","12:00:00","12:01:00", "Retiros", "P"));
//        newLista.insertar(new Tiquete("Jose Salas", "928347561983", 28, "Colones","7:00:00","7:01:00", "Cambio de Divisas", "B"));
//        newLista.insertar(new Tiquete("Raquel Saborio", "487562039184", 37,"Dolares","5:30:00","5:45:00", "Depositos", "B"));
//        newLista.insertar(new Tiquete("Hernan Gonzales", "639820457102", 75, "Dolares","8:45:00","9:45:00", "Retiros", "P"));
//        newLista.insertar(new Tiquete("Mario Brenes", "159384762945", 36, "Colones","10:25:00","12:00:00", "Cambio de Divisas", "A"));
//
//        serializarLista(newLista, "Config.json");

        newLista = deserealizarLista("Config.json");
        System.out.println(newLista.toString());

        newCola.MoverTiquetesaLista(newLista, newLista, newLista);

    }
    //Método para serealizar la lista
    public void serializarLista(Lista lista, String archivo) {
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(lista, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   //Método para serealizar Usuarios
    public void serializarUsuarios(String archivo) {
        Gson gson = new GsonBuilder().create();
        Usuario usuarioAbby = new Usuario("abby", "1234");
        //Usuario usuarioEd = new Usuario("Edgardo", "1234");
        
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(usuarioAbby, writer);
            //gson.toJson(usuarioEd, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void serializarGrafo(Grafo grafo, String archivo) {
    Gson gson = new GsonBuilder().create();
    try (FileWriter writer = new FileWriter(archivo)) {
        gson.toJson(grafo, writer);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    //Método para deserealizar la Lista
    public Lista deserealizarLista(String archivo) {
        Gson gson = new GsonBuilder().create();
        try (FileReader reader = new FileReader(archivo)) {
            return gson.fromJson(reader, Lista.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //Método para deserealizar la Usuarios
    public Usuario deserealizarUsuarios(String archivo) {
        Gson gson = new GsonBuilder().create();
        try (FileReader reader = new FileReader(archivo)) {
            return gson.fromJson(reader, Usuario.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
