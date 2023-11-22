package ejerciciosopcionales;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número positivo para calcular su factorial:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Ingrese un número positivo.");
        } else {
            long factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println(numero + "! = " + factorial);
        }

        scanner.close();
    }
}
