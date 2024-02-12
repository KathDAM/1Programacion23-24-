package segundaev.arrays.ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class MenoresMayores {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        int tamaño = Utilidades.tamañoVectorInt();

        int[] vector = new int[tamaño];
        Utilidades.introducirValoresInt(vector);

        int cota = Utilidades.introducirCota();

        int[] vectorCopia = Arrays.copyOf(vector, tamaño);

        Arrays.sort(vectorCopia);
        int busqueda = Arrays.binarySearch(vectorCopia,cota);
    
        if (busqueda >= 0) { //revisamos si la cota existe en el array
            int menores = busqueda;
            int mayores = vectorCopia.length - menores - 1; 
            System.out.println("Número de elementos menores que la cota " + cota + ": " + menores);
            System.out.println("Número de elementos mayores o iguales que la cota " + cota + ": " + mayores);
            System.out.println("Números menores que la cota " + cota + ": " + Arrays.toString(Arrays.copyOfRange(vectorCopia, 0, menores)));
            System.out.println("Números mayores o iguales que la cota " + cota + ": " + Arrays.toString(Arrays.copyOfRange(vectorCopia, menores, vectorCopia.length)));
        } else {
            int menores = -busqueda - 1;
            int mayores = vectorCopia.length - menores;
            System.out.println("Número de elementos menores que la cota " + cota + " : " + menores);
            System.out.println("Número de elementos mayores o iguales que la cota " + cota + ": " + mayores);
            System.out.println("Números menores que la cota " + cota + ": " + Arrays.toString(Arrays.copyOfRange(vectorCopia, 0, menores))); // vector- array que leo, 0 - posicion desde donde leo y menores el final de lo que leo (menores = cota en este caso)
            System.out.println("Números mayores o iguales que la cota " + cota + ": " + Arrays.toString(Arrays.copyOfRange(vectorCopia, menores, vectorCopia.length)));
        }

        lect.close();
    }
}
