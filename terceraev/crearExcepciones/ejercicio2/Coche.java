// Catherine AM
package ejercicio2;

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

    //CAMBIOS EN AVANZAR, UTILIZAMOS LA CLASE COCHEEXCEPCION
    // METODOS
    public void avanzar(float km) {
        try {
            if (km > 0) {
                kmRecorridos += km;
            } else {
                throw new CocheException("La distancia a avanzar debe ser mayor que cero.");
            }
        } catch (CocheException e) {
            System.out.println("Error al avanzar el Coche: " + e.getMessage());
        }
        
    }

    public void reiniciarKmRecorridos(){
        this.kmRecorridos = 0;
        System.out.println("Cuentakilómetros reiniciado a 0.");
    }
}

