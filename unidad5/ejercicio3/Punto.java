//Catherine AM
package unidad5.ejercicio3;

public class Punto {
    // ATRIBUTOS
    private double x, y;

    // CONSTRUCTOR
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // GETTER
    public double getGetX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // SETTER
    public void setGetX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // METODOS
    public void imprimirCoordenadas() {
        System.out.print("(" + x);
        System.out.print(" , " + y + ")");
        System.out.println();
    }

    public double calcularDistanciapuntoapunto(Punto puntoB) {
        result.x = this.x -puntoB;
        return x;
    }

    public double calcularDistanciaotropunto() {
        return 0;
    }

}
