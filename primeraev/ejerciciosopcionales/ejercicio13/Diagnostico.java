package ejerciciosopcionales.ejercicio13;

import java.util.Scanner;

public class Diagnostico {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.println("Dame el peso del paciente");
        double peso = lect.nextDouble();

        System.out.println("Dame la altura del paciente");
        double altura = lect.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Bajo Peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Peso Normal (saludable)");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso (obesidad de grado I)");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Sobrepeso crónico (obesidad de grado II)");
        } else if (imc >= 35 && imc <= 40) {
            System.out.println("Obisidad Premórbida (obesidad de grado III)");
        } else if (imc > 40) {
            System.out.println("Obisidad Mórbida (obesidad de grado IV)");
        }

        lect.close();
    }
}
