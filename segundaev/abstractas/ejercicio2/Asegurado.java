package segundaev.abstractas.ejercicio2;

import java.util.Calendar;

public class Asegurado{
    // ATRIBUTOS
    protected int anyoNac;
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    int edad;


    // CONSTRUCTORES
    public Asegurado(int anyoNac,String nombre,String primerApellido,String segundoApellido) {
        this.anyoNac = anyoNac;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        calculoEdad();
    }

    // GETTER
    public int getAnyoNac() {
        return anyoNac;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }

    // SETTER
    public void setAnyoNac(int anyoNac) {
        this.anyoNac = anyoNac;
        calculoEdad();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    // METODOS
    private void calculoEdad() {
        int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
        edad = anyoActual - anyoNac;
        System.out.println(" || Edad " + edad);
    }

    public String toString(){
        return "Año nacimiento " + anyoNac  + " || Nombre " + nombre + " || Primer Apellido " + primerApellido + " || Segundo apellido " + segundoApellido; 
    }
    
}