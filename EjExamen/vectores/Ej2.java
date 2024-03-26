package EjExamen.vectores;

public class Ej2 {
    public static void main(String[] args) {
        // Crear dos arrays para comparar
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // equals
        boolean sonIguales = Ej1.equals(array1, array2);
        System.out.println("Los arrays son iguales: " + sonIguales);

        // fill (con índices)
        int[] array3 = {0, 0, 0, 0, 0};
        Ej1.fill(array3, 1, 3, 7);
        System.out.println("Array después de fill (con índices): " + Ej1.toString(array3));

        // fill (sin índices)
        int[] array4 = new int[5];
        Ej1.fill(array4, 8);
        System.out.println("Array después de fill (sin índices): " + Ej1.toString(array4));

        // toString
        System.out.println("Array convertido a String: " + Ej1.toString(array1));

        // copyOf
        int[] copia = Ej1.copyOf(array1, 3);
        System.out.println("Copia del array: " + Ej1.toString(copia));

        // sort
        int[] array5 = {5, 3, 1, 4, 2};
        Ej1.sort(array5);
        System.out.println("Array ordenado: " + Ej1.toString(array5));

        // binarySearch
        int[] array6 = {1, 3, 5, 7, 9};
        int indice = Ej1.binarySearch(array6, 5);
        System.out.println("El índice del valor buscado es: " + indice);
    }
}
