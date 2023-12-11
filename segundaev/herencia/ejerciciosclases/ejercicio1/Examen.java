package segundaev.herencia.ejerciciosclases.ejercicio1;

public class Examen {
    // ATRIBUTOS
    protected String nombre;
    protected int aula;
    protected Fecha fecha;
    protected Hora hora;

  /*   // CONSTRUCTOR
    public Examen() {
       this.nombre = nombre;
       this.aula = aula;
       this.fecha = fecha;
       this.hora = hora;
    }
*/
    // GETTER
    public String getNombre() {
        return nombre;
    }

    public int getAula() {
        return aula;
    }

    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }


    
    

}
