
package com.ejercicio1.proyectofinaled;

import javax.swing.JOptionPane;

public class Menu {
    
    Cola colaTiquetes = new Cola();
    
    public void MenuCargarTiket(){
  
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        String id = JOptionPane.showInputDialog("Ingrese el id del cliente: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));
        String monedaCuenta = JOptionPane.showInputDialog("Ingrese la moneda de la cuenta:"+"\n"+"Dólares"+"\n"+"Colones");
        String tramite = JOptionPane.showInputDialog("Ingrese el tipo de tramite:" +"\n"+"*Depositos"+"\n"+" *Retiros"+"\n"+"*Cambio de divisas"+"\n"+"*Servicios");
        String tipoTramite = JOptionPane.showInputDialog("Ingrese el tipo de Prioridad:"+"\n"+"P: Preferencial"+"\n"+"A: Un solo tramite"+"\n"+"B: Dos o más tramites");

        Tiquete tiquete = new Tiquete(nombre, id, edad, monedaCuenta, tramite, tipoTramite);

        this.colaTiquetes.encolar(tiquete);
        int largo = colaTiquetes.imprimirCola();
        //System.out.println("Hay "+ largo + " tiquetes en la cola");
         
    }
    public void desplegarMenuInicial(){
        
         int opcion;

        do {
            
            String menu = "Bienvenido a nuestro menú:\n"
                        + "1. Agregar Tiquete\n"
                        + "2. Atender Tiquete\n"
                        + "3. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Sistema de agregar Nuevo Tiquete");
                    
                    this.MenuCargarTiket();

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Sistema de Atender Tiquete");

                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Salir");

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);  
    }
}
        
        
    
    

    

