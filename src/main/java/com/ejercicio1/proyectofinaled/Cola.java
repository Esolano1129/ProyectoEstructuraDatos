/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio1.proyectofinaled;

/**
 *
 * @author camil
 */
public class Cola {

    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
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

    public Tiquete descolar() throws Exception {
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
