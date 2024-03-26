// Catherine AM
package EjExamen.ejercicio2;

public abstract class Seguro {
    // ATRIBUTOS
    protected Asegurado asegurado;

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
