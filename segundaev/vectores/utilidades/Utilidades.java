package segundaev.vectores.utilidades;

import java.util.Arrays;
import java.util.Scanner;

public class Utilidades {
    static Scanner lect = new Scanner(System.in);
  
    // INT
    public static int tamañoVectorInt(){
        System.out.println("Introduce un tamaño de array: ");
        int tamaño = Integer.parseInt(lect.nextLine());
       
        return tamaño;
    }

    public static void introducirValoresInt(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
    }

    public static int introducirCota(){
        System.out.println("Introduce la cota :");
        int cota = Integer.parseInt(lect.nextLine());
       
        return cota;
    }
    
    public static int busquedaNumeroInt(){
        System.out.println("Introduce el numero que quieres bucar: ");
        int numero = lect.nextInt();
        return numero;
    }

    public static void mostrarVectorInt(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] "); 
        }
        System.out.println();
    }

    public static void encontrarIntVector(int[] vector, int num){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("El numero "+ num + " esta en la posicion " + i);
                return;
            }
        }
        System.out.println("No hay ningún " + num + " en el vector");    
    }

    // BOOLEAN
    public static boolean contieneVector(int[] A, int[] B) {
        if (A.length < B.length) {
            return false;
        }

        for (int i = 0; i <= A.length - B.length; i++) {
            if (Arrays.equals(Arrays.copyOfRange(A, i, i + B.length), B)) {
                return true;
            }
        }

        return false;
    }

    // CHAR
    public static void introducirValoresChar(char[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.next().charAt(0);
        }
    }

    // STRING
    public static void introducirValoresString(String[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextLine();
        }
    }

    public static void mostrarVectorString(String[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] "); 
        }
        System.out.println();
    }

    public static void invertirVectorString(String[]vector){
        String[] vectorInvertido = new String[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
            System.out.print(" [" + vectorInvertido[i] + "] ");
        }
    }

    public static void invertirMismoVectorString(String[]vector){
        int inicio = 0;
        int fin = vector.length - 1;

        while (inicio < fin) {
            String aux = vector[inicio];
            vector[inicio] = vector[fin];
            vector[fin] = aux;

            inicio ++;
            fin--;
        }
       mostrarVectorString(vector);
    }

}
