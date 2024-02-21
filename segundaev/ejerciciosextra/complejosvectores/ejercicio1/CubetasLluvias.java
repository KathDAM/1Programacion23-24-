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

    private static void imprimirResultadoCubeta(int[] cubeta, int capacidadCubeta) {
        for (int i = 0; i < cubeta.length; i++) {
            if (capacidadCubeta > 0) {
                capacidadCubeta -= cubeta[i];
                System.out.println("Día=" + (i + 1) + " Lluvia=" + cubeta[i] + " Capacidad=" + capacidadCubeta); 
            }else{
                System.out.println("  * Fin de la simulación del llenado de la cubeta en " + cubeta.length + " días * ");
            }
        }

        System.out.println("  * Fin de la simulación del llenado de la cubeta en " + cubeta.length + " días * ");
        
    }

    private static void imprimirResultadoCubetaRemanente(int[] cubeta, int capacidadCubeta) {
        int lluviaAcumulada = 0;
        for (int i = 0; i < cubeta.length; i++) {
            lluviaAcumulada += cubeta[i];
            capacidadCubeta -= cubeta[i];
            System.out.println("Día=" + (i + 1) + " Lluvia Acumulado=" + lluviaAcumulada + " Capacidad Remanente=" + capacidadCubeta + " litros");
        
        }
    }

    public static int generacionLluvia(){
        Random random = new Random();
        return random.nextInt(21);
    }
}
