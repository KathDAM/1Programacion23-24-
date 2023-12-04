//Catherine AM
package unidad5static.ejercicio2;

public class PruebaPunto {
    public static void main(String[] args) {

        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto(0, 4);
        Punto punto3 = new Punto(2, -1);

        // Calcular y mostrar la distancia de los puntos al origen usando la constante ORIGEN
        double distanciapunto1 = punto1.distancia(Punto.ORIGEN);
        double distanciapunto2 = punto2.distancia(Punto.ORIGEN);
        double distanciapunto3 = punto3.distancia(Punto.ORIGEN);

        System.out.println("Distancia de (3,4) al origen: " + distanciapunto1);
        System.out.println("Distancia de (0,4) al origen: " + distanciapunto2);
        System.out.println("Distancia de (2,-1) al origen: " + distanciapunto3);
   
    }
}
