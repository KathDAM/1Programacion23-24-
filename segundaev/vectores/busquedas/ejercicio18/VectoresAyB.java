// Catherine AM
package segundaev.vectores.busquedas.ejercicio18;


import segundaev.vectores.utilidades.Utilidades;

public class VectoresAyB {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] B = {3, 4, 5};

        if (Utilidades.contieneVector(A, B)) {
            System.out.println("El vector A contiene al vector B.");
        } else {
            System.out.println("El vector A no contiene al vector B.");
        }
    }
}
