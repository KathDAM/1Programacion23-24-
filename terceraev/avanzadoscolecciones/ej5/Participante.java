package terceraev.avanzadoscolecciones.ej5;

public class Participante {
    private String nombre;
    private String apellido;
    private Genero genero;
    private int dorsal;

    // CONSTRUCTOR
    public Participante(String nombre, String apellido, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    // SETTER
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    // GETTER
    public int getDorsal() {
        return dorsal;
    }

    // METODOS
    public String toString() {
        return "Dorsal: " + dorsal + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Género: " + genero;
    }
}


