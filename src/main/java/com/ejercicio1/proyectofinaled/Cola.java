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

    
    public void MoverTiquetesaLista(Lista CajaPreferencial, Lista CajaTramiteRapido, Lista CajaTramiteNormal) {
        Nodo auxiliar = frente;

        while (auxiliar != null) {
            Tiquete tiquete = auxiliar.getDato();  


            switch (tiquete.getTipoTramite()) {
                case "P":  // Preferencial
                    CajaPreferencial.insertar(tiquete);
                    break;
                case "A":  // Trámite rápido
                    CajaTramiteRapido.insertar(tiquete);
                    break;
                case "B":  // Trámite normal
                    CajaTramiteNormal.insertar(tiquete);
                    break;
                default:
                    System.out.println("Tipo de trámite no válido: " + tiquete.getTipoTramite());
            }

            auxiliar = auxiliar.getSiguiente();  
        }
    }
    
    public int imprimirCola(){
        
        Nodo frenteTemp = this.frente;
        int i = 0;
        while(frenteTemp != null){
            
            System.out.println( "\n"+"Nuevo Tiquete Agregado: "+ frenteTemp.getDato());            
            i++;
            frenteTemp = frenteTemp.getSiguiente();
        }
        return i;
    }
}
