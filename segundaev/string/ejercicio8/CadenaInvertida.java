package segundaev.string.ejercicio8;

import java.util.Scanner;

public class CadenaInvertida {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe una frase:");
        String frase = lect.nextLine();

        String fraseInvertida =  invertirCadena(frase);

        System.out.println("La frase invertida es " + fraseInvertida);

        lect.close();
    }

    private static String  invertirCadena(String frase) {
        StringBuilder builder = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) { //empieza con 1-
            builder.append(frase.charAt(i));
        }
        return builder.toString();
    }
}


/* la opción más rapida
StringBuilder builder = new StringBuilder(frase);
return builder.reverse().toString(); */