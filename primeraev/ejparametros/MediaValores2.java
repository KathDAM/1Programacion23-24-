package ejparametros;

import java.util.Scanner;

public class MediaValores2 {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Cuántos valores desea sumar?");
        int valores = lect.nextInt();
        double suma = 0;
   
        mediaValores(valores,suma);
        lect.close();
    }

    public static void mediaValores(int valor, double sum ){
        for (int i = 0; i < valor; i++) {
            System.out.print("  Escriba el valor " + (i+1)+ ": ");
            double valoresintro = lect.nextDouble();
            sum += valoresintro;
            System.out.println("    La suma actual es " + sum);
        }
    
        double mediavalores = sum / valor ;
        System.out.println("La media de los " + valor + " valores introducidos es " + mediavalores );

    }
}
