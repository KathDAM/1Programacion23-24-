// Catherine AM
package segundaev.herencia2.ejer5;

public abstract class ContenidoAudiovisual {
    
    //*************** PROPIEDADES Y CONSTANTES ESTÁTICAS ************************
    
    /**
     * Propiedad estática para contabilizar el número de objetos creados. Se maneja
     * internamente para calcular el código de cada objeto de forma incremental
     */
    private static int numObjetosCreados = 0;
    
    /**
     * Constante que formará parte del prefijo de todos los {@link #codigoContenido}
     */
    private final static String PREFIJO_CONTENIDO_AUDIOVISUAL = "CONTAUDV";
    
    /**
     * Constante que define la longitud de todos los {@link #codigoContenido}
     */
    private final static int LONGITUD_CODIGO_CONTENIDO = 15;

    
    //******************** PROPIEDADES ***************************
    /**
     * Código de contenido. No nulo. De longitud {@link ContenidoAudiovisual#LONGITUD_CODIGO_CONTENIDO}. 
     * Autocalculado empezando desde <code>CONTAUDV0000001</code>. De solo lectura.
     */
    protected String codigoContenido;
    
    /**
     * Título del contenido. No nulo. De lectura y escritura.
     */
    protected String titulo;
    
    /**
     * Idioma del contenido. No nulo. De lectura y escritura.
     */
    protected IdiomaEnum idioma;

    
    
    //***************************** CONSTRUCTORES **************************
    /**
     * Crea un contenido audiovisual. El {@link #codigoContenido} se autocalcula
     * @param titulo El título del contenido que se está inicializando. No puede ser nulo.
     * @param idioma El idioma del contenido. No puede ser nulo.
     * @see #calcularSiguienteCodigo() 
     */
    public ContenidoAudiovisual(String titulo, IdiomaEnum idioma){
        if(titulo == null || titulo.equalsIgnoreCase("")){
            //throw new RuntimeException("El título es obligatorio");
            System.out.println("El título es obligatorio");
        }
        else if(idioma == null){
            //throw new RuntimeException("El idioma es obligatorio");
            System.out.println("El idioma es obligatorio");
        }
        else{
            this.codigoContenido = ContenidoAudiovisual.calcularSiguienteCodigo();
            this.titulo = titulo;
            this.idioma = idioma;
        }    
        
    }
    
    //******************** MÉTODOS GET Y SET ***************************
    public String getCodigoContenido() {
        return codigoContenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.equalsIgnoreCase("")){
            //throw new RuntimeException("El título es obligatorio");
            System.out.println("El título es obligatorio");
        }
        else 
            this.titulo = titulo;
    }

    public IdiomaEnum getIdioma() {
        return this.idioma;
    }

    public void setIdioma(IdiomaEnum idioma) {
        if(idioma == null){
            //throw new RuntimeException("El idioma es obligatorio");
            System.out.println("El idioma es obligatorio");
        }
        else
            this.idioma = idioma;
    }
    
    //******************** MÉTODOS PRIVADOS Y ESTÁTICOS ****************************
    /**
     * Calcula el siguiente código de contenido, con el formato <code>CONTAUDVXXXXXXX</code>, empezando en
     * CONTAUDV0000001 y continuando por CONTAUDV0000002, CONTAUDV0000003...
     * @return 
     */
    private static String calcularSiguienteCodigo() {
        return PREFIJO_CONTENIDO_AUDIOVISUAL + padLeftZeros(LONGITUD_CODIGO_CONTENIDO-PREFIJO_CONTENIDO_AUDIOVISUAL.length(),++ContenidoAudiovisual.numObjetosCreados, '0');
    }
    
    /**
     * Completa un valor entero como cadena de caracteress con un caracter comodín a la izquierda hasta completar el tamaño 
     * indicado
     * @param leftPad Tamaño indicado
     * @param valueToPad Valor entero a completar con 0s a la izquierda
     * @param ch Caracter comodín con el que completar
     * @return el valor indicado como cadena de caracteres completado a la izquierda con tantos caracteres comodines sean necdesarios
     */
    private static String padLeftZeros(int leftPad, int valueToPad, char ch) {
        
        String valueToPadStr = Integer.valueOf(valueToPad).toString();
        while(valueToPadStr.length()<leftPad){
            valueToPadStr = Character.valueOf(ch).toString() + valueToPadStr;
        }
        return valueToPadStr;
    }
   
}
