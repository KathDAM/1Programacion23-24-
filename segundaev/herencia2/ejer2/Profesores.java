// Catherine AM
package segundaev.herencia2.ejer2;

import java.util.Calendar;

public class Profesores {
    // ATRIBUTOS
    private String nombre;
    private String apellido1;
    private String apellido2; //opcional
    private Calendar fecha;
    private String cargo;
    private int salarioBase = 1500;

    // CONSTRUCTOR
    public Profesores(String nombre,String apellido1,Calendar fecha) {
        this.nombre =  nombre;
        this.apellido1 = apellido1;
        this.fecha = fecha;
    }

    // GETTER
    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getCargo() {
        return cargo;
    }
    
    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    // METODOS
    public int calcularSalarioTotal() {
        int salarioTotal = salarioBase;
        salarioTotal += obtenerComplementoCargo();
        salarioTotal += obtenerComplementoTrienios();
        return salarioTotal;
    }

    private int obtenerComplementoCargo(){
        switch (cargo) {
            case "secretaria":
                return 100;
            case "jefatura":
                return 200;
            case "direccion":
                return 300;
            default:
                return 0;
        }
    }

    private double obtenerComplementoTrienios() {
        int anosCentro = obtenerAnosEnCentro();
        return anosCentro * 25;
    }

    private int obtenerAnosEnCentro() {
        Calendar actual = Calendar.getInstance();
        int anoActual = actual.get(Calendar.YEAR);
        int anoIncorporacion = fecha.get(Calendar.YEAR);
        return anoActual - anoIncorporacion;
    }
}
