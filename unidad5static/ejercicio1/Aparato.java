package unidad5static.ejercicio1;

public class Aparato {
    //ATRIBUTOS
    private String nombre;
    private int watios;
    private boolean apagado;

    //CONSTRUCTOR CON PARAMETRO
    public Aparato(String nombre,int watios) {
        this.nombre = nombre;
        this.watios = watios;
        this.apagado = true;

    }

    //GETTER
    public String getNombre() {
        return nombre;
    }

    public int getWatios() {
        return watios;
    }
    
    //METODOS

    public static boolean encenderAparato(String nombre,boolean apagado){
        if (apagado) {
            
        } else {
            
        }
        return apagado;
        
    }

     public static boolean apagadoAparato(String nombre,boolean apagado){
        if (apagado) {
            
        } else {
            
        }
        return apagado;
        
    }



}
