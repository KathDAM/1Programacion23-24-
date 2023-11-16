//Catherine AM
package unidad5.ejercicio5;

import unidad5.ejercicio3.Punto;

public class Main {
    public static void main(String[] args) {
        // Crear un móvil con velocidad 2.4 metros/segundo, posición inicial (2.1, 5.2),
        // y que se mueve sobre la recta y = 2x + 1
        Punto puntoInicial = new Punto(2.1, 5.2);
        Recta trayectoria = new Recta(2, 1);
        Movil movil = new Movil(2.4, puntoInicial, trayectoria);

        // Imprimir la posición del móvil en diferentes momentos del tiempo
        movil.imprimirPosicion(3.5);
        movil.imprimirPosicion(4);
        movil.imprimirPosicion(6.2);
    }
}
