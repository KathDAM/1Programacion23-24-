package EjExamen.vectores;

import java.util.Arrays;

public class Ej3 {
    public static void main(String[] args) {
        int [] vector1 = {1,2,3,4};
        int [] vector2 = {1,2,5,4};

        int[] suma = sumaVector(vector1,vector2);
        int[] resta = restaVector(vector1,vector2);
        System.out.println("La suma de vectores es " + Arrays.toString(suma));
        System.out.println("La resta de vectores es " + Arrays.toString(resta));
    }
    private static int[] restaVector(int[] vector1, int[] vector2) {
        int n = Math.min(vector1.length, vector2.length); //longitud correcta
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = vector1[i] - vector2[i];
        }

        return resultado;
    }

    private static int[] sumaVector(int[] vector1, int[] vector2) {
        int n = vector1.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }

        return resultado;
    }    

    /*public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    } */
}
