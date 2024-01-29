package segundaev.vectores.recorridovectores.ejercicio6;

import java.util.Scanner;

public class sumanVectoresII {
        static Scanner lect = new Scanner(System.in);
        static double imparesd = 0;
        static double paresd = 0;
    public static void main(String[] args) {

        System.out.println("Introduce el tamaño del vector: ");
        int n = lect.nextInt();

        int[] vector = new int[n];

        introducirValoresVector(vector);

        imparesVector(vector);
        paresVector(vector);
        diferenciaParesImpares(imparesd, paresd);

        lect.close();
    }
    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static void imparesVector(int[] vectorimpar){
        double suma = 0;
        System.out.println("Valores en posiciones impares: ");
        for (int i = 1; i < vectorimpar.length; i+=2) {
            System.out.print("[ " + vectorimpar[i] + " ]");
            suma += vectorimpar[i];
        }
        System.out.println(" - La suma de impares es " + suma);
        imparesd = suma + imparesd;
    }

    public static void paresVector(int[] vectorpar){
        double suma = 0;
        System.out.println("Valores en posiciones pares: ");
        for (int i = 0; i < vectorpar.length; i+=2) {
            System.out.print("[ " + vectorpar[i] + " ]");
            suma += vectorpar[i];
        }
        System.out.println(" - La suma de pares es " + suma);
        paresd = suma + paresd;
    }

    public static void diferenciaParesImpares(double imparesd, double paresd){
        double res = 0;
        if (paresd > imparesd) {
            res = paresd - imparesd;
        } else {
            res = imparesd - paresd;
        }
        System.out.println("La diferencia entre pares e impares es " + res);
    }
}



