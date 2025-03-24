
package com.ejercicio1.proyectofinaled;

import javax.swing.JOptionPane;

public class Sucursal {
    public String nombre;
    public Lista cajeros = new Lista();
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
    
    
    public void crearCajas(){
        
        for(int i = 0; i < this.cantidad; i++){
            cajeros.insertarNodo(new Nodo()); //insertar caja
            //System.out.println("Caja " + (i+1) + " creada");
        }
        
        cajeros.imprimirLista();
        
    }
}
