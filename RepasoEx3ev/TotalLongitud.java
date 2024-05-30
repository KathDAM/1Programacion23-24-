package RepasoEx3ev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TotalLongitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Analizador de palabras en fichero. Escriba la ubicación del fichero a analizar:");
        String nombreFichero = scanner.nextLine();

        try {
            Map<Integer, Integer> clasificacionPorLongitud = new HashMap<>();
            Map<Character, Integer> clasificacionPorInicial = new HashMap<>();
            int totalPalabras = 0;
            Set<String> palabrasUnicas = new HashSet<>();

            BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
            String line;

            System.out.println("Leyendo archivo...");

            while ((line = reader.readLine()) != null) {
                String[] palabras = line.split("\\W+");
                for (int i = 0; i < palabras.length; i++) {
                    String palabra = palabras[i];
                    if (!palabra.isEmpty()) {
                        totalPalabras++;
                        palabra = palabra.toLowerCase();
                        palabrasUnicas.add(palabra);

                        // Clasificación por longitud
                        int longitud = palabra.length();
                        clasificacionPorLongitud.put(longitud, clasificacionPorLongitud.getOrDefault(longitud, 0) + 1);

                        // Clasificación por inicial
                        char inicial = palabra.charAt(0);
                        clasificacionPorInicial.put(inicial, clasificacionPorInicial.getOrDefault(inicial, 0) + 1);
                    }
                }
            }
            reader.close();

            System.out.println("\nTotal de palabras contabilizadas: " + totalPalabras);
            System.out.println("Total de palabras sin repeticiones: " + palabrasUnicas.size());

            System.out.println("\nClasificación de las palabras por longitud:");
            for (Map.Entry<Integer, Integer> entry : clasificacionPorLongitud.entrySet()) {
                System.out.println("Palabras de " + entry.getKey() + " caracteres: " + entry.getValue());
            }

            System.out.println("\nClasificación de las palabras por inicial:");
            for (Map.Entry<Character, Integer> entry : clasificacionPorInicial.entrySet()) {
                System.out.println("Palabras que empiezan por '" + entry.getKey() + "': " + entry.getValue());
            }

        } catch (IOException e) {
            System.err.println("Se produjo un error al leer el fichero: " + e.getMessage());
        }
    }
}
