// Catherine AM
package segundaev.herencia2.ejer5;

public class Pelicula extends ContenidoAudiovisual{
   
    
    /**
     * Inicializa una {@link Pelicula} con todas sus propiedades.
     * @param titulo Título
     * @param idioma Idioma
     * @see ContenidoAudiovisual#ContenidoAudiovisual(java.lang.String, src.ejercicio5.IdiomaEnum) 
     */
    public Pelicula(String titulo, IdiomaEnum idioma){
        super(titulo, idioma);
    }
   
}
