package pruebatest;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3.Cara o cruz");
        Scanner lect = new Scanner(System.in);

        System.out.println("Ingrese el número de lanzamientos:");
        int numLanzamientos = lect.nextInt();
        lect.nextLine();  // Consumir el salto de línea

        System.out.println("Ingrese el carácter para la cara:");
        char cara = lect.nextLine().charAt(0);

        System.out.println("Ingrese el carácter para la cruz:");
        char cruz = lect.nextLine().charAt(0);

        realizarLanzamientos(numLanzamientos, cara, cruz);
        
        lect.close();
    }

    public static void realizarLanzamientos(int numLanzamientos, char cara, char cruz) {
        int caras = 0;
        int cruces = 0;

        for (int i = 0; i < numLanzamientos; ++i) {
            char resultado = obtenerResultadoLanzamiento(cara, cruz);
            System.out.print(resultado);

            if (resultado == cara) {
                caras++;
            } else {
                cruces++;
            }
        }

        System.out.println("\nCara (" + cara + "): " + caras);
        System.out.println("Cruz (" + cruz + "): " + cruces);
    }

    public static char obtenerResultadoLanzamiento(char cara, char cruz) {
        if (Math.random() < 0.5) {
            return cara;
        } else {
            return cruz;
        }
    }
} 
    

