//Catherine AM
package unidad5static.ejercicio3;

public class Elemento {
    //ATRIBUTO
    private String nombre;

    //CONTADOR 
    private static int numerototal = 0;

    //CONSTRUCTOR 
    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    //GET
    public String getNombre() {
        return nombre;
    }

    //MÉTODOS
    public static int númeroDeElementos() {
        return numerototal;
    }

    public static void incrementarContador() {
        numerototal++;
    }
}
