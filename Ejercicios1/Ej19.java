//Catherine AM
package Ejercicios1;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Ej19 - Consumo automóvil");
        System.out.println("****************************************");

        Scanner scanner = new Scanner(System.in);

        // Datos del primer repostaje
        System.out.print("Ingrese el precio del litro de combustible del primer repostaje: ");
        double precLit1 = scanner.nextDouble();
        System.out.print("Ingrese el total pagado en el primer repostaje: ");
        double total1 = scanner.nextDouble();
        System.out.print("Ingrese el número de kilómetros en el cuentakilómetros después del primer repostaje: ");
        double km1 = scanner.nextDouble();

        // Datos del segundo repostaje
        System.out.print("Ingrese el precio del litro de combustible en el segundo repostaje: ");
        double precLit2 = scanner.nextDouble();
        System.out.print("Ingrese el total pagado en el segundo repostaje: ");
        double total2 = scanner.nextDouble();

        // Datos del tercer repostaje
        System.out.print("Ingrese el número de kilómetros en el cuentakilómetros después del tercer repostaje: ");
        double km3 = scanner.nextDouble();

        // Calcular el consumo por cada 100 km
        double litrosConsumidos = (total1 / precLit1) + (total2 / precLit2);
        double distanciaRecorrida = km3 - km1;
        double consumoPor100Km = (litrosConsumidos / distanciaRecorrida) * 100;

        // Calcular el coste por kilómetro
        double costePorKilometro = (total1 + total2) / distanciaRecorrida;

        // Mostrar resultados
        System.out.println("El consumo por cada 100 km es: " + consumoPor100Km + " litros");
        System.out.println("El coste por kilómetro es: " + costePorKilometro + " euros");

        scanner.close();
    }
}

