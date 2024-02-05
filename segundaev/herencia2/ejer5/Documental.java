// Catherine AM
package segundaev.herencia2.ejer5;

public class Documental extends ContenidoAudiovisual {
 
    /**
     * Categoría del documental. Admite nulos.
     */
    private CategoriaDocumentalEnum categoria;

    public CategoriaDocumentalEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDocumentalEnum categoria) {
        this.categoria = categoria;
    }
    
    /**
     * Inicializa un {@link Documental} con todas sus propiedades.
     * @param titulo Título
     * @param idioma Idioma
     * @param categoria Categoría
     * @see ContenidoAudiovisual#ContenidoAudiovisual(java.lang.String, src.ejercicio5.IdiomaEnum)
     */
    public Documental(String titulo, IdiomaEnum idioma, CategoriaDocumentalEnum categoria){
        super(titulo, idioma);
        this.categoria = categoria;
    }
    
    /**
     * Inicializa un {@link Documental} con título e idioma, mientras que la categoría no se inicializa.
     * @param titulo Título
     * @param idioma Idioma
     * @see Documental#Documental(java.lang.String, src.ejercicio5.IdiomaEnum, src.ejercicio5.CategoriaDocumentalEnum) 
     */
    public Documental(String titulo, IdiomaEnum idioma){
        this(titulo, idioma, null);
    }
}
