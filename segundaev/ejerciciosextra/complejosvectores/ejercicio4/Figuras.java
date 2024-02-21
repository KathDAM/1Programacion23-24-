package segundaev.ejerciciosextra.complejosvectores.ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

import segundaev.ejerciciosextra.vectoresobjetos.ejercicio8.Ovalo;

public class Figuras {
    static Scanner lect = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuántas figuras desea tratar?");
        int numFiguras = lect.nextInt();
        lect.nextLine(); // Limpiar el buffer de entrada

        Figura[] figuras = new Figura[numFiguras];

        for (int i = 0; i < numFiguras; i++) {
            System.out.println("Ingrese el tipo de figura (circulo, ovalo, cuadrado, rectangulo) para la figura " + (i + 1) + ":");
            String tipo = lect.nextLine().toLowerCase();

            switch (tipo) {
                case "circulo":
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = lect.nextDouble();
                    figuras[i] = new Circulo(radio);
                    break;
                case "ovalo":
                    System.out.println("Ingrese el semieje menor del óvalo:");
                    double semiejeMenor = lect.nextDouble();
                    System.out.println("Ingrese el semieje mayor del óvalo:");
                    double semiejeMayor = lect.nextDouble();
                    figuras[i] = new Ovalo(semiejeMenor, semiejeMayor);
                    break;
                case "cuadrado":
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = lect.nextDouble();
                    figuras[i] = new Cuadrado(lado);
                    break;
                case "rectangulo":
                    System.out.println("Ingrese la base del rectángulo:");
                    double base = lect.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double altura = lect.nextDouble();
                    figuras[i] = new Rectangulo(base, altura);
                    break;
                default:
                    System.out.println("Tipo de figura no válido. Inténtelo de nuevo.");
                    i--; // Retroceder una iteración para volver a pedir el tipo de figura
            }
            lect.nextLine(); // Limpiar el buffer de entrada
        }

        // Calcular y mostrar áreas ordenadas
        System.out.println("Áreas ordenadas:");
        Arrays.sort(figuras, (a, b) -> Double.compare(a.calcularArea(), b.calcularArea()));
        for (Figura figura : figuras) {
            System.out.println(figura);
        }

        // Calcular y mostrar perímetros ordenados
        System.out.println("Perímetros ordenados:");
        Arrays.sort(figuras, (a, b) -> Double.compare(a.calcularPerimetro(), b.calcularPerimetro()));
        for (Figura figura : figuras) {
            System.out.println(figura);
        }
    }
}

}
