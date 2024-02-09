package segundaev.arrays.ejercicio4;

import java.util.Arrays;

public class OrdenarReales {
    public static void main(String[] args) {
        float [] numreales = {1 , -10.8F, 8, 4, 9};
        float [] copia = numreales.clone();

        Arrays.sort(copia);
        
        System.out.println(Arrays.toString(copia));
    }
}
