package segundaev.herencia.ejerciciosclases.ejercicio3;

public class Cancion extends Multimedia {
    // ATRIBUTO
    private String estudioGrabacion;

    // CONSTRUCTOR
    public Cancion(String titulo, String autor, int añoPublicacion, String formato, int horas, int minutos, int segundos, String estudioGrabacion) {
        super(titulo, autor, añoPublicacion, formato, horas, minutos, segundos);
        establecerEstudioGrabacion(estudioGrabacion);
    }

    // SETTER
    public void setEstudioGrabacion(String estudioGrabacion) {
        establecerEstudioGrabacion(estudioGrabacion);
    }

    // GETTER
    public String getEstudioGrabacion() {
        return estudioGrabacion;
    }

    // METODOS
    private void establecerEstudioGrabacion(String estudioGrabacion) {
        if (estudioGrabacion == null || estudioGrabacion.trim().isEmpty()) {
            System.out.println("El estudio de grabación no puede estar vacío.");
        }
        this.estudioGrabacion = estudioGrabacion;
    }

    public String toString() {
        return super.toString() + ", Estudio de Grabación=" + estudioGrabacion;
    }
}
