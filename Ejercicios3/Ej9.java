//Catherine AM
package Ejercicios3;

import java.util.Scanner;
 
public class Ej9 {
 
    public static void main(String[] args) {
        System.out.println("Ejercicio 9");
        System.out.println(" ");

        Scanner lect = new Scanner(System.in);
        System.out.println("Vamos a sacar la media armónica de dos números para ello - ");
        System.out.println("Proporciona un número(1): ");
        int num1 = lect.nextInt();

        System.out.println("Proporciona un número(2): ");
        int num2 = lect.nextInt();

        double media = obtenerMedia(num1,num2);
        double minvers = obtenerMediaInverso(num1,num2);
        double invresul = obtenerInversoResult(num1,num2);

        System.out.println("La media de ambos números es " + media);
        System.out.println("La media de ambos números es " + minvers);
        System.out.println("El inverso resultado de ambos números es " + invresul);
    }

    
}