//Catherine AM
package Ejercicios2.Condicionales;

import java.util.Scanner;

public class Ej8 {
     public static void main(String[] args) {
        Scanner lect =  new Scanner(System.in);
        System.out.println("Dime la fecha actual ");
        System.out.println("Dame el dia: ");
        int diaa = lect.nextInt();
        System.out.println("Dame el mes: ");
        int mesa = lect.nextInt();
        System.out.println("Dame el año: ");
        int anoa = lect.nextInt();

        System.out.println("Dime la fecha de tu nacimiento: ");
        System.out.println("Dame el dia: ");
        int dian = lect.nextInt();
        System.out.println("Dame el mes: ");
        int mesn = lect.nextInt();
        System.out.println("Dame el año: ");
        int anon = lect.nextInt();

        int ano = anoa - anon;
      
        // Verificar si aún no ha cumplido años este año
        if (mesa < mesn || (mesa == mesn && diaa < dian)) {
            ano--;
        }

        System.out.println("Tienes actualmente " + ano + "." );

        lect.close();
    }

}
