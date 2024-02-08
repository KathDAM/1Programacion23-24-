// Catherine AM
package segundaev.vectores.recorridovectores.ejercicio11;

import segundaev.vectores.utilidades.Utilidades;

public class vectorEquilibrado {
    public static void main(String[] args) {
   
        int[] vector = new int[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresInt(vector);
        vectorEsEquilibrado(vector);
     
    }

    public static void vectorEsEquilibrado(int[] vector){
        int contenprimeramitad = 0;
        int contensegundamitad = 0; 
        int mitad = vector.length / 2;

        for (int i = 0; i < mitad; i++) {
            contenprimeramitad += vector[i];
        }

        for (int i = vector.length - mitad; i < vector.length ; i++) {
            contensegundamitad += vector[i];
        }
    
        if (contenprimeramitad == contensegundamitad) {
            System.out.println("El vector esta equilibrado");
        } else {
            System.out.println("El vector no esta equilibrado");
        }
    }
}

