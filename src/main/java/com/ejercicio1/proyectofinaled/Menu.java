
package com.ejercicio1.proyectofinaled;

import javax.swing.JOptionPane;

public class Menu {
    
    Cola colaTiquetes = new Cola();
    
    public void MenuCargarTiket(){
  
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        String id = JOptionPane.showInputDialog("Ingrese el id del cliente: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));
        String monedaCuenta = JOptionPane.showInputDialog("Ingrese la moneda de la cuenta (dólares o colones): ");
        String tramite = JOptionPane.showInputDialog("Ingrese el tipo de tramite(Depositos, Retiros, Cambio de divisas, Servicios): ");
        String tipoTramite = JOptionPane.showInputDialog("Ingrese el tipo de tramite(P: Preferencial, A: Un solo tramite, B: Dos o más tramites): ");

        Tiquete tiquete = new Tiquete(nombre, id, edad, monedaCuenta, tramite, tipoTramite);

        this.colaTiquetes.encolar(tiquete);
        //int largo = colaTiquetes.imprimirCola();
        //System.out.println("Hay "+ largo + " tiquetes en la cola");
        /*int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea atender un tiquete?: ", "Atender tiquete", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {


            try {

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }*/
        
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
        
        
    
    

    

