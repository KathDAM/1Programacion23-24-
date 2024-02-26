package segundaev.ejerciciosextra.vectoresobjetos.ejercicio8;

import java.util.Scanner;

public class TestAppFiguras {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
   
        Figura[] figuras = crearFiguras(lect);
        mostrarResultados(figuras);
        lect.close();
    }

    public static Figura[] crearFiguras(Scanner lect) {
        System.out.println("¿Cuántas figuras deseas crear?");
        int numFiguras = Integer.parseInt(lect.nextLine());
        Figura[] figuras = new Figura[numFiguras];
        
        for (int i = 0; i < numFiguras; i++) {
            //Se puede modularizar una más, creando un crearFigura
            System.out.println("Escribe el tipo de figura (circulo, ovalo, cuadrado, rectangulo) para la figura " + (i + 1) + ":");
            String tipoFigura = lect.nextLine().toUpperCase();

            System.out.println("Introduce el color de la figura:");
            String colorStr = lect.nextLine().toUpperCase();
            Color color = Color.fromString(colorStr);
            
            switch (tipoFigura) {
                case "CIRCULO":
                    System.out.println("Introduce el radio del círculo:");
                    double radioCirculo = Double.parseDouble(lect.nextLine());
                    figuras[i] = new Circulo(color, radioCirculo);
                    break;
                case "CUADRADO":
                    System.out.println("Introduce el lado del cuadrado:");
                    double lado = Double.parseDouble(lect.nextLine());
                    figuras[i] = new Cuadrado(color, lado);
                    break;
                case "OVALO":
                    System.out.println("Introduce el semieje mayor del óvalo:");
                    double semiejeMayor = Double.parseDouble(lect.nextLine());
                    System.out.println("Introduce el semieje menor del óvalo:");
                    double semiejeMenor = Double.parseDouble(lect.nextLine());
                    figuras[i] = new Ovalo(color, semiejeMenor, semiejeMayor);
                    break;
                case "RECTANGULO":
                    System.out.println("Introduce la base del rectángulo:");
                    double base = Double.parseDouble(lect.nextLine());
                    System.out.println("Introduce la altura del rectángulo:");
                    double altura = Double.parseDouble(lect.nextLine());
                    figuras[i] = new Rectangulo(color, base, altura);
                    break;
                default:
                    System.out.println("Tipo de figura no válido. Inténtalo de nuevo.");
                    i--; 
                    break;
            }
        } //hasta aqui
        return figuras;
    }

    public static void mostrarResultados(Figura[] figuras) {
        System.out.println("\nFiguras actuales almacenadas:");
        for (int i = 0; i < figuras.length; i++) {
            Figura figura = figuras[i];
            System.out.println(figura.nombreFigura);
            System.out.println(" * Color: " + figura.color);
            System.out.println(" * Área: " + figura.calcularArea());
            System.out.println(" * Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}
