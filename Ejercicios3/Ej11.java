//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej11{
    public static void main(String[] args) {
        System.out.println("Ejercicio 11");
        System.out.println(" ");

        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe una secuencia de 4 n´umeros para saber si es capicúa");
        System.out.println("Proporciona un número(1): ");
        int num1 = lect.nextInt();

        System.out.println("Proporciona un número(2): ");
        int num2 = lect.nextInt();

        System.out.println("Proporciona un número(3): ");
        int num3 = lect.nextInt();

        System.out.println("Proporciona un número(4): ");
        int num4 = lect.nextInt();

        int res = esCapicua(num1,num2,num3,num4);

        if (res == ) {
            
        } else {
            System.out.println("");
        }
                
    }

    static int esCapicua(int a,int b,int c,int d){

        return d;

    }
}