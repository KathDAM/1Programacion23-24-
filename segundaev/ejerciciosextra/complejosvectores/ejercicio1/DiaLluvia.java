/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaev.ejerciciosextra.complejosvectores.ejercicio1;

/**
 *  Clase que representa la lluvia simulada en un día
 * @author jsanm
 */
public class DiaLluvia {

    /**
     * Ordinal que indica el número de día de la simulación desde 1..N
     */
    private int numDiaSimulacion;

    public int getNumDiaSimulacion() {
        return numDiaSimulacion;
    }

    
    
    /**
     * Cantidad de lluvia simulada ese día
     */
    private int cantidadLluviaSimulada;
    
    public int getCantidadLluviaSimulada() {
        return cantidadLluviaSimulada;
    }
    

    public DiaLluvia(int numDiaSimulacion, int cantidadLluviaSimulada) {
        
        if(numDiaSimulacion<=0)
            throw new RuntimeException("El número de día de la simulación ha de ser positivo");
        if(cantidadLluviaSimulada<=0)
            throw new RuntimeException("La cantidad de lluvia simulada ha de ser positiva");
        
        this.numDiaSimulacion = numDiaSimulacion;
        this.cantidadLluviaSimulada = cantidadLluviaSimulada;
    }
    
    public String toString(){
        return String.format("Día=%2d\tLluvia=%2d",this.numDiaSimulacion,this.cantidadLluviaSimulada);
    }
    
}
