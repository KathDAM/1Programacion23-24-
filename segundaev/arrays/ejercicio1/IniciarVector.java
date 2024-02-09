package segundaev.arrays.ejercicio1;

import java.util.Arrays;

public class IniciarVector {
    public static void main(String[] args) {
        int [] enteros = {1 , 2, 8, 0, 9};
        char [] caracteres = {'1' , '+', '-' , 'p'};

        Arrays.sort(enteros);
        Arrays.sort(caracteres);

        System.out.println(Arrays.toString(enteros));
        System.out.println(Arrays.toString(caracteres));
    }
}
