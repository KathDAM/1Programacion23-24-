package segundaev.arrays.ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class MenoresMayores {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        int mayores = 0;
        int menores = 0;
        int tamaño = Utilidades.tamañoVectorInt();

        int[] vector = new int[tamaño];
        Utilidades.introducirValoresInt(vector);

        int cota = Utilidades.introducirCota();

        for (int i = 0; i < tamaño; i++) {
            if (vector[i] < cota) {
                menores++;
            } else {
                mayores++;
            }
        }
        
        System.out.println("Número de elementos menores que la cota " + cota + ": " + menores);
        System.out.println("Número de elementos mayores o iguales que la cota " + cota + ": " + mayores);
    
        lect.close();
    }
}
