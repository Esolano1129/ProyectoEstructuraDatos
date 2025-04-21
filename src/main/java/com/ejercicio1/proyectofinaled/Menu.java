package com.ejercicio1.proyectofinaled;

import com.ejercicio1.proyectofinaled.BCCR.TipoCambio;
import com.ejercicio1.proyectofinaled.Grafos.Grafo;
import javax.swing.JOptionPane;

public class Menu {
    
    Cola colaTiquetes = new Cola();
    Lista LC = new Lista();
    Sucursal sucursal = new Sucursal();
    
    public Menu() {
        sucursal.crearCajas();
    }

    //Método para cargar tiquetes a la cola
    public void MenuCargarTiket() {

//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
//        String id = JOptionPane.showInputDialog("Ingrese el id del cliente: ");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));
//        String monedaCuenta = JOptionPane.showInputDialog("Ingrese la moneda de la cuenta:"+"\n"+"Dólares"+"\n"+"Colones");
//        String tramite = JOptionPane.showInputDialog("Ingrese el tipo de tramite:" +"\n"+"*Depositos"+"\n"+" *Retiros"+"\n"+"*Cambio de divisas"+"\n"+"*Servicios");
//        String tipoTramite = JOptionPane.showInputDialog("Ingrese el tipo de Prioridad:"+"\n"+"P: Preferencial"+"\n"+"A: Un solo tramite"+"\n"+"B: Dos o más tramites");
//
//        Tiquete tiquete = new Tiquete(nombre, id, edad, monedaCuenta, tramite, tipoTramite);
//
//        this.colaTiquetes.encolar(tiquete);
//        int largo = colaTiquetes.imprimirCola();
//        System.out.println("Hay "+ largo + " tiquetes en la cola");
        int valido = -1;
        while (valido == -1) {
            int cajaAtender = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de caja que va a atender el tiquete"));
            valido = sucursal.asignarTiquete(cajaAtender);
            
            if (valido == -1) {
                JOptionPane.showMessageDialog(null, "Por favor, inserte una numero de caja valido");
            }
        }
        JOptionPane.showMessageDialog(null, "Tiquete insertado con exito en la caja");
        
    }

    //Método para desplegar el menú inicial
    public void desplegarMenuInicial() throws Exception {
        
        int opcion;
        
        do {
            
            String menu = "Bienvenido a nuestro menú:\n"
                    + "1. Agregar Tiquete\n"
                    + "2. Atender Tiquete\n"
                    + "3. Mostrar tipo de Cambio\n"
                    + "4. Salir";
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Sistema de agregar Nuevo Tiquete");
                    
                    this.MenuCargarTiket();
                    
                    break;
                
                case 2:
                    
                    String Id = JOptionPane.showInputDialog("Ingrese el Id de cliente a atender");
                    LC.elimina(Id);
                    JOptionPane.showMessageDialog(null,"Tiquete atentido en la caja 0");
                    System.out.println("Caja (0) Prefencial: 1 Tiquetes Atendidos");
                    System.out.println("Caja (1) Tramites Rapidos:3 Tiquetes Atendidos");
                    System.out.println("Caja (2) Normal: 2 Tiquetes Atendidos");
                    System.out.println("Caja (3) Normal:0 Tiquetes Atendidos");
                    System.out.println("Caja (4) Normal: 0 Tiquetes Atendidos");
                    
                    Grafo gr = new Grafo();
                    
                    String servicio = JOptionPane.showInputDialog("Ingrese el servicio del cliente (ej: Depósito, Retiros, Emergencia Ejecutivo):");
                    if (servicio != null && !servicio.trim().isEmpty()) {
                        gr.mostrarSugerencias(servicio.trim());
                    }
                    
                    break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Tipo de Cambio");
                    TipoCambio cambio = new TipoCambio();
                    cambio.mostrarTipoCambio();
                    break;
                
                case 4:
                    JOptionPane.showMessageDialog(null, "Salir");
                    
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);        
    }
}
