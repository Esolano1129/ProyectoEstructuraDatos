
package com.ejercicio1.proyectofinaled;

public class NodoColas {
    
    private Cola caja;
    private NodoColas siguiente;

    public NodoColas(Cola caja, NodoColas siguiente) {
        this.caja = caja;
        this.siguiente = siguiente;
    }

    public NodoColas(Cola caja) {
        this.caja = caja;
    }

    public NodoColas(NodoColas siguiente) {
        this.siguiente = siguiente;
    }

    public NodoColas() {
    }

    public Cola getCaja() {
        return caja;
    }

    public void setCaja(Cola caja) {
        this.caja = caja;
    }

    public NodoColas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColas siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoColas{" + "caja=" + caja + ", siguiente=" + siguiente + '}';
    }
    
    
    
}
