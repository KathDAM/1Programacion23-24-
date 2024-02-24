package segundaev.ejerciciosextra.vectoresobjetos.ejercicio6;

import java.util.Scanner;

public class TestAppFibonacci {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño del vector para la serie de Fibonacci:");
        short tamaño = lect.nextShort();

        CalculadoraSerieFibonacci calculadora = new CalculadoraSerieFibonacci(tamaño);
        
        System.out.println(calculadora);

        lect.close();
    }
}
