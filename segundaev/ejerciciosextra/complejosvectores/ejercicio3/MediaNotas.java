package segundaev.ejerciciosextra.complejosvectores.ejercicio3;

import java.util.Scanner;

public class MediaNotas {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresa el numeros de alumnos: ");
        int alumnos = lect.nextInt();

        int[] notas = new int[alumnos];

        for (int i = 0; i < alumnos; i++) {
            notas[i] = pedirNotasAlumnos(i + 1);
        }

        double media = calcularMedia(notas);
        System.out.println("La media de notas de la clase es: " + media);

    }

    private static int pedirNotasAlumnos(int num){
        int nota;
        do {
            System.out.println("Introduce la nota del alumno " + num + ": ");
            nota = lect.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Inténtalo de nuevo.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    private static double calcularMedia(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }


}
