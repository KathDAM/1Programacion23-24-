// Catherine AM
package segundaev.vectores.busquedas.ejercicio15;

import java.util.Scanner;

import segundaev.vectores.utilidades.Utilidades;

public class BusquedaN {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        int[] vector = new int[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresInt(vector);

        Utilidades.encontrarIntVector(vector,Utilidades.busquedaNumeroInt());
    }


}
