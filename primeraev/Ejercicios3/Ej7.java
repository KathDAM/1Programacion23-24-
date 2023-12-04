//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej7{
    public static void main(String[] args) {
        System.out.println("Ejercicio 7");
        System.out.println(" ");

        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe el carácter que desees imprimir:");
        char carac = lect.next().charAt(0);
        System.out.println("Escribe el número de veces que desees imprimir:");
        int cveces = lect.nextInt();
        System.out.println("Escribe el número de lineas que desees imprimir:");
        int lineas = lect.nextInt();

        imprimirCaracter(carac,cveces,lineas);
        lect.close();
    }

    static void imprimirCaracter(char a, int b, int c){
        for ( int i = 0; i < c; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(a);
            } 
            System.out.println();
        }
    }
}