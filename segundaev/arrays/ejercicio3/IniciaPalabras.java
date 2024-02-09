package segundaev.arrays.ejercicio3;

import java.util.Arrays;

public class IniciaPalabras {
    public static void main(String[] args) {
        String [] palabras = {"Hermano" ,"Cariño", "vida", "tia"};
        String [] copia = palabras.clone();
        
        System.out.println(Arrays.toString(copia));
    }
}
