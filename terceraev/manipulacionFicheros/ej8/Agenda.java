package terceraev.manipulacionFicheros.ej8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<String> registros;

    public Agenda() {
        registros = new ArrayList<>();
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public boolean eliminarRegistro(String nombre) {
        return registros.removeIf(registro -> registro.contains(nombre));
    }

    public List<String> buscarRegistro(String nombre) {
        List<String> resultados = new ArrayList<>();
        for (String registro : registros) {
            if (registro.contains(nombre)) {
                resultados.add(registro);
            }
        }
        return resultados;
    }

    public void cargarDesdeFichero(String nombreFichero) {
// Declaramos un BufferedReader para leer del archivo
    BufferedReader reader = null;

    try {
        // Inicializamos el BufferedReader para leer del archivo especificado
        reader = new BufferedReader(new FileReader(nombreFichero));

        // Declaramos una variable para almacenar cada línea leída del archivo
        String linea;

        // Leemos cada línea del archivo hasta que llegamos al final (cuando readLine() devuelve null)
        while ((linea = reader.readLine()) != null) {
            // Agregamos cada línea leída a la lista de registros
            registros.add(linea);
        }
    } catch (IOException e) {
        // Si ocurre un error de entrada/salida, imprimimos el rastreo de la pila
        e.printStackTrace();
    } finally {
        // Finalmente, cerramos el BufferedReader en un bloque finally para asegurarnos de que se cierre correctamente
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            // Si ocurre un error al cerrar el BufferedReader, imprimimos el rastreo de la pila
            ex.printStackTrace();
        }
    }
    }

    public void guardarEnFichero(String nombreFichero) {
        // Declaramos un BufferedWriter para escribir en el archivo
        BufferedWriter writer = null;

        try {
            // Inicializamos el BufferedWriter para escribir en el archivo especificado
            writer = new BufferedWriter(new FileWriter(nombreFichero));

            // Iteramos sobre cada registro en la lista de registros
            for (String registro : registros) {
                // Escribimos el registro en una nueva línea en el archivo
                writer.write(registro);
                // Agregamos una nueva línea después de cada registro para separarlos
                writer.newLine();
            }
        } catch (IOException e) {
            // Si ocurre un error de entrada/salida, imprimimos el rastreo de la pila
            e.printStackTrace();
        } finally {
            // Finalmente, cerramos el BufferedWriter en un bloque finally para asegurarnos de que se cierre correctamente
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                // Si ocurre un error al cerrar el BufferedWriter, imprimimos el rastreo de la pila
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Cargar agenda desde un archivo
        agenda.cargarDesdeFichero("agenda.txt");

        // Agregar registros
        agenda.agregarRegistro("Juan: 123456789");
        agenda.agregarRegistro("María: 987654321");

        // Eliminar registro
        agenda.eliminarRegistro("Juan");

        // Guardar agenda en un archivo
        agenda.guardarEnFichero("agenda_actualizada.txt");

        // Buscar registro
        List<String> resultados = agenda.buscarRegistro("María");
        System.out.println("Resultados de búsqueda:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
