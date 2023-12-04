package ejparametros2;

import java.util.Scanner;

public class CubetaLluvia5 {
    public static void main(String[] args) {

    System.out.println("Escribe la capacidad de la cubeta, en litros: ");
    long capacidad = lect.nextLong();

    CubetaLluvia5 cubeta = new CubetaLluvia5(capacidad);

    cubeta.capacidadLluvia();
    System.out.println("Fin de la simulación del llenado de la cubeta en " + cubeta.getNumDias() + " días");

    lect.close();
}

    //ATRIBUTOS
    static Scanner lect = new Scanner(System.in);
    private long capacidad;
    private int numDias;

    //CONSTRUCTOR
    public CubetaLluvia5(long capacidad) {
        this.capacidad = capacidad;
    }

    //GET
    public long getCapacidad() {
        return capacidad;
    }

    public int getNumDias() {
        return numDias;
    }

    //SET
    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    //FUNCIONES
    private void capacidadLluvia() {
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



