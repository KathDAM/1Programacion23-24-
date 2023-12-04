//Catherine AM
package Ejercicios3;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        System.out.println(" ");
        Scanner lect = new Scanner(System.in);

        System.out.println("Programa para ver cual es el mayor de los cuatro números enteros que ingreses a continuación");
        System.out.println("Ingresa un numero entero(1): ");
        int num1 = lect.nextInt();

        System.out.println("Ingresa un numero entero(2): ");
        int num2 = lect.nextInt();

        System.out.println("Ingresa un numero entero(3): ");
        int num3 = lect.nextInt();

        System.out.println("Ingresa un numero entero(4): ");
        int num4 = lect.nextInt();

        int result = obtenerMayor(num1,num2,num3,num4);
        System.out.println("El número mayor de " + num1 + ", " + num2 + " , " + num3 + " y " + num4 + " es: " + result);

        lect.close();
    }

   /* Esto esta incorrecto:
    static int obtenerMayor(int a, int b,int c, int d){
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > a && b > c && b > d) {
            return b;
        } else if (c > a && c > b && c > d){
            return c;
        } else{
            return d;
        }
    }  
 */
    static int obtenerMayor(int a, int b,int c, int d){
       Ej3.obtenerMayor(a,b);
       Ej3.obtenerMayor(c,d);
       int res =  Ej3.obtenerMayor(a,b);
       int res2 =  Ej3.obtenerMayor(c,d);

       return Ej3.obtenerMayor(res, res2);
       
    }  

}