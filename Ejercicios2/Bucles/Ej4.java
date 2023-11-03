//Catherine AM
package Ejercicios2.Bucles;

import java.util.Scanner;

public class Ej4 {
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un número entero (A): ");
        int nA = scanner.nextInt();

        System.out.println("Dame otro número entero (B) mayor que A: ");
        int nB = scanner.nextInt();

        int result = 0;

        //PARA SACAR CUANTOS PARES HAY
        System.out.println("Los números de A a B son: ");
        for (int i = nA; i < nB; i++) {
            System.out.print(" " + i);
            if (i % 2 == 0) {
                result ++;
            } 
        }
        System.out.print(" " + nB);
        System.out.println(" ");
        System.out.println("Los números de " + nA + " a " + nB + " PARES son: " + result);
       // System.out.println("Los números pares son: " + par);

    }
}
