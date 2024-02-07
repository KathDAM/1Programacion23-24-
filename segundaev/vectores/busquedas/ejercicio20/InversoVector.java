// Catherine AM
package segundaev.vectores.busquedas.ejercicio20;

public class InversoVector {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {5, 4, 3, 2, 1};

        if (esInverso(A, B)) {
            System.out.println("El vector B es el inverso del vector A.");
        } else {
            System.out.println("El vector B no es el inverso del vector A.");
        }
    }

    public static boolean esInverso(int[] A, int[] B) {
        if (A.length != B.length) {
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[A.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
