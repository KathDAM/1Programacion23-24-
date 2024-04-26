package terceraev.manipulacionFicheros.ej7;

import java.io.*;

import terceraev.manipulacionFicheros.Utilidades;

public class Agenda {
    String nombre, direccion, telefono, email;

    // CONSTRUCTOR
    public Agenda(String nombre, String direccion,String telefono, String email ) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    // GETTER
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // MÉTODO
    public static void escribirRegistro(Agenda agenda) {
        DataOutputStream escrito = null;
    
        try {
            escrito = new DataOutputStream(new FileOutputStream("agenda.dat"));
            escrito.writeUTF(agenda.getNombre());
            escrito.writeUTF(agenda.getDireccion());
            escrito.writeUTF(agenda.getTelefono());
            escrito.writeUTF(agenda.getEmail());
            System.out.println("Registro agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        } finally{
            Utilidades.cerrarRecursos(escrito);
        }
    }
    

    public static void leerRegistros() {
        DataInputStream leido = null;

        try {
            leido = new DataInputStream(new FileInputStream("agenda.dat"));
            while (leido.available() > 0) {
                String nombre = leido.readUTF();
                String direccion = leido.readUTF();
                String telefono = leido.readUTF();
                String email = leido.readUTF();
                System.out.println("Nombre: " + nombre +"\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nEmail: " + email + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");

        } finally {
            Utilidades.cerrarRecursos(leido);
        }
    }
}
