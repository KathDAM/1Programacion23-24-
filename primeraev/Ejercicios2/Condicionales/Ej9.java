//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el día, mes y año
        System.out.print("Ingresa el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingresa el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingresa el año: ");
        int anio = scanner.nextInt();

        // Validar la fecha
        boolean esValida = true;

        if (anio < 1 || mes < 1 || mes > 12 || dia < 1) {
            esValida = false;
        } else {
            switch (mes) {
                case 2:
                    // Verificar febrero y si es año bisiesto
                    if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                        if (dia > 29) {
                            esValida = false;
                        }
                    } else {
                        if (dia > 28) {
                            esValida = false;
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 30) {
                        esValida = false;
                    }
                    break;
                default:
                    if (dia > 31) {
                        esValida = false;
                    }
            }
        }

        // Mostrar el resultado
        if (esValida) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }

        scanner.close();
    }
}
    


