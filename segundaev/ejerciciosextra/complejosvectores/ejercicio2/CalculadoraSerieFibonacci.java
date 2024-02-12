/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaev.ejerciciosextra.complejosvectores.ejercicio2;

import java.util.Arrays;

/**
 *
 * @author jsanm
 */
public class CalculadoraSerieFibonacci {
    
    /**
     * Serie de Fibonacci calculada desde la primera a la última posición. 
     */
    private long[] resultadoSerie;
    /**
     * Crea una serie de fibonacci en base al número de elementos de la serie a calcular
     * @param n Número de elementos de la serie a calcular
     */
    public CalculadoraSerieFibonacci(short n){
        
        if(n<2)
            throw new RuntimeException("N debe ser mayor que 1");
        if(n>=92)
            throw new RuntimeException("N debe ser menor que 92 por no poder calcularse en este programa");
        
        this.resultadoSerie = new long[n];
        calcularSerie();
    }

    /**
     * Calcula la serie. Método privado para inicializar el array de resultados siempre de forma controlada y no perderlos
     */
    private void calcularSerie() {
        
        resultadoSerie[0]=1;
        resultadoSerie[1]=1;
        for(short i=2;i<resultadoSerie.length;i++){
            resultadoSerie[i]=resultadoSerie[i-1]+resultadoSerie[i-2];
        }
    }
    
    /**
     * Método get que devuelve una <b>copia de la serie</b>. Es un método seguro para evitar que
     * el invocante pueda incidir sobre la serie.
     * @return 
     */
    public long[] getResultadoSerie(){
        return this.resultadoSerie.clone();
    }
    
    public String toString(){
        return "Serie Fibonacci de " + this.resultadoSerie.length + " elementos: " + Arrays.toString(this.resultadoSerie) ;
        
    }
}
