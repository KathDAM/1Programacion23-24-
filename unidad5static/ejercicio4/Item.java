//Catherine AM
package unidad5static.ejercicio4;

public class Item {
    //ATRIBUTOS
    private String nombre;
    private int idnum;

    //CONTADOR
    private static int asignarid = 1;

    //CONSTRUCTOR
    public Item(String nombre) {
       this.nombre = nombre;
       this.idnum = asignarid++;
    }

    //GET
    public String getNombre() {
        return nombre;
    }

    public int getIdnum() {
        return idnum;
    }

    //METODO (representa el objeto como una cadena)
    public String toString(){
        return "Item - [ ID: " + idnum + ", Nombre: " + nombre + " ]";
    }
}
