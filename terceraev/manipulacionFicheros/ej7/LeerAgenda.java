package terceraev.manipulacionFicheros.ej7;

import java.io.IOException;
import java.util.Scanner;

public class LeerAgenda {
    public static void main(String[] args) throws IOException {
        Scanner lect = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce el nombre: ");
            String nombre = lect.nextLine();
    
            System.out.println("Introduce la dirección: ");
            String direccion = lect.nextLine();
    
            System.out.println("Introduce el teléfono: ");
            String telefono = lect.nextLine();
    
            System.out.println("Introduce el email: ");
            String email = lect.nextLine();
    
            Agenda nuevoRegistro = new Agenda(nombre, direccion, telefono, email);
            Agenda.escribirRegistro(nuevoRegistro);
    
            System.out.println("¿Deseas añadir otro registro? (Sí/No): ");
            String respuesta = lect.nextLine();
            if (!respuesta.equalsIgnoreCase("Sí")) {
                break;
            }

            Agenda.leerRegistros();
        }
    
        lect.close(); 
    }
    
}
