package ejparametros2;

import java.util.Scanner;

public class CubetaLluvia2 {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Escribe la capacidad de la cubeta, en litros: ");
        long capacida = lect.nextLong();

        capacidadLlluvia(capacida);
        lect.close();
    }
       
    private static void capacidadLlluvia(long capacidad){
        int numDiasTranscurridos = 0;
        long lluviaDiaria;

        while (capacidad > 0) {
            numDiasTranscurridos++;
            lluviaDiaria = Math.round(Math.random() * 20.0);

            if (lluviaDiaria < capacidad) {
                capacidad -= lluviaDiaria;
            } else {
                capacidad = 0;
            }
            System.out.println("Día= " + numDiasTranscurridos + " Lluvia= " + lluviaDiaria + " Capacidad= " + capacidad);
        }

        System.out.println("Fin de la simulación del llenado de la cubeta en " + numDiasTranscurridos + " días");
    }
}

