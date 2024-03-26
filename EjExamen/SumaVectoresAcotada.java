package EjExamen;

public class SumaVectoresAcotada {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        int C = 10;

        int[] c = sumarVectoresAcotada(a, b, C);

        System.out.println("Vector 1: ");
        imprimirArray(a);
        System.out.println("Vector 2: ");
        imprimirArray(b);
        System.out.println("Cota máxima: " + C);
        System.out.println("Vector resultado: ");
        imprimirArray(c);
    }

    public static int[] sumarVectoresAcotada(int[] a, int[] b, int C) {
        int n = Math.min(a.length, b.length);
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            int suma = a[i] + b[i];
           // c[i] = suma <= C ? suma : C;
           if (suma <= C) {
                c[i] = suma;
            } else {
                c[i] = C;
            }
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
/*
    public static void mostrarVectorInt(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] "); 
        }
        System.out.println();
    } */