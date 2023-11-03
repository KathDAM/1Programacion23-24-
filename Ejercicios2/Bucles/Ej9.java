//Catherine AM
package Ejercicios2.Bucles;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9");

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame un número entero positivo: ");
        int num = lector.nextInt();
        
        if (num <= 1) {
            System.out.println("No se puede descomponer, ingresa un número entero positivo mayor que 1.");
        } else {
            System.out.print("El número " + num + " se descompone en  ");
            int divisor = 2;

            while (num > 1) {
                 if (num % divisor == 0) {
                    System.out.print(divisor);
                    num /= divisor;
                    if (num > 1) {
                        System.out.print(" * ");
                    }
                } else {
                    divisor++;
                }
            }
        System.out.println(" ");
        }
        lector.close();
    }
}