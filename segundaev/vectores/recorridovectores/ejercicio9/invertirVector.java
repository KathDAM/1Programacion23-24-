package segundaev.vectores.recorridovectores.ejercicio9;

import segundaev.vectores.utilidades.Utilidades;

public class invertirVector {
    public static void main(String[] args) {

        String[] vector = new String[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresString(vector);
        System.out.println("Vector introducido: ");
        Utilidades.mostrarVectorString(vector);
        System.out.println("Vector invertido: ");
        Utilidades.invertirVectorString(vector);

    }
}

