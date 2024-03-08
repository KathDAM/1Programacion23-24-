/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author jsanm
 */
public class Circulo extends Figura {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public Circulo(Color color, double radio) {
        super(color);
        this.nombreFigura = "Círculo";
        if (radio > 0) {
            this.radio = radio;
        } else {
            throw new RuntimeException("El radio de un círculo ha de ser positivo o mayor a 0");
        }
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    public String toString() {
        return String.format("%s - %.2f - %.2f", super.toString(), this.radio, this.calcularArea());
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Circulo))
            return false;
        else {
            Circulo otherCircle = (Circulo) other;
            return otherCircle.radio == this.radio && otherCircle.color == this.color;
        }
    }

}
