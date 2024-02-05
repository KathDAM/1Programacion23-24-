// Catherine AM
package segundaev.herencia2.ejer1;

import java.util.Calendar;

public class Movil extends Producto {
    // ATRIBUTOS
    private String marca;
    private String modelo;

    // CONSTRUCTOR
    public Movil(int codigo,String descripcion,double precio,Calendar fecha,String marca,String modelo) {
        super(codigo, descripcion, precio, fecha);
        this.marca = marca;
        this.modelo = modelo;
    }

    // GETTER
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // SETTER
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
