package segundaev.ejerciciosextra.vectoresobjetos.ejercicio7;

import java.util.Scanner;

public class TestAppAsignatura {
     public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.print("Ingresa el número de alumnos:");
        int numeroAlumnos = Integer.parseInt(lect.nextLine());

        NotasAsignatura asignatura = new NotasAsignatura(numeroAlumnos);

        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Ingresa la nota del alumno " + (i + 1) + ":");
            int nota = Integer.parseInt(lect.nextLine());
            asignatura.anyadirNota(nota);
        }

        System.out.println("\n" +asignatura);
        
        TotalCalificacionVO[] totalNotas = asignatura.calcularTotalNotas();
        System.out.println("\nTotal de notas por calificación:");
        for (int i = 0; i < totalNotas.length; i++) {
            System.out.println(totalNotas[i]);
        }

        float media = asignatura.calcularMedia();
        System.out.printf("\nLa media de las notas es: %.2f\n",media); //%.2f\n  me da dos decimales

        float[] diferenciaMedias = asignatura.calcularDiferenciaCalificacionConMedia();
        System.out.println("\nDiferencia de calificación con respecto a la media:");
        for (int i = 0; i < diferenciaMedias.length; i++) {
            System.out.printf("Alumno %d: %.2f\n", (i + 1), diferenciaMedias[i]);
        }

        lect.close();
    }
}
