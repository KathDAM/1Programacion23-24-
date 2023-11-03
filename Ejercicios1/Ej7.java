//Catherine AM
package Ejercicios1;

public class Ej7 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Ej7 - Intereses banco");
        System.out.println("****************************************");
        double din = 2000;
        double pfijoanual = (din * 2.75)/100;
        double pfijomed = pfijoanual /2;
        double reten = (pfijomed * 18)/100 ;

        System.out.println("El total que tendra de intereses después de 6 meses son " + pfijomed );
        
    }
}
