package terceraev.manipulacionFicheros.ej6;

import java.io.*;
import java.util.Scanner;

import terceraev.manipulacionFicheros.Utilidades;

public class TransformarMayusculas {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = lect.nextLine();

        while (true) {
            
            System.out.println("Introduce la posicion a convertir en mayusculas(para salir poner 'EOF'): ");
            String pos = lect.nextLine();

            try {
                if (pos.equals("EOF")) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                int posicion = Integer.parseInt(pos);
                cambiarPosicionMayusculas(nombreFichero, posicion);
                System.out.println("Posición transformada correctamente");
            } catch (Exception e) {
                System.out.println("Error al transformar la posición " + pos);
            } 
        }

        lect.close();
    }

    public static void cambiarPosicionMayusculas(String nombre, int pos) throws IOException {
        BufferedReader leido = null;
        BufferedWriter escrito = null;

        try {
            leido = new BufferedReader(new FileReader(nombre));
            escrito = new BufferedWriter(new FileWriter("temp.txt"));

            int contador = 0;
            int caracter;

            while ((caracter = leido.read()) != -1) {
                contador++;
                if (contador == pos) { 
                    escrito.write(Character.toUpperCase(caracter));
                }  else{
                    escrito.write(caracter);
                }
            }

            System.out.println("Archivo cambiado correctamente.");

        } catch (IOException e) {
            System.out.println("Error de escritura del fichero ");
        } finally {
            Utilidades.cerrarRecursos(escrito);
            Utilidades.cerrarRecursos(leido);
        }
    }
}

            