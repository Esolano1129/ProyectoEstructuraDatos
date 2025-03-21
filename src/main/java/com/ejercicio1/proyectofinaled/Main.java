package com.ejercicio1.proyectofinaled;

public class Main {

    public static void main(String[] args) {

        try {

            Cola newCola = new Cola();
            Lista CajaPreferencial = new Lista();
            Lista CajaTramiteRapido = new Lista();
            Lista CajaTramiteNormal = new Lista();

            //Serializacion desserializarPila = new Serializacion();
            // newCola = desserializarPila.desseralizarCola("Config.json");
            
            //Datos para Jsom
            newCola.encolar(new Tiquete("Jose Rodriguez", "584728394017", 35, "Dolares", "Depositos", "A"));
            newCola.encolar(new Tiquete("Carlos Ramirez", "103948576210", 65, "Dolares", "Retiros", "P"));
            newCola.encolar(new Tiquete("Jose Salas", "928347561983", 28, "Colones", "Cambio de Divisas", "B"));
            newCola.encolar(new Tiquete("Raquel Saborio", "487562039184", 37, "Dolares", "Depositos", "B"));
            newCola.encolar(new Tiquete("Hernan Gonzales", "639820457102", 75, "Dolares", "Retiros", "P"));
            newCola.encolar(new Tiquete("Mario Brenes", "159384762945", 36, "Colones", "Cambio de Divisas", "A"));

            
            newCola.MoverTiquetesaLista(CajaPreferencial, CajaTramiteRapido, CajaTramiteNormal);

            System.out.println("Caja Preferencial: " + CajaPreferencial.toString());
            System.out.println("Caja Tramite Rapido: " + CajaTramiteRapido.toString());
            System.out.println("Caja Tramite Normal: " + CajaTramiteNormal.toString());

            //Serializacion serializaLista = new Serializacion();
            // serializaLista.serializarLista(caja, "Config.json");
            
            //Menu menu = new Menu();
            //menu.desplegarMenu();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
