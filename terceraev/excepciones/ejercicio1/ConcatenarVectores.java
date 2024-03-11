// Catherine AM
package terceraev.excepciones.ejercicio1;

import terceraev.excepciones.utilidades.Utilidades;

public class ConcatenarVectores {
    public static void main(String[] args) {

        System.out.println("Dame el tamaño del vector A: ");
        int[] A = new int[Utilidades.tamañoVectorInt()];
        System.out.println("y introduce los valores: ");
        Utilidades.introducirValoresInt(A);

        System.out.println("Dame el tamaño del vector B: ");
        int[] B = new int[Utilidades.tamañoVectorInt()];
        System.out.println("y introduce los valores: ");
        Utilidades.introducirValoresInt(B);

        int[] result;
        try {
            result = concatenarVectores(A, B);

        } catch (IllegalArgumentException e) {
            System.out.println("Error al concatenar los vectores. " + e.getMessage());
            return;
        }

        System.out.print("El resultado de los dos vectores concatenados es [");
        Utilidades.mostrarVectorInt(result);
    }

    public static int[] concatenarVectores(int[] a, int[] b) {
        if (a != null && a.length != 0 && b != null && b.length != 0) {
            int tamañoR = a.length + b.length;
            int[] R = new int[tamañoR];
            for (int i = 0; i < a.length; i++) {
                R[i] = a[i];
            }

            for (int i = 0; i < b.length; i++) {
                R[a.length + i] = b[i];
            }
            return R;
        } else {
            throw new IllegalArgumentException("Los vectores no pueden ser nulos ni de tamaño 0");
        }
    }
}
