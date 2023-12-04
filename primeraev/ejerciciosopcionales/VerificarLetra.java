package ejerciciosopcionales;
import java.util.Scanner;

public class VerificarLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una letra
        System.out.print("Introduce una letra: ");
        char letra = scanner.next().charAt(0);

        // Verificar si la letra es mayúscula o minúscula
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra ingresada es mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra ingresada es minúscula.");
        } else {
            System.out.println("No es una letra válida.");
        }

        scanner.close();
    }
}


