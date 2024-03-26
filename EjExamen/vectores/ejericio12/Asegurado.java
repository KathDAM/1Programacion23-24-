/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjExamen.vectores.ejericio12;

import java.util.Calendar;


/**
 * Crea una clase Asegurado para poder almacenar la información de cualquier asegurado en un sistema de gestión de seguros. 
 * 
 * Todo asegurado consta de un año de nacimiento, nombre, primer apellido y segundo apellido 
 * (este último puede no estar informado, los demás son obligatorios). 
 * 
 * Añade constructor y métodos getters y setters. Además, incluye una función para calcular la edad del asegurado en función de la fecha actual (apoyarse en la clase java.util.Calendar para conocer el momento actual). 
 */
public class Asegurado {
    

    /**
     * Año de nacimiento del asegurado. Útil para hacer cálculos actuariales indexados por edad.
     */
    protected int anyoNacimiento;
    
    /**
     * Nombre del asegurqado. No nulo.
     */
    protected String nombre;
    
    /**
     * Primer apellido del asegurado. No nulo.
     */
    protected String apellido1;
    
    /**
     * Segundo apellido del asegurado.
     */
    protected String apellido2;
    
    /**
     * Crea un asegurado sin segundo apellido en base a la definición de {@link #Asegurado(int, java.lang.String, java.lang.String, java.lang.String) 
     * @param anyoNacimiento Anyo de nacimiento.
     * @param nombre Nombre
     * @param apellido1 Primer apellido
     */
    public Asegurado(int anyoNacimiento, String nombre, String apellido1){
        this(anyoNacimiento, nombre, apellido1, null);
    }
    
    /**
     * Crea un asegurado con toda la información del asegurado.
     * @param anyoNacimiento Año de nacimiento
     * @param nombre Nombre. No puede ser nulo ni cadena vacía.
     * @param apellido1 Primer apellido. No puede ser nulo ni cadena vacía.
     * @param apellido2 Segundo apellido.
     */
    public Asegurado(int anyoNacimiento, String nombre, String apellido1, String apellido2){
        
        if(nombre == null || "".equals(nombre) || apellido1 == null || "".equals(apellido1) ){
            //throw new RuntimeException("El nombre y el primer apellidos son obligatorios");
            System.out.println("El nombre y el primer apellidos son obligatorios");
        }
        else{
            this.anyoNacimiento = anyoNacimiento;
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
        }
    }
    

    public int getAnyoNacimiento(){
        return this.anyoNacimiento;
    }

    public void setAnyoNacimiento(int yearNacimiento){
        this.anyoNacimiento = yearNacimiento;
    }
     
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Establece el nombre del asegurado. No puede ser nulo ni cadena vacía.
     * @param nombre Nuevo nombre del asegurado. No puede ser nulo ni cadena vacía.
     */
    public void setNombre(String nombre){
        if(nombre == null || "".equals(nombre)) {
            //throw new RuntimeException("El nombre es obligatorio");
            System.out.println("El nombre es obligatorio");
        }
        else
            this.nombre = nombre;
    }
    
    public String getApellido1(){
        return this.apellido1;
    }
    
    /**
     * Establece el primer apellido del asegurado. No puede ser nulo ni cadena vacía.
     * @param apellido1 Nuevo primer apellido del asegurado. No puede ser nulo ni cadena vacía.
     */
     public void setApellido1(String apellido1){
         if(apellido1 == null || "".equals(apellido1)) {
            //throw new RuntimeException("El primer apellido es obligatorio");
            System.out.println("El primer apellido es obligatorio");
        }
        else
             this.apellido1 = apellido1;
    }


    public String getApellido2(){
        return this.apellido2;
    }
   
    /**
     * Establece el segundo apellido del asegurado. Admite cualquier valor, incluso cadena vacía y nulo.
     * @param apellido2 
     */
    public void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }    
    
    /**
     * Calcula la edad en base a la propiedad {@link #anyoNacimiento} y el año actual.
     * <p>
     * Nótese que el valor calculado no se almacena en ninguna propiedad existente, es un cálculo en caliente
     * que el método invocante deberá manejar como resultado de salida de esta función.
     * @return La edad calculada.
     */
    public int calcularEdad(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.anyoNacimiento;
    }    
}
