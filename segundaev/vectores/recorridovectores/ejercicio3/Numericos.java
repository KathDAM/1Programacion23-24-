package segundaev.vectores.recorridovectores.ejercicio3;

import java.util.Scanner;

public class Numericos {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce el tamaño del vector: ");
        int n = lect.nextInt();

        int[] vector = new int[n];

        introducirValoresVector(vector);
        visualizacionCuatro(vector);

        lect.close();
    }

    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void visualizacionCuatro(int[] vector4){
        System.out.println("Valores en 4 posiciones : ");
        for (int i = 0; i < vector4.length; i++) {
            if (i % 4 == 0) {
                System.out.println(" ");
            }
            System.out.print("[ " + vector4[i] + " ]");
        }
    }
    

}
