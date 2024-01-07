// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio3;

public class Pelicula extends Multimedia{
    // ATRIBUTOS 
    private String actorPrincipal;
    private String actrizPrincipal;

    // CONSTRUCTOR
    public Pelicula(String titulo, String autor, int añoPublicacion,  String formato, int horas, int minutos, int segundos, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, añoPublicacion, formato, horas, minutos, segundos);
        establecerActorPrincipal(actorPrincipal);
        establecerActrizPrincipal(actrizPrincipal);
        validarFormatoPelicula();
    }

    // SETTER
    public void setActorPrincipal(String actorPrincipal) {
        establecerActorPrincipal(actorPrincipal);
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        establecerActrizPrincipal(actrizPrincipal);
    }

    // GETTER
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    // METODOS 
    private void establecerActorPrincipal(String actorPrincipal) {
        if (actorPrincipal == null || actorPrincipal.trim().isEmpty()) {
            System.out.println("El actor principal no puede estar vacío.");
        }
        this.actorPrincipal = actorPrincipal;
    }

    private void establecerActrizPrincipal(String actrizPrincipal) {
        if (actrizPrincipal == null || actrizPrincipal.trim().isEmpty()) {
            System.out.println("La actriz principal no puede estar vacía.");
        }
        this.actrizPrincipal = actrizPrincipal;
    }

    private void validarFormatoPelicula() {
        if (!getFormato().equalsIgnoreCase("midi") && !getFormato().equalsIgnoreCase("mpeg") && !getFormato().equalsIgnoreCase("mov")) {
            System.out.println("Formato de película no válido. Solo se permiten midi, mpeg y mov.");
        }
    }

    public String toString() {
        return super.toString() + ", Actor Principal=" + actorPrincipal + ", Actriz Principal=" + actrizPrincipal;
    }  
}
