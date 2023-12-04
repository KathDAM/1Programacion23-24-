//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner lect =  new Scanner(System.in);
        System.out.println("Dime una edad");
        int edad = lect.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
        lect.close();
    }
}
