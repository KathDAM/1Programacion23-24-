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
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

    public Rectangulo(Color color, double base, double altura) {
        super(color);
        this.nombreFigura = "Rectangulo";
        if(base>0)
            this.base = base;
        else
            throw new RuntimeException("La base de un rectángulo ha de ser positiva");
        if(altura>0)
            this.altura = altura;
        else
            throw new RuntimeException("La altura de un rectángulo ha de ser positiva");
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*base + 2*altura;
    }

    @Override
    public double calcularArea() {
         return base*altura;
    }
    
    public String toString() {
        return String.format("%s - %.2f - %.2f - %.2f", super.toString(), this.base, this.altura, this.calcularPerimetro());
    }
    
    public boolean equals(Object other){
        if(other==null || !(other instanceof Rectangulo))
            return false;
        else{
            Rectangulo otherCircle = (Rectangulo)other;
            return otherCircle.calcularArea() == this.calcularArea() && otherCircle.color == this.color;
        }
    }
    
}
