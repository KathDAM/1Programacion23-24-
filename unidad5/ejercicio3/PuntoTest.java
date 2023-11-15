//Catherine AM
package unidad5.ejercicio3;

public class PuntoTest {
    public static void main(String[] args) {

        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(5, 3);
        Punto punto3 = new Punto(2, -1);
        Punto punto4 = new Punto((punto2.getX() + punto3.getX()) / 2, (punto2.getY() + punto3.getY()) / 2);
        Punto punto5 = new Punto(4, 3);
        
        System.out.print("Punto 1: ");
        punto1.imprimirCoordenadas();

        System.out.print("Punto 2: ");
        punto2.imprimirCoordenadas();

        System.out.print("Punto 3: ");
        punto3.imprimirCoordenadas();

        System.out.print("Punto 4: ");
        punto4.imprimirCoordenadas();

        //Calcula la distancia de punto 1 a punto 2
        double distanciaEntrePuntos = punto1.distancia(punto2);
        System.out.println("Distancia entre puntos: " + distanciaEntrePuntos);

        //Calcula y muestra distancia del punto(4,3) al origen 
        double distanciaAlOrigen = punto5.distancia();
        System.out.println("Distancia al origen: " + distanciaAlOrigen);

//--------------------------------------------------------------------------------------------------------

/* 
        //Calcula la distancia de punto 1 a punto 2
        double distancia = punto1.calcularDistancia(punto2);
        System.out.println("La distancia entre los puntos es: " + distancia);

        // Calcula y muestra distancia del punto(4,3) al origen 
        Punto punto5 = new Punto(4, 3);
        double distanciaAlOrigen = punto5.calcularDistanciaOrigen();
        System.out.println("Distancia del punto (4,3) al origen: " + distanciaAlOrigen);
*/  
    }
}
