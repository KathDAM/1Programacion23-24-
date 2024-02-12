package segundaev.arrays.ejercicio7;

import java.util.Arrays;

import segundaev.vectores.utilidades.Utilidades;

public class OrdenarVec {
    public static void main(String[] args) {
  
        int tamaño = Utilidades.tamañoVectorInt();

        int[] vector = new int[tamaño];
        Utilidades.introducirValoresInt(vector);

        int cota = Utilidades.introducirCota();

        int[] vectorCopia = Arrays.copyOf(vector, tamaño);
        Arrays.sort(vectorCopia);

        int busqueda = Arrays.binarySearch(vectorCopia,cota);
        if (busqueda < 0) {
            busqueda = - busqueda -1;
        }
    
        int[] vectorResultado = new int[vectorCopia.length];
        Arrays.fill(vectorResultado, 0, busqueda , -cota); // vector- array que leo, 0 - posicion desde donde leo y menores el final de lo que leo (menores = cota en este caso), y cota es lo que muestro al imprimir
        Arrays.fill(vectorResultado, busqueda, vectorResultado.length, cota);

        System.out.println("Vector original: " + Arrays.toString(vector));
        System.out.println("Vector resultante: " + Arrays.toString(vectorResultado));

    }
}

