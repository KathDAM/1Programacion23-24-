//Catherine AM
package Ejercicios2.Bucles;

import java.util.Scanner;

public class Ej11 {
  public static void main(String[] args) {
    System.out.println("Ejercicio 11");
    System.out.println(" ");
    Scanner lect = new Scanner(System.in);
    int max = 100;
    int min = 1;

    int numRandom = (int)(Math.random() * (max - min)) + min;
    int intentos = 0;

    System.out.println("Adivina el número");
    System.out.println("Intenta adivinar el número del 1 al 100");
    int num = lect.nextInt();

    while (true) {
      
      if (num != numRandom) {
        intentos ++;
      } else {
        System.out.println("¡Lo has adivinado! Número de veces de intentos: " + intentos);
      }

    }

  }  
}
