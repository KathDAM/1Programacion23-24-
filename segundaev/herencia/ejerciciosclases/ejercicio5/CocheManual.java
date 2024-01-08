package segundaev.herencia.ejerciciosclases.ejercicio5;

public class CocheManual extends Coche{
    
    // CONSTRUCTOR
    public CocheManual(String matricula, double limiteVelocidad) {
        super(matricula,limiteVelocidad);
    }

    // METODOS
    public boolean acelerar(double incremento) {
        return super.acelerar(incremento);
    }
    
    protected boolean cambiaMarcha(int nuevaMarcha) {
        return super.cambiaMarcha(nuevaMarcha);
    }
}

