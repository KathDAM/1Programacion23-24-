// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio5;

public class Coche {
    // ATRIBUTOS
    private String matricula;
    private double velocidad;
    private int marcha;
    private double limiteVelocidad;

    // CONSTRUCTOR
    public Coche(String matricula, double limiteVelocidad) {
        this.matricula = matricula;
        this.limiteVelocidad = limiteVelocidad;
        this.velocidad = 0;
        this.marcha = 0;
    }

    // GETTERS
    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public double getLimiteVelocidad() {
        return limiteVelocidad;
    }

    // METODOS
    public boolean acelerar(double incremento) {
        if (velocidad + incremento <= limiteVelocidad) {
            velocidad += incremento;
            return true;  // Aceleración exitosa
        } else {
            // Velocidad máxima alcanzada
            System.out.println("Velocidad máxima alcanzada. No se puede acelerar más.");
            return false;
        }
    }

    public boolean frenar(double decremento) {
        if (velocidad - decremento >= 0) {
            velocidad -= decremento;
            return true;  // Frenado exitoso
        } else {
            // El coche se ha detenido
            System.out.println("El coche se ha detenido. No se puede frenar más.");
            velocidad = 0;  // Establecer velocidad a 0
            return false;
        }
    }

    protected boolean cambiaMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 0 && nuevaMarcha <= 6) {
            marcha = nuevaMarcha;
            return true;
        } else {
            System.out.println("Marcha no válida. Debe estar en el rango 0..6.");
            return false;
        }
    }

    public String toString() {
        return "Coche: Matrícula=" + matricula + ", Velocidad=" + velocidad +", Marcha=" + marcha +", Límite de Velocidad Máxima=" + limiteVelocidad;
    }

}

