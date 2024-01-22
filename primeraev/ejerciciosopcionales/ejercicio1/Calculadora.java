package ejerciciosopcionales.ejercicio1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.println("Calculadora númerica. Escriba dos numeros decimales: ");
        double num1 = lect.nextDouble();
        double num2 = lect.nextDouble();
        int opcion;

        do {
            System.out.println("Elija una opción: ");
            System.out.println("    1 - Suma");
            System.out.println("    2 - Resta");
            System.out.println("    3 - Multiplicación");
            System.out.println("    4 - División");
            System.out.println("    5 - Salir");

            opcion = lect.nextInt();
            System.out.println("********************************************");
            
            switch (opcion) {
                case 1:
                    System.out.println(sumar(num1,num2));    
                    System.out.println("********************************************");
                    break;
                
                case 2:
                    System.out.println(restar(num1, num2));
                    System.out.println("********************************************");
                    break;

                case 3:
                    System.out.println(multiplicar(num1, num2));
                    System.out.println("********************************************");
                    break;
                
                case 4:
                    System.out.println(dividir(num1, num2));
                    System.out.println("********************************************");
                    break;

                case 5:
                    System.out.println("*************      SALIR      **************");
                    break;

                default:
                    System.out.println("********************************************");
                    System.out.println("Opcion inválida");
                    break;
            }

        } while (opcion != 5);

        lect.close();
    }

    public static double sumar(double a, double b){
        System.out.print(a +" + " + b + " = ");
        return a + b;
    }

    public static double restar(double a, double b){
        System.out.print(a +" - " + b + " = ");
        return a - b;
    }

    public static double multiplicar(double a, double b){
        System.out.print(a +" x " + b + " = ");
        return a * b;
    }

    public static double dividir(double a, double b){
        if (b == 0) {
            System.out.print("No es posible dividir por cero");
            return 0;
        } else {
            System.out.print(a +" : " + b + " = ");
            return a / b;  
        }
    }

}
