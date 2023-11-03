//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej6{
    public static void main(String[] args) {
        System.out.println("Ejercicio 6");
        System.out.println(" ");

        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe el caracter que desees imprimir:");
        char carac = lect.next().charAt(0);

        System.out.println("Indica las veces que quieres imprimir el caracter: ");
        int veces = lect.nextInt();

        imprimirCaracter(carac,veces);

        lect.close();
    }

    static void imprimirCaracter(char a,int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);;
        }
    }
}