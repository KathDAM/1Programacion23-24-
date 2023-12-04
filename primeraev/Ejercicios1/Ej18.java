//Catherine AM
package Ejercicios1;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Ej18 - Triangulo");
        System.out.println("****************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del lado: ");
        double lado = scanner.nextDouble();

        double perimetro = 3 * lado; // Fórmula del perímetro de un triángulo equilátero
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2); // Fórmula del área de un triángulo equilátero

        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Área del triángulo: " + area);

        scanner.close();
    }
}
