/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training2;

import java.util.Scanner;

/**
 * Este programa solicita un número de valores variable al usuario y calcula el sumatorio utilizando un vector.
 * 
 * Completa las instrucciones que se te solicitan.
 * @author jsanm
 */
public class InicializacionArraysTamanyoVariable {
            
     static Scanner scn = new Scanner(System.in);
     public static void main(String[] args){
 
         
         System.out.println("Indique el tamaño del vector");
         int tamanyoVector = Integer.parseInt(scn.nextLine());
         
         //0. Finaliza la declaración del vector. IMPLEMENTAR AQUÍ
         int[] vectorSumatorio = new int[tamanyoVector];
         

         //1. Pide al usuario tantos valores enteros como datos quepan en el vector 
         inicializarVector(vectorSumatorio);
         
         //2. Calcula el sumatorio de todos los valores del vector
         int resultado = calcularSumatorioVector(vectorSumatorio);
         
         //3. Mostramos el resultado del sumatorio al usuario
         System.out.println("Usted ha introducido " + vectorSumatorio.length + " valores que suman un total de " + resultado + " unidades");
         
     }

     /**
      * Recibe un vector e inicializa sus datos en base al tamaño del vector con datos introducidos por teclado
      * @param arraySinValores Array sin valores a inicializar. Parámetro de entrada y salida.
      */
    private static void inicializarVector(int[] arraySinValores) {
        //IMPLEMENTAR AQUÍ
        for (int i = 0; i < arraySinValores.length; i++) {
            System.out.print("Introduce los valores[" + i + "] : " );
            int num =scn.nextInt();
            arraySinValores[i] = num;
        }
    }

    /**
     * Calcula el sumatorio de un vector de enteros
     * @param vectorSumatorio Array del cual se suman sus valores
     * @return El sumatorio
     */
    private static int calcularSumatorioVector(int[] vectorSumatorio) {
         //IMPLEMENTAR AQUÍ
         int suma = 0;
         for (int j = 0; j < vectorSumatorio.length; j++) {
            suma += vectorSumatorio[j];
         }
         return suma;
    }
}
