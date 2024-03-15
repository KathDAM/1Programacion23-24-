/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Arrays;

/**
 * Ejemplos y actividades para los cálculos recursivos
 * @author j.sanmateujuan
 */
public class CalculosRecursivos {
    
    
    public static int calcularPotencia(int base,int exponente){
        
        if(exponente < 0)
            throw new IllegalArgumentException("No implementado el cálculo con exponente negativo");
        
        if(exponente == 0)
            return 1;
        
        return base * calcularPotencia(base, exponente-1);
                
    }
    
    public static int posicionEnArray(int elemento, int[] vector){
        
        if(vector==null)
            return -1;
        
        return posicionEnArray(elemento, vector,0);
    }
    
    private static int posicionEnArray(int elemento, int[] vector, int i) {
        
        if(i>=vector.length)
            return -1;        
        
        if(vector[i]==elemento)
            return i;
        
        return posicionEnArray(elemento, vector, i+1);
        
    }
    
    public static void imprimirSecuencia(int numElem){
        
        if(numElem < 1)
            return;
        
        if(numElem == 1){
            System.out.print(1 + " ");
            return;
        }
        
        imprimirSecuencia(numElem-1);
        System.out.print(numElem + " ");
    }
    
    public static void main(String[] args){
        
        System.out.print("Calculamos 2 elevado a 10: ");
        System.out.println(calcularPotencia(2,10));
        System.out.println();
        
        int valorBusq=5;
        int[] valoresBusq = {6, 2, -1, 5, 4};
        System.out.print("Buscamos " + valorBusq + " en " + Arrays.toString(valoresBusq) + ": ");
        System.out.println(posicionEnArray(valorBusq,valoresBusq));
        System.out.println();
        
        valorBusq = 1;
        System.out.print("Buscamos " + valorBusq + " en " + Arrays.toString(valoresBusq) + ": ");
        System.out.println(posicionEnArray(valorBusq,valoresBusq));
        System.out.println();
        
        int numElems = 1;
        System.out.print("Secuencia de " + numElems + " elementos: ");
        imprimirSecuencia(numElems);
        System.out.println();
        System.out.println();
        
        numElems = 2;
        System.out.print("Secuencia de " + numElems + " elementos: ");
        imprimirSecuencia(numElems);
        System.out.println();
        System.out.println();
        
        numElems = 10;
        System.out.print("Secuencia de " + numElems + " elementos: ");
        imprimirSecuencia(numElems);
        System.out.println();
        System.out.println();
        
       
        
        
        
    }
    
    public static int multiplicar(int multiplicando, int multiplicador){
        
        //TODO: implementar recursivamente
       return 0; //borrar esta línea al implementar
    }
    
    
   

    
}
