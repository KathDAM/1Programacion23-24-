package terceraev.ejemSerializable;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private int edad;

    public Persona(String s, int i){
        nombre = s;
        edad = i;
    }

    public String toString(){
        return nombre + ":" + edad;
    }
}
