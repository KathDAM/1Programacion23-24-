package segundaev.vectores.recorridovectores.ejercicio4;

import java.util.Scanner;

public class LotesM {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce el tamaño del vector: ");
        int n = lect.nextInt();

        int[] vector = new int[n];

        introducirValoresVector(vector);

        visualizacionMM(vector);

        lect.close();
    }
    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void visualizacionMM(int[] vector4){

        System.out.println("Introduce el tamaño de lotes para ver el vector: ");
        int m = lect.nextInt();

        System.out.println("Valores en M posiciones : ");
        for (int i = 0; i < vector4.length; i++) {
            if (i % m == 0) {
                System.out.println(" ");
            }
            System.out.print("[ " + vector4[i] + " ]");
        }
    } 
}
