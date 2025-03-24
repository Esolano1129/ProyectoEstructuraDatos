/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio1.proyectofinaled;

import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class Sucursal {
    String nombre;
    Lista cajeros = new Lista();
    int cantidad; //lista con multiples cajas
    
    
    Sucursal(){
        this.nombre = JOptionPane.showInputDialog(null, "Digite el nombre de la sucursal");
        this.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Cajas en la sucursal"));
    }
    
    Sucursal(String nombre, int cantidad){
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
