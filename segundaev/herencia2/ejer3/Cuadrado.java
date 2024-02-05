package segundaev.herencia2.ejer3;

public class Cuadrado extends Figura{
    // ATRIBUTOS
    private double lado;

    // CONSTRUCTOR
    public Cuadrado(double lado) {
        super(lado * lado);
        this.lado = lado;
    }

    // GETTER
    public double getLado() {
        return lado;
    }

    // SETTER
    public void setLado(double lado) {
        this.lado = lado;
        super.setArea(lado * lado);
    }
}
