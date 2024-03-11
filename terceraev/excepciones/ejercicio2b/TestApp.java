/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraev.excepciones.ejercicio2b;
import java.util.Scanner;

/**
 * Escribe una aplicación en la que: 
 * 
 * a. Se cree un triángulo en (0, 0), (4, 3), (-1, 7). 
 * b. Muestre la información del triángulo por pantalla. 
 * c. Muestre el perímetro del triángulo por pantalla. 
 * d. Solicite al usuario un desplazamiento a realizarle al triángulo. 
 * e. Muestre la información del triángulo por pantalla. 
 * f. Solicite al usuario un escalado a realizarle al triángulo. 
 * g. Muestre la información del triángulo por pantalla. 
 * @author jsanm
 */
public class TestApp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Triangulo tr = new Triangulo( new Punto(0, 0), new Punto(4, 3), new Punto(-1, 7));

        System.out.println("El triángulo inicial es");
        System.out.println(tr);
        
        System.out.println("Y su perímetro");
        System.out.println(tr.perimetro());
        
        System.out.print("Indique un desplazamiento en el eje de coordenadas horizontal: ");
        float despX = input.nextFloat();
        input.nextLine();
        
        System.out.print("Indique un desplazamiento en el eje de coordenadas vertical: ");
        float despY = input.nextFloat();
        input.nextLine();
        
        tr.trasladar(despX, despY);
        System.out.println("Triángulo tras el traslado");        
        System.out.println(tr);
        
        System.out.print("Indique ahora un factor de escala para el triangulo: ");
        double factorEscalar = input.nextDouble();
        
        tr.escalar(factorEscalar);
        System.out.println("Triángulo tras el escalado");        
        System.out.println(tr);
    }
}
