// Catherine AM
package segundaev.vectores.busquedas.ejercicio15;

import java.util.Scanner;

public class BusquedaN {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array: ");
        int tamaño = lect.nextInt();

        int[] vector = new int[tamaño];

        introducirValoresVector(vector);

        System.out.println("Introduce el numero que quieres bucar: ");
        int numero = lect.nextInt();
        encontrarPrimerM(vector,numero);
    }

    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void encontrarPrimerM(int[] vector, int num){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("El numero "+ num + " esta en la posicion " + i);
                return;
            }
        }
        System.out.println("No hay ningún " + num + " en el vector");    
    }
}
