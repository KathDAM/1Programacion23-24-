/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training2;

/**
 *
 * Programa que calcula la media de las tres evaluaciones utilizando un vector para almacenar todas las notas
 * 
 * Completa las instrucciones que se te soliciten.
 * @author jsanm
 */
public class InicializacionArrays {
    
    public static void main(String[] args){
        
        //0. Inicializamos un array para almacenar las notas de las tres evaluaciones
        float[] promediosEvaluacion = new float[3];
        
        //1. resultado de la primera evaluación
        promediosEvaluacion[0] = 3.5f;
        
        //2. escribe el resultado de la segunda y tercera evaluación en "promediosEvaluacion"
        //IMPLEMENTAR AQUÍ
        promediosEvaluacion[1] = 6.5f;
        promediosEvaluacion[2] = 8.2f;
        
        //3. calcula la media de las tres evaluaciones y muéstrala por pantalla
        //IMPLEMENTAR AQUÍ
        float suma = 0.0f;
        for (int i = 0; i < promediosEvaluacion.length; i++) {
            suma += promediosEvaluacion[i];
        }
        float media = suma / 3f;
        System.out.println("La media de valores es " + media);
        
    }
}
