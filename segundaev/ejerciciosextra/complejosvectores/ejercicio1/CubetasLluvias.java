package segundaev.ejerciciosextra.complejosvectores.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class CubetasLluvias {
    static Scanner lect = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escriba la capacidad de la cubeta, en litros ");
        int capacidadCubeta = lect.nextInt();

        int[] listaSimuladaDias = simuladorCubeta(capacidadCubeta);

        imprimirResultadoCubeta(listaSimuladaDias,capacidadCubeta);
        imprimirResultadoCubetaRemanente(listaSimuladaDias,capacidadCubeta);
    }

    private static int[] simuladorCubeta(int capacidadCubeta) {
        int dias = 0;
        int lluviaAcumulada = 0;
        int [] simulacionLluvia = new int[15]; 
        while (dias < 15 && lluviaAcumulada < capacidadCubeta) {
            int lluviaDia = generacionLluvia();
            simulacionLluvia[dias] = lluviaDia;
            lluviaAcumulada += lluviaDia;
            dias++;
        }
        return simulacionLluvia;
    }

    private static void imprimirResultadoCubeta(int[] cubeta, int capacidadCubeta) {
        int dias = 0;
        int []simulacionLluvia = new int[15]; 
        for (int i = 0; i < dias; i++) {
            capacidadCubeta -= simulacionLluvia[i];
            System.out.println("Día=" + (i + 1) + " Lluvia=" + simulacionLluvia[i]+ " Capacidad=" + capacidadCubeta); 
        }

        System.out.println("  * Fin de la simulación del llenado de la cubeta en " + (dias) + " días * ");
        
    }

    private static void imprimirResultadoCubetaRemanente(int[] cubeta, int capacidadCubeta) {
        int lluviaAcumulada = 0;
        int dias = 0;
        int []simulacionLluvia = new int[15]; 
        for (int i = 0; i < dias; i++) {
            capacidadCubeta -= simulacionLluvia[i];
            System.out.println("Día=" + (i + 1) + " Lluvia Acumulado=" + lluviaAcumulada + " Capacidad Remanente=" + capacidadCubeta + " litros");
            lluviaAcumulada = lluviaAcumulada + simulacionLluvia[i];
        }
    }

    public static int generacionLluvia(){
        Random random = new Random();
        return random.nextInt(21);
    }
}
