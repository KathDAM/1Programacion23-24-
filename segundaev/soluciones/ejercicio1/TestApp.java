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
    
    //figuras hardcode, una por tipo, para comparar condicionadamente según elección del usuario
    private final static Figura CIRCULO = new Circulo(Color.MARRON, 3.0);
    private final static Figura CUADRADO = new Cuadrado(Color.MARRON, 3.0);
    private final static Figura OVALO = new Ovalo(Color.MARRON, 3.0, 2.0);
    private final static Figura RECTANGULO = new Rectangulo(Color.MARRON, 3.0, 2.0);
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Qué desea introducir? (C)irculo, (R)ectangulo, Cua(d)rado, (O)valo");
        String eleccion = scn.nextLine();
        if(!eleccionValida(eleccion)){
            System.out.print("Decisión incorrecta. ");
            return;
        }
        
        System.out.println("Indique el color: NEGRO, BLANCO, ROJO, AZUL, AMARILLO, VERDE, NARANJA, MARRON, ROSA, VIOLETA, MAGENTA");
        Color c = Color.fromString(scn.nextLine());
        
        
        
        Figura figuraUsuario=null, figuraSistema = null;
        if("c".equalsIgnoreCase(eleccion)){
            System.out.println("Indique el radio del círculo");
            double radio = Double.parseDouble(scn.nextLine());
            figuraUsuario = new Circulo(c, radio);     
            figuraSistema = CIRCULO;
        }
        else if("r".equalsIgnoreCase(eleccion)){
            System.out.println("Indique la base y la altura en dos líneas");
            double base = Double.parseDouble(scn.nextLine());
            double altura = Double.parseDouble(scn.nextLine());
            figuraUsuario = new Rectangulo(c, base, altura);
            figuraSistema = RECTANGULO;
        }
        else if("d".equalsIgnoreCase(eleccion)){
            System.out.println("Indique la longitud del lado");
            double lado = Double.parseDouble(scn.nextLine());
            figuraUsuario = new Cuadrado(c, lado);
            figuraSistema = CUADRADO;
        }
        else if("o".equalsIgnoreCase(eleccion)){
            System.out.println("Indique los radios menor y mayor del óvalo en dos líneas");
            double radioMenor = Double.parseDouble(scn.nextLine());
            double radioMayor = Double.parseDouble(scn.nextLine());
            figuraUsuario = new Ovalo(c, radioMenor, radioMayor);
            figuraSistema = OVALO;
        }
        
        System.out.printf("El %s tiene un perímetro de %.2f y un área de %.2f\n", figuraUsuario.getNombreFigura(), figuraUsuario.calcularPerimetro(), figuraUsuario.calcularArea());
        System.out.println("toString: \n\t" + figuraUsuario);

        if(figuraUsuario.equals(figuraSistema))
            System.out.println("El objeto introducido es igual a este objeto: " + figuraSistema);
        else
            System.out.println("El objeto introducido NO es igual a este objeto: " + figuraSistema);
                    
        System.out.println("FIN.");
    }

    private static boolean eleccionValida(String eleccion) {
        //válidas: (C)irculo, (R)ectangulo, Cua(d)rado, (O)valo
        if(!"c".equalsIgnoreCase(eleccion) && !"r".equalsIgnoreCase(eleccion) && !"d".equalsIgnoreCase(eleccion) && !"o".equalsIgnoreCase(eleccion))
            return false;
        return true;
    }
}
