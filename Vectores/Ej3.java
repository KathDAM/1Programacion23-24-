//Catherine AM
package vectores;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.print("¿De qué tamaño será el array? ");
        int tamaño1 = lect.nextInt();
        int[] array1 = creaArray(tamaño1);

        System.out.println("El contenido del vector es el siguiente:");
        imprimirArray(array1);

        System.out.print("¿De qué tamaño será el segundo array? ");
        int tamaño2 = lect.nextInt();
        int[] array2 = creaArray(tamaño2);

        System.out.println("El contenido del segundo vector es el siguiente:");
        imprimirArray(array2);

        lect.close();
    }

    // METODOS
        //CREA ARRAY
    public static int[] creaArray(int tamaño) {
        int[] array = new int[tamaño];
        Scanner lect = new Scanner(System.in);

        for (int i = 0; i < tamaño; i++) {
            System.out.print("     Introduzca el valor entero de la posición " + i + ": ");
            int posicion = lect.nextInt();
            array[i] = posicion;
        }

        return array;
      
    }
        //IMPRIME ARRAY
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("vector[" + i + "] = " + array[i]);
        }
    }
}