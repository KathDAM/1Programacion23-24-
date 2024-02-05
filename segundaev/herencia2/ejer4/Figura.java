//Catherine AM
package segundaev.herencia2.ejer4;

public class Figura implements IRelacionable, Comparable<Figura>{
    //ATRIBUTOS
    private double area;

    // CONSTRUCTOR
    public Figura(double area) {
        this.area = area;
    }

    // GETTER
    public double getArea() {
        return area;
    }

    // SETTER
    public void setArea(double area) {
        this.area = area;
    }

    // METODOS
    public int compareTo(Figura comparaFigura){
        double comparacion = this.getArea() - comparaFigura.getArea();

        if (comparacion < 0) {
            return -1;
        } else if (comparacion > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean esMayorQue(IRelacionable a){
        if (a instanceof Figura) {
            Figura otraFigura = (Figura) a;
            return this.area > otraFigura.getArea();
        }
        return false;
    }

    public boolean esMenorQue(IRelacionable a){
        if (a instanceof Figura) {
            Figura otraFigura = (Figura) a;
            return this.area < otraFigura.getArea();
        }
        return false;
    }

    public boolean esIgualQue(IRelacionable a){
        if (a instanceof Figura) {
            Figura otraFigura = (Figura) a;
            return this.area == otraFigura.getArea();
        }
        return false;
    }
}
