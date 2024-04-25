package terceraev.manipulacionFicheros.ej4;

import java.io.*;
import java.util.Scanner;

import terceraev.manipulacionFicheros.Utilidades;

public class FicheroNif {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Introduce el número A: ");
        int A = Integer.parseInt(lect.next());

        System.out.println("Introduce el número B: ");
        int B = Integer.parseInt(lect.next());
        lect.nextLine();

        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = lect.nextLine();

        try {
            ficheroNif(A,B, nombreFichero);
            System.out.println("Se han generado los NIFs correctamente");
        } catch (Exception e) {
           System.out.println("Error al generar los NIFs");
        }
        finally{
            lect.close();
        } 
    }

    public static void ficheroNif(int a, int b, String nombre) throws IOException{
        BufferedWriter escrito = null;

        try {
            escrito = new BufferedWriter(new FileWriter(nombre));
            
            for (int i = a; i <= b; i++) {
                escrito.write(generarNif(i)); 
                escrito.newLine();
            } 
            System.out.println("Archivo generado correctamente.");

        } catch(IOException e){
            System.out.println("Error de escritura del fichero ");
        } 
        finally {
            Utilidades.cerrarRecursos(escrito);
        }
    }

    public static String generarNif(int num) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int division = num % 23;
        return String.format("%08d",num) + letra.charAt(division);
    }
}
