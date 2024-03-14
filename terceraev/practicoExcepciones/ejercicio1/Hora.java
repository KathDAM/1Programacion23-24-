/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 * La clase Hora consta de hora y minuto. 
 * También recibe los valores para los atributos por parámetro en el constructor, 
 * tiene métodos que devuelven cada uno de los atributos y un método toString() 
 * que devuelve la hora en formato hh:mm. 
 * @author jsanm
 */
public class Hora {
    
    /************************** PROPIEDADES PRIVADAS **************************/
    /**
     * Hora del objeto Hora. Valor entero
     */
    private int hora;
    
    /**
     * Minuto del objeto Hora. Valor entero
     */
    private int minuto;
    
    /************************** CONSTRUCTORES **************************/
    /**
     * Crea un objeto Hora en base a una hora y minutos indicados como valores  numéricos
     * @param hora hora del objeto Hora
     * @param minuto minuto del objeto Hora
     */
    public Hora(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }
    
    /************************** GETTERS **************************/
    public int getHora(){
        return this.hora;
    }
    
    public int getMinuto(){
        return this.minuto;
    }
    
    /************************** MÉTODOS **************************/
    @Override
    public String toString(){
       
         // hay que confertir el objeto Hora en una cadena de texto en formato hh:mm
        
        //conversiones entero a String. (También se puede concatenar "" + variableInt para hacer la conversión).
        String horaStr = Integer.toString(hora);
        String minutoStr = Integer.toString(minuto);
        
        //completamos con un 0 delante de las variables hora y mes, si procede
        if(hora<10)
            horaStr = "0" + horaStr;
        if(minuto<10)
            minutoStr = "0" + minutoStr;
        
        return horaStr + ":" + minutoStr;
    }
}
