// Catherine AM
package segundaev.vectores.busquedas.ejercicio16;

import segundaev.vectores.utilidades.Utilidades;

public class SumaPosiciones {
    public static void main(String[] args) {
     
        int[] vector = new int[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresInt(vector);

        buscaSumaPosiciones(vector,Utilidades.busquedaNumeroInt());
    }

    public static void buscaSumaPosiciones(int[] vector, int num){
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
            if (suma > num) {
                System.out.println("La primera posición donde la suma supera M es: " + i);
            }
        }
        System.out.println("La suma de todos los elementos no supera el valor de M.");
      } 
}
