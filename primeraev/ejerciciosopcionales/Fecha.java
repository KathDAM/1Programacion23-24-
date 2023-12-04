package ejerciciosopcionales;

import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int anio = scanner.nextInt();

        boolean esFechaValida;

        if (anio > 0 && mes >= 1 && mes <= 12) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    esFechaValida = (dia >= 1 && dia <= 31);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    esFechaValida = (dia >= 1 && dia <= 30);
                    break;
                case 2:
                    // Verificar si es un año bisiesto
                    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                        esFechaValida = (dia >= 1 && dia <= 29);
                    } else {
                        esFechaValida = (dia >= 1 && dia <= 28);
                    }
                    break;
                default:
                    esFechaValida = false;
                    break;
            }
        } else {
            esFechaValida = false;
        }

        if (esFechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " no es válida.");
        }

        scanner.close();
    }
}
