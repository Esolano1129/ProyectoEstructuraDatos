
package com.ejercicio1.proyectofinaled;

import javax.swing.JOptionPane;

public class Menu {
    
    public void desplegarMenu(){
        
        Sucursal sucursal = crearSucursal();

        while (true) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
            String id = JOptionPane.showInputDialog("Ingrese el id del cliente: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));
            String monedaCuenta = JOptionPane.showInputDialog("Ingrese la moneda de la cuenta (dólares o colones): ");
            String tramite = JOptionPane.showInputDialog("Ingrese el tipo de tramite(Depositos, Retiros, Cambio de divisas, Servicios): ");
            String tipoTramite = JOptionPane.showInputDialog("Ingrese el tipo de tramite(P: Preferencial, A: Un solo tramite, B: Dos o más tramites): ");

            Tiquete tiquete = new Tiquete(nombre, id, edad, monedaCuenta, tramite, tipoTramite);
         

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea atender un tiquete?: ", "Atender tiquete", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                try {
                   // sucursal.atenderTiquete();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea agregar un tiquete?: ", "Agregar tiquete", JOptionPane.YES_NO_OPTION);
            if (continuar == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }

    private static Sucursal crearSucursal() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal: ");
        int cantidadCajas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajas: "));
        return new Sucursal(nombre, cantidadCajas);
    }
}
    

