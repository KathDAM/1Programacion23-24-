//Catherine AM
package Ejercicios2.Bucles;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 8");
        

        Scanner lector = new Scanner(System.in);
        System.out.println("Dame un número entero: ");
        int num = lector.nextInt();

        if (num <= 0 || num == 1) {
            System.out.println("No es un numero primo");
        } else{
            boolean esPrimo = true;

            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                }  
            }

            if (esPrimo) {
                System.out.println("Es un numero primo");
            } else {
                System.out.println("No es un numero primo");
            }
        }
        lector.close();
    }
}
