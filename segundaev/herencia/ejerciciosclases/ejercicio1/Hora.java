package segundaev.herencia.ejerciciosclases.ejercicio1;

public class Hora extends Examen{
    // ATRIBUTOS
    protected int hora;
    protected int minuto;
    
 
    // CONSTRUCTOR
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
 
    // GETTER
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
    return minuto;
    }
   

    // MÉTODOS
    public String toString(){
    return getHora() + " : " + getMinuto();
    }
}
