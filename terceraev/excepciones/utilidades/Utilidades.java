package terceraev.excepciones.utilidades;

import java.util.Scanner;

public class Utilidades {
    static Scanner lect = new Scanner(System.in);
  
    // INT
    public static int tamañoVectorInt(){
        int tamaño = Integer.parseInt(lect.nextLine());
        return tamaño;
    }

    public static void introducirValoresInt(int[] vector){
       /* if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException("Los vectores no pueden ser nulos ni de tamaño 0");
        }
        */
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = Integer.parseInt(lect.nextLine());
        }
    }

    public static void mostrarVectorInt(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print( vector[i]); 
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}