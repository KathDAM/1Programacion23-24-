package segundaev.arrays.ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaCaracter {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        char [] caracteres = {'1' , '+', '-' , 'p', 'M'};

        System.out.println("Dame un valor de un solo caracter que quieras buscar en el array: ");
        char valor = lect.next().charAt(0);

        Arrays.sort(caracteres);

        int busca = Arrays.binarySearch(caracteres,valor);

        if (busca >= 0) {
            System.out.println("El valor " + valor + " esta en el vector");
        } else {
            System.out.println("El valor " + valor + " NO esta en el vector");
        }

        lect.close();
    }
}
