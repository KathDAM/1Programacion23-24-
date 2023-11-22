package pruebatest;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4e.Calculadora Binaria");
        Scanner lect = new Scanner(System.in);

        System.out.println("Ingresa el primer operando: ");
        double num1 = lect.nextDouble();

        System.out.println("Ingresa el segundo operando: ");
        double num2 = lect.nextDouble();

        CalculadoraBinaria calculadora = new CalculadoraBinaria(num1,num2);

        System.out.println(calculadora.sumarNum());
        System.out.println(calculadora.restarNum());
        System.out.println(calculadora.multipliNum());
        System.out.println(calculadora.dividirNum());

        lect.close();
    }
    
}
