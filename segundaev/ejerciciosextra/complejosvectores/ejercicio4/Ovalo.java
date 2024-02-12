/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaev.ejerciciosextra.complejosvectores.ejercicio4;

/**
 *
 * @author jsanm
 */
public class Ovalo extends Figura{
 
    private double semiejeMenor;
    private double semiejeMayor;

    public Ovalo(Color color, double semiejeMenor, double semiejeMayor) {
        super(color);
        this.nombreFigura = "Ovalo";
        if(semiejeMenor>0 && semiejeMayor>0){
            this.semiejeMenor = semiejeMenor;
            this.semiejeMayor = semiejeMayor;
        }
        else
            throw new RuntimeException("Los radios de un óvalo han de ser positivos");
        
    }

    public double getSemiejeMenor() {
        return semiejeMenor;
    }

    public double getSemiejeMayor() {
        return semiejeMayor;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*(semiejeMenor + semiejeMayor);
    }

    @Override
    public double calcularArea() {
         return Math.PI*semiejeMenor*semiejeMayor;
    }
    
    public String toString() {
        return String.format("%s - %.2f - %.2f - %.2f", super.toString(), this.semiejeMayor, this.semiejeMenor, this.calcularPerimetro());
    }
    
    public boolean equals(Object other){
        if(other==null || !(other instanceof Ovalo))
            return false;
        else{
            Ovalo otherOval = (Ovalo)other;
            return otherOval.calcularArea() == this.calcularArea() && otherOval.color == this.color;
        }
    }
}
