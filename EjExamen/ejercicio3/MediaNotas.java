package ejercicio3;

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
        imprimirAlumnos(notas);
        imprimirNota(notas);
        double media = calcularMedia(notas);
        System.out.println("\nLa media de notas de la clase es: " + media);

        double[] diferencias = diferenciaPuntuacionSobreMedia(notas, media);
        imprimirDiferenciasMedia(diferencias);

    }

    private static void imprimirAlumnos(int[] notas) {
        System.out.println("\nNotas de Alumnos: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1) + " : " + notas[i]);
        }
    }

    private static int pedirNotasAlumnos(int notaDada) {
        int nota;
        do {
            nota = obtenerNotaValida(notaDada);
        } while (nota < 0 || nota > 10); // se ejecutará la nota mientras esté fuera del rango válido.
        return nota;
    }
    
    private static int obtenerNotaValida(int notaDada) {
        int nota;
        System.out.println("Introduce la nota del alumno " + notaDada + ": ");
        nota = lect.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10. Inténtalo de nuevo.");
        }
        return nota;
    }

    private static double calcularMedia(int[] notas) {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return (double) suma / notas.length;
    }

    private static int[] clasificarNota(int[] notasAlumnos) {
        int[] clasificacionAlumnos = new int[7];
        for (int i = 0; i < notasAlumnos.length; i++) {
            int notaPosicion = notasAlumnos[i];
            int resultado = 0;
            if (notaPosicion <= 2) {
                resultado = 0;
            } else if (notaPosicion >= 3 && notaPosicion <= 4) {
                resultado = 1;
            } else if (notaPosicion == 5) {
                resultado = 2;
            } else if (notaPosicion == 6) {
                resultado = 3;
            } else if (notaPosicion >= 7 && notaPosicion <= 8) {
                resultado = 4;
            } else if (notaPosicion == 9) {
                resultado = 5;
            } else if (notaPosicion == 10) {
                resultado = 6;
            }
            clasificacionAlumnos[resultado]++;
        }
        return clasificacionAlumnos;
    }

    private static void imprimirNota(int[] notas) {
        String[] calificacion = {"Muy deficiente", "Insuficiente", "Suficiente", "Bien", "Notable", "Excelente", "Matrícula de Honor"};
        int[] clasificacionAlumnos = clasificarNota(notas);
        System.out.println("\nAlumnos con calificación");
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println(" * " + calificacion[i] + ": " + clasificacionAlumnos[i]);
        }
    }

    private static double[] diferenciaPuntuacionSobreMedia(int[] notas, double media) {
        double[] diferencias = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            diferencias[i] = notas[i] - media;
        } 
        return diferencias;
    }
 
    private static void imprimirDiferenciasMedia(double[] diferencias) {
        System.out.println("Diferencias de puntuación sobre la media:");
        for (int i = 0; i < diferencias.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + diferencias[i]);
        }
    }
}
