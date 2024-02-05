package segundaev.vectores.recorridovectores.ejercicio9;

import java.util.Scanner;

public class invertirVector {
     static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array: ");
        int tamaño = lect.nextInt();
        lect.nextLine(); //Vaciar buffer

        String[] vector = new String[tamaño];

        introducirValoresVector(vector);
        mostrarVector(vector);
        invertiVector(vector);
     
        lect.close();
    }

    public static void introducirValoresVector(String[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextLine();
        }
    }

    public static void mostrarVector(String[]vector){
        System.out.println("Vector introducido: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] "); 
        }
    }

    public static void invertiVector(String[]vector){
        System.out.println("");
        System.out.println("Vector invertido: ");
        String[] vectorInvertido = new String[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
            System.out.print(" [" + vectorInvertido[i] + "] ");
        }
    }
}

