package PruebaTest;

import java.util.Scanner;

public class Ej1 {
    
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Ejercicio 1. Tabla de multiplicar");
        System.out.println("Dame un número entero:");
        int num = lect.nextInt();

        System.out.println("Tabla de multiplicar del " + num);

        for (int i = 0; i <= 10; i++) {
            if (i==10) {
                System.out.print("y " + num + "x" + i + "=" + (num * 10) + ".");
            }else{
                System.out.print(num + "x" + i + "=" + i * num + " , ");
            }
        }

        lect.close();
    }
}


