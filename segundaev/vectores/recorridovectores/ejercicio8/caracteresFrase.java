package segundaev.vectores.recorridovectores.ejercicio8;

import java.util.Scanner;

public class caracteresFrase {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase = lect.nextLine();
        
        introducirFraseVector(frase.toCharArray());
     
        lect.close();
    }
    public static void introducirFraseVector(char[] frase){
        for (int i = 0; i < frase.length; i++) {
            System.out.println("Elemento " + (i) + ":  " + frase[i] + " "); 
        }
    }
}
