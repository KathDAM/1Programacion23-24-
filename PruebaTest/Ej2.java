package PruebaTest;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Ejercicio 2.Serie de Fibonacci");
        System.out.println("Dame un número N:");
        int n = lect.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(serieFibonacci(i) + " , ");
        }

        lect.close();
    }

    public static int serieFibonacci(int n){
        if (n <= 1) {
            return n;
        } else {
            return serieFibonacci(n - 1) + serieFibonacci(n - 2);
        }
    }
}
