//Catherine AM
package unidad5.ejercicio3;

public class Punto {
    //ATRIBUTOS
    private double x,y;

    //CONSTRUCTOR
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //GETTER
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    //SETTER
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //METODOS
    public void imprimirCoordenadas(){
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
    }

    public double calcularDistanciapuntoapunto(){
        return 0;
    }

    public double calcularDistanciaotropunto(){
        return 0;
    }


}
