
package com.ejercicio1.proyectofinaled;

public class ListaColas {
    
    public NodoColas cabeza;

    public ListaColas(NodoColas Cabeza) {
        this.cabeza = Cabeza;
    }
    
    
    public void insertarNodo(NodoColas caja){ //insertar cajas necesita fix para muchas cajas, caso 1 caja (caja 0) funciona bien, ocupamos mas.
        
        NodoColas temp = cabeza;
        
        if(temp == null)
        {
            cabeza = caja;
        }else{
            
            while(temp != null){
                temp = temp.getSiguiente();
            }
            cabeza.setSiguiente(temp);
            
        }
        
    }
    
    //Método para imprimir lista 
    public void imprimirLista(){
        
        NodoColas frenteTemp = this.cabeza;
        int i = 0;
        while(frenteTemp != null){
            
            System.out.println("Caja "+ (i)) ;
            Cola tickets = frenteTemp.getTiquetes();
            System.out.println(imprimirTiquetes(tickets));
            i++;
            frenteTemp = frenteTemp.getSiguiente();
        }
    }
    //Método para imprimir tiquetes
    public String imprimirTiquetes(Cola tiquetes){
        Nodo temp = tiquetes.getRaiz();
        
        String tiquetesString = "";
        
        while(temp != null){
            tiquetesString = tiquetesString + temp.getDato().toString() + "\n";
            temp = temp.getSiguiente();
        }
        System.out.println("TIQUETES: "+ tiquetesString);
        return tiquetesString;
    }
}
