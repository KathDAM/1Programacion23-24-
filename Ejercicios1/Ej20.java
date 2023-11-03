//Catherine AM
package Ejercicios1;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Ej20 - Intereses Banco 2");
        System.out.println("****************************************");

        Scanner lect = new Scanner(System.in);

        // Solicita info
        System.out.print("Ingrese la cantidad a invertir en el banco: ");
        double cantidadInvertida = lect.nextDouble();

        System.out.print("Ingrese el tipo de interés anual (%): ");
        double tipoInteresAnual = lect.nextDouble();

        System.out.print("Ingrese el plazo de la inversión en meses: ");
        int plazoMeses = lect.nextInt();

        // Calcular el interés
        double interesSimple = (cantidadInvertida * tipoInteresAnual / 100) * (plazoMeses / 12.0);

        // Calcular el total después de la retención fiscal
        double totalDespuesRetencion = cantidadInvertida + interesSimple;
        double retencion = interesSimple * 0.18; // El 18% de los intereses es retenido

        // Calcular el total final
        double totalFinal = totalDespuesRetencion - retencion;

        // Mostrar resultados
        System.out.println("Cantidad invertida: " + cantidadInvertida + " euros");
        System.out.println("Interés ganado: " + interesSimple + " euros");
        System.out.println("Retención fiscal (18%): " + retencion + " euros");
        System.out.println("Total después de la retención: " + totalDespuesRetencion + " euros");
        System.out.println("Total final después de impuestos: " + totalFinal + " euros");

        lect.close();
    }
}

