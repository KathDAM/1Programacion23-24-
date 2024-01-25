// Catherine AM
package segundaev.InterfacesyAbstraccion.interfaces.ejercicio4;

import java.util.Scanner;

public class Main {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        Asegurado2 asegurado1 = obtenerDatosAsegurado();
        Seguro2 seguro1 = elegirSeguro(asegurado1);
        System.out.println(asegurado1);
        mostrarInfoSeguro(seguro1);

        Asegurado2 asegurado2 = obtenerDatosAsegurado();
        Seguro2 seguro2 = elegirSeguro(asegurado2);
        System.out.println(asegurado2);
        mostrarInfoSeguro(seguro2);

        compararPrimas(seguro1, seguro2);
    }

    private static Asegurado2 obtenerDatosAsegurado() {
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

        return asegurado;
    }

    private static Seguro2 elegirSeguro(Asegurado2 asegurado) {
        System.out.println("¿Que seguro quieres contratar? \n" + "  1. Seguro de Decesos \n" + "  2. Seguro de Vida \n");
        int opcion = lect.nextInt();

        if (opcion == 1) {
            return new SeguroDecesos2(asegurado);
        } else {
            return new SeguroVida2(asegurado);
        }
    }

    private static void mostrarInfoSeguro(Seguro2 seguro){
        float primaAnual = seguro.calcularPrimaAnual();
        System.out.println("El importe de la prima anual es " + primaAnual);
    }
    
    private static void compararPrimas(Seguro2 seguro1, Seguro2 seguro2){
        int comparar =  seguro1.compareTo(seguro2);
        if (comparar < 0) {
        System.out.println("Prima de seguro1 es menor por " + comparar);
        } else if (comparar > 0) {
            System.out.println("Prima de seguro2 es menor por " + comparar);
        } else {
            System.out.println("Las primas son iguales");
        }
    }   
}  