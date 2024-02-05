// Catherine AM
package segundaev.herencia2.ejer2;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar fechaIncorporacion = Calendar.getInstance();
        fechaIncorporacion.set(2010, Calendar.JANUARY, 1); // Por ejemplo, fecha de incorporación en enero de 2010

        // Crear un objeto Profesores con los datos proporcionados
        Profesores profesor = new Profesores("Juan", "Gomez", fechaIncorporacion);
        profesor.setCargo("jefatura"); // Asignar un cargo al profesor

        // Calcula el salario total del profesor
        int salarioTotal = profesor.calcularSalarioTotal();

        System.out.println("Salario total del profesor " + profesor.getNombre() + " " + profesor.getApellido1() + " " + profesor.getApellido2() + ": " + salarioTotal + " euros");

    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del profesor:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el primer apellido del profesor:");
        String apellido1 = scanner.nextLine();

        System.out.println("¿Deseas introducir el segundo apellido? (Sí/No):");
        String respuesta = scanner.nextLine();

        String apellido2 = ""; // Inicializamos cadena vacía por defecto

        if (respuesta.equalsIgnoreCase("Si")) {
            System.out.println("Introduce el segundo apellido del profesor:");
            apellido2 = scanner.nextLine();
        }

        System.out.println("Introduce la fecha de incorporación del profesor (año):");
        int añoIncorporacion = scanner.nextInt();

        Calendar fechaIncorporacion = Calendar.getInstance();
        fechaIncorporacion.set(Calendar.YEAR, añoIncorporacion);

        Profesores profesor = new Profesores(nombre, apellido1, apellido2, fechaIncorporacion);

}
 */