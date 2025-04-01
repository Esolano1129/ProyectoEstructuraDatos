
package com.ejercicio1.proyectofinaled;

public class NodoColas { //cajeros
    
    private Cola tiquetes;
    private NodoColas siguiente; //siguiente cajero
    int codPreferencial;
    int limiteTramites;
    
    public NodoColas(int preferencia){
        
        this.tiquetes = new Cola();
        this.siguiente = null;
        this.codPreferencial = preferencia;
        this.limiteTramites = calcularTramites();
        
    }

    public NodoColas(Cola tiquetes, NodoColas siguiente) {
        this.tiquetes = tiquetes;
        this.siguiente = siguiente;
    }

    public NodoColas(Cola tiquetes) {
        this.tiquetes = tiquetes;
    }

    public NodoColas(NodoColas siguiente) {
        this.siguiente = siguiente;
    }

    public NodoColas() {
    }

    public Cola getTiquetes() {
        return tiquetes;
    }

    public void setCaja(Cola tiquetes) {
        this.tiquetes = tiquetes;
    }

    public NodoColas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColas siguiente) {
        if (this.siguiente != null){
            setSiguiente(this.siguiente);
        }else{
            this.siguiente = siguiente;
        }
        
    }
    // Método para definir colas de prioridades
    public int calcularTramites(){
        if (this.codPreferencial == 0){ //caja preferencial
            return 1000;
        }else if (this.codPreferencial == 1){ //caja unica
            return 1;
        }else{
            return 500; //cajas restantes
        }
    }

    @Override
    public String toString() {
        return "NodoColas{" + "tiquetes=" + tiquetes + ", siguiente=" + siguiente + '}';
    }
    
    
    
}
