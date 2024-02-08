//Catherine AM
package segundaev.vectores.recorridovectores.ejercicio1;

import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class Valores10{
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        int[] vector = new int[10];

        System.out.println("Introduce 10 valores en el vector: ");

        Utilidades.introducirValoresInt(vector);

        System.out.println("Valores introducidos en el vector: ");
        Utilidades.mostrarVectorInt(vector);
        lect.close();
    }

}
