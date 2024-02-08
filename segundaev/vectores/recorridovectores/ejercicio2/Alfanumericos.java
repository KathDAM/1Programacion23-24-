package segundaev.vectores.recorridovectores.ejercicio2;

import segundaev.vectores.utilidades.Utilidades;

public class Alfanumericos {
    public static void main(String[] args) {
     
        String[] vector = new String[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresString(vector);

        System.out.println("Valores en posiciones pares: ");
        for (int i = 0; i < vector.length; i+=2) {
            System.out.print("[ " + vector[i] + " ]");
        }

        System.out.println("Valores en posiciones impares: ");
        for (int i = 1; i < vector.length; i+=2) {
            System.out.print("[ " + vector[i] + " ]");
        }
    
    }
}
