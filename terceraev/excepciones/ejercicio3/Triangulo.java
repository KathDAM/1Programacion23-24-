/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraev.excepciones.ejercicio3;

/**
 * Escribe la clase Triangulo que se represente con tres puntos dibujados en el eje de coordenadas cartesianas. 
 * Esta clase ha de tener los siguientes métodos: 
 * @author jsanm
 */
public class Triangulo {
   
    /************************** PROPIEDADES PRIVADAS **************************/
    
    /**
     * Primer punto del triángulo
     * 
     */
    protected Punto punto1;
    
    /**
     * Segundo punto del triángulo
     */
    protected Punto punto2;
    
    /**
     * Tercer punto del triángulo
     */
    protected Punto punto3;
    
    /************************** CONSTRUCTORES **************************/
    /**
     * a. Un constructor que reciba como parámetros los puntos del triángulo. 
     * @param punto1 Primer punto del triángulo
     * @param punto2 Segundo punto del triángulo
     * @param punto3 Tercer punto del triángulo
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3){
        
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        
    }
    
    /************************** MÉTODOS **************************/
    
    /**
     * b. trasladar que, dado un desplazamiento en unidades del eje de coordenadas horizontal y otro en el eje de coordenadas vertical, 
     * mueva el triángulo a una nueva posición. 
     * @param despX Desplazamiento en el eje horizontal
     * @param despY Desplazamiento en el eje vertical
     */
    public void trasladar(float despX, float despY){
        
        //trasladamos el punto 1
        this.punto1.trasladar(despX, despY);
        
        //trasladamos el punto 2
        this.punto2.trasladar(despX, despY);
        
        //trasladamos el punto 3
        this.punto3.trasladar(despX, despY);
        
    }
    
    /**
     * c. escalar que, dado un factor de escala, escale el triángulo.  Para implementar el método, 
     * se deberá tener en cuenta el siguiente algoritmo 
     * <ol>
     *      <li>el punto del triángulo más cercano al eje de coordenadas se mantendrá invariado (PI). </li>
     * 
     *      <li>Los otros dos puntos, se escalarán en base al factor de escala, aumentando la distancia al PI en proporción al factor de escala. </li>
     * </ol>
     * @param factorDeEscala Factor de escala
     */
    public void escalar(double factorDeEscala){
        
        //calculamos el punto invariado (el más cercano)
        Punto puntoInvariado = this.obtenerPuntoMasCercanoOrigen();
        
        //asignamos los otros dos, en función del más cercano
        Punto puntoEscalarUno, puntoEscalarDos;        
        if (puntoInvariado == this.punto1){
            puntoEscalarUno = punto2;
            puntoEscalarDos = punto3;
        } else if (puntoInvariado == this.punto2){
            puntoEscalarUno = punto1;
            puntoEscalarDos = punto3;
        } else{
            puntoEscalarUno = punto1;
            puntoEscalarDos = punto2;
        }  
        
        //los escalamos proporcionalmente, en base a la distancia al punto más cercano y el factor de escala
        escalarPuntoProporcionalmente(puntoEscalarUno, puntoInvariado, factorDeEscala);
        escalarPuntoProporcionalmente(puntoEscalarDos, puntoInvariado, factorDeEscala);
    }
    
    
    /**
     * d. perimetro, que calcule el perímetro del triángulo. 
     * @return El perímetro del triángulo como la suma de distancias entre los tres puntos
     */
    public double perimetro(){
        return this.punto1.distancia(punto2) + this.punto2.distancia(punto3) + this.punto3.distancia(punto1) ;
    }
    
    /**
     * e. toString, que muestre los tres puntos del triángulo, uno por línea. 
     * @return 
     */
    @Override
    public String toString(){
        return "Punto 1: " + this.punto1 + "\n" + 
               "Punto 2: " + this.punto2 + "\n" + 
               "Punto 3: " + this.punto3;
    }
    
    /************************** MÉTODOS PRIVADOS (DE APOYO) **************************/
    /**
     * Escala un punto proporcionalmente en base a la distancia en coordenadas X e Y a un punto de referencia, en función
     * de un factor de escala
     * @param punto punto a escalar. De entrada / salida (varía en este método)
     * @param puntoReferencia punto de referencia para calcular la distancia al punto a escalar
     * @param factorDeEscala factor de escalar
     */
    private static void escalarPuntoProporcionalmente(Punto punto, Punto puntoReferencia, double factorDeEscala){
        
        //calculamos las distancias al punto de referencia en las coordenadas X e Y
        float distanciaHorizontalReferencia = punto.getX() - puntoReferencia.getX();
        float distanciaVerticalReferencia = punto.getY() - puntoReferencia.getY();
        
        //escalamos proporcionalmente
        float x = (float)(distanciaHorizontalReferencia * factorDeEscala) + puntoReferencia.getX();
        float y = (float)(distanciaVerticalReferencia * factorDeEscala) + puntoReferencia.getY();        

        //cambiamos el punto
        punto.setX(x);
        punto.setY(y);
        
    }
    
    private Punto obtenerPuntoMasCercanoOrigen(){
        
        Punto origen = new Punto();
        
        double distanciaPunto1 = Math.abs(origen.distancia(this.punto1));
        double distanciaPunto2 = Math.abs(origen.distancia(this.punto2));
        double distanciaPunto3 = Math.abs(origen.distancia(this.punto3));
        
        if (distanciaPunto1 < distanciaPunto2 && distanciaPunto1 < distanciaPunto3){
            return this.punto1;
        }else if (distanciaPunto2 < distanciaPunto1 && distanciaPunto2 < distanciaPunto3){
            return this.punto2;
        }else{
            return this.punto3;
        }
    }


}
