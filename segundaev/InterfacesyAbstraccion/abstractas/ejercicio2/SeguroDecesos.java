// Catherine AM
package segundaev.InterfacesyAbstraccion.abstractas.ejercicio2;

public class SeguroDecesos extends Seguro {
    
    // CONSTRUCTOR
    public SeguroDecesos(Asegurado asegurado) {
        super(asegurado);
    }

    // METODOS
    public float calcularPrimaAnual() {
        float primaAnual= 0;
        if (this.asegurado.getEdad()<= 18) {
            primaAnual = 10;
        } else if (this.asegurado.getEdad() >= 19 && this.asegurado.getEdad()<= 39) {
            primaAnual = 22;
        } else if (this.asegurado.getEdad() >= 40 && this.asegurado.getEdad() <= 49) {
            primaAnual = 45;
        } else if (this.asegurado.getEdad() >= 50 && this.asegurado.getEdad() <= 55) {
            primaAnual = 62;
        } else if (this.asegurado.getEdad() >= 56 && this.asegurado.getEdad() <= 60) {
            primaAnual = 88; 
        } else if (this.asegurado.getEdad() >= 61) {
            primaAnual = 10 * (this.asegurado.getEdad() - 60) + 88;
        }
        return primaAnual;
    }
}
