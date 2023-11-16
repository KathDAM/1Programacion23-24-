package unidad5.ejercicio5;

import unidad5.ejercicio3.Punto;

public class Movil {
    //ATRIBUTOS
    double velocidad;
    private Punto punto;
    private Recta movimiento;

    //CONSTRUCTOR
    public Movil(double velocidad) {
        this.velocidad = velocidad;
    }

    //GET
    public Recta getMovimiento() {
        return movimiento;
    }

    //METODOS

    public static double trayectoriaPunto(double velocidad){
        return velocidad;
    }


    
}
