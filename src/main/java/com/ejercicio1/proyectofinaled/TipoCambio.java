
package com.ejercicio1.proyectofinaled;
import java.math.BigDecimal;

public class TipoCambio {
    
    
    public void mostrarTipoCambio()throws Exception{
        
        
        ServicioBCCR servicio = new ServicioBCCR();
        IndicadorEconomico indicador = servicio.obtenerIndicador(
                "318", "31/03/2025", "31/03/2025",
                "Edgardo Solano", "N", "edgardoasolano@gmail.com", "10ACIREM8G" //Aquí agregamos nuevas credenciales y token cuando nos subscribimos a la página del BCCR
        );
        System.out.println("\n\n\n\n/////////////////////////////////////");
        BigDecimal tipoCambio = tipoCambio(indicador);
        System.out.println("/////////////////////////////////////");
        System.out.println("Tipo de cambio:"+ tipoCambio.toString());
        System.out.println("/////////////////////////////////////\n");
       
    }
 
    public static BigDecimal tipoCambio(IndicadorEconomico indicadorEconomico) {
        BigDecimal resultado=null;
        // Verificando que no sea nulo
        if (indicadorEconomico != null && indicadorEconomico.getDiffgram() != null) {
            IndicadorEconomico.Diffgram diffgram = indicadorEconomico.getDiffgram();
 
            if (diffgram.getDatosDeIndicadores() != null) {
                IndicadorEconomico.DatosDeIndicadores datos = diffgram.getDatosDeIndicadores();
 
                if (datos.getIndicadores() != null && !datos.getIndicadores().isEmpty()) {
                    for (IndicadorEconomico.Indicador indicador : datos.getIndicadores()) {
                        // Imprimiendo los datos del indicador
                        System.out.println(".:Datos del Indicador:.");
                        System.out.println("\tCódigo: " + indicador.getCodigo());
                        System.out.println("\tFecha: " + indicador.getFecha());
                        System.out.println("\tValor: " + indicador.getValor());
                        // Extrayendo intCompact (si existe como parte del BigDecimal)
                        if (indicador.getValor() != null) {
                            long intCompact = indicador.getValor().unscaledValue().longValue();
                            System.out.println("\tintCompact: " + intCompact);
                        }
                        return indicador.getValor();
                    }
                } else {
                    System.out.println("No hay indicadores en la respuesta.");
                }
            } else {
                System.out.println("No hay datos de indicadores.");
            }
        } else {
            System.out.println("El objeto indicadorEconomico está vacío.");
        }        
       return resultado;
    }
 
}
 
    

