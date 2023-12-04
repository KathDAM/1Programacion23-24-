//Catherine AM
package Ejercicios1;

public class Ej13 {
    public static void main(String[] args) {
        System.out.println("Ej13 - Intereses banco");
        System.out.println("****************************************");
        double din = 2000; //dinero actual
        double pfijoanual = (din * 2.75)/100; //dinero de plazafijo anual con intereses
        double pfijomed = pfijoanual /2; //dinero de plazafijo de 6 meses con intereses
        double reten = (pfijomed * 18)/100 ; //retenciones que quita hacienda sobre el plazomedio

        System.out.println(" Dinero actual - " + din);
        System.out.println(" Intereses despues de 6 meses - " + pfijomed);
        System.out.println(" Retenciones de hacienda - " + reten);
        System.out.println("****************************************");
        System.out.println("El total que tendra después de 6 meses son " + (din+pfijomed - reten));
        System.out.println(" ");
    }
}
