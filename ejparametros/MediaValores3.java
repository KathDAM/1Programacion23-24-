package ejparametros;

import java.util.Scanner;

public class MediaValores3 {
     static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Cuántos valores desea sumar?");
        int valores = lect.nextInt();
        double suma = 0;
   
        double media = mediaValores(valores,suma);
        System.out.println("La media de los " + valores + " valores introducidos es " + media);
        lect.close();
    }

    public static double mediaValores(int valor, double sum ){
        for (int i = 0; i < valor; i++) {
            System.out.print("  Escriba el valor " + (i+1)+ ": ");
            double valoresintro = lect.nextDouble();
            sum += valoresintro;
            System.out.println("    La suma actual es " + sum);
        }
    
        double mediavalores = sum / valor ;
        return mediavalores;

    }
}
