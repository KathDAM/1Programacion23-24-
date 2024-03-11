// Catherine AM
package ejercicio2;

public abstract class Vehiculo {
    // ATRIBUTOS
    protected String marca;
    protected String modelo;
    protected int anyoFabricacion;
    
    /*CAMBIOS EN CONSTRUCTOR(try catch), UTILIZAMOS LA CLASE VEHICULOEXCEPCION */
    // CONSTRUCTOR
    public Vehiculo (String marca,String modelo,int anyoFabricacion){
        try {
            if (marca == null || modelo == null || anyoFabricacion <= 0) {
                throw new IllegalArgumentException("Los valores no pueden ser nulos o valores negativos.");
            }
            this.marca = marca;
            this.modelo = modelo;
            this.anyoFabricacion = anyoFabricacion;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el vehículo: " + e.getMessage());
        }
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
