//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej11{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ejercicio 11");
        System.out.println();

        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe una secuencia de 4 números para saber si es capicúa");
        System.out.println("Proporciona un número(1): ");
        int num1 = lect.nextInt();

        System.out.println("Proporciona un número(2): ");
        int num2 = lect.nextInt();

        System.out.println("Proporciona un número(3): ");
        int num3 = lect.nextInt();

        System.out.println("Proporciona un número(4): ");
        int num4 = lect.nextInt();

        if (esCapicua(num1,num2,num3,num4)) {
            System.out.println("Los numeros " + num1 + "-" + num2+ "-" + num3 + "-" + num4 + " son Capicua");
        } else {
            System.out.println("Los numeros " + num1 + "-" + num2 + "-" + num3 + "-" + num4 + " no son Capicua");
        }
        
        lect.close();
    }

    static boolean esCapicua(int a, int b, int c, int d) {
        return (a == d) && (b == c);
    }
}