package segundaev.vectores.recorridovectores.ejercicio11;

import java.util.Scanner;

public class vectorEquilibrado {
     static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array: ");
        int tamaño = lect.nextInt();
        lect.nextLine(); //Vaciar buffer

        int[] vector = new int[tamaño];

        introducirValoresVector(vector);
        vectorEsEquilibrado(vector);
     
        lect.close();
    }

    public static void introducirValoresVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i) + ":  "); 
            vector[i] = lect.nextInt();
        }
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




/*
        if (vector.length % 2 == 0) {
            for (int i = 0; i < mitad; i++) {
                contenprimeramitad += vector[i];
            }

            for (int i = mitad; i < vector.length; i++) {
                contensegundamitad += vector[i];
            }
        }else{
            for (int i = 0; i < mitad; i++) {
                contenprimeramitad += vector[i];
            }

            for (int i = mitad + 1; i < vector.length ; i++) {
                contensegundamitad += vector[i];
            }
        }

        if (contenprimeramitad == contensegundamitad) {
            System.out.println("El vector esta equilibrado");
        } else {
            System.out.println("El vector no esta equilibrado");
        }
    }
     */