//Catherine AM
package Ejercicios1;

public class Ej9y10 {
    public static void main(String[] args) {
        System.out.println( "");
        System.out.println("Ej9 - Expresiones aritméticas");
        System.out.println("****************************************");
        System.out.println("a) " + ( 25 + 20 - 15));
        System.out.println("b) " + ( 20 * 10 + 15 * 10));
        System.out.println("c) " + ( 20 * 10 / 2 -20 /5 * 3));
        System.out.println("d) " + ( 15 / 10 * 2 + 3 / 4 * 8));
        System.out.println( "");

        System.out.println("Ej10 - Expresiones aritméticas 2");
        System.out.println("****************************************");
        int a = 2;
        int b = 4;
        int resultA = -a + 5 % b - a * a;
        System.out.println("a) " + resultA);
        int resultB = 5 + 3 % 7 * b * a - b % a;
        System.out.println("b) " + resultB);
        int resultC = (a + 1) * (b + 1) - b / a;
        System.out.println("c) " + resultC);
        System.out.println( "");
    } 
}
