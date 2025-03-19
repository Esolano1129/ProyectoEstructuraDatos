
package com.ejercicio1.proyectofinaled;



public class Nodo{
   
    
    private Tiquete dato; 
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
        
    }

    public Nodo(Tiquete dato) {
        this.dato = dato;
        
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

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
     
    
    
   
}

