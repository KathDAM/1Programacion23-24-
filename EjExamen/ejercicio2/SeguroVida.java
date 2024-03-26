// Catherine AM
package EjExamen.ejercicio2;

public class SeguroVida extends Seguro {

    // CONSTRUCTOR
    public SeguroVida(Asegurado asegurado) {
        super(asegurado);
    }

    // METODOS
    public float calcularPrimaAnual() {
        float factorMultiplicado = 0;
        if (this.asegurado.getEdad() < 25) {
            factorMultiplicado = 1;
        } else if (this.asegurado.getEdad() >= 25 && this.asegurado.getEdad() <= 34) {
            factorMultiplicado = 1.1f;
        } else if (this.asegurado.getEdad() >= 35 && this.asegurado.getEdad() <= 44) {
            factorMultiplicado = 1.2f;
        } else if (this.asegurado.getEdad() >= 45 && this.asegurado.getEdad() <= 54) {
            factorMultiplicado = 1.3f;
        } else if (this.asegurado.getEdad() >= 55 && this.asegurado.getEdad() <= 64) {
            factorMultiplicado = 1.4f;
        } else if (this.asegurado.getEdad() >= 65) {
            System.out.println("No se puede contratar un seguro de vida");
            return 0;
        }
        return this.asegurado.getEdad() * factorMultiplicado;
    }
}
