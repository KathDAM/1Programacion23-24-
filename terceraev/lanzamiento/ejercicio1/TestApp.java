/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jsanm
 */
public class TestApp {

    // figuras hardcode, una por tipo, para comparar condicionadamente según
    // elección del usuario
    private final static Figura CIRCULO = new Circulo(Color.MARRON, 3.0);
    private final static Figura CUADRADO = new Cuadrado(Color.MARRON, 3.0);
    private final static Figura OVALO = new Ovalo(Color.MARRON, 3.0, 2.0);
    private final static Figura RECTANGULO = new Rectangulo(Color.MARRON, 3.0, 2.0);

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String eleccion = "";
        boolean entradaValida = false;

        /* CAMBIOS EN MAIN, Y EN METODO ELECCION VALIDA(try catch) */
        do {
            try {
                System.out.println("Qué desea introducir? (C)irculo, (R)ectangulo, Cua(d)rado, (O)valo");
                eleccion = scn.nextLine();
                eleccionValida(eleccion);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!entradaValida);

        System.out.println("Indique el color: NEGRO, BLANCO, ROJO, AZUL, AMARILLO, VERDE, NARANJA, MARRON, ROSA, VIOLETA, MAGENTA");
        Color c = Color.fromString(scn.nextLine());

        Figura figuraUsuario = null, figuraSistema = null;
        try {
            if ("c".equalsIgnoreCase(eleccion)) {
                do {
                    try {
                        System.out.println("Indique el radio del círculo");
                        double radio = Double.parseDouble(scn.nextLine());
                        figuraUsuario = new Circulo(c, radio);
                        figuraSistema = CIRCULO;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } while (figuraUsuario == null);
            } else if ("r".equalsIgnoreCase(eleccion)) {
                do {
                    try {
                        System.out.println("Indique la base y la altura en dos líneas");
                        double base = Double.parseDouble(scn.nextLine());
                        double altura = Double.parseDouble(scn.nextLine());
                        figuraUsuario = new Rectangulo(c, base, altura);
                        figuraSistema = RECTANGULO;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } while (figuraUsuario == null);
            } else if ("d".equalsIgnoreCase(eleccion)) {
                do {
                    try {
                        System.out.println("Indique la longitud del lado");
                        double lado = Double.parseDouble(scn.nextLine());
                        figuraUsuario = new Cuadrado(c, lado);
                        figuraSistema = CUADRADO;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } while (figuraUsuario == null);
            } else if ("o".equalsIgnoreCase(eleccion)) {
                do {
                    try {
                        System.out.println("Indique los radios menor y mayor del óvalo en dos líneas");
                        double radioMenor = Double.parseDouble(scn.nextLine());
                        double radioMayor = Double.parseDouble(scn.nextLine());
                        figuraUsuario = new Ovalo(c, radioMenor, radioMayor);
                        figuraSistema = OVALO;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } while (figuraUsuario == null);
            }
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.printf("El %s tiene un perímetro de %.2f y un área de %.2f\n", figuraUsuario.getNombreFigura(),
                figuraUsuario.calcularPerimetro(), figuraUsuario.calcularArea());
        System.out.println("toString: \n\t" + figuraUsuario);

        if (figuraUsuario.equals(figuraSistema)) {
            System.out.println("El objeto introducido es igual a este objeto: " + figuraSistema);
        } else {
            System.out.println("El objeto introducido NO es igual a este objeto: " + figuraSistema);
        }
        System.out.println("FIN.");

        scn.close();
    }

    private static void eleccionValida(String eleccion) throws Exception {
        // válidas: (C)irculo, (R)ectangulo, Cua(d)rado, (O)valo
        if (!("c".equalsIgnoreCase(eleccion) || "r".equalsIgnoreCase(eleccion) || "d".equalsIgnoreCase(eleccion)
                || "o".equalsIgnoreCase(eleccion))) {
            throw new Exception("Eleccion inválida (tiene que ser 'c','r','d' o 'o'):");
        }

    }
}
