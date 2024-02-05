// Catherine AM
package segundaev.herencia2.ejer1;

import java.util.Calendar;

public class Producto {
    // ATRIBUTOS
    private int codigo;
    private String descripcion;
    private double precio;
    private Calendar fecha;

    // CONSTRUCTOR
    public Producto(int codigo,String descripcion,double precio,Calendar fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
    }

    // GETTER
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public Calendar getFecha() {
        return fecha;
    }

    // SETTER
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    //METODOS
    public String toString(){
        return "[" + this.getClass().getSimpleName() + "]#[" + codigo + "]";
    }

    public boolean esIgualCodigo(Producto otroProd){
        return this.codigo == otroProd.codigo;
    }




}
