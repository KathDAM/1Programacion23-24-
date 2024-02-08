// Catherine AM
package segundaev.vectores.busquedas.ejercicio17;

import java.util.Scanner;

public class Capicua {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        if (esCapicua(frase)) {
            System.out.println("La frase es capicúa.");
        } else {
            System.out.println("La frase no es capicúa.");
        }

        scanner.close();
    }

    public static boolean esCapicua(String frase) {
        frase = frase.replaceAll("\\s+", "").toUpperCase();
        char[] caracteres = frase.toCharArray();
        
        int inicio = 0;
        int fin = caracteres.length - 1;
        while (inicio < fin) {
            if (caracteres[inicio] != caracteres[fin]) {
                return false; // No capicúa
            }
            inicio++;
            fin--;
        }
        return true; // Capicúa
    }
}
