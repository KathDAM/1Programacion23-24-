package EjExamen.vectores;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {
        // Ejemplo de uso de los métodos equivalentes
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // equals
        boolean sonIguales = equals(array1, array2);
        System.out.println("Los arrays son iguales: " + sonIguales);

        // fill (con índices)
        int[] array3 = {0, 0, 0, 0, 0};
        fill(array3, 1, 3, 7);
        System.out.println("Array después de fill (con índices): " + Arrays.toString(array3));

        // fill (sin índices)
        int[] array4 = new int[5];
        fill(array4, 8);
        System.out.println("Array después de fill (sin índices): " + Arrays.toString(array4));

        // toString
        System.out.println("Array convertido a String: " + toString(array1));

        // copyOf
        int[] copia = copyOf(array1, 3);
        System.out.println("Copia del array: " + Arrays.toString(copia));

        // sort
        int[] array5 = {5, 3, 1, 4, 2};
        sort(array5);
        System.out.println("Array ordenado: " + Arrays.toString(array5));

        // binarySearch
        int[] array6 = {1, 3, 5, 7, 9};
        int indice = binarySearch(array6, 5);
        System.out.println("El índice del valor buscado es: " + indice);
    }

    public static boolean equals(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static void fill(int[] array, int fromIndex, int toIndex, int value) {
        Arrays.fill(array, fromIndex, toIndex, value);
    }

    public static void fill(int[] array, int value) {
        Arrays.fill(array, value);
    }

    public static String toString(int[] array) {
        return Arrays.toString(array);
    }

    public static int[] copyOf(int[] original, int newLength) {
        return Arrays.copyOf(original, newLength);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
