// Catherine AM
package segundaev.InterfacesyAbstraccion.abstractas.ejercicio1;

public class Coche extends Vehiculo {
    // ATRIBUTOS
    protected float kmRecorridos;

    // CONSTRUCTOR
    public Coche(String marca, String modelo, int anyoFabricacion) {
        super(marca, modelo, anyoFabricacion);
        this.kmRecorridos = 0;
    }

    // GET
    public float getKmRecorridos() {
        return kmRecorridos;
    }

    // METODOS
    public void avanzar(float km) {
        if (km > 0) {
            kmRecorridos += km;
        } else {
            System.out.println("La distancia a avanzar debe ser mayor que cero.");
        }
    }

    public void reiniciarKmRecorridos(){
        this.kmRecorridos = 0;
        System.out.println("Cuentakilómetros reiniciado a 0.");
    }
}

