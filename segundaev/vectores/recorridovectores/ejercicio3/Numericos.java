package segundaev.vectores.recorridovectores.ejercicio3;

import segundaev.vectores.utilidades.Utilidades;

public class Numericos {
    public static void main(String[] args) {

        int[] vector = new int[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresInt(vector);
        visualizacionCuatro(vector);

    }

    public static void visualizacionCuatro(int[] vector4){
        System.out.println("Valores en 4 posiciones : ");
        for (int i = 0; i < vector4.length; i++) {
            if (i % 4 == 0) {
                System.out.println(" ");
            }
            System.out.print("[ " + vector4[i] + " ]");
        }
    }
    

}
