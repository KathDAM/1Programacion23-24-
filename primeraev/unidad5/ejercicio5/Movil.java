//Catherine AM
package unidad5.ejercicio5;

import unidad5.ejercicio3.Punto;

public class Movil {
    //ATRIBUTOS
    private double velocidad;
    private Punto punto;
    private Recta movimiento;

    //CONSTRUCTOR
    public Movil(double velocidad,Punto punto,Recta movimiento) {
        this.velocidad = velocidad;
        this.punto = punto;
        this.movimiento = movimiento;
    }

    //GET
    public Recta getMovimiento() {
        return movimiento;
    }

    //METODOS

    public Punto trayectoriaPunto(double tiempo){
        double desplazamiento = velocidad * tiempo;
        double nuevaCoordenadaX = punto.getX() + desplazamiento;
        double nuevaCoordenadaY = movimiento.evaluarEnX(nuevaCoordenadaX);
        return new Punto(nuevaCoordenadaX, nuevaCoordenadaY);
    }

    public void imprimirPosicion(double tiempo){
        Punto posicion = trayectoriaPunto(tiempo);
        System.out.println("Posicion actual en el tiempo " + tiempo + ": " + posicion);
    }


    
}
