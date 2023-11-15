//Catherine AM
package unidad5.ejercicio3;

public class Punto {
    // ATRIBUTOS
    private double x, y;

    // CONSTRUCTOR CON PARAMETROS
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //CONSTRUCTOR SIN PARAMETROS
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // GETTER
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // SETTER
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // METODOS
    public void imprimirCoordenadas() {
        System.out.print("(" + x + " , " + y + ")");
        System.out.println();
    }

    //calcula distancia a otro punto
    public double distancia(Punto otroPunto) {
        double distanciaX = this.x - otroPunto.getX();
        double distanciaY = this.y - otroPunto.getY();
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    //calcula distancia al origen
    public double distancia() {
        return Math.sqrt(x * x + y * y);

    }

//--------------------------------------------------------------------------------------------------------

/* 
    //calcula la distacia a otro punto
    public double calcularDistancia(Punto puntoB) {
        double distanciaX = this.x - puntoB.x; //se puede poner get
        double distanciaY = this.y - puntoB.y;
        return Math.sqrt((distanciaX * distanciaX) + (distanciaY * distanciaY));
    }

    //calcula la distancia al origen
    public double calcularDistanciaOrigen() {
        return Math.sqrt(x * x + y * y);
    }
*/

}
