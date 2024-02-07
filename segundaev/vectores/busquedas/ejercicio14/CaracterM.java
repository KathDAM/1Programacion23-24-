// Catherine AM
package segundaev.vectores.busquedas.ejercicio14;

import java.util.Scanner;

public class CaracterM {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array: ");
        int tamaño = lect.nextInt();

        char[] vector = new char[tamaño];

        introducirValoresVector(vector);
        String caracter = "M";
        encontrarCaracter(vector,caracter);
    }

    public static void introducirValoresVector(char[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.next().charAt(0);
        }
    }

    public static void encontrarCaracter(char[] vector, String caract){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 'M') {
                System.out.println("El caracter "+ caract + " esta en la posicion " + i);
                return;
            }
        }
        System.out.println("No hay ninguna M en el vector");    
    }
}
