package ejerciciosopcionales.ejercicio8;

import java.util.Scanner;

public class CalculoNotas {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Dame 3 notas que esten en números enteros de un alumno: ");

        System.out.println("Nota 1:");
        int nota1 = lect.nextInt();

        System.out.println("Nota 2:");
        int nota2 = lect.nextInt();

        System.out.println("Nota 3:");
        int nota3 = lect.nextInt();

        if (nota1<5 || nota2<5 ||nota3<5) {
            double mediaNotas = (nota1 + nota2 +nota3) / 3;
            if (mediaNotas>4) {
                System.out.println("La nota final es 4");
            } else {
                int notaFinal = (int) Math.round(mediaNotas);
                System.out.println("La nota final es " + notaFinal);
            }
        } else {
            double mediaNotas = (nota1 + nota2 +nota3) / 3;
            int notaFinal = (int) Math.round(mediaNotas);
            System.out.println("La nota final es " + notaFinal );
        }

        lect.close();
    }  
}
