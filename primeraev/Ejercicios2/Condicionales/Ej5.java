//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner lect =  new Scanner(System.in);
        System.out.println("Dime una calificación");
        int cal = lect.nextInt();

        if (cal >= 0 && cal <= 10) {
            if (cal<3) {
                System.out.println("M.D.");
            }
            if (cal>=3 && cal<5) {
                System.out.println("INS.");
            }
            if (cal>=5 && cal<6) {
                System.out.println("SUF.");
            }
            if (cal==6 && cal<7) {
                System.out.println("BIEN.");
            }
            if (cal>=7 && cal<9) {
                System.out.println("NOT.");
            }
            if (cal>=9 && cal==10) {
                System.out.println("SOB.");
            }
        } else {
            System.out.println("Número no válido");
        }
        lect.close();
    }
}
