package segundaev.ejerciciosextra.vectoresobjetos.ejercicio5;

import java.util.Scanner;

public class TestAppCubeta {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        System.out.println("Ingresa la capacidad de la cubeta:");
        int capacidadCubeta = lect.nextInt();
        System.out.println("Ingresa el número máximo de días de simulación:");
        int maxDiasSimulacion = lect.nextInt();

        SimulacionCubeta cubeta = new SimulacionCubeta(capacidadCubeta, maxDiasSimulacion);
        int totalDias = 0;
        while (cubeta.sePuedeSimularMasDias() && !cubeta.cubetaLlena()) {
            DiaLluvia diaSimulado = cubeta.anyadirDiaSimulacion();
            if (diaSimulado != null) {
                System.out.println("Día= " + diaSimulado.getNumDiaSimulacion() +
                                    " Lluvia= " + diaSimulado.getCantidadLluviaSimulada() +
                                    " Capacidad= " + cubeta.getCapacidadRemanente());
            }
            totalDias++;
        }

        System.out.println("  * Fin de la simulación del llenado de la cubeta en " + totalDias + " dias * ");

        int lluviaAcumulada = 0;
        for (int i = 0; i < cubeta.getNumDiasSimulados(); i++) {
            DiaLluvia dia = cubeta.getSimulacionLluvia(i);
            lluviaAcumulada += dia.getCantidadLluviaSimulada();
            System.out.println("Día= " + dia.getNumDiaSimulacion() + 
                                " Lluvia acumulada= " + lluviaAcumulada + 
                                " Capacidad remanente= " + cubeta.getCapacidadRemanentePorDia(i));
        }

        lect.close();
    }
}
