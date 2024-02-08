// Catherine AM
package segundaev.vectores.busquedas.ejercicio13;

import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class Numerico0 {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        int[] vector = new int[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresInt(vector);
        encontrarPrimerNumero(vector);

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
