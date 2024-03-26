package EjExamen.vectores;

public class SumaVectoresAcotada {
    public static void main(String[] args) {
        int[] a = {1, 20, 30, 40, 50};
        int[] b = {10, 15, 25, 35, 45};
        int C = 50; // Valor máximo

        int[] c = sumarVectoresAcotada(a, b, C);

        // Imprimir el vector resultante
        System.out.println("Vector resultante:");
        imprimirArray(c);
    }

    public static int[] sumarVectoresAcotada(int[] a, int[] b, int C) {
        int n = Math.min(a.length, b.length);
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            int suma = a[i] + b[i];
            c[i] = suma <= C ? suma : C; // Aplicar la cota C si la suma supera C
        }

        return c;
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
