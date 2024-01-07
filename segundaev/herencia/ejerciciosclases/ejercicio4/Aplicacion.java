// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio4;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(4, 3);
        Punto punto3 = new Punto(-1, 7);

        // Crea el objeto Triangulo
        TrianguloEquilatero triangulo = new TrianguloEquilatero(punto1, punto2, punto3);
    
        // Muestra la información del triángulo 
        System.out.println("Información del triángulo equilátero:");
        System.out.println(triangulo.toString());
    
        // Muestra el perímetro del triángulo 
        double perimetro = triangulo.perimetroTriangulo();
        System.out.println("   Perímetro del triángulo equilátero: " + perimetro);
        System.out.println();
        
        // Solicita al usuario un desplazamiento para el triángulo
        System.out.println("Ingrese el desplazamiento del triángulo equilátero:");
        System.out.print("   Desplazamiento horizontal: ");
        double desplazamientoX = lect.nextDouble();
        System.out.print("   Desplazamiento vertical: ");
        double desplazamientoY = lect.nextDouble();

        // Muestra la información actualizada 
        triangulo.trasladarTriangulo(desplazamientoX, desplazamientoY);
        System.out.println("Información actualizada del triángulo equilátero después del desplazamiento:");
        System.out.println(triangulo.toString());

        // Solicita al usuario un escalado para el triángulo
        System.out.print("Ingrese el factor de escala para el triángulo equilátero:");
        double factorEscala = lect.nextDouble();

        // Muestra la información actualizada del triángulo después del escalado.
        triangulo.escalarTriangulo(factorEscala);
        System.out.println("Información actualizada del triángulo equilátero después del escalado:");
        System.out.println(triangulo.toString());

        lect.close();
    }
}
