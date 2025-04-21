
package com.ejercicio1.proyectofinaled;

import com.ejercicio1.proyectofinaled.Tiquete;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ManejadorArchivos {

    private static final String RUTA = "atendidos.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static class RegistroTiquete {
        private String nombre;
        private String id;
        private int edad;
        private String monedaCuenta;
        private String horaCreacion;
        private String horaAtencion;
        private String tramite;
        private String tipoTramite;
        private int caja;
        private String sucursal;

        public RegistroTiquete(Tiquete t, int caja, String sucursal) {
            this.nombre = t.getNombre();
            this.id = t.getId();
            this.edad = t.getEdad();
            this.monedaCuenta = t.getMonedaCuenta();
            this.horaCreacion = t.getHoraCreacion();
            this.horaAtencion = t.getHoraAtencion();
            this.tramite = t.getTramite();
            this.tipoTramite = t.getTipoTramite();
            this.caja = caja;
            this.sucursal = sucursal;
        }
    }

    public static void guardarTiquete(Tiquete t, int caja, String sucursal) {
        RegistroTiquete registro = new RegistroTiquete(t, caja, sucursal);
        String json = gson.toJson(registro);

        try (FileWriter file = new FileWriter(RUTA, true)) {
            file.write(json + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error guardando tiquete: " + e.getMessage());
        }
    }
    
}

    

