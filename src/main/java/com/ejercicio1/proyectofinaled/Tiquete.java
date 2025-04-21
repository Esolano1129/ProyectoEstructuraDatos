
package com.ejercicio1.proyectofinaled;


public class Tiquete  {
    
    public String nombre;
    public String id;
    public int edad;
    public String monedaCuenta;
    public String horaCreacion;
    public String horaAtencion;
    public String tramite;
    public String tipoTramite;

    public Tiquete() {
        
    }

    public Tiquete(String nombre, String id, int edad, String monedaCuenta, String horaCreacion, String horaAtencion, String tramite, String tipoTramite) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.monedaCuenta = monedaCuenta;
        this.horaCreacion = horaCreacion;
        this.horaAtencion = horaAtencion;
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

    public String getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(String horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }
    

    @Override
    public String toString() {
        return "Tiquete[" + "nombre:" + nombre + ", id:" + id + ", edad:" + edad + ", monedaCuenta:" + monedaCuenta + ", horaCreacion:" + horaCreacion + ", horaAtencion:" + horaAtencion + ", tramite:" + tramite + ", tipoTramite:" + tipoTramite + ']';
    }
    
    
    
    
}
