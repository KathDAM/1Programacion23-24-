package terceraev.manipulacionFicheros.ej5;

import java.io.*;
import java.util.Scanner;
import terceraev.manipulacionFicheros.Utilidades;

public class EliminarNif {
    static Scanner lect = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = lect.nextLine();

        System.out.println("Introduce el NIF a eliminar: ");
        String NIF = lect.nextLine();

        try {
            eliminarNif(nombreFichero, NIF);
            System.out.println("NIF eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Error al eliminar el NIF");
        } finally {
            lect.close();
        }
    }

    public static void eliminarNif(String nombre, String NIF) throws IOException {

        String archivoTemporal = "temporal.txt";

        BufferedReader leido = null;
        BufferedWriter escrito = null;

        try {
            leido = new BufferedReader(new FileReader(nombre));
            escrito = new BufferedWriter(new FileWriter(archivoTemporal));

            String linea;
            while ((linea = leido.readLine()) != null) {
                if (!linea.equals(NIF)) {
                    escrito.write(linea);
                    escrito.newLine();
                }
            }
            System.out.println("Archivo generado correctamente.");

            new File(archivoTemporal).renameTo(new File(nombre));
        } catch (IOException e) {
            System.out.println("Error de escritura del fichero ");
        } finally {
            Utilidades.cerrarRecursos(escrito);
            Utilidades.cerrarRecursos(leido);
        }
    }
}
