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
public class Cuadrado extends Figura{
    
    private double lado;

    public double getLado() {
        return lado;
    }
    
    public Cuadrado(Color color, double lado){
        super(color);
        this.nombreFigura = "Cuadrado";
        if(lado>0)
            this.lado = lado;
        else
            System.out.println("El lado de un cuadrado ha de ser positivo");
    }

    @Override
    public double calcularPerimetro() {
        return 4*this.lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    
    public String toString() {
        return String.format("%s - %.2f - %.2f", super.toString(), this.lado, this.calcularArea());
    }
    
    public boolean equals(Object other){
        if(other==null || !(other instanceof Cuadrado))
            return false;
        else{
            Cuadrado otherSquare = (Cuadrado)other;
            return otherSquare.lado == this.lado && otherSquare.color == this.color;
        }
    }
}
