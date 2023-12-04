//Catherine AM
package Ejercicios1;

public class Ej8 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Ej8 - Intereses banco");
        System.out.println("****************************************");
        double din = 2000;
        double pfijoanual = (din * 2.75)/100;
        double pfijomed = pfijoanual /2;
        double reten = (pfijomed * 18)/100 ;

        System.out.println("* Dinero actual - " + din);
        System.out.println("* Intereses despues de 6 meses - " + pfijomed);
        System.out.println("* Retenciones de hacienda - " + reten);
        System.out.println("****************************************");
        System.out.println("El total que tendra después de 6 meses son " + (din+pfijomed - reten));
       
    } 
}
