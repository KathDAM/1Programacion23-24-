package Ejemplo;
import java.util.Scanner;

class Adivinanza {
    public static void main (String args[]) {
        
        Scanner tcl = new Scanner(System.in);
        int valor;

        System.out.println("Piensa un numero");
        tcl.nextLine();
        System.out.println("Multiplicalo por 5");
        tcl.nextLine();
        System.out.println("Sumale 6"); 
        tcl.nextLine();
        System.out.println("Multiplıcalo por 4");
        tcl.nextLine();
        System.out.println("Sumale 9");
        tcl.nextLine();
        System.out.println("Multiplıcalo por 5");
        tcl.nextLine();
        System.out.println("Escribe el resultado");
        valor=tcl.nextInt();
        System.out.println("El numero que habıas pensado es: ");
        System.out.println((valor-165)/100);
        
        tcl.close();
    }
}