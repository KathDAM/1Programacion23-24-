/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraev.excepciones.ejercicio2;

import java.util.Scanner;

import terceraev.excepciones.ejercicio2b.Punto;
import terceraev.excepciones.ejercicio2b.Triangulo;

/**
 * Repite el apartado c) del ejercicio 2 sobre triángulos, pero con un triángulo equilátero.
 * @author jsanm
 */
public class TestApp {
    
    public static void main(String[] args) {
        
        Scanner lect = new Scanner(System.in);
        System.out.println("Introduce el punto 1: ");

        System.out.println("Introduce el punto 2: ");

        System.out.println("Introduce el punto 3: ");

        Triangulo tr = new TrianguloEquilatero( new Punto(0, 0), new Punto(4, 3)); 
                //, new Punto(-1, 7)); el tercer punto dejamos que lo calcule el constructor

        System.out.println("El triángulo inicial es");
        System.out.println(tr);
        
        System.out.println("Y su perímetro");
        System.out.println(tr.perimetro());
        
        System.out.print("Indique un desplazamiento en el eje de coordenadas horizontal: ");
        float despX = lect.nextFloat();
        lect.nextLine();
        
        System.out.print("Indique un desplazamiento en el eje de coordenadas vertical: ");
        float despY = lect.nextFloat();
        lect.nextLine();
        
        tr.trasladar(despX, despY);
        System.out.println("Triángulo tras el traslado");        
        System.out.println(tr);
        
        System.out.print("Indique ahora un factor de escala para el triangulo: ");
        double factorEscalar = lect.nextDouble();
        
        tr.escalar(factorEscalar);
        System.out.println("Triángulo tras el escalado");        
        System.out.println(tr);
       
    }
}
