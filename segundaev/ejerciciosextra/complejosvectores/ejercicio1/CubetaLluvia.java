package segundaev.ejerciciosextra.complejosvectores.ejercicio1;

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
       
        capacidadCubeta(capacidadCubeta);
        
    }

    private static void capacidadCubeta(int litros){
        for (int i = 0; i < lluviaDia.length; i++) {
            lluviaDia[i] = generacionLluvia(); 
            lluviaAcumulada += lluviaDia[i]; 
            
            System.out.println("Día=" + (dias + 1) + " Lluvia=" + lluviaDia + " Capacidad=" + capacidadCubeta + " Lluvia acumulada=" + lluviaAcumulada);

            if (lluviaAcumulada >= capacidadCubeta) {
                System.out.println("La cubeta se ha llenado en " + (i + 1) + " días.");
                break;
            }
        } 
        
        if (lluviaAcumulada < capacidadCubeta) {
            System.out.println("La cubeta no se llenó en 15 días.");
        }
       /* int capacidad = litros;
        dias = 0; 

        while (dias < 15 && capacidad > 0 ) {
            int lluvia = generacionLluvia();
            System.out.println("Día=" + (dias + 1) + " Lluvia=" + lluvia + " Capacidad=" + capacidad + " Lluvia acumulada=" + lluviaAcumulada);
            
            capacidad = lluvia - capacidad;

            if (capacidad < 0) {
                System.out.println("Fin de la simulación del llenado de la cubeta en " + dias + " días");
            }
            lluviaAcumulada[dias] = lluvia + lluviaAcumulada;
            
        }
         */
    }

    public static int generacionLluvia(){
        return (int) Math.random() * 21;
    }

}


