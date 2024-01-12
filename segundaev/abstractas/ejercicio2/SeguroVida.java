package segundaev.abstractas.ejercicio2;

public class SeguroVida extends Seguro {

    // CONSTRUCTOR
    public SeguroVida(int anyoNac, String nombre, String primerApellido, String segundoApellido, Asegurado asegurado) {
        super(anyoNac, nombre, primerApellido, segundoApellido, asegurado);
    }

    // METODOS
    public float calcularPrimaAnual() {
        float factorMultiplicado = 0;
        if (edad < 25) {
            factorMultiplicado = 1;
        } else if (edad >= 25 && edad <= 34) {
            factorMultiplicado = 1.1f;
        } else if (edad >= 35 && edad <= 44) {
            factorMultiplicado = 1.2f;
        } else if (edad >= 45 && edad <= 54) {
            factorMultiplicado = 1.3f;
        } else if (edad >= 55 && edad <= 64) {
            factorMultiplicado = 1.4f;
        } else if (edad >= 65) {
            System.out.println("No se puede contratar un seguro de vida");
            return 0;
        }
        return primaBase * factorMultiplicado;
    }
}
