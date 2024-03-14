/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 * Implementa una clase, de nombre Examen, para guardar información sobre los exámenes de un centro educativo. 
 * La información que se guarda de un examen es: el nombre de la asignatura, el aula, la fecha y la hora. 
 * 
 * Para guardar la fecha y la hora hay que implementar dos nuevas clases, Fecha y Hora.  
 * 
 * Todos los atributos de un examen se pueden modificar. 
 * @author jsanm
 */
public class Examen {
    
    /************************** PROPIEDADES PRIVADAS **************************/
    
    /**
     * Nombre de la asignatura de la que se examina. Cadena alfanumérica. Se puede leer y escribir.
     */
    private String nombreAsignatura;
    
    /**
     * Aula donde se realiza el examen. Valor numérico. Se puede leer y escribir.
     */
    private int aula;
    
    /**
     * Fecha del examen. De tipo {@link Fecha}. Se puede leer y escribir.
     */
    private Fecha fecha;
    
    /**
     * Hora del examen. De tipo {@link Hora}. Se puede leer y escribir.
     * 
     */
    private Hora hora;   
    
    /************************** CONSTRUCTORES **************************/
    
    /**
     * Crea un examen con todas las propiedades
     * @param nombreAsignatura Nombre de la asignatura de la que  se examina
     * @param aula Aula en la que se realiza el examen
     * @param fecha Fecha del examen
     * @param hora Hora del examen
     */
    public Examen(String nombreAsignatura, int aula, Fecha fecha, Hora hora){
        
        this.nombreAsignatura = nombreAsignatura;
        this.aula = aula;        
        this.fecha = fecha;
        this.hora = hora;
    }
        
    /************************** GETTERS Y SETTERS **************************/
    /* A. EXCEPCION RUNTIMEEXCEPTION  */
    public void setNombreAsignatura(String newNombreAsignatura){
        if (newNombreAsignatura == null || newNombreAsignatura.isEmpty()) {
            throw new RuntimeException("El nombre de la asignatura no puede ser nulo o estar vacío.");
        }
        this.nombreAsignatura = newNombreAsignatura;
    }
    /*B. NUEVA CLASE QUE HEREDE DE RUNTIMEEXCEPTION */
    public void setAula(int newAula) {
        if (newAula <= 0) {
            throw new MiRuntimeException("El número de aula debe ser mayor que cero.");
        }
        this.aula = newAula;
    }

    /* C. EXCEPCION NO RUNTIMEEXCEPTION NI HIJA*/
    public void setFecha(Fecha newFecha) throws MiExcepcion {
        if (newFecha == null) {
            throw new MiExcepcion("La fecha del examen no puede ser nula.");
        }
        this.fecha = newFecha;
    }
    
    public void setHora(Hora newHora){
        this.hora = newHora;
    }
    
    
    public String getNombreAsignatura(){
        return this.nombreAsignatura;
    }
    
    public int getAula(){
        return this.aula;
    }
    
    public Fecha getFecha(){
        return this.fecha;
    }
    
    public Hora getHora(){
        return this.hora;
    }
    
    
    /************************** MÉTODOS **************************/
    @Override
    public String toString(){
        //Aunque no lo indica el enunciado, nos viene bien implementar también el método toString para sacar la información
        //de un examen por pantalla. El formato lo he elegido al azar
        return "Examen de:"+this.getNombreAsignatura()+"\n" + 
               "Aula:"+this.getAula()+"\n" + 
               "Fecha y hora:"+this.getFecha() + " " + this.getHora();
    }
    
}
