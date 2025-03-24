
package com.ejercicio1.proyectofinaled;



public class Lista {
    
    public Nodo cabeza;
    //public NodoColas cabeza;
    
    
    public void insertar(Tiquete t)
    {
        if(cabeza == null)
        {
            cabeza = new Nodo(t);
        }
        else
        {
           //Asigna al prinpio
            if(Long.parseLong(t.getId())<Long.parseLong(cabeza.getDato().getId()))
            {
                Nodo auxiliar = new Nodo(t);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            }
            else
            {
                //Inserta a la derecha si solo hay 1 nodo
                if(cabeza.getSiguiente() == null)
                {
                    Nodo nuevo = new Nodo(t);
                    cabeza.setSiguiente(nuevo);
                }
                else
                {
                 //Inserta al medio o al final
                    Nodo auxiliar = cabeza;
                    while(auxiliar.getSiguiente() != null && 
                          Long.parseLong(auxiliar.getSiguiente().getDato().getId()) < Long.parseLong(t.getId()))
                    {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    
                    Nodo otroAuxiliar = new Nodo(t);
                     
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }
    
    public void insertarNodo(Nodo dato){ //insertar cajeros
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        }else{
            while(cabeza != null){
                if (cabeza.getSiguiente() == null){
                    cabeza.setSiguiente(dato);
                    System.out.println("INSERTADO");
                }
                cabeza = cabeza.getSiguiente();
            }
            
        }
        
       
        
    }
    public boolean existe(String id)
    {
        boolean respuesta = false;
        
        Nodo auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getId() == id)
            {
                respuesta = true;
                break;
            }
            else
            {
                auxiliar = auxiliar.getSiguiente();
            }
        }
        
        return respuesta;
    }
    
    public void modifica(Tiquete t)
    {
        Nodo auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getId() == t.getId())
            {
                auxiliar.getDato().setNombre(t.getNombre());
                break;
            }
            else
            {
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    
    public void elimina(String id)
    {
        Nodo auxiliar = cabeza;
        Nodo anterior = null;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getId() == id)
            {
                if(auxiliar == cabeza)
                {
                    cabeza = cabeza.getSiguiente();
                    auxiliar.setSiguiente(null);
                    break;
                }
                else
                {
                    anterior.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(null);
                    break;
                }
            }
            else
            {
                anterior = auxiliar;
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
 @Override
    public String toString() {
        Nodo auxiliar = cabeza;
        String respuesta = "Lista: \n";
        
        while(auxiliar != null)
        {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
        }
        
        return respuesta;
    }
    
    public int imprimirLista(){
        
        Nodo frenteTemp = this.cabeza;
        int i = 0;
        while(frenteTemp != null){
            
            System.out.println("Nodo "+ i + " con nombre en el tiquete: "+ frenteTemp.getDato().nombre);            
            i++;
            frenteTemp = frenteTemp.getSiguiente();
        }
        return i;
    }
    

    public boolean estaVacia() {
        return cabeza == null;
    }
}
    
    
    

