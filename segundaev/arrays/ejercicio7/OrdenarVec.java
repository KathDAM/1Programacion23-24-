package segundaev.arrays.ejercicio7;

import java.util.Scanner;

public class OrdenarVec {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        // Pedir tamaño del vector
        System.out.println("Introduce el tamaño del vector: ");
        int tamaño = lect.nextInt();

        // Crear vector
        int[] vector = new int[tamaño];

        // Pedir valores del vector
        System.out.println("Introduce los valores del vector: ");
        for (int i = 0; i < tamaño; i++) {
            vector[i] = lect.nextInt();
        }

        // Pedir cota
        System.out.println("Introduce la cota: ");
        int cota = lect.nextInt();

        lect.close();

        // Crear vector resultante V'
        int[] vectorResultado = calcularVectorResultado(vector, cota);

        // Mostrar vector resultante
        System.out.println("Vector resultante V': " + Arrays.toString(vectorResultado));
    }

    // Función para calcular el vector resultante V'
    private static int[] calcularVectorResultado(int[] vector, int cota) {
        int posicionCota = encontrarPosicionCota(vector, cota);
        int[] vectorResultado = new int[vector.length];
        Arrays.fill(vectorResultado, 0, posicionCota + 1, -cota);
        Arrays.fill(vectorResultado, posicionCota + 1, vector.length, cota);
        return vectorResultado;
    }

    // Función para encontrar la posición de la cota en el vector ordenado
    private static int encontrarPosicionCota(int[] vector, int cota) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= cota) {
                return i;
            }
        }
        return vector.length - 1; // Si no se encuentra, retorna la última posición
    }
}

