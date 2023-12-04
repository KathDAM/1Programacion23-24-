package pruebatest;

import java.util.Scanner;

public class CalculadoraBinaria {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4.Calculadora Binaria");
        Scanner lect = new Scanner(System.in);

        System.out.println("Dame un número real:  ");
        double num1 = lect.nextDouble();
        System.out.println("Dame otro número real:");
        double num2 = lect.nextDouble();

        CalculadoraBinaria calculadora = new CalculadoraBinaria(num1,num2);

        System.out.println("El total de la suma entre " + num1 + " y " + num2 + " es " + calculadora.sumarNum());
        System.out.println("El total de la resta entre " + num1 + " y " + num2 + " es " + calculadora.restarNum());
        System.out.println("El total de la multiplicacion entre " + num1 + " y " + num2 + " es " + calculadora.multipliNum());
        System.out.println("El total de la division entre " + num1 + " y " + num2 + " es " + calculadora.dividirNum());

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
        this.setA(otra.a); //this.a = otra.a;
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
    public double sumarNum(){
        res = a + b;
        return res;
    }

    public double restarNum(){
        res = a - b;
        return res;
    }

    public double multipliNum(){
        res = a * b;
        return res;
    }

    public double dividirNum(){
        if (b==0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
            res = (a / b);
            return res;
        }
       
    }

}
