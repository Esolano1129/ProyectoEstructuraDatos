
package com.ejercicio1.proyectofinaled;

public class Sucursal {
    
    private String nombre;
    private int cantidadCajas;
    private Cola colaPreferencial;
    private Cola colaTramiteRapido;
    private Cola colaTramiteNormal;

    public Sucursal(String nombre, int cantidadCajas, Cola colaPreferencial, Cola colaTramiteRapido, Cola colaTramiteNormal) {
        this.nombre = nombre;
        this.cantidadCajas = cantidadCajas;
        this.colaPreferencial = new Cola();
        this.colaTramiteRapido = new Cola();
        this.colaTramiteNormal = new Cola();
    }

    public Sucursal(String nombre, int cantidadCajas) {
        this.nombre = nombre;
        this.cantidadCajas = cantidadCajas;
    }
    
    
    public void agregarTiquete (Tiquete tiquete){
        switch (tiquete.getTipoTramite()){
            case "P":
            colaPreferencial.encolar(tiquete);
            break;
            case "A":
            colaTramiteRapido.encolar(tiquete);
            break;
            case "B":
            colaTramiteNormal.encolar(tiquete);
            break;
        }
        
    }
    public void atenderTiquete() throws Exception {
        if (!colaPreferencial.estaVacia()){
            Tiquete tiquete = colaPreferencial.descolar();
            System.out.println("Atendiendo tiquete preferencial: " + tiquete.getNombre());
        } else if (!colaTramiteRapido.estaVacia()){
            Tiquete tiquete = colaTramiteRapido.descolar();
            System.out.println("Atendiendo tiquete de tramite rapido: " + tiquete.getNombre());
        }else if (!colaTramiteNormal.estaVacia()){
            Tiquete tiquete = colaTramiteNormal.descolar();
            System.out.println("Atendiendo tiquete normal: " + tiquete.getNombre());
        }else {
            System.out.println("No hay tiquetes para atender.");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    public void setCantidadCajas(int cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }
}
