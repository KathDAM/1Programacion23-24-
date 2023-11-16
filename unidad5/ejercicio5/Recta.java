//Catherine AM
package unidad5.ejercicio5;

public class Recta {
    //ATRIBUTOS
    private double pendiente;
    private double ordenadaAlOrigen;

    //CONSTRUCTOR
    public Recta(double pendiente, double ordenadaAlOrigen) {
        this.pendiente = pendiente;
        this.ordenadaAlOrigen = ordenadaAlOrigen;
    }

    //MÉTODO
    public double evaluarEnX(double x) {
        return pendiente * x + ordenadaAlOrigen;
    }
    
}