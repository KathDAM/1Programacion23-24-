package pruebatest;

public class TablasMultiplicar {
    public static void main(String[] args) {
        System.out.println("Ejercicio: Tablas de multiplicar del 1 al 10");

        for (int num = 1; num <= 10; num++) {
            System.out.println("\nTabla de multiplicar del " + num + ":");

            for (int i = 0; i <= 10; i++) {
                System.out.print(num + "x" + i + "=" + i * num);

                if (i < 10) {
                    System.out.print(" , ");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
