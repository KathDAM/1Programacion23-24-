package segundaev.string.ejercicio10;

import java.util.Scanner;

public class BusquedaPalabaras {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String frase = lect.nextLine();

        System.out.print("Y ahora una palabra que buscar: ");
        String palabra = lect.nextLine();

        int cont = recorridoBusqueda(frase,palabra);
    
        System.out.println("La palabra '" + palabra + "' aparece " + cont + " veces en la frase.");
        lect.close();
    }
        
    private static int recorridoBusqueda(String frase2, String palabra2) {
        String[] palabras = frase2.split("\\s+"); //divide por 1 o + espacios en blanco
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra2)) {
                contador++;
            }
        }
        return contador;
    }
    
}
