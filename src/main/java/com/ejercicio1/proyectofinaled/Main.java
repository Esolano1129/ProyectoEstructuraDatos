package com.ejercicio1.proyectofinaled;

public class Main {

    public static void main(String[] args) {
       
        Serializacion serial = new Serializacion();

        try {
             Login log = new Login();
             log.validarUsuario();
             
            Sucursal sucursal = new Sucursal();
            sucursal.crearCajas();
            // Menu menu = new Menu();
            // menu.desplegarMenuInicial();     
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
