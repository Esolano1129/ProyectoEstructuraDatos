
package com.ejercicio1.proyectofinaled;

public class Nodo {
    //Atributos
    
    private Tiquete dato; 
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
        
    }

    public Nodo(Tiquete dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Tiquete getDato() {
        return dato;
    }

    public void setDato(Tiquete dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
     
    
    
   
}

