// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio2;

public class Punto {
    // ATRIBUTOS
    protected double x,y;

    // CONSTRUCTOR
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // CONSTRUCTOR Inicializa las coordenadas en el origen por defecto (0,0)
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // SET
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // GET
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // METODOS
    public double distancia(Punto otroPunto){
        double distanciaX = this.x - otroPunto.getX();
        double distanciaY = this.y - otroPunto.getY();
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    public String toString() {
        return "( " + x + " , " + y + " )";
    }
}
