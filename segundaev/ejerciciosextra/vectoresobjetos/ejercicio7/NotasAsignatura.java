/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaev.ejerciciosextra.vectoresobjetos.ejercicio7;

import java.util.Arrays;

/**
 * Clase para manejar las notas de una asignatura
 * @author jsanm
 */
public class NotasAsignatura {
    
    /**
     * Almacén de notas de los alumnos. Tantas como alumnos haya en la clase
     */
    public int[] notasAlumnos;
    
    /**
     * Número de alumnos cuyas notas se han registrado. Inicialmente a 0
     */
    public int alumnosRegistrados = 0;
    
    /**
     * Se crea un objeto para almacenar las notas de tantos alumnos como se indique
     * @param numeroAlumnos Número de alumnos a manejar sus notas
     */
    public NotasAsignatura(int numeroAlumnos){
        if(numeroAlumnos<=0)
            throw new RuntimeException("Número de alumnos debe ser mayor que 0");
        this.notasAlumnos = new int[numeroAlumnos];
    }
    
    /**
     * Añade una nota al almacén de notas de los alumnos. 
     * @param nota Nota a añadir
     */
    public void anyadirNota(int nota){
        if(alumnosRegistrados==this.notasAlumnos.length)
            throw new RuntimeException("Ya se han registrado todas las notas");
        if(nota<0 || nota>10)
            throw new RuntimeException("La nota a registrar ha de ser entre 0 y 10");
            
        
        this.notasAlumnos[alumnosRegistrados]=nota;
        alumnosRegistrados++;
    }
    
    /**
     * Devuelve la lista clonada de notas, para evitar que sea manipulada por el llamante
     * @return lista de notas clonada.
     */
    public int[] getNotasAlumnos(){
        return this.notasAlumnos.clone();
    }
    
    /**
     * Calcula la media de los alumnos que han registrado la nota
     * @return La media
     */
    public float calcularMedia(){
        int suma = 0;
        for (int i = 0; i < alumnosRegistrados; i++) {
            suma += notasAlumnos[i];
        }
        return (float) suma / alumnosRegistrados;
    }
    
    /**
     * Calcula el total de notas de cada calificación en un vector de 7 posiciones y se devuelve
     * @return 
     */
    public TotalCalificacionVO[] calcularTotalNotas(){
        int[] cantidadCalificaciones = new int[Calificacion.values().length];
        for (int i = 0; i < notasAlumnos.length; i++) {
            int nota = notasAlumnos[i];
            if (nota >= 1 && nota <= 2) {
                cantidadCalificaciones[Calificacion.MUY_DEFICIENTE.ordinal()]++; // ordinal() devuelve el índice numérico en ENUM
            } else if (nota >= 3 && nota <= 4) {
                cantidadCalificaciones[Calificacion.INSUFICIENTE.ordinal()]++;
            } else if (nota == 5) {
                cantidadCalificaciones[Calificacion.SUFICIENTE.ordinal()]++;
            } else if (nota == 6) {
                cantidadCalificaciones[Calificacion.BIEN.ordinal()]++;
            } else if (nota >= 7 && nota <= 8) {
                cantidadCalificaciones[Calificacion.NOTABLE.ordinal()]++;
            } else if (nota == 9) {
                cantidadCalificaciones[Calificacion.EXCELENTE.ordinal()]++;
            } else if (nota == 10) {
                cantidadCalificaciones[Calificacion.MATRICULA_HONOR.ordinal()]++;
            }
        }
        
        TotalCalificacionVO[] total = new TotalCalificacionVO[Calificacion.values().length];
        for (int i = 0; i < total.length; i++) {
            total[i] = new TotalCalificacionVO(Calificacion.values()[i], cantidadCalificaciones[i]);
        }
        return total;
    }

    /**
     * Calcula la diferencia de puntuación de cada alumno registrado con respecto a la media
     * @return Un vector con la diferencia de la nota de cada alumno con respecto a la media
     */
    public float[] calcularDiferenciaCalificacionConMedia(){
        float media = calcularMedia();
        float[] diferencias = new float[alumnosRegistrados];
        
        for (int i = 0; i < alumnosRegistrados; i++) {
            diferencias[i] = notasAlumnos[i] - media;
        }
        return diferencias;
    }

    /**
     * Devuelve las notas de cada alumno
     * @return 
     */
    public String toString(){
        return "{Alumnos registrados: " + this.alumnosRegistrados + "} - {Notas: " + Arrays.toString(this.notasAlumnos) + " }";
    }
}
