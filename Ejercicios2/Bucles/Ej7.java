//Catherine AM
package Ejercicios2.Bucles;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7");
        Scanner lector = new Scanner(System.in);

        System.out.println("Dame un número real (A): ");
        double nA = lector.nextDouble();

        System.out.println("Dame otro número entero (B): ");
        int nB = lector.nextInt();

        System.out.println("Resultado final " +  Math.pow(nA, nB));

        lector.close();
    }
}












         /* if (nA <= 0 || nB<=0) {
            if (nA == 0 || nB<=0) {
                System.out.println("Opción invalida.Indefinido o 1");
            } else {
                System.out.println("Resultado final " +  Math.pow(nA, nB)); 
            }

        } else {
             System.out.println("Resultado final " +   Math.pow(nA, nB));     
        }

         if (nB<=0) {
            if (nB==0) {
                System.out.println("Resultado final 1");
            } else {
                System.out.println("Resultado final " +  Math.pow(nA, nB));
            }
           
        } else {
            System.out.println("Resultado final " +  Math.pow(nA, nB));          
        }*/