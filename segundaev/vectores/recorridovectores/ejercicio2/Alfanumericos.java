package segundaev.vectores.recorridovectores.ejercicio2;

import java.util.Scanner;

public class Alfanumericos {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.println("Introduce el tamaño del vector: ");
        int n = Integer.parseInt(lect.nextLine());

        String[] vector = new String[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextLine();
        }

        System.out.println("Valores en posiciones pares: ");
        for (int i = 0; i < vector.length; i+=2) {
            System.out.print("[ " + vector[i] + " ]");
        }

        System.out.println("Valores en posiciones impares: ");
        for (int i = 1; i < vector.length; i+=2) {
            System.out.print("[ " + vector[i] + " ]");
        }
        lect.close();
    }
}
