/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training2;

import java.util.Scanner;

/**
 * Este programa solicita un mes al usuario y el programa contesta con el número de días que 
 * dispone el mes. Para ello, hace uso de un array de 12 posiciones con los resultados por mes.
 * 
 * Completa las instrucciones que se te solicitan.
 * @author jsanm
 */
public class InicializacionArraysConValores {
   static Scanner lect = new Scanner(System.in);
    
     public static void main(String[] args){
        
        //0. Inicializamos un array para almacenar los días que tiene cada mes
        int[] numDiasXMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //1. Solicita un mes al usuario (valor de 1 a 12)
        System.out.println("Dame un valor del 1 al 12");
        int valor =lect.nextInt();
        
        //2. Informa al usuario sobre cuántos días dispone el mes introducido haciendo uso
        // de la variable "numDiasXMes". Ten en cuenta que el primer índice del array es un 0.
        System.out.println("Dispones de " + numDiasXMes[valor-1] + " días.");

     }
        
}
