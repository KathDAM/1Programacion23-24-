// Catherine AM
package segundaev.vectores.busquedas.ejercicio13;

import java.util.Scanner;

public class Numerico0 {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array: ");
        int tamaño = lect.nextInt();
        lect.nextLine(); //Vaciar buffer

        int[] vector = new int[tamaño];

        introducirValoresVector(vector);
        encontrarPrimerNumero(vector);

    }
    
    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void encontrarPrimerNumero(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                System.out.println("El numero 0 esta en la posicion " + i);
                return;
            }
        }
        System.out.println("No hay ningún 0 en el vector");    
    }
}
