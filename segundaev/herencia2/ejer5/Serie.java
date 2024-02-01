// Catherine AM
package segundaev.herencia2.ejer5;

public class Serie extends ContenidoAudiovisual{
    
    /**
     * Número de capítulos de todas las temporadas
     */
    private int numCapitulosTemporadas;

   
    
    /**
     * Inicializa un {@link Serie} con todas sus propiedades.
     * @param titulo Título
     * @param idioma Idioma
     * @param numCapitulosTemporadas Número de capítulos entre todas las temporadas. Ha de ser positivo
     * @see ContenidoAudiovisual#ContenidoAudiovisual(java.lang.String, src.ejercicio5.IdiomaEnum)
     */
    public Serie(String titulo, IdiomaEnum idioma, int numCapitulosTemporadas){
        super(titulo, idioma);
        this.setNumCapitulosTemporadas(numCapitulosTemporadas);
    }

    /**
     * Establece la propiedad {@link #numCapitulosTemporadas}. 
     * @param numCapitulosTemporadas Nuevo valor de la propiedad. Ha de ser un valor positivo.
     */
    private void setNumCapitulosTemporadas(int numCapitulosTemporadas) {
        if(numCapitulosTemporadas<=0){
            //throw new RuntimeException("El número de capítulos ha de ser un valor positivo");
            System.out.println("El número de capítulos ha de ser un valor positivo");
        }
        else
            this.numCapitulosTemporadas = numCapitulosTemporadas;
    }
    
    public int getNumCapitulosTemporadas() {
        return numCapitulosTemporadas;
    }
}
