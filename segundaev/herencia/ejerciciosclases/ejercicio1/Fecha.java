package segundaev.herencia.ejerciciosclases.ejercicio1;

public class Fecha extends Examen {
    // ATRIBUTOS
    protected int dia;
    protected int mes;
    protected int año;

    // CONSTRUCTOR
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // GETTER
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }

    // MÉTODOS
    public String toString(){
        return getDia() + " / " + getMes() + " / " + getAño();
    }
}
