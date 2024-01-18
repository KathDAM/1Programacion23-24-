package ejerciciosopcionales.ejercicio9;

import java.util.Random;
import java.util.Scanner;

public class AdivinarValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de adivinar el valor del dado.");

        // Establece el número de aciertos requeridos (puedes ajustarlo según tus preferencias)
        int aciertosRequeridos = 3;
        int aciertos = 0;

        while (aciertos < aciertosRequeridos) {
            // Pide al usuario que adivine el valor del dado
            System.out.print("Introduce tu adivinanza (un número entre 1 y 6): ");
            int adivinanzaUsuario = scanner.nextInt();

            // Genera un número aleatorio entre 1 y 6 (simulando el dado)
            int valorDado = random.nextInt(6) + 1;

            // Muestra el valor del dado
            System.out.println("El valor del dado es: " + valorDado);

            // Verifica si el usuario adivinó correctamente
            if (adivinanzaUsuario == valorDado) {
                System.out.println("¡Adivinaste correctamente!");
                aciertos++;
            } else {
                System.out.println("Lo siento, fallaste. Sigue intentando.");
            }

            System.out.println("Aciertos actuales: " + aciertos);
            System.out.println(); // Línea en blanco para mejorar la presentación
        }

        System.out.println("¡Felicidades! Has alcanzado el número de aciertos requeridos.");
        scanner.close();
    }
}
     

