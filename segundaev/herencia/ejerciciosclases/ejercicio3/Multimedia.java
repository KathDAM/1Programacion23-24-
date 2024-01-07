// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio3;

public class Multimedia {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String formato;
    private int horas;
    private int minutos;
    private int segundos;

    // CONSTRUCTOR
    public Multimedia(String titulo, String autor, int añoPublicacion, String formato, int horas, int minutos, int segundos) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        establecerFormato(formato);
        establecerDuracion(horas, minutos, segundos);
    }

    // GETTER
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getFormato() {
        return formato;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    // METODOS 

    private void establecerFormato(String formato) {
        if (formato.equalsIgnoreCase("wav") || formato.equalsIgnoreCase("mp3") ||
            formato.equalsIgnoreCase("mp4") || formato.equalsIgnoreCase("mpeg") ||
            formato.equalsIgnoreCase("midi") || formato.equalsIgnoreCase("mov") ||
            formato.equalsIgnoreCase("ogg")) {
            this.formato = formato;
        } else {
            System.out.println("Formato incorrecto. Revisa los valores dados.");
        }
    }

    private void establecerDuracion(int horas, int minutos, int segundos) {
        if (horas < 0 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Duración incorrecta.Revisa los valores dados");
        } else {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    public boolean esIgual(Multimedia otro) {
        return autor.equalsIgnoreCase(otro.autor) && titulo.equalsIgnoreCase(otro.titulo);
    }

    public String toString() {
        return "Multimedia: Título=" + titulo + ", Autor=" + autor + ", Año de Publicación=" + añoPublicacion + ", Formato=" + formato + ", Duración=" + String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

}

