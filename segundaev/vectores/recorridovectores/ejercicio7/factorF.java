package segundaev.vectores.recorridovectores.ejercicio7;

import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class factorF {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
 
        int[] vector = new int[Utilidades.tamañoVectorInt()];
     
       Utilidades.introducirValoresInt(vector);

        System.out.println("Introduce el factor F multiplicador del vector: ");
        int factor = lect.nextInt();

        factorMultiplicado(vector,factor);

        lect.close();
    }

    public static void factorMultiplicado(int[] vector,int factor){
        for (int i = 0; i < vector.length; i++) {
            int mult = vector[i] * factor;
            System.out.println("Elemento " + (i) + " multiplicado por " + factor + " es igual a " + mult); 
        }
    }
}
