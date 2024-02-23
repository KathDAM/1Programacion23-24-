package segundaev.ejerciciosextra.complejosvectores.ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

import segundaev.vectores.recorridovectores.ejercicio11.vectorEquilibrado;

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
                    areas[i] = areaRectangulo(base,altura);
                    perimetros[i] = perimetroRectangulo(base, altura);
                    break;

                default:
                    System.out.println("Tipo de figura no válido. Inténtelo de nuevo.");
                    i--; //Va una para atras 
            }
            lect.nextLine(); 
        }
        ordenarFiguras(figuras,areas);
        ordenarFiguras(figuras,perimetros);

  
       
    }

    //METODOS GENERALES

    public static void ordenarFiguras(String[] figuras, double[] medidas) {
        int n = medidas.length;
        Arrays.sort(figuras, (a, b) -> Double.compare(a.getArea(), b.getArea()));
    }

    public static void imprimirInfoFiguras() {
        System.out.println("Las areas de las figuras ordenadas son: \n" );
        System.out.println("Los perimetros de las figuras ordenadas son: \n" );
    }

    //CIRCULO
    private static double areaCirculo(double a) {
        return Math.PI * (a * a);
    }

    private static double perimetroCirculo(double a) {
        return 2 * Math.PI * a;
    }

    //OVALO
    private static double areaOvalo(double a,double b) {
        return b * a * Math.PI ;
    }

    private static double perimetroOvalo(double a,double b) {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }

    //CUADRADO
    private static double areaCuadrado(double b) {
        return b * b;
    }

    private static double perimetroCuadrado(double b) {
        return 4 * b;
    }

    //RECTANGULO
    private static double areaRectangulo(double b, double a) {
        return b * a;
    }

    private static double perimetroRectangulo(double b, double a) {
        return 2 *(b + a);
    }
}


