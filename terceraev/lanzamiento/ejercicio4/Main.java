// Catherine AM
package ejercicio4;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /*CAMBIOS EN MAIN(try catch) */
        
        Calendar fechaIncorporacion = Calendar.getInstance();
        fechaIncorporacion.set(2010, Calendar.FEBRUARY, 28); // Por ejemplo, fecha de incorporación en enero de 2010

        Profesores profesor =null;
        // Crear un objeto Profesores con los datos proporcionados
        try {
            profesor = new Profesores(null, "Gomez", fechaIncorporacion);
            
     
        } catch (RuntimeException e) {
            System.out.println("Error al crear Profesores: " + e.getMessage());
        }

        if(profesor!=null){
            profesor.setCargo("jefatura"); // Asignar un cargo al profesor

            // Calcula el salario total del profesor
            int salarioTotal = profesor.calcularSalarioTotal();

            System.out.println("Salario total del profesor " + profesor.getNombre() + " " + profesor.getApellido1() + " " + profesor.getApellido2() + ": " + salarioTotal + " euros");
        }
    }
}
