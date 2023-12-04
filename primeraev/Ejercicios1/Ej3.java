//Catherine AM
package Ejercicios1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Ej3 - Notas Programación");
        System.out.println("****************************************");
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario ingresar las notas de los parciales
        System.out.print("Ingrese la nota del Parcial 1: ");
        double notaParcial1 = scanner.nextDouble();
        
        System.out.print("Ingrese la nota del Parcial 2: ");
        double notaParcial2 = scanner.nextDouble();
        
        // Calcular la nota final
        double notaFinal = (notaParcial1 + notaParcial2) / 2;
        
        // Imprimir las notas de los parciales en líneas separadas
        System.out.println("Nota Parcial 1: " + notaParcial1);
        System.out.println("Nota Parcial 2: " + notaParcial2);
        
        // Imprimir la nota final
        System.out.println("Nota Final: " + notaFinal);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
