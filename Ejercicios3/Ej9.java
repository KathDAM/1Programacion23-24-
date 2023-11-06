//Catherine AM
package Ejercicios3;

import java.util.Scanner;
 
public class Ej9 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ejercicio 9");
        System.out.println();

        Scanner lect = new Scanner(System.in);
        System.out.println("Vamos a calcular la media armónica de dos números.");
        System.out.println("Proporciona un número(1): ");
        double num1 = lect.nextDouble();

        System.out.println("Proporciona un número(2): ");
        double num2 = lect.nextDouble();

        double mediaArmonica = calcularMediaArmonica(num1, num2);
        double inversoResultado = calcularInversoResultado(num1, num2);

        System.out.println("La media armónica de " + num1 + " y " + num2 + " es " + mediaArmonica);
        System.out.println("El inverso del resultado de " + num1 + " y " + num2 + " es " + inversoResultado);

        lect.close();
    }
    // La media armónica se calcula según la fórmula: 2 / ((1 / a) + (1 / b)), y el inverso del resultado es simplemente el inverso de la media aritmética de los dos números.
    static double calcularMediaArmonica(double a, double b) {
        double resul = 2 / ((1 / a) + (1 / b));
        return resul;
    }

    static double calcularInversoResultado(double a, double b) {
        double resul = 1 / ((a + b) / 2);
        return resul;
    }
}