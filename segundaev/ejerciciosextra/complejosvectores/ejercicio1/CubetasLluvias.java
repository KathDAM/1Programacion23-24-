package segundaev.ejerciciosextra.complejosvectores.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class CubetasLluvias {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escriba la capacidad de la cubeta, en litros ");
        int capacidadCubeta = lect.nextInt();

        int[] listaSimuladaDias = simuladorCubeta(capacidadCubeta);

        int dias = imprimirResultadoCubeta(listaSimuladaDias,capacidadCubeta);
        imprimirResultadoCubetaRemanente(listaSimuladaDias,capacidadCubeta,dias);

        lect.close(); 
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

    private static int imprimirResultadoCubeta(int[] cubeta, int capacidadCubeta) {
        int dias = 0;
        for(int i = 0; capacidadCubeta > 0 && i < cubeta.length; i++){
            capacidadCubeta -= cubeta[i];
            if (capacidadCubeta < 0) {
                capacidadCubeta = 0;
            }
            System.out.println("Día=" + (i + 1) + " Lluvia=" + cubeta[i] + " Capacidad=" + capacidadCubeta); 
            dias++;
        }
        System.out.println("  * Fin de la simulación del llenado de la cubeta en " + dias + " días * ");
        return dias;
    }

    private static void imprimirResultadoCubetaRemanente(int[] cubeta, int capacidadCubeta, int dias) {
        int lluviaAcumulada = 0;
        for (int i = 0; i < dias; i++) {
            lluviaAcumulada += cubeta[i];
            capacidadCubeta -= cubeta[i];
            if (capacidadCubeta < 0) {
                capacidadCubeta = 0;
            }
            System.out.println("Día=" + (i + 1) + " Lluvia Acumulado=" + lluviaAcumulada + " Capacidad Remanente=" + capacidadCubeta + " litros");
        }
    }

    public static int generacionLluvia(){
        Random random = new Random();
        return random.nextInt(21);
    }
}
