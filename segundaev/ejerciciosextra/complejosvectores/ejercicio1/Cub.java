package segundaev.ejerciciosextra.complejosvectores.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Cub {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad de la cubeta en litros: ");
        int capacidadCubeta = scanner.nextInt();

        int[] lluviaPorDia = new int[15]; 
        int lluviaAcumulada = 0;
        Random random = new Random();

        
        for (int i = 0; i < lluviaPorDia.length; i++) {
            lluviaPorDia[i] = random.nextInt(21); 
            lluviaAcumulada += lluviaPorDia[i]; 
            
            System.out.println("Día " + (i + 1) + ": Llovió " + lluviaPorDia[i] + " litros");

            if (lluviaAcumulada >= capacidadCubeta) {
                System.out.println("La cubeta se ha llenado en " + (i + 1) + " días.");
                break;
            }
        } 
        
        if (lluviaAcumulada < capacidadCubeta) {
            System.out.println("La cubeta no se llenó en 15 días.");
        }

        scanner.close();
    }
}

