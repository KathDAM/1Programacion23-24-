package RepasoEx3ev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DiccionarioPalabras {
    private static Set<String> palabrasUnicas = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero:");
        String nombreFichero = scanner.nextLine();

        try {
            cargarPalabrasUnicas(nombreFichero);
            System.out.println("El número de palabras únicas en el fichero es: " + palabrasUnicas.size());

            while (true) {
                System.out.println("Introduce una palabra para buscar (o 'salir' para terminar):");
                String palabra = scanner.nextLine();
                if (palabra.equalsIgnoreCase("salir")) {
                    break;
                }
                if (contienePalabra(palabra)) {
                    System.out.println("La palabra '" + palabra + "' está en el fichero.");
                } else {
                    System.out.println("La palabra '" + palabra + "' no está en el fichero.");
                }
            }
        } catch (IOException e) {
            System.err.println("Se produjo un error al leer el fichero: " + e.getMessage());
        }
    }

    public static void cargarPalabrasUnicas(String nombreFichero) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] palabras = line.split("\\W+");
            for (int i = 0; i < palabras.length; i++) {
                String palabra = palabras[i];
                if (!palabra.isEmpty()) {
                    palabra = palabra.toLowerCase();
                    palabrasUnicas.add(palabra);
                }
            }
        }
        reader.close();
    }
    
    public static boolean contienePalabra(String palabra) {
        return palabrasUnicas.contains(palabra.toLowerCase());
    }
}
