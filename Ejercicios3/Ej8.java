//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej8{
    public static void main(String[] args) {
        System.out.println("Ejercicio 8");
        System.out.println(" ");

        Scanner lect = new Scanner(System.in);

        System.out.println("Escribe el carácter que desees imprimir:");
        char carac = lect.next().charAt(0);

        System.out.println("Escribe el número de lineas que desees imprimir:");
        int nlineas = lect.nextInt();

        imprimirPiramide(carac,nlineas);

        lect.close();
    }

    static void imprimirPiramide(char a,int b){
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b-i; j++) { //le da forma de triangulo
                System.out.print(" ");
            }

            for (int j = 0; j <= i*2; j++) { // va + 2caracteres más por linea
                System.out.print(a);
            }
            System.out.println();
        }
    }
}