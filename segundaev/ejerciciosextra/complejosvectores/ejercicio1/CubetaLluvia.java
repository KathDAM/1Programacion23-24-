package segundaev.ejerciciosextra.complejosvectores.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class CubetaLluvia {
    static Scanner lect = new Scanner(System.in);
    static int dias;
    static int[] lluviaDia = new int[15];
    static int lluviaAcumulada = 0;
    static int capacidadCubeta;
    public static void main(String[] args) {
        System.out.println("Escriba la capacidad de la cubeta, en litros ");
        capacidadCubeta = lect.nextInt();
       
        simularLlenadoCubeta();
        mostrarResultado(); 
    }

    private static void simularLlenadoCubeta(){
        for (int i = 0; i < lluviaDia.length; i++) {
            lluviaDia[i] = generacionLluvia(); 
            lluviaAcumulada += lluviaDia[i]; 
            
            System.out.println("Día=" + (i + 1) + " Lluvia=" + lluviaDia[i]+ " Capacidad=" + capacidadCubeta);

            if (lluviaAcumulada >= capacidadCubeta) {
                System.out.println("Fin de la simulación del llenado de la cubeta en " + (i + 1) + " días.");
                break;
            }
            capacidadCubeta = capacidadCubeta - lluviaDia[i];
        } 
        
        if (lluviaAcumulada < capacidadCubeta) {
            System.out.println("Fin de la simulación del llenado de la cubeta, no se llenó en 15 días.");
        }
    }

    private static void mostrarResultado(){
        System.out.println(" * Lluvia acumulada=" + lluviaAcumulada + " y Capacidad Remanente=" + capacidadCubeta);
        //        System.out.println("Día=" + (dia + 1) + " Lluvia=" + lluviaDia[dia] + " Acumulado=" + lluviaAcumulada + " Capacidad Remanente=" + capacidadCubeta + " litros");
    }


    public static int generacionLluvia(){
        Random random = new Random();
        return random.nextInt(21);
    }
}


