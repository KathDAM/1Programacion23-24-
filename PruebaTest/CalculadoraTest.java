package PruebaTest;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4e.Calculadora Binaria");
        Scanner lect = new Scanner(System.in);

        System.out.println(CalculadoraBinaria.sumarNum(0, 7));
        System.out.println(CalculadoraBinaria.restarNum(-1, 4));
        System.out.println(CalculadoraBinaria.multipliNum(2,5));
        System.out.println(CalculadoraBinaria.dividirNum(8, 0));

        lect.close();
    }
    
}
