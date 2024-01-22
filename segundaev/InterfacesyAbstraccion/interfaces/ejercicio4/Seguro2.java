// Catherine AM
package segundaev.InterfacesyAbstraccion.interfaces.ejercicio4;

public abstract class Seguro2 implements Comparable<Seguro2> {
    // ATRIBUTOS
    protected Asegurado2 asegurado;

    // CONSTRUCTOR
    public Seguro2(Asegurado2 asegurado) {
        this.asegurado = asegurado;
    }

    // GETTER
    public Asegurado2 getAsegurado() {
        return asegurado;
    }

    // SETTER
    public void setAsegurado(Asegurado2 asegurado) {
        this.asegurado = asegurado;
    }

    // METODOS
    public abstract float calcularPrimaAnual();

    public int compareTo(Seguro2 otroSeguro) {

        float prima1 = this.calcularPrimaAnual();
        float prima2 = otroSeguro.calcularPrimaAnual();

        return (int)(prima1 - prima2);
    }
}
