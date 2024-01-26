package segundaev.vectores.recorridovectores.ejercicio5;

import java.util.Scanner;

public class SumaVectores {

    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce el tamaño del vector: ");
        int n = lect.nextInt();

        int[] vector = new int[n];

        introducirValoresVector(vector);

        imparesVector(vector);
        paresVector(vector);

        lect.close();
    }
    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void imparesVector(int[] vectorimpar){
        int suma = 0;
        System.out.println("Valores en posiciones impares: ");
        for (int i = 1; i < vectorimpar.length; i+=2) {
            System.out.print("[ " + vectorimpar[i] + " ]");
            suma += vectorimpar[i];
        }
        System.out.println("La suma de impares es " + suma);
    }

    public static void paresVector(int[] vectorpar){
        int suma = 0;
        System.out.println("Valores en posiciones pares: ");
        for (int i = 0; i < vectorpar.length; i+=2) {
            System.out.print("[ " + vectorpar[i] + " ]");
            suma += vectorpar[i];
        }
        System.out.println("La suma de pares es " + suma);
    }
}

