// Catherine AM
package segundaev.InterfacesyAbstraccion.abstractas.ejercicio2;

public abstract class Seguro {
    // ATRIBUTOS
    protected Asegurado asegurado;
    protected int primaBase = 100;


    // CONSTRUCTOR
    public Seguro(Asegurado asegurado) {
        this.asegurado = asegurado;
    }

    // GETTER
    public Asegurado getAsegurado() {
        return asegurado;
    }

    // SETTER
    public void setAsegurado(Asegurado asegurado) {
        this.asegurado = asegurado;
    }

    // METODOS
    public abstract float calcularPrimaAnual();
}
