//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej4 {
     public static void main(String[] args) {
        Scanner lect =  new Scanner(System.in);
        System.out.println("Dime un número");
        int num1 = lect.nextInt();

        System.out.println("Dime otro número");
        int num2 = lect.nextInt();

        if (num1 > num2) {
            System.out.println("El orden es " + num2 + "<" + num1);
        }else{
            System.out.println("El orden es " + num1 + "<" + num2);
        }
        
        lect.close();
    }
}