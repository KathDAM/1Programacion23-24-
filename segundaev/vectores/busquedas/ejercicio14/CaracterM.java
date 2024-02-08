// Catherine AM
package segundaev.vectores.busquedas.ejercicio14;

import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class CaracterM {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        char[] vector = new char[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresChar(vector);
        System.out.println("Introduce el caracter que quieres bucar: ");
        char caracter = lect.next().charAt(0);
        encontrarCaracter(vector,caracter);
    }

    public static void encontrarCaracter(char[] vector, char caract){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == caract) {
                System.out.println("El caracter "+ caract + " esta en la posicion " + i);
                return;
            }
        }
        System.out.println("No hay ninguna caracter en el vector");    
    }
}
