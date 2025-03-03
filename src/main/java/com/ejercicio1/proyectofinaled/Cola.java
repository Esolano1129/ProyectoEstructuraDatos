package com.ejercicio1.proyectofinaled;

public class Cola {

    private Nodo frente;
    private Nodo fin;

    public Cola(Nodo frente, Nodo fin) {
        this.frente = frente;
        this.fin = fin;
    }
    
    public Cola() {
        this.frente = frente;
        this.fin = fin;
    }

    public void encolar(Tiquete dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (fin != null) {
            fin.setSiguiente(nuevoNodo);

        }
        fin = nuevoNodo;
        if (frente == null) {
            frente = nuevoNodo;
        }
    }

    public Tiquete desencolar() throws Exception {
        if (frente == null) {
            throw new Exception("La cola está vacía");

        }
        Tiquete dato = frente.getDato();
        frente = frente.getSiguiente();

        if (frente == null) {
            fin = null;
        }

        return dato;
    }

    public Tiquete frente() throws Exception {
        if (frente == null) {
            throw new Exception("La cola está vacía");
        }
        return frente.getDato();

    }

    public boolean estaVacia() {
        return frente == null;

}


}