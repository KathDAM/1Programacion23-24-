package ejparametros;

import java.util.Scanner;

public class MediaValores5 {
    static Scanner lect = new Scanner(System.in);

    // ATRIBUTOS
    private double valor;
    private double suma;

    // CONSTRUCTOR
    public MediaValores5(double valor) {
        this.valor = valor;
    }

    // GETTER
    public double getValor() {
        return valor;
    }

    public double getSuma() {
        return suma;
    }

    // SETTER
    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double mediaValores() {
        for (int i = 0; i < valor; i++) {
            System.out.print("  Escriba el valor " + (i+1)+ ": ");
            double valoresintro = lect.nextDouble();
            suma += valoresintro;
            System.out.println("    La suma actual es " + suma);
        }

        double mediavalores = suma / valor;
        return mediavalores;
    }
}
 

