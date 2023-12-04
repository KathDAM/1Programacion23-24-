//Catherine AM
package Ejercicios1;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {

        System.out.println("Ej17 - Tiempo");
        System.out.println("****************************************");
        System.out.println( "");
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese los segundos: ");
        int seg = lector.nextInt();

        int segu = seg % 60;
        int min = seg / 60;
        int hora = seg / 3600;
        int dias = seg / 86400;

        System.out.println("Días: " + dias);
        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + min);
        System.out.println("Segundos: " + segu);
        lector.close();
    
        System.out.println( "");
    }
}