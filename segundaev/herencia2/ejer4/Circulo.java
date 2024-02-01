//Catherine AM
package segundaev.herencia2.ejer4;

public class Circulo extends Figura {
    // ATRIBUTOS
    private double radio;

    // CONSTRUCTOR
    public Circulo(double radio) {
        super(Math.PI * (radio * radio));
        this.radio = radio;
    }

    // GETTER
    public double getRadio() {
        return radio;
    }

    // SETTER
    public void setRadio(double radio) {
       this.radio = radio;
       super.setArea(Math.PI * (radio * radio)); //Actualiza el radio
    }
}
