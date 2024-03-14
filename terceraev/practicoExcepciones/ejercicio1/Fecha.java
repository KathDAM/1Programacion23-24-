/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 * La clase Fecha consta de día, mes y año. 
 * Todos los valores se reciben en el constructor por parámetro. 
 * Además, esta clase debe tener un método que devuelva cada uno de los atributos y un método toString() 
 * que devuelva la información de la fecha en formato dd/mm/yyyy.   
 * @author jsanm
 */
public class Fecha {
    
    /************************** PROPIEDADES PRIVADAS **************************/
    /**
     * Día del objeto Fecha. Valor entero
     */
    private int dia;
    
    /**
     * Mes del objeto Fecha. Valor entero
     */
    private int mes;
    
    /**
     * Año del objeto Fecha. Valor entero
     */
    private int anyo;
        
    /************************** CONSTRUCTORES **************************/
    
    /**
     * Crea una Fecha con día, mes y año
     * @param dia El día del objeto Fecha
     * @param mes El mes del objeto Fecha
     * @param anyo El año del objeto Fecha
     */
    public Fecha(int dia, int mes, int anyo){
        
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        
    }
    
    /************************** GETTERS **************************/
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }
    
    /************************** MÉTODOS **************************/
    @Override
    public String toString(){
        
        // hay que confertir el objeto Fecha en una cadena de texto en formato dd/mm/yyyy
        
        //conversiones entero a String. (También se puede concatenar "" + variableInt para hacer la conversión).
        String diaStr = Integer.toString(dia);
        String mesStr = Integer.toString(mes);
        String anyoStr = Integer.toString(anyo);
        
        //completamos con un 0 delante de las variables día y mes, si procede
        if(dia<10)
            diaStr = "0" + diaStr;
        if(mes<10)
            mesStr = "0" + mesStr;
        
        //completamos con tantos 0 delante como sea necesario la variable de año
        if(anyo<10)
            anyoStr = "000" + anyoStr;
        else if(anyo<100)
            anyoStr = "00" + anyoStr;
        else if(anyo<1000)
            anyoStr = "0" + anyoStr;
        
        return diaStr + "/" + mesStr + "/" + anyoStr;
    }
    
    
    public static void main(String[] args){
    
        //pruebas del método toString con distintos objetos de fecha que provoquen
        //los flujos alternativos del método toString        
        Fecha f = new Fecha(21,12,2000);
        Fecha f2 = new Fecha(2,12,2000);
        Fecha f3 = new Fecha(21,2,2000);
        Fecha f4 = new Fecha(2,2,2000);
        Fecha f5 = new Fecha(2,2,200);
        Fecha f6 = new Fecha(2,2,20);
        Fecha f7 = new Fecha(2,2,20);
        Fecha f8 = new Fecha(2,2,2);
        
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f8);
    }
    
}
