//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej6 {
       public static void main(String[] args) {
        Scanner lect =  new Scanner(System.in);
        System.out.println("Dime una cantidad de dinero en euros");
        double euros = lect.nextDouble();

        // Convertir euros a centavos (1 euro = 100 centavos)
        int cent = (int) (euros * 100);

        int euros2 = cent / 200;
        cent -= euros2 * 200; //tambien puede usarse cent %= 200;

        int euros1 = cent / 100;
        cent -= euros1 * 100;

        int cent50 = cent / 50;
        cent -= cent50 * 50;

        int cent20 = cent / 20;
        cent -= cent20 * 20;

        int cent10 = cent / 10;
        cent -= cent10 * 10;

        int cent5 = cent / 5;
        cent -= cent5 * 5;

        int cent2 = cent / 2;
        cent -= cent2 * 2;

        int cent1 = cent;

        System.out.println("Monedas de 2 euros: " + euros2);
        System.out.println("Monedas de 1 euro: " + euros1);
        System.out.println("Monedas de 50 centavos: " + cent50);
        System.out.println("Monedas de 20 centavos: " + cent20);
        System.out.println("Monedas de 10 centavos: " + cent10);
        System.out.println("Monedas de 5 centavos: " + cent5);
        System.out.println("Monedas de 2 centavos: " + cent2);
        System.out.println("Monedas de 1 centavo: " + cent1);
        
        lect.close();
    }

}
