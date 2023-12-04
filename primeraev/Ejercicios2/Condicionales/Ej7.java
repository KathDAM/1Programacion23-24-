//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {

        Scanner lect =  new Scanner(System.in);

        System.out.println("Cuota a pagar del club de golf, dime tu edad:");
        int edad = lect.nextInt();
        
        double cuota = 500;

        if (edad >= 0 && edad < 18) {
            System.out.println("Los padres son socios? (Si/No) :");
            String socios = lect.next();

            if (socios.equalsIgnoreCase("No")) {
                double pagar18 = cuota - (cuota*25)/100;
                System.out.println("Tu cuota a pagar es de " + pagar18);
            } else {
                double pagars18 = cuota - (cuota*35)/100;
                System.out.println("Tu cuota a pagar es de " + pagars18);
            }
        }else if (edad > 65 ) {
            double pagar65 = cuota - (cuota*50)/100;
            System.out.println("Tu cuota a pagar es de " + pagar65);
        } else {
            System.out.println("Tu cuota a pagar es de " + cuota);
        }

        lect.close();
    }
}
