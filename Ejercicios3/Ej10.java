//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej10{
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        System.out.println(" ");

        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe un número entero para calcular su factorial:");
        int num = lect.nextInt();
        long res = calculoFactorial(num);

        System.out.println("El factorial de " + num + " es " + res);

        lect.close();
    }

    static long calculoFactorial(int a){
        if (a == 0) {
            System.out.println("1");
        }
        if (a < 0) {
            System.out.println("Los números negativos no tienen factorial");
        }
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;

    }
}