package RepasoEx3ev.Fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AgendaClientes {
     private List<Cliente> clientes;

    // Constructor
    public AgendaClientes() {
        clientes = new ArrayList<>();
    }

    // Método para cargar los datos de los clientes desde un archivo
    public void cargarClientes(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t");
                if (data.length == 7) { // Verificamos que haya 7 campos
                    Cliente cliente = new Cliente(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
                    clientes.add(cliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para guardar los datos de los clientes en un archivo
    public void guardarClientes(String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Cliente cliente : clientes) {
                bw.write(cliente.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Métodos para añadir, eliminar y buscar clientes
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarClientePorCodigo(String codigoCliente) {
        clientes.removeIf(cliente -> cliente.getCodigoCliente().equals(codigoCliente));
    }

    public Cliente buscarClientePorNombre(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    // Otros métodos para buscar por código, teléfono, edad, etc.

    // Método para obtener todos los clientes
    public List<Cliente> obtenerTodosLosClientes() {
        return clientes;
    }
}
