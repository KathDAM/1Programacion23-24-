package ejparametros2;

import java.util.Scanner;

public class CubetaLluvia6 {
    static Scanner lect = new Scanner(System.in);
    private static long capacidad;
    private static  int numDias;
    public static void main(String[] args) {

    System.out.println("Escribe la capacidad de la cubeta, en litros: ");
    long capacidad = lect.nextLong();

    int dias = capacidadLluvia();
    System.out.println("Fin de la simulación del llenado de la cubeta en " + cubeta.getNumDias() + " días");

    lect.close();
}

    //FUNCIONES
    private static long capacidadLluvia() {
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
        numDias = numDiasTranscurridos;
    }
}




}
