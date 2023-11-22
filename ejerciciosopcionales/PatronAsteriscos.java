package ejerciciosopcionales;

import java.util.Scanner;

public class PatronAsteriscos {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de N:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= i; k++) { //para imprimirn triangulo entero- for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("* ");
            }

            // Cambiar de línea después de cada fila
            System.out.println();
        }
    }
}
