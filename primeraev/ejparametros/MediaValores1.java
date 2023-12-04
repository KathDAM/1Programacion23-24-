package ejparametros;
//Catherine AM

import java.util.Scanner;

public class MediaValores1  {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        mediaValores();
        lect.close();
    }

    public static void mediaValores( ){
        System.out.println("¿Cuántos valores desea sumar?");
        int valor = lect.nextInt();
        double suma = 0;
   
        for (int i = 0; i < valor; i++) {
            System.out.print("  Escriba el valor " + (i+1)+ ": ");
            double valoresintro = lect.nextDouble();
            suma += valoresintro;
            System.out.println("    La suma actual es " + suma);
        }
    
        double mediavalores = suma / valor ;
        System.out.println("La media de los " + valor+ " valores introducidos es " + mediavalores );
        
    }
}
