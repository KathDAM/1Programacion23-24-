package segundaev.herencia2.ejer3;

public class Figura implements IRelacionable{
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
