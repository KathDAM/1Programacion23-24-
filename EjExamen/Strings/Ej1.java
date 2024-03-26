package EjExamen.Strings;

import java.util.Scanner;

public class Ej1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre, el primer apellido y el segundo apellido
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su primer apellido: ");
        String primerApellido = scanner.nextLine();

        System.out.print("Ingrese su segundo apellido: ");
        String segundoApellido = scanner.nextLine();

        // Concatenar las cadenas para formar el nombre completo
        String nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;

        // Mostrar el nombre completo
        System.out.println("El nombre completo es: " + nombreCompleto);

        System.out.println("Nombre completo en Mayusculas: " + nombreCompleto.toUpperCase());

        System.out.println("Nombre completo en minusculas: " + nombreCompleto.toLowerCase());

        System.out.println("Longitud del nombre: " + nombreCompleto.length());

        System.out.println("Las inciales del nombre completo minusculas son: " + nombre.toLowerCase().charAt(0) + primerApellido.toLowerCase().charAt(0) + segundoApellido.toLowerCase().charAt(0) );
        System.out.println("Las inciales del nombre completo mayusculas son: " + nombre.toUpperCase().charAt(0) + primerApellido.toUpperCase().charAt(0) + segundoApellido.toUpperCase().charAt(0) );
        
        // Obtener el último carácter del segundo apellido
        char ultimoCaracterSegundoApellido = segundoApellido.charAt(segundoApellido.length() - 1);// Dado que los índices en una cadena comienzan desde 0, la longitud de la cadena menos 1 nos da el índice del último carácter en la cadena.

        // Contar el número de ocurrencias del último carácter del segundo apellido en el nombre completo
        int contador = 0;
        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (nombreCompleto.charAt(i) == ultimoCaracterSegundoApellido) {
                contador++;
            }
        }

        System.out.println("El número de ocurrencias del último carácter del segundo apellido en el nombre completo es: " + contador);


         // Encontrar el primer carácter del nombre completo
         char primerCaracter = nombreCompleto.charAt(0);

         // Convertir todas las ocurrencias del primer carácter a mayúsculas en el nombre completo
         StringBuilder nombreCompletoMayusculas = new StringBuilder();
         for (int i = 0; i < nombreCompleto.length(); i++) {
             char caracter = nombreCompleto.charAt(i);
             if (caracter == primerCaracter) {
                nombreCompletoMayusculas.append(Character.toUpperCase(caracter));
             } else {
                nombreCompletoMayusculas.append(caracter);
             }
         }
 
         System.out.println("El nombre completo con todas las ocurrencias del primer carácter en mayúsculas es:");
         System.out.println(nombreCompletoMayusculas.toString());
 
        scanner.close();
     }
}
