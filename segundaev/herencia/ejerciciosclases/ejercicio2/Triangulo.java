package segundaev.herencia.ejerciciosclases.ejercicio2;

public class Triangulo {
    // ATRIBUTOS
    private Punto punto1,punto2,punto3;

    // CONSTRUCTOR
    public Triangulo( Punto punto1,  Punto punto2,  Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    // METODOS
    public void trasladarTriangulo(double x, double y){
        
        this.punto1.setX(this.punto1.getX()+ x);
        this.punto2.setX(this.punto2.getX()+ x);
        this.punto3.setX(this.punto3.getX() + x);
        
        

    }

    public void escalarTriangulo(){
        
    }

    public double perimetroTriangulo(){
       double perimetro = punto1 + punto2 + punto3;
       return  perimetro;
    }

    public String toString(){

    }
}
