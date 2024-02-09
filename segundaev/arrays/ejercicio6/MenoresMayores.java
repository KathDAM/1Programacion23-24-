package segundaev.arrays.ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class MenoresMayores {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

       // int mayores = 0;
        //int menores = 0;

        int[] vector = new int[Utilidades.tamañoVectorInt()];
        Utilidades.introducirValoresInt(vector);

        Utilidades.introducirCota();

        long menores = Arrays.stream(vector)
        .filter(num -> num < Utilidades.introducirCota())
        .count();

        long mayoresOIguales = Arrays.stream(vector)
                        .filter(num -> num >= Utilidades.introducirCota())
                        .count();
        
        System.out.println("Número de elementos menores que la cota " + cota + ": " + menores);
        System.out.println("Número de elementos mayores o iguales que la cota " + cota + ": " + mayoresOIguales);
    
    }
}
