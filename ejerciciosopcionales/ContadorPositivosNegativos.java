package ejerciciosopcionales;

import java.util.Scanner;

public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce una secuencia de números. Para finalizar, introduce 0:");

        int numero;
        do {
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

        } while (numero != 0);
        
/*        while (numero != 0) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

            numero = scanner.nextInt();
        } */
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        scanner.close();
    }
}
