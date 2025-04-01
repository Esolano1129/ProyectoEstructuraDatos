
package com.ejercicio1.proyectofinaled;

import javax.swing.JOptionPane;

public class Sucursal {
    public String nombre;
    public ListaColas cajeros = new ListaColas(new NodoColas());
    public int cantidad; //lista con multiples cajas
    
    
    public Sucursal(){
        this.nombre = JOptionPane.showInputDialog(null, "Digite el nombre de la sucursal");
        this.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Cajas en la sucursal"));
    }
    
   public Sucursal(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
        crearCajas();
    }
    
    // Método para crear las cajas
    public void crearCajas(){
        
        for(int i = 0; i < this.cantidad; i++){
            
            NodoColas cajero;
            
            if(i == 0){ //primera caja, va preferencial
                cajero = new NodoColas(0); //prefencial
            }else if(i == 1){
                cajero = new NodoColas(1); //tramite unico
            }else{
                cajero = new NodoColas(i); //restantes cajeros
            }
            
            
            
            cajeros.insertarNodo(cajero); //insertar caja
            //System.out.println("Caja " + (i+1) + " creada");
        }        
    }

    //Método apra asignar los tiquetes a las cajas
   public int asignarTiquete(int cajaAtender) {
        
        ListaColas temp = cajeros;
        
        while(temp != null){
            
            if (temp.cabeza.codPreferencial == cajaAtender){
                Tiquete nuevoTiquete = crearTiqueteCajero();
                if (temp.cabeza.getTiquetes() == null){
                    temp.cabeza.setCaja(new Cola());
                    temp.cabeza.getTiquetes().encolar(nuevoTiquete);
                    temp.imprimirLista();
                    return 200; //crea la cola de tiquetes con el primer tiquete
                    
                }else{
                    temp.cabeza.getTiquetes().encolar(nuevoTiquete);
                    temp.imprimirLista();
                    return 202; //solo inserta
                }
                
            }else{
                temp.cabeza = temp.cabeza.getSiguiente(); //la caja no es la correcta, se mueve a la siguiente y verifica
            }
            
        }
        
        return -1; //no encontro caja
    
    }
    
    //Método para crear nuevos tiquetes y asignarlos a los nodos de cola.
    public Tiquete crearTiqueteCajero(){
        
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        String id = JOptionPane.showInputDialog("Ingrese el id del cliente: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));
        String monedaCuenta = JOptionPane.showInputDialog("Ingrese la moneda de la cuenta:"+"\n"+"Dólares"+"\n"+"Colones");
        String tramite = JOptionPane.showInputDialog("Ingrese el tipo de tramite:" +"\n"+"*Depositos"+"\n"+" *Retiros"+"\n"+"*Cambio de divisas"+"\n"+"*Servicios");
        String tipoTramite = JOptionPane.showInputDialog("Ingrese el tipo de Prioridad:"+"\n"+"0: Preferencial"+"\n"+"1: Un solo tramite"+"\n"+"2: Dos o más tramites");

        return new Tiquete(nombre, id, edad, monedaCuenta, tramite, tipoTramite);
        
    }
}
