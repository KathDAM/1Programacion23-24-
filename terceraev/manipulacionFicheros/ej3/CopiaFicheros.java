package terceraev.manipulacionFicheros.ej3;

import java.io.*;
import java.util.Scanner;

import terceraev.manipulacionFicheros.Utilidades;

public class CopiaFicheros {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Introduce el nombre del fichero origen: ");
        String ficheroOrigen = lect.nextLine();

        System.out.println("Introduce el nombre del fichero nuevo: ");
        String ficheroNuevo = lect.nextLine();

        System.out.println("Introduce el tamaño de mínimo: ");
        int tamaño = lect.nextInt();

        try {
            cotaLineal(ficheroOrigen,ficheroNuevo, tamaño);
            System.out.println("Filtro de líneas correcto");
        } catch (Exception e) {
           System.out.println("Error al filtrar lineas");
        }
        finally{
            lect.close();
        } 
    }

    public static void cotaLineal(String origen, String destino, int tamaño) throws IOException {
          
        BufferedReader leido = null;
        BufferedWriter escrito = null; 

        try {
        
            leido = new BufferedReader(new FileReader(origen));
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
