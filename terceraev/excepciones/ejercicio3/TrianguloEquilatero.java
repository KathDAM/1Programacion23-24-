package terceraev.excepciones.ejercicio3;

/**
 * Recupera la clase triángulo del ejercicio 2. 
 * <p>
 * Define con ella una nueva clase para representar un rectángulo equilátero.  
 * @author jsanm
 */
public class TrianguloEquilatero extends Triangulo{
    
    /**
     * Los lados de un triángulo se considerarán iguales aunque difieran en esta longitud
     */
    private final static double MAX_DIFERENCIA_LADOS = 0.0001;
    
    /**
     * Crea un triángulo equilátero en base a tres puntos indicados. 
     * <p>Si las distancias entre sí no son iguales, se lanza un error
     * @param punto1 Punto uno
     * @param punto2 Punto dos
     * @param punto3 Punto tres
     * @throws NoFormaTrianguloEquilateroException 
     */
    public TrianguloEquilatero(Punto punto1, Punto punto2, Punto punto3) throws NoFormaTrianguloEquilateroException{
        super(punto1, punto2, punto3);
       
        //a. En el constructor, si los puntos suministrados no forman un triángulo equilátero, debes dar un error. 
        if (!formanTrianguloEquilatero(punto1, punto2, punto3)){
            throw new NoFormaTrianguloEquilateroException("No es un triángulo equilátero");
        }
        
    }
    
    
    /**
     * Añade un nuevo constructor que reciba solo dos puntos. 
     * El tercero, lo debe calcular la propia clase siguiendo reglas trigonométricas. 
     * Ten en cuenta que los ángulos de un triángulo equilátero son de 60º (en la clase Math tienes funciones para calcular el seno y el coseno de un ángulo en radianes) 
     * 
     */
    /**
     * Crea un triángulo equilátero en base a dos puntos. El tercer punto del triángulo se calcula
     * @param punto1 Punto uno
     * @param punto2 Punto dos
     * @throws Exception 
     */
    public TrianguloEquilatero(Punto punto1, Punto punto2) throws NoFormaTrianguloEquilateroException{
        this(punto1, punto2, obtenerTercerPunto(punto1, punto2));
        
        
    }
    

    /************************** FUNCIONES PRIVADAS  **************************/
    
    /**
     * Función estática para validar si tres puntos forman un triángulo equilátero. 
     * @param punto1 Punto uno a validar
     * @param punto2 Punto dos a validar
     * @param punto3 Punto tres a validar
     * @return Si forman o no un triángulo equilátero, en base a las distancias entre ellos, salvando un margen de error.
     * @see #MAX_DIFERENCIA_LADOS
     */
    private static boolean formanTrianguloEquilatero(Punto punto1, Punto punto2, Punto punto3){
        
        double distanciaUnoADos = punto1.distancia(punto2);
        double distanciaDosATres = punto2.distancia(punto3);
        double distanciaTresAUno = punto3.distancia(punto1);
        
        return Math.abs(distanciaUnoADos - distanciaDosATres)<MAX_DIFERENCIA_LADOS && Math.abs(distanciaDosATres-distanciaTresAUno)<MAX_DIFERENCIA_LADOS;
    }
    
    /**
     * Función estática que calcula un punto en base a otros dos de tal forma que las distancias entre los tres 
     * son iguales, aplicando trigonometría.
     * @param punto1 Punto uno
     * @param punto2 Punto dos
     * @return el punto para el cual las distancias son equivalentes
     */
    private static Punto obtenerTercerPunto(Punto punto1, Punto punto2){
        float x = (float)((punto1.getX() + punto2.getX()) / 2 + (punto1.getY() - punto2.getY()) * Math.sqrt(3) / 2);
        float y = (float)((punto1.getY() + punto2.getY()) / 2 + (punto2.getX() - punto1.getX()) * Math.sqrt(3) / 2);
        return new Punto(x, y);
    }
    
}
