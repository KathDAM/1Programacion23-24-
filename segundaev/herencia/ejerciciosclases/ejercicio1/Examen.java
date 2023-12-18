// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio1;

public class Examen {
    // ATRIBUTOS
    protected String nombre;
    protected String aula;
    protected Fecha fecha;
    protected Hora hora;

   // CONSTRUCTOR
    public Examen(String nombre, String aula, Fecha fecha, Hora hora) {
       this.nombre = nombre;
       this.aula = aula;
       this.fecha = fecha;
       this.hora = hora;
    }

    // GETTER
    public String getNombre() {
        return nombre;
    }

    public String getAula() {
        return aula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }

    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

  // MÉTODO
    public String toString() {
        return "Examen de " + nombre + " en la Aula " + aula + " en Fecha " + fecha + " y Hora " + hora;
    } 
}
