
package com.ejercicio1.proyectofinaled;

public class Sucursal {
    
    private String nombreSucursal;
    private int cantidadCajas;
    private Lista CajaPreferencial;
    private Lista CajaTramiteRapido;
    private Lista CajaTramiteNormal;


    public Sucursal(String nombreSucursal, int cantidadCajas, Lista CajaPreferencial, Lista CajaTramiteRapido, Lista CajaTramiteNormal) {
        this.nombreSucursal = nombreSucursal;
        this.cantidadCajas = cantidadCajas;
        this.CajaPreferencial = CajaPreferencial;
        this.CajaTramiteRapido = CajaTramiteRapido;
        this.CajaTramiteNormal = CajaTramiteNormal;
    
    }

    public Sucursal(String nombreSucursal, int cantidadCajas) {
        this.nombreSucursal = nombreSucursal;
        this.cantidadCajas = cantidadCajas;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    public void setCantidadCajas(int cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombreSucursal=" + nombreSucursal + ", cantidadCajas=" + cantidadCajas + ", CajaPreferencial=" + CajaPreferencial + ", CajaTramiteRapido=" + CajaTramiteRapido + ", CajaTramiteNormal=" + CajaTramiteNormal + '}';
    }
    
}
