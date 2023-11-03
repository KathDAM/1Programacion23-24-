//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner lect =  new Scanner(System.in);
        System.out.println("Dime un número");
        int num = lect.nextInt();

        if (num%2 == 0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
        lect.close();
    }
}
