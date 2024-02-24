package segundaev.ejerciciosextra.complejosvectores.ejercicio4;

import java.util.Scanner;

public class Figuras {
    static Scanner lect = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuántas figuras deseas tratar?");
        int numFiguras = lect.nextInt();
        lect.nextLine();

        String[] figuras = new String[numFiguras];
        double[] areas = new double[numFiguras];
        double[] perimetros = new double[numFiguras];

        for (int i = 0; i < numFiguras; i++) {
            System.out.println("Escribe el tipo de figura (circulo, ovalo, cuadrado, rectangulo) para la figura " + (i + 1) + ":");
            String tipo = lect.nextLine().toUpperCase();

            switch (tipo) {
                case "CIRCULO":
                    figuras[i] = "CIRCULO";
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = lect.nextDouble();
                    areas[i] = areaCirculo(radio);
                    perimetros[i] = perimetroCirculo(radio);
                    break;

                case "OVALO":
                    figuras[i] = "OVALO";
                    System.out.println("Ingrese el semieje menor del óvalo (r1):");
                    double semiejeMenor = lect.nextDouble();
                    System.out.println("Ingrese el semieje mayor del óvalo (r2):");
                    double semiejeMayor = lect.nextDouble();
                    areas[i] = areaOvalo(semiejeMenor, semiejeMayor);
                    perimetros[i] = perimetroOvalo(semiejeMenor, semiejeMayor);
                    break;

                case "CUADRADO":
                    figuras[i] = "CUADRADO";
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = lect.nextDouble();
                    areas[i] = areaCuadrado(lado);
                    perimetros[i] = perimetroCuadrado(lado);
                    break;

                case "RECTANGULO":
                    figuras[i] = "RECTANGULO";
                    System.out.println("Ingrese la base del rectángulo:");
                    double base = lect.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double altura = lect.nextDouble();
                    areas[i] = areaRectangulo(base, altura);
                    perimetros[i] = perimetroRectangulo(base, altura);
                    break;

                default:
                    System.out.println("Tipo de figura no válido. Inténtalo de nuevo.");
                    i--; // Vuelve a pedir datos
            }
            lect.nextLine();
        }

        ordenarFiguras(figuras, areas);
        System.out.println("\nFiguras ordenadas de menor a mayor según el area: ");
        imprimirInfoFiguras(figuras, areas);

        ordenarFiguras(figuras, perimetros);
        System.out.println("\nFiguras ordenadas de menor a mayor según el perimetro: ");
        imprimirInfoFiguras(figuras, perimetros);

    }

    // METODOS GENERALES
    public static void ordenarFiguras(String[] figuras, double[] medidas) {
        for (int i = 0; i < medidas.length - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < medidas.length; j++) {
                if (medidas[j] < medidas[menorIndice]) {
                    menorIndice = j;
                }
            }
            double intercambioMedidas = medidas[menorIndice];
            medidas[menorIndice] = medidas[i];
            medidas[i] = intercambioMedidas;

            String valorFigura = figuras[menorIndice];
            figuras[menorIndice] = figuras[i];
            figuras[i] = valorFigura;
        }
    }

    public static void imprimirInfoFiguras(String[] figuras, double[] medidas) {
        for (int i = 0; i < medidas.length; i++) {
            System.out.println(" * Figura " + (i + 1) + " - " + figuras[i] + " - " + medidas[i]);
        }
    }

    // CIRCULO
    private static double areaCirculo(double a) {
        return Math.PI * (a * a);
    }

    private static double perimetroCirculo(double a) {
        return 2 * Math.PI * a;
    }

    // OVALO
    private static double areaOvalo(double a, double b) {
        return b * a * Math.PI;
    }

    private static double perimetroOvalo(double a, double b) {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }

    // CUADRADO
    private static double areaCuadrado(double b) {
        return b * b;
    }

    private static double perimetroCuadrado(double b) {
        return 4 * b;
    }

    // RECTANGULO
    private static double areaRectangulo(double b, double a) {
        return b * a;
    }

    private static double perimetroRectangulo(double b, double a) {
        return 2 * (b + a);
    }
}
