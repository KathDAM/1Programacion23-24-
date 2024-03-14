 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraev.excepciones.ejercicio3;

/**
 * Escribe una clase Punto que represente un punto en coordenadas cartesianas x e y, y que contenga  
 *      
 *      a. los métodos getters y setters y un constructor para inicializar las coordenadas. 
 *          Por defecto, un punto estará en el origen de coordenadas. 
 * 
 *      b. La función distancia que, dado un segundo punto, calcule la distancia del objeto a dicho punto. 
 *      Para implementar la función, puedes valerte de esta referencia: https://www.superprof.es/apuntes/escolar/matematicas/analitica/vectores/dis tancia-entre-dos-puntos.html 
 * 
 *      c. Además, una función para representar un punto como cadena de caracteres. Utiliza para ello el formato (x, y)
 * 
 * @author jsanm
 */
public class Punto {
    
    /************************** PROPIEDADES PRIVADAS **************************/
    /**
     * Coordenada x del punto
     */
    private float x;
    /**
     * Coordenada y del punto
     */
    private float y;
    
    /************************** CONSTRUCTORES **************************/
    /**
     * Crea un punto indicando las coordenadas
     * @param x Coordenada x
     * @param y Coordenada y
     */
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * Crea un punto en el eje de coordenadas (0, 0)
     */
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
    
    /************************** GETTERS Y SETTERS **************************/
    public float getX(){
        return this.x;
    }
    
    public void setX(float newX){
        this.x = newX;
    }
    
    public float getY(){
        return this.y;
    }
    
    public void setY(float newY){
        this.y = newY;
    }
    
    /************************** MÉTODOS **************************/
    @Override
    public String toString(){
        //respetamos el formato (x, y) indicado en el enunciado. Añadimos precisión de dos decimales
        return "(" + this.x +", " + this.y + ")";
    }
    
    /**
     * Calcula la distancia entre el punto invocante y otro punto
     * @param that El otro punto sobre el que calcular la distancia
     * @return Distancia entre un punto y otro indicado por parámetro
     */
    public double distancia(Punto that){
        return Math.sqrt((Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)));
    }
    
    /**
     * Mueve el punto incrementalmente
     * @param despX Desplazamiento en coordenada horizontal
     * @param despY Desplazamiento en coordenada vertical
     */
    public void trasladar(float despX, float despY){
        this.x += despX;
        this.y += despY;
    }
        
    
   
    
}
