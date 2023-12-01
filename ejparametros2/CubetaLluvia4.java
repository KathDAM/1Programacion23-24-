package ejparametros2;
   
import java.util.Scanner;

public class CubetaLluvia4 {
    static Scanner lect = new Scanner(System.in);
    private static int numDias;
    private static long capacidad;
    public static void main(String[] args) {
        System.out.println("Escribe la capacidad de la cubeta, en litros: ");
        capacidad = lect.nextLong();

        capacidadLluvia();
        System.out.println("Fin de la simulación del llenado de la cubeta en " + numDias + " días");

        lect.close();
    }

    private static void capacidadLluvia() {
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


