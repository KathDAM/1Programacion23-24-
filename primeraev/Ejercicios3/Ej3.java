//Catherine AM
package Ejercicios3;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        System.out.println(" ");
        int num1 = 5;
        int num2 = 7;

        int mayor = obtenerMayor(num1, num2);

        System.out.println("El número mayor entre " + num1 + " y " + num2 + " es: " + mayor);
    }

    public static int obtenerMayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
     

