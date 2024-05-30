package RepasoEx3ev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ContarPalabras {
     public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero:");
        String nombreFichero = lect.nextLine();

        try {
            int numeroDePalabras = contarPalabrasUnicas(nombreFichero);
            System.out.println("El número de palabras únicas en el fichero es: " + numeroDePalabras);
        } catch (IOException e) {
            System.err.println("Se produjo un error al leer el fichero: " + e.getMessage());
        }
    }

    /**
     * Función que cuenta las palabras únicas en un fichero.
     * @param nombreFichero El nombre del fichero a leer.
     * @return El número de palabras únicas en el fichero.
     * @throws IOException Si ocurre un error al leer el fichero.
     */
    public static int contarPalabrasUnicas(String nombreFichero) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
        String line;
        List<String> palabrasUnicas = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            String[] palabras = line.split("\\W+");
            for (int i = 0; i < palabras.length; i++) {
                String palabra = palabras[i];
                if (!palabra.isEmpty()) {
                    palabra = palabra.toLowerCase();
                    if (!palabrasUnicas.contains(palabra)) {
                        palabrasUnicas.add(palabra);
                    }
                }
            }
        }
        reader.close();
        return palabrasUnicas.size();
    }
}
