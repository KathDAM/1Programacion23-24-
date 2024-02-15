package segundaev.vectores.recorridovectores.ejercicio4;

import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class LotesM {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        int[] vector = new int[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresInt(vector);

        visualizacionMM(vector);

        lect.close();
    }

    public static void visualizacionMM(int[] vector){

        System.out.println("Introduce el tamaño de lotes para ver el vector: ");
        int m = lect.nextInt();

        System.out.println("Valores en M posiciones : ");
        for (int i = 0; i < vector.length; i++) {
            if (i % m == 0) {
                System.out.println();
            }
            System.out.print("[ " + vector[i] + " ]");
        }
    } 
}
