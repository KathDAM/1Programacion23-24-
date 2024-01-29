package segundaev.vectores.recorridovectores.ejercicio7;

import java.util.Scanner;

public class factorF {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el tamaño del vector: ");
        int n = lect.nextInt();

        int[] vector = new int[n];
     
        introducirValoresVector(vector);

        System.out.println("Introduce el factor F multiplicador del vector: ");
        int factor = lect.nextInt();

        factorMultiplicado(vector,factor);

        lect.close();
    }
    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void factorMultiplicado(int[] vector,int factor){
        for (int i = 0; i < vector.length; i++) {
            int mult = vector[i] * factor;
            System.out.println("Elemento " + (i) + " multiplicado por " + factor + " es igual a " + mult); 
        }
    }
}
