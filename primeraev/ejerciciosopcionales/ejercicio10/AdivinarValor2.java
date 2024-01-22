package ejerciciosopcionales.ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class AdivinarValor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de veces que desea tirar el dado: ");
        int numeroDeTiradas = scanner.nextInt();

        // Arreglo para almacenar la frecuencia de cada número (del 1 al 6)
        int[] frecuencia = new int[6];

        // Realizar las tiradas y contar la frecuencia de cada número
        for (int i = 0; i < numeroDeTiradas; i++) {
            int resultadoTirada = random.nextInt(6) + 1;
            frecuencia[resultadoTirada - 1]++; // Restamos 1 para ajustar al índice del arreglo
        }

        // Calcular y mostrar el porcentaje de veces que ha salido cada número
        System.out.println("Porcentaje de veces que ha salido cada número del dado:");

        for (int i = 0; i < 6; i++) {
            int numero = i + 1; // Sumamos 1 para mostrar el número real del dado
            double porcentaje = (double) frecuencia[i] / numeroDeTiradas * 100;
            System.out.println("Número " + numero + ": " + porcentaje + "%");
        }

        scanner.close();
    }
}

     

