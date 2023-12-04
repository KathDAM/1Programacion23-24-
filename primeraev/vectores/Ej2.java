//Catherine A.M.
package vectores;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args){
        Scanner lect = new Scanner(System.in);

        System.out.println("¿De qué tamaño será el array? ");
        int tamaño = lect.nextInt();

        int [] array = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("    Introduzca el valor entero de la posición " + i + ": ");
            int posicion = lect.nextInt();
            array[i]= posicion;
        }

        System.out.print("¿Qué valor deseas buscar? ");
        int valor = lect.nextInt();

        buscarValor(array,valor);

        lect.close();
    }

    //METODO
    public static void buscarValor(int[] array, int valor) {
        boolean encontrar = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                System.out.println("Se ha encontrado el valor " + valor + " en la posición " + i);
                encontrar = true;
            }
        }

        if (!encontrar) {
            System.out.println("No se ha encontrado el valor " + valor + " en el array.");
        
        }
    }   
}
