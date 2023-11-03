//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej2 {
       public static void main(String[] args) {
        Scanner lect =  new Scanner(System.in);
        System.out.println("Dime una edad");
        int edad = lect.nextInt();

        if (edad == 25) {
            System.out.println("Tienes 25");
        }
        if (edad > 25) {
            System.out.println("Eres mayor de 25");
        } 
        if(edad < 25){
            System.out.println("No eres mayor de 25");
        }
        lect.close();
    }
}

