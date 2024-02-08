package segundaev.vectores.recorridovectores.ejercicio5;

import segundaev.vectores.utilidades.Utilidades;

public class SumaVectores {

    public static void main(String[] args) {

        int[] vector = new int[Utilidades.tamañoVectorInt()];

        Utilidades.introducirValoresInt(vector);

        imparesVector(vector);
        paresVector(vector);

    }

    public static void imparesVector(int[] vectorimpar){
        int suma = 0;
        System.out.println("Valores en posiciones impares: ");
        for (int i = 1; i < vectorimpar.length; i+=2) {
            System.out.print("[ " + vectorimpar[i] + " ]");
            suma += vectorimpar[i];
        }
        System.out.println(" - La suma de impares es " + suma);
    }

    public static void paresVector(int[] vectorpar){
        int suma = 0;
        System.out.println("Valores en posiciones pares: ");
        for (int i = 0; i < vectorpar.length; i+=2) {
            System.out.print("[ " + vectorpar[i] + " ]");
            suma += vectorpar[i];
        }
        System.out.println(" - La suma de pares es " + suma);
    }
}

