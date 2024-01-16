// Catherine AM
package segundaev.interfaces.ejercicio4;

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

        Asegurado2 asegurado = new Asegurado2(anyo, nombre, apellido1, apellido2);
        asegurado.calculoEdad();

        Seguro2 seguro1, seguro2;

        System.out.println("¿Que seguro quieres contratar? \n" + "  1. Seguro de Decesos \n" + "  2. Seguro de Vida \n");
        opcion = lect.nextInt();

        if (opcion == 1) {
            seguro1 = new SeguroDecesos2(asegurado);
        } else {
            seguro1 = new SeguroVida2(asegurado);
        }
        asegurado.toString();

        if (opcion == 1) {
            seguro2 = new SeguroDecesos2(asegurado);
        } else {
            seguro2 = new SeguroVida2(asegurado);
        }
        asegurado.toString();

        float primaAnual = seguro1.compareTo(seguro2);
        System.out.println(primaAnual);

    }  
}
