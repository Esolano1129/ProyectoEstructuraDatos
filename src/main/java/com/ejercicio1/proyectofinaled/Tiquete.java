
package com.ejercicio1.proyectofinaled;

import java.time.LocalDateTime;

public class Tiquete {
    
    private String nombre;
    private String id;
    private int edad;
    private String monedaCuenta;
    private LocalDateTime horaCreacion;
    private LocalDateTime horaAtencion;
    private String tramite;
    private String tipoTramite;

    public Tiquete() {
        
    }

    public Tiquete(String nombre, String id, int edad, String monedaCuenta, LocalDateTime horaCreacion, LocalDateTime horaAtencion, String tramite, String tipoTramite) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.monedaCuenta = monedaCuenta;
        this.horaCreacion = LocalDateTime.now();
        this.horaAtencion = null;
        this.tramite = tramite;
        this.tipoTramite = tipoTramite;
        
    }

    public Tiquete(String nombre, String id, int edad, String monedaCuenta, String tramite, String tipoTramite) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.monedaCuenta = monedaCuenta;
        this.tramite = tramite;
        this.tipoTramite = tipoTramite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMonedaCuenta() {
        return monedaCuenta;
    }

    public void setMonedaCuenta(String monedaCuenta) {
        this.monedaCuenta = monedaCuenta;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public LocalDateTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDateTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", monedaCuenta=" + monedaCuenta + ", horaCreacion=" + horaCreacion + ", horaAtencion=" + horaAtencion + ", tramite=" + tramite + ", tipoTramite=" + tipoTramite + '}';
    }
    
    
    
    
}
