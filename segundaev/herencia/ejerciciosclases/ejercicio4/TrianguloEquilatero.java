// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio4;

public class TrianguloEquilatero {
    // ATRIBUTOS
    private Punto punto1,punto2,punto3;

    // CONSTRUCTOR
    public TrianguloEquilatero( Punto punto1,  Punto punto2,  Punto punto3) {
        if (!esTrianguloEquilatero(punto1, punto2, punto3)) {
            System.out.println("Los puntos no forman un triángulo equilátero."); 
        }
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    // NUEVO CONSTRUCTOR
    public TrianguloEquilatero(Punto punto1, Punto punto2) {
        // Calcular el tercer punto para formar un triángulo equilátero
        double lado = punto1.distancia(punto2);
        double angulo = Math.toRadians(60); // Ángulo de 60 grados 

        double deltaX = punto2.getX() - punto1.getX();
        double deltaY = punto2.getY() - punto1.getY();

        double nuevoX = punto1.getX() + lado * Math.cos(angulo) + deltaY * Math.sin(angulo);
        double nuevoY = punto1.getY() + lado * Math.sin(angulo) - deltaX * Math.cos(angulo);

        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = new Punto(nuevoX, nuevoY);
    }

    // METODOS
    public void trasladarTriangulo(double x, double y){
        this.punto1.setX(this.punto1.getX() + x);
        this.punto1.setY(this.punto1.getY() + y);
        
        this.punto2.setX(this.punto2.getX() + x);
        this.punto2.setY(this.punto2.getY() + y);
        
        this.punto3.setX(this.punto3.getX() + x);
        this.punto3.setY(this.punto3.getY() + y);
    }

    public void escalarTriangulo(double factoresc){
        Punto puntoMasCercano = busquedaPuntoCercanoAlOrigen();

       /* Entendemos que el punto más cercano no varia:
        this.punto1.setX(puntoMasCercano.getX() * factoresc * (this.punto1.getX() - puntoMasCercano.getX()));
        this.punto1.setY(puntoMasCercano.getY() * factoresc * (this.punto1.getX() - puntoMasCercano.getX()));
        */
        this.punto2.setX(puntoMasCercano.getX() * factoresc * (this.punto2.getX() - puntoMasCercano.getX()));
        this.punto2.setY(puntoMasCercano.getY() * factoresc * (this.punto2.getX() - puntoMasCercano.getX()));
        
        this.punto3.setX(puntoMasCercano.getX() * factoresc * (this.punto3.getX() - puntoMasCercano.getX()));
        this.punto3.setY(puntoMasCercano.getY() * factoresc * (this.punto3.getX() - puntoMasCercano.getX()));
   
    }

    public double perimetroTriangulo(){
        double lado1 = punto1.distancia(punto2);
        double lado2 = punto2.distancia(punto3);
        double lado3 = punto3.distancia(punto1);

        return lado1 + lado2 + lado3;
    }

    private Punto busquedaPuntoCercanoAlOrigen() {
        double distancia1 = punto1.distancia(new Punto(0, 0));
        double distancia2 = punto2.distancia(new Punto(0, 0));
        double distancia3 = punto3.distancia(new Punto(0, 0));

        if (distancia1 <= distancia2 && distancia1 <= distancia3) {
            return punto1;
        } else if (distancia2 <= distancia1 && distancia2 <= distancia3) {
            return punto2;
        } else {
            return punto3;
        }
    }

    private static boolean esTrianguloEquilatero(Punto punto1, Punto punto2, Punto punto3) {
        double lado1 = punto1.distancia(punto2);
        double lado2 = punto2.distancia(punto3);
        double lado3 = punto3.distancia(punto1);

        return Math.abs(lado1 - lado2) < 1-5 && Math.abs(lado2 - lado3) < 1-5 && Math.abs(lado3 - lado1) < 1-5;
    }
    
    public String toString(){
        return "   Triangulo: P1" + punto1.toString() + ", P2" + punto2.toString() + ", P3" + punto3.toString();
    }
}
