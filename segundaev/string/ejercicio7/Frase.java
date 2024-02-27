package segundaev.string.ejercicio7;

import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe una frase:");
        String frase = lect.nextLine();

        int cantidadEspacios = cuantosEspacios(frase);
        System.out.println("La frase tiene " + cantidadEspacios + " espacios.");
    
        lect.close();
    }

    public static int cuantosEspacios(String frase) {
        String[] espacios = frase.split(" ");
        return espacios.length - 1;
    }
}
