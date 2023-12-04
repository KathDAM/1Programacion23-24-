//Catherine AM
package Ejercicios3;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.println(" ");
        System.out.println("Escribe el radio de la circunferencia: ");
        double radio = lect.nextDouble();

        double area = areaCircunferencia(radio);
        double longitud = longitudCircunferencia(radio);

        System.out.println("Área circunferencia: " + area);
        System.out.println("Longitud circunferencia: " + longitud);

        lect.close();
    }

    public static double areaCircunferencia(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static double longitudCircunferencia(double radio) {
        double longitud = 2 * Math.PI * radio;
        return longitud;
    }
}


