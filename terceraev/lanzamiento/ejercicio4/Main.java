// Catherine AM
package ejercicio4;

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
