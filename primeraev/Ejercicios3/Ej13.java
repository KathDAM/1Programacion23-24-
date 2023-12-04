//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println();
        System.out.println("Ejercicio 13");
        System.out.println();

        System.out.println("Ingresa un número para revisar si es 'perfecto':");
        int num = lect.nextInt();

        if (esNumeroPerfecto(num)) {
            System.out.println("El " + num + " es un número perfecto.");
        } else {
            System.out.println("El " + num + " no es un número perfecto.");
        }

        lect.close();
    }

    static boolean esNumeroPerfecto(int numero) {
        if (numero <= 1) {
            return false; // >=1 no son perfectos.
        }

        int suma = 0; 

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}