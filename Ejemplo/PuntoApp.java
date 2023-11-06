package Ejemplo;

import java.util.Scanner;

public class PuntoApp {
    public static void main(String[] args) {
    int coorX, coorY;
    Punto punto1;
    punto1 = new Punto();
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese coordenada x :");
    coorX = teclado.nextInt();
    System.out.println("Ingrese coordenada y :");
    coorY = teclado.nextInt();
    punto1.setCoordenadas(coorX, coorY);

    System.out.println("Hablamos del punto (" + punto1.getCoordenadaX() + " , " + punto1.getCoordenadaY() + " )");
    punto1.imprimirCuadrante();

    teclado.close();
    }
}
