//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej4{

    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Ejercicio 4");
        System.out.println(" ");
        System.out.println("Programa para ver cual es el mayor de los tres números enteros que ingreses a continuación");
        System.out.println("Ingresa un numero entero(1): ");
        int num1 = lect.nextInt();

        System.out.println("Ingresa un numero entero(2): ");
        int num2 = lect.nextInt();

        System.out.println("Ingresa un numero entero(3): ");
        int num3 = lect.nextInt();

        int result = obtenerMayor(num1,num2,num3);

        System.out.println("El número mayor de " + num1 + ", " + num2 + " y " + num3 + " es: " + result);

        lect.close();
    }

    static int obtenerMayor(int a,int b, int c){
        if (a>b && a>c) {
            return a;
        } if (b>a && b>c) {
            return b;
        } else {
            return c;
        }
    }
}