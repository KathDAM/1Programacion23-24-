/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaev.ejerciciosextra.vectoresobjetos.ejercicio7;

/**
 * Representa el total de una calificación en una asignatura
 * @author jsanm
 */
public class TotalCalificacionVO {
    
    private Calificacion calificacion;
    private int numAlumnosConCalificacion;

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        if(calificacion==null)
            throw new RuntimeException("La calificación es obligatoria");
        this.calificacion = calificacion;
    }

    public int getNumAlumnosConCalificacion() {
        return numAlumnosConCalificacion;
    }

    public void setNumAlumnosConCalificacion(int numAlumnosConCalificacion) {
        if(numAlumnosConCalificacion<0)
            throw new RuntimeException("El número de alumnos con una calificación ha de ser positivo");
        this.numAlumnosConCalificacion = numAlumnosConCalificacion;
    }
    
    /**
     * Construye un objeto que totaliza el número de alumnos que tienen una calificación en una asignatura
     * @param calificacion
     * @param numAlumnosConCalificacion 
     */
    public TotalCalificacionVO(Calificacion calificacion, int numAlumnosConCalificacion){
        this.setCalificacion(calificacion);
        this.setNumAlumnosConCalificacion(numAlumnosConCalificacion);
    }
    
    public String toString(){
        return "{" + this.calificacion + " - " + this.numAlumnosConCalificacion + "}";
    }
}
