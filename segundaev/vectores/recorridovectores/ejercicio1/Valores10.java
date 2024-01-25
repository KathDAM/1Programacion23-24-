//Catherine AM
package segundaev.vectores.recorridovectores.ejercicio1;

import java.util.Scanner;

public class Valores10{
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        int[] vector = new int[10];

        System.out.println("Introduce 10 valores en el vector: ");

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vector[i] = lect.nextInt();
        }

        System.out.println("Valores introducidos en el vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " , ");
        }
        lect.close();
    }

}
