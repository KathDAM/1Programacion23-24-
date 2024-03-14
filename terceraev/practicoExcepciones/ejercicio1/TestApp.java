/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 * Programa una aplicación que cree un examen en base a lo datos suministrados por el usuario, 
 * lo muestre por pantalla y le solicite un cambio de día y de hora. 
 * 
 * Tras el cambio de hora, se volverá a mostrar la información del examen por pantalla.
 * @author jsanm
 */
public class TestApp {
    public static void main(String[] args) throws MiExcepcion {
        
        Scanner scn = new Scanner(System.in);
        
        boolean datosCorrectos = false;

        while (!datosCorrectos) {
            try {
                System.out.print("De qué asignatura es el examen? ");
                String asignatura = scn.next();
                System.out.print("En qué aula se realizará el examen? ");
                int aulaExamen = scn.nextInt();
                System.out.println("Escriba el día, mes y año como valores numéricos");
                int diaExamen = scn.nextInt();
                int mesExamen = scn.nextInt();
                int anyoExamen = scn.nextInt();
                System.out.println("Finalmente, la hora y los minutos de inicio");
                int horaExamen = scn.nextInt();
                int minutosExamen = scn.nextInt();

                Fecha fExamen = new Fecha(diaExamen, mesExamen, anyoExamen);
                Hora hExamen = new Hora(horaExamen, minutosExamen);
                
                Examen ex = new Examen(asignatura, aulaExamen, fExamen, hExamen);

                System.out.println("Datos del examen");
                System.out.println("*****************************");
                System.out.println(ex);
                System.out.println("*****************************");

                datosCorrectos = true; // Si llegamos aquí sin lanzar excepciones, establecemos datosCorrectos a true
            } catch (MiExcepcion e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Por favor, inténtalo de nuevo.");
                scn.nextLine(); // Limpiamos el buffer del teclado
            }
        }

        scn.close();
    }
}
