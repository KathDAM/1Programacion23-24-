//Catherine AM
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
    
    public boolean estaApagado() {
        return apagado;
    }

    //METODOS

      public void encender() {
        apagado = false;
        System.out.println(nombre + " encendido.");
    }

    public void apagar() {
        apagado = true;
        System.out.println(nombre + " apagado.");
    }
}




