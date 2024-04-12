package terceraev.avanzadoscolecciones.ej3;

import java.util.Calendar;

public class FichaPaciente {
    private String nombre;
    private String apellidos;
    private Calendar fechaNacimiento;
    private int edad;

    // CONSTRUCTOR
    public FichaPaciente(String nombre, String apellidos, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
    }

    // GETTER
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    // METODOS
    private int calcularEdad() {
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

        //Comprueba que aun no ha cumplido el anyo actual
        if (ahora.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) || 
            (ahora.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) &&
            ahora.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }

    /* Pregunta Javi: 
    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNacimiento, ahora).getYears();
    }
     */

    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Fecha de Nacimiento: " + fechaNacimiento.getTime() + ", Edad: " + edad;
    }
}
