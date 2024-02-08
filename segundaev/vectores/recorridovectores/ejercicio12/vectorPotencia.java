package segundaev.vectores.recorridovectores.ejercicio12;

import java.util.Scanner;

public class vectorPotencia {
     static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce la base: ");
        double base = lect.nextDouble();
        
        System.out.println("Introduce el exponente: ");
        int exponente = lect.nextInt();

        double[] potencias = calcularPotencia(base,exponente);

        System.out.println("Las potencias de " + base + " hasta " + exponente + " son:");
        for (int i = 0; i <= exponente; i++) {
            System.out.println(base + " ^ " + i + " = " + potencias[i]);
        }
        
        lect.close();
    }

    public static double[] calcularPotencia(double base, int exponente){
        double[] potencias = new double[exponente + 1];
        
        for (int i = 0; i <= exponente; i++) {
            potencias[i] = Math.pow(base, i);
        }
        return potencias;
    }
}
