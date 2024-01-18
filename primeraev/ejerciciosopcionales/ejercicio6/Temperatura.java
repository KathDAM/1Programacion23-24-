package ejerciciosopcionales.ejercicio6;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        
        System.out.print("Indicanos la temperatura en centígrados(valor entero): ");
        int temp = lect.nextInt();

        if (temp < 10) {
            System.out.println("El clima sera : Frío");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("El clima sera : Templado");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("El clima sera : Caluroso");
        }else if (temp >= 30){
            System.out.println("El clima sera : Tropical");
        }

        lect.close();
    }
}
