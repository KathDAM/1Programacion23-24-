// Catherine AM
package segundaev.vectores.busquedas.ejercicio18;

import java.util.Arrays;

public class VectoresAyB {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] B = {3, 4, 5};

        if (contieneVector(A, B)) {
            System.out.println("El vector A contiene al vector B.");
        } else {
            System.out.println("El vector A no contiene al vector B.");
        }
    }

    public static boolean contieneVector(int[] A, int[] B) {
        if (A.length < B.length) {
            return false;
        }

        for (int i = 0; i <= A.length - B.length; i++) {
            if (Arrays.equals(Arrays.copyOfRange(A, i, i + B.length), B)) {
                return true;
            }
        }

        return false;
    }
}
