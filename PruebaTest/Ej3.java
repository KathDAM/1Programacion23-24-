package PruebaTest;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3.Cara o cruz");
        Scanner lect = new Scanner(System.in);
        System.out.print("Dame un numero entero : ");
        int x = lect.nextInt();

        System.out.println(tirarMoneda(x));
    }

    public static int tirarMoneda(int a){
        for (int i = 0; i < a; i++) {
            Math.random();
           // String.charAt
        }
        return a;
        
    }
    
}
