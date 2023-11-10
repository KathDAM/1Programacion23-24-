//Catherine AM
package unidad5.ejercicio3;

public class PuntoTest {
    public static void main(String[] args) {

        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(5, 3);
        Punto punto3 = new Punto(2, -1);
        Punto punto4 = new Punto((punto2.getGetX() + punto3.getGetX()) / 2, (punto2.getY() + punto3.getY()) / 2);
        
        System.out.print("Punto 1: ");
        punto1.imprimirCoordenadas();

        System.out.print("Punto 2: ");
        punto2.imprimirCoordenadas();

        System.out.print("Punto 3: ");
        punto3.imprimirCoordenadas();

        System.out.print("Punto 4: ");
        punto4.imprimirCoordenadas();

    }
}
