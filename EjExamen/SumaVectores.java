package EjExamen;
public class SumaVectores {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9, 10};

        int[] resultante = sumarArrays(vector1, vector2);

        System.out.print("Vector 1: ");
        imprimirArray(vector1);
        System.out.print("Vector 2: ");
        imprimirArray(vector2);
        System.out.print("Vector resultado: ");
        imprimirArray(resultante);
    }

    public static int[] sumarArrays(int[] vector1, int[] vector2) {
        int n = vector1.length;
        int[] resultante = new int[n];

        for (int i = 0; i < n; i++) {
            resultante[i] = vector1[i] + vector2[i];
        }

        return resultante;
    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
