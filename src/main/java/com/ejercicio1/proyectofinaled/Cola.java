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

   //Método para encolar los tiquetes en la cola 
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
    //Método para desencolar los tiquetes de la cola 
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
    //Método para mostrar el elemento al frente de la cola 
    public Tiquete frente() throws Exception {
        if (frente == null) {
            throw new Exception("La cola está vacía");
        }
        return frente.getDato();

    }
    
    public Nodo getRaiz(){
        return this.frente;
    }

    public boolean estaVacia() {
        return frente == null;

    }

    // Método para mover los tquetes de la cola a la Lista de Colas
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
    //Método para imprimir los elementos de la cola
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

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
}
