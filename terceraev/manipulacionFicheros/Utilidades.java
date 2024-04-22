package terceraev.manipulacionFicheros;

import java.io.*;

public class Utilidades {
    public static void cerrarRecursos(Reader reader) {
        try {
            if (reader != null) reader.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero: " + e.getMessage());
        }
    }

    public static void cerrarRecursos(Writer writer) {
        try {
            if (writer != null) writer.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero: " + e.getMessage());
        }
    }

}
