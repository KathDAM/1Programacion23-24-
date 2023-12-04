package ejparametros;

import java.util.Scanner;

public class MediaValores4 {
    static Scanner lect = new Scanner(System.in);
    static int valores ;
    static double suma ;
    public static void main(String[] args) {

        System.out.println("¿Cuántos valores desea sumar?");
        valores= lect.nextInt();
        suma = 0;
   
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
 

