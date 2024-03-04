// Catherine AM
package ejercicio2;

public abstract class Vehiculo {
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

    // METODOS
    public abstract void avanzar(float km);

}
