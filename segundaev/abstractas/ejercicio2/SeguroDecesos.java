package segundaev.abstractas.ejercicio2;

public class SeguroDecesos extends Seguro {
    
    // CONSTRUCTOR
    public SeguroDecesos(int anyoNac, String nombre, String primerApellido, String segundoApellido,Asegurado asegurado) {
        super(anyoNac, nombre, primerApellido, segundoApellido, asegurado);
    }

    // METODOS
    public float calcularPrimaAnual() {
        float primaAnual= 0;
        if (edad <= 18) {
            primaAnual = 10;
        } else if (edad >= 19 && 39 >= edad) {
            primaAnual = 22;
        } else if (edad >= 40 && 49 > edad) {
            primaAnual = 45;
        } else if (edad >= 50 && 55 > edad) {
            primaAnual = 62;
        } else if (edad >= 56 && 60 > edad) {
            primaAnual = 10;
        } else if (edad >= 61) {
            primaAnual = 10 * (edad - 60) + 88;
        } 
        return primaAnual;
    }
}
