
package com.ejercicio1.proyectofinaled;

public class ListaColas {
    
    public NodoColas cabeza;

    public ListaColas(NodoColas Cabeza) {
        this.cabeza = Cabeza;
    }

    public ListaColas() {
    }
     // Método para insertar ordenado en la lista
   
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
    
   public void AtenderTiquete(String id) {
    NodoColas cajaActual = cabeza;
    int numeroCaja = 0;

    while (cajaActual != null) {
        Cola colaCaja = cajaActual.getTiquetes();

        if (!colaCaja.estaVacia() && colaCaja.getFrente().getDato().getId().equals
        (id)) {
            try {
                // Atender el tiquete actual
                Tiquete atendido = colaCaja.desencolar();
                atendido.setHoraAtencion(java.time.LocalTime.now().toString());
                ManejadorArchivos.guardarTiquete(atendido, numeroCaja, "Sucursal Central");
                System.out.println("Tiquete con ID " + id + " atendido en caja " + numeroCaja);

                // Si hay otro tiquete, atenderlo automáticamente
                if (!colaCaja.estaVacia()) {
                    Tiquete siguiente = colaCaja.desencolar();
                    siguiente.setHoraAtencion(java.time.LocalTime.now().toString());
                    ManejadorArchivos.guardarTiquete(siguiente, numeroCaja, "Sucursal Central");
                    System.out.println("Siguiente tiquete atendido automáticamente en caja " + numeroCaja);
                }

            } catch (Exception e) {
                System.out.println("Error al atender tiquete: " + e.getMessage());
            }

            return; // salimos al encontrar el ID
        }

        cajaActual = cajaActual.getSiguiente();
        numeroCaja++;
    }

    System.out.println("Tiquete con ID " + id + " no fue encontrado en ninguna caja.");
}
   
   
}