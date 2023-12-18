// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio1;

import java.util.Scanner;

import segundaev.herencia.ejerciciosclases.ejercicio2.Triangulo;

public class Main {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Buenos días, ingresa los datos del Examen:");
        System.out.print("   Dime el nombre de la asignatura: ");
        String nombre = lect.nextLine();

        System.out.print("   Dime el aula donde se realizó: ");
        String aula = lect.nextLine();

        int dia, mes, anyo;
        do {
            System.out.println("Ingresa la fecha del Examen:");
            dia = pedirEntero("   Dime el día del Examen: ");
            mes = pedirEntero("   Dime el mes del Examen: ");
            anyo = pedirEntero("   Dime el año del Examen: ");
        } while (!esFechaValida(dia, mes, anyo));

        int hora = pedirEntero("   Dime la hora del Examen: ");
        int min = pedirEntero("   Dime los minutos del Examen: ");

        // Validar la hora
        while (!esHoraValida(hora, min)) {
            System.out.println("Hora no válida. Ingresa nuevamente la hora:");
            hora = lect.nextInt();
            System.out.print("   Dime los minutos : ");
            min = lect.nextInt();
        }

        Fecha fechaExamen = new Fecha(dia, mes, anyo);
        Hora horaExamen = new Hora(hora, min);

        Examen examen = new Examen(nombre, aula, fechaExamen, horaExamen);

        // Mostrar información del examen
        System.out.println("· Información del Examen · :");
        System.out.println("   " + examen.toString());

        // Solicitar cambios de fecha y hora al usuario
        System.out.println("Ingresa la nueva fecha del Examen: ");
        do {
            System.out.println("Ingresa la nueva fecha del Examen:");
            dia = pedirEntero("   Dime el día del Examen: ");
            mes = pedirEntero("   Dime el mes del Examen: ");
            anyo = pedirEntero("   Dime el año del Examen: ");
            if (!esFechaValida(dia, mes, anyo)) {
                System.out.println("Fecha no válida. Por favor, inténtalo de nuevo.");
            }
        } while (!esFechaValida(dia, mes, anyo));

        hora = pedirEntero("   Dime la nueva hora del Examen: ");
        min = pedirEntero("   Dime los nuevos minutos del Examen: ");

          // Validar la hora
        while (!esHoraValida(hora, min)) {
            System.out.println("Hora no válida. Ingresa nuevamente la hora:");
            hora = lect.nextInt();
            System.out.print("   Dime los minutos : ");
            min = lect.nextInt();
        }
        // Aplicar cambios al examen
        examen.getFecha().actualizarFecha(dia, mes, anyo);
        examen.getHora().actualizarHora(hora, min);


        // Mostrar información actualizada del examen
        System.out.println("· Información actualizada del Examen · :");
        System.out.println("   " + examen.toString());

        lect.close();
    }

    // Método para pedir un entero al usuario con un mensaje
    private static int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        while (!lect.hasNextInt()) {
            System.out.println("¡¡¡¡ Inválido. Introduce un número entero. !!!!");
            System.out.print(mensaje);
            lect.next(); // Limpiar el buffer del scanner
        }
        return lect.nextInt();
    }

    // Método para verificar si una fecha es válida
    private static boolean esFechaValida(int dia, int mes, int anyo) {
        if (dia < 0 || dia > 31 || anyo < 0 || mes < 1 || mes > 12) {
            System.out.println("¡¡¡¡ Inválido. Fecha incorrecta !!!!");
            return false;
        }

        int[] diasEnMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esBisiesto(anyo)) {
            diasEnMes[2] = 29; // Febrero tiene 29 días en años bisiestos
        }

        return dia >= 1 && dia <= diasEnMes[mes];
    }

    // Método para verificar si un año es bisiesto
    private static boolean esBisiesto(int anyo) {
        return anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0);
    }

    private static boolean esHoraValida(int hora, int minuto) {
        return hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60;
    }
}
