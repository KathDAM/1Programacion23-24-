//Catherine A.M.
package vectores;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.print("Escriba el tamaño del vector: ");
        int tamaño = lect.nextInt();

        int [] array = new int[tamaño]; //crea la array

        for (int i = 0; i < tamaño; i++) {
            System.out.print("     Introduzca el número entero de la posición " + i + ": " );
            int posicion = lect.nextInt();
            array[i]= posicion;
        }
        System.out.println();

        System.out.println("El contenido del vector es el siguiente: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("vector[" + i + "]= " + array[i]);
        }

        lect.close();
    }
    

}
