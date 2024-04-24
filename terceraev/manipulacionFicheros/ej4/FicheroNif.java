package terceraev.manipulacionFicheros.ej4;

import java.io.*;
import java.util.Scanner;

public class FicheroNif {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Introduce el número A: ");
        int A = lect.nextInt();

        System.out.println("Introduce el número B: ");
        int B = lect.nextInt();

        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = lect.nextLine();

        try {
            generarNif(A,B, nombreFichero);
            System.out.println("Se han generado los NIFs correctamente");
        } catch (Exception e) {
           System.out.println("Error al generar los NIFs");
        }
        finally{
            lect.close();
        } 
    }

    public static void generarNif(int a, int b, String fichero) throws IOException {
         
        BufferedWriter escrito = null; 

        try {
        
            escrito = new BufferedWriter(new FileWriter(destino));

            String linea;
            
            while ((linea = leido.readLine()) != null) {
                if (linea.length() >= tamaño) {
                    escrito.write(linea);
                    escrito.newLine();
                }
            }
            System.out.println("Archivo filtrado correctamente.");

        } catch(IOException e){
            System.out.println("Error de escritura del fichero ");
        } 
        finally {
            Utilidades.cerrarRecursos(leido);
            Utilidades.cerrarRecursos(escrito);
        }
    }
}
