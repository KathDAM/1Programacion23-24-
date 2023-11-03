//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej10{
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        System.out.println(" ");

        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe un número entero para calcular su factorial:");
        int num = lect.nextInt();

        System.out.println("El factorial de " + num + " es " + calculoFactorial());
   
    }
}