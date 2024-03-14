/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraev.excepciones.ejercicio3;

import java.util.Scanner;

/**
 * Repite el apartado c) del ejercicio 2 sobre triángulos, pero con un triángulo equilátero.
 * @author jsanm
 */
public class TestApp {
    
    public static void main(String[] args) {
        
        Scanner lect = new Scanner(System.in);
        TrianguloEquilatero tr = null;

        while (true) {
            System.out.println("Introduce el punto 1: ");
            System.out.print("x: ");
            float x1 = lect.nextFloat();
            System.out.print("y: ");
            float y1 = lect.nextFloat();
            Punto punto1 = new Punto(x1, y1);

            System.out.println("Introduce el punto 2: ");
            System.out.print("x: ");
            float x2 = lect.nextFloat();
            System.out.print("y: ");
            float y2 = lect.nextFloat();
            Punto punto2 = new Punto(x2, y2);

            System.out.println("Introduce el punto 2: ");
            System.out.print("x: ");
            float x3 = lect.nextFloat();
            System.out.print("y: ");
            float y3 = lect.nextFloat();
            Punto punto3 = new Punto(x3, y3);

            try {
                tr = new TrianguloEquilatero(punto1, punto2,punto3); 
                //, new Punto(-1, 7)); el tercer punto dejamos que lo calcule el constructor
                break;
            } catch (Exception e) {
                System.out.println("Error al crear el triángulo: " + e.getMessage());
                System.out.println("Por favor, inténtalo de nuevo.");
                lect.nextLine(); 
            }
        }

        System.out.println("El triángulo inicial es");
        System.out.println(tr);
        
        System.out.println("Y su perímetro");
        System.out.println(tr.perimetro());
       
        lect.close();
    }
}
