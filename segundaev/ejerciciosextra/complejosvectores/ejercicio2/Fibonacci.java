package segundaev.ejerciciosextra.complejosvectores.ejercicio2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros que quieres visualizar de la serie de Fibonacci: ");
        int cantidad = lect.nextInt();

        int[] vectorFibonacci = calcularFibonacci(cantidad);

        System.out.println("Fibonacci de " + cantidad + " elementos:");
        imprimirFibonacci(cantidad, vectorFibonacci);
        
        lect.close();
    }

    private static int[] calcularFibonacci(int tamaño) {
        int[] vectorFibo = new int[tamaño];
        
        if (tamaño >= 1 || tamaño >= 2) {
            vectorFibo[0] = 1;
            vectorFibo[1] = 1;
        }
 
        for (int i = 2; i < tamaño; i++) {
            vectorFibo[i] = vectorFibo[i - 1] + vectorFibo[i - 2]; // vectorFibo[i - 1] es el número en la posición anterior, y vectorFibo[i - 2] es el número dos posiciones antes en el arreglo.
        }

        return vectorFibo;
    }

    private static void imprimirFibonacci(int cantidad, int[] vectorFibonacci){
        for (int i = 0; i < cantidad; i++) {
            System.out.print(vectorFibonacci[i] + " ");
        }
    }

}
