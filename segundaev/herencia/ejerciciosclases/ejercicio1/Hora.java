// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio1;

public class Hora{
    // ATRIBUTOS
    private int hora;
    private int minuto;
    
 
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

    public void actualizarHora(int nuevaHora, int nuevoMinuto) {
        this.hora = nuevaHora;
        this.minuto = nuevoMinuto;
    }
}
