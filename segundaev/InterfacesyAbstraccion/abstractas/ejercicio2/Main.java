// Catherine AM
package segundaev.InterfacesyAbstraccion.abstractas.ejercicio2;

import java.util.Scanner;

public class Main {
    static Scanner lect = new Scanner(System.in);
    static int opcion; 
    public static void main(String[] args) {

        System.out.println("Escribe los datos siguientes: ");
        System.out.print("Año de nacimiento: ");
        int anyo = lect.nextInt();

        lect.nextLine(); //Vaciar buffer

        System.out.print("Nombre: ");
        String nombre = lect.nextLine();

        System.out.print("Primer apellido: ");
        String apellido1 = lect.nextLine();

        System.out.print("¿Tienes segundo apellido? (Si/No): ");
        String respuesta = lect.nextLine();

        String apellido2 = "";
        if (respuesta.equalsIgnoreCase("Si")) {
            System.out.println("Segundo apellido:");
            apellido2 = lect.nextLine();
        }

        Asegurado asegurado = new Asegurado(anyo, nombre, apellido1, apellido2);
        asegurado.calculoEdad();

        System.out.println("¿Que seguro quieres contratar? \n" + "  1. Seguro de Decesos \n" + "  2. Seguro de Vida \n");
        opcion = lect.nextInt();

        Seguro seguro;

        if (opcion == 1) {
            seguro = new SeguroDecesos(asegurado);
        } else {
            seguro = new SeguroVida(asegurado);
        }

        float primaAnual = seguro.calcularPrimaAnual();
        System.out.println("Importe de la prima anual correspondiente: " + primaAnual);
 
    }
}
