package com.ejercicio1.proyectofinaled.Grafos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Grafo {

    private Map<String, List<ProductosComplementarios>> grafo;

    public Grafo() {
        grafo = new HashMap<>();
        inicializarGrafo();
    }

    private void inicializarGrafo() {
        // Productos complementarios para seguros
        List<ProductosComplementarios> seguros = Arrays.asList(
                new ProductosComplementarios("Seguro Contra Robo"),
                new ProductosComplementarios("Seguro de Viajes"),
                new ProductosComplementarios("Seguro de Vida Financiera")
        );

        // Productos verdes
        List<ProductosComplementarios> productosVerdes = Arrays.asList(
                new ProductosComplementarios("Retiro sin Tarjeta"),
                new ProductosComplementarios("Intereses para Fauna y Flora"),
                new ProductosComplementarios("Donación a Energía Limpia")
        );

        // Plan Salva Vidas
        List<ProductosComplementarios> planEmergencia = Collections.singletonList(
                new ProductosComplementarios("Plan Salva Vidas")
        );

        // Mapeamos los servicios a productos
        grafo.put("Depósito", seguros);
        grafo.put("Moneda", seguros);
        grafo.put("Cambio de Divisas", seguros);

        grafo.put("Retiros", productosVerdes);
        grafo.put("Cancelaciones", productosVerdes);
        grafo.put("Planes Ecológicos", productosVerdes);

        grafo.put("Emergencia Ejecutivo", planEmergencia);
    }

    public void mostrarSugerencias(String servicio) {
        
        List<ProductosComplementarios> sugerencias = grafo.getOrDefault(servicio, new ArrayList<>());

        if (!sugerencias.isEmpty()) {
            StringBuilder mensaje = new StringBuilder("Sugerencias para el servicio \"" + servicio + "\":\n");
            for (ProductosComplementarios p : sugerencias) {
                mensaje.append("- ").append(p.getNombre()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Productos Complementarios", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay sugerencias para este servicio.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

