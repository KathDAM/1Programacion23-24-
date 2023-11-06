//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println();
        System.out.println("Ejercicio 12");
        System.out.println();

        System.out.print("Escribe tu nombre: ");
        String nombre = lect.nextLine();

        System.out.println("Porfavor,elige un idioma: ");
        System.out.println("a - Valenciano");
        System.out.println("b - Castellano");
        System.out.println("c - Inglés");

        char idioma = lect.next().toLowerCase().charAt(0); //char para almacenar caracter

        eligeSaludo(nombre, idioma);

        lect.close();
    }

    static void eligeSaludo(String nombre, char idioma) {
        String mensaje = ""; //inicializa como una cadena vacía

        switch (idioma) {
            case 'a':
                mensaje = "Bona vesprada " + nombre;
                break;
            case 'b':
                mensaje = "Buenos días " + nombre;
                break;
            case 'c':
                mensaje = "Good morning " + nombre;
                break;
            default:
                mensaje = "Elección no válida";
        }

        System.out.println(mensaje);
    }
}
