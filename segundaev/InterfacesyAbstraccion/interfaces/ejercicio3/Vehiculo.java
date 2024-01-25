// Catherine AM
package segundaev.InterfacesyAbstraccion.interfaces.ejercicio3;

public abstract class Vehiculo implements IAvanzable{
    // ATRIBUTOS
    protected String marca;
    protected String modelo;
    protected int anyoFabricacion;

    // CONSTRUCTOR
    public Vehiculo (String marca,String modelo,int anyoFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
    }

    // GET
    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

}
