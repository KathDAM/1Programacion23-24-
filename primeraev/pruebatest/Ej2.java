package pruebatest;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Ejercicio 2.Serie de Fibonacci");
        System.out.println("Dame un número N:");
        int n = lect.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print(serieFibonacci(i) + " , ");
        }

        System.out.println();
        mostrarSerieFibonacci(n);

        lect.close();
    }

    public static int serieFibonacci(int n){
        if (n <= 1) {
            return n;
        } else {
            return serieFibonacci(n - 1) + serieFibonacci(n - 2);
        }
    }

    //segunda opcion
    public static void mostrarSerieFibonacci(int n) {
        int a = 1, b = 1;

        System.out.println("Los primeros " + n + " números de la serie de Fibonacci son:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
/*
    //tercera opcion
     // Inicializamos los dos primeros números de la serie
     int a = 1;
     int b = 1, i = 1;

   
     while (i <= n) {
         System.out.print(a + " ");

         int siguiente = a + b;
         a = b;
         b = siguiente;

         i++;
     }
 */
}
