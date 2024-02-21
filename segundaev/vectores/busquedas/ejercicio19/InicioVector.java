// Catherine AM
package segundaev.vectores.busquedas.ejercicio19;

import java.util.Arrays;

public class InicioVector {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] B = {3, 4, 5};

        int posicionInicio = contieneVector(A, B);
        
        if (posicionInicio != -1) {
            System.out.println("El vector A contiene al vector B. B comienza en la posición " + posicionInicio + " de A.");
        } else {
            System.out.println("El vector A no contiene al vector B.");
        }
    }

    public static int contieneVector(int[] A, int[] B) {
        if (A.length < B.length) {
            return -1;
        }

        for (int i = 0; i <= A.length - B.length; i++) {
            if (Arrays.equals(Arrays.copyOfRange(A, i, i + B.length), B)) {
                return i;
            }
        }

        return -1;
    }
}
