package segundaev.abstractas.ejercicio2;

public abstract class Seguro{
    // ATRIBUTOS
    protected Asegurado asegurado;

    // CONSTRUCTOR
    public Seguro(int anyoNac,String nombre,String primerApellido,String segundoApellido, Asegurado asegurado) {
        super( anyoNac, nombre, primerApellido, segundoApellido);
        this.asegurado = asegurado;
    }

    // METODOS
    public abstract float calcularPrimaAnual();
}
