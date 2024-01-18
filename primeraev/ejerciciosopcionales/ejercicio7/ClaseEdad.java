package ejerciciosopcionales.ejercicio7;

import java.util.Scanner;

public class ClaseEdad {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        int sumaedad = 0;

        System.out.print("Indica cuantos alumnos hay en una clase: ");
        int numalum = lect.nextInt();

        for (int i = 0; i < numalum; i++) {
            System.out.print("Indica la edad del alumno:");
            int edad = lect.nextInt();
            sumaedad += edad;
        }

        double media = (double) sumaedad / numalum;
        System.out.println("La media de edad de la clase es: " + media);
       
        lect.close();
    }
}
