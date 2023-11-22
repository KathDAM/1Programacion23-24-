package ejerciciosopcionales;

import java.util.Scanner;

public class PatronCuadrado {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de N (impar):");
        int n = scanner.nextInt();

     // Imprimir el cuadrado
     for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            // Imprimir asterisco en los bordes o en el centro del cuadrado
            if (i == 1 || i == n || j == 1 || j == n ) {
                System.out.print("* ");
            } else {
                // Imprimir espacio en blanco en otras posiciones
                System.out.print("  ");
            }
        }
        // Cambiar de línea después de cada fila
        System.out.println();
        }
    }
}
