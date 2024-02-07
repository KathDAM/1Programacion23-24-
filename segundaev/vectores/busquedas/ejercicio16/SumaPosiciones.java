// Catherine AM
package segundaev.vectores.busquedas.ejercicio16;

import java.util.Scanner;

public class SumaPosiciones {
        static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array: ");
        int tamaño = lect.nextInt();

        int[] vector = new int[tamaño];

        introducirValoresVector(vector);

        System.out.println("Introduce el numero que quieres bucar: ");
        int numero = lect.nextInt();
        buscaSumaPosiciones(vector,numero);
    }

    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void buscaSumaPosiciones(int[] vector, int num){
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
            if (suma > num) {
                System.out.println("La primera posición donde la suma supera M es: " + i);
            }
        }
        System.out.println("La suma de todos los elementos no supera el valor de M.");
      } 
}
