package PruebaTest;

import java.util.Scanner;

public class CalculadoraBinaria {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4.Calculadora Binaria");
        Scanner lect = new Scanner(System.in);

        System.out.println("Dame un número real:  ");
        int num1 = lect.nextInt();
        System.out.println("Dame otro número real:");
        int num2 = lect.nextInt();

        System.out.println("El total de la suma entre " + num1 + " y " + num2 + " es " + sumarNum(num1,num2));
        System.out.println("El total de la resta entre " + num1 + " y " + num2 + " es " + restarNum(num1,num2));
        System.out.println("El total de la multiplicacion entre " + num1 + " y " + num2 + " es " + multipliNum(num1, num2));
        System.out.println("El total de la division entre " + num1 + " y " + num2 + " es " + dividirNum(num1,num2));

        lect.close();
    }

    //ATRIBUTOS
    private double a,b;
    private static double res;

    //CONSTRUCTOR VALORES (a)
    public CalculadoraBinaria(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //CONSTRUCTOR POR DEFECTO (b)
    public CalculadoraBinaria() {
        this.a = 0;
        this.b = 0;
    }

    //CONSTRUCTOR QUE ADMITE OTRA CALCULADORA (c)
    public CalculadoraBinaria(CalculadoraBinaria otra) {
        this.setA(otra.a);
        this.setB(otra.b);
    }

    //GETTER
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    //SETTER
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    //METODOS
    public static double sumarNum(double a, double b){
        res = a + b;
        return res;
    }

    public static double restarNum(double a, double b){
        res = a - b;
        return res;
    }

    public static double multipliNum(double a, double b){
        res = a * b;
        return res;
    }

    public static double dividirNum(double a, double b){
        if (b==0) {
            System.out.println("No se puede dividir por cero");
        } else {
            res = (a / b);
            System.out.println("El resultado es " + res);
        }
        return res;
    }

}
