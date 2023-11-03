//Catherine AM
package Ejercicios2.Bucles;

public class Ej5 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        int par = 0;
        int impar = 0;
        int sumap = 0;
        int sumai = 0;
        int multi = 0;
        int summulti = 0;

        System.out.println("Los números del 1 al 100 son: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
            if (i%2 == 0) {
                par ++ ;
                sumap = i +  sumap;
            } else {
                impar ++;
                sumai = i +  sumai;
            }
            if (i%4 == 0 && i %7 == 0) {
                multi ++;
                summulti = i + summulti;
            }
        }

        System.out.println(" ");
        System.out.println("Hay  " + par + " números pares.");
        System.out.println("Hay  " + impar + " números impares.");
        System.out.println("Hay  " + sumai + " suma números pares.");
        System.out.println("Hay  " + sumap + " suma números impares.");
        System.out.println("Hay  " + multi + " que son múltiplos de cuatro y de siete,");
        System.out.print("y la suma de estos son  " + summulti + ".");
    }
    
}
