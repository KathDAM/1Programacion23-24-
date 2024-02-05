package segundaev.herencia2.ejer3;

public class Rectangulo extends Figura{
    // ATRIBUTOS
    private double base;
    private double altura;

    // CONSTRUCTOR
    public Rectangulo(double base, double altura) {
        super(base * altura);
        this.base = base;
        this.altura = altura;
    }

    // GETTER
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // SETTER
    public void setBase(double base) {
        this.base = base;
        super.setArea(base * altura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
        super.setArea(base * altura);
    }
}
