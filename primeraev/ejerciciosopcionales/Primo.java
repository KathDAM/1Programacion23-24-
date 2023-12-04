package ejerciciosopcionales;

import java.util.Scanner;

public class Primo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero para verificar si es primo:");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " no es un número primo.");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }

        scanner.close();
    }
}
