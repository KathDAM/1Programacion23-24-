package segundaev.string.ejercicio9;

import java.util.Scanner;

public class SinVocales {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Dame tu nombre y apellido completo: ");
        String nombre = lect.nextLine();

        String sinvocales = eliminarVocales(nombre);
        System.out.println("El nombre completo sin vocales es " + sinvocales);
        lect.close();
    }

    private static String eliminarVocales(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!esVocal(caracter)) {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }
    /*la opción rápida:
     return cadena.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "") */

    private static boolean esVocal(char caracter) {
        char letra = Character.toLowerCase(caracter);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
