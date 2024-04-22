package terceraev.manipulacionFicheros.ej1;

import java.io.*;
import java.util.Scanner;

import terceraev.manipulacionFicheros.Utilidades;

public class ConcatenaFicheros {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Introduce el nombre del primer fichero: ");
        String fichero1 = lect.nextLine();

        System.out.println("Introduce el nombre del segundo fichero: ");
        String fichero2 = lect.nextLine();

        System.out.println("Introduce el nombre del fichero destino: ");
        String ficheroDestino = lect.nextLine();

        System.out.println("Introduce el caracter para separar los ficheros: ");
        char separador = lect.next().charAt(0);

        try {
            unionFicheros(fichero1,fichero2, ficheroDestino,separador);
            System.out.println("Fusion de archivos correcto");
        } catch (Exception e) {
           System.out.println("Error al fusionar archivos");
        }
        finally{
            lect.close();
        } 
    }

    public static void unionFicheros(String archi1, String archi2, String destino,char caracter) {
          
        BufferedReader fiche1 = null;
        BufferedReader fiche2 = null; 
        BufferedWriter ficheDestino = null; 

        try {
        
            fiche1 = new BufferedReader(new FileReader(archi1));
            fiche2 = new BufferedReader(new FileReader(archi2));
            ficheDestino = new BufferedWriter(new FileWriter(destino));

            String linea1, linea2;
            
            while ((linea1 = fiche1.readLine()) != null && (linea2 = fiche2.readLine()) != null) {
                String lineaConcatenada = linea1 + caracter + linea2;
                ficheDestino.write(lineaConcatenada);
                ficheDestino.newLine();
            }
            System.out.println("Archivo copiado correctamente.");

        } catch(IOException e){
            System.out.println("Error de escritura del fichero ");
            System.out.println(e.getMessage());
        } 
        finally {
            Utilidades.cerrarRecursos(fiche1);
            Utilidades.cerrarRecursos(fiche2);
            Utilidades.cerrarRecursos(ficheDestino);
        }
    }
}
