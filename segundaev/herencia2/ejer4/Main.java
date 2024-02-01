//Catherine AM
package segundaev.herencia2.ejer4;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(8);
        Rectangulo rectangulo = new Rectangulo(5, 2.5);

        System.out.println("Area circulo: " + circulo.getArea());
        System.out.println("Area cuadrado: " + cuadrado.getArea());
        System.out.println("Area rectangulo: " + rectangulo.getArea());

        //Comparamos area figuras
        System.out.println("\nComparación de figuras:");
        if (circulo.compareTo(rectangulo) > 0) {
            System.out.println("El círculo tiene un área mayor que el rectángulo.");
        } else if (circulo.compareTo(rectangulo) < 0) {
            System.out.println("El círculo tiene un área menor que el rectángulo.");
        } else {
            System.out.println("El círculo y el rectángulo tienen el mismo área.");
        }

        // Comparamos figuras usando la interfaz 
        System.out.println("\nComparación de figuras usando IRelacionable:");
        if (circulo.esMayorQue(cuadrado)) {
            System.out.println("El círculo es mayor que el cuadrado.");
        } else if (rectangulo.esMenorQue(cuadrado)) {
            System.out.println("El rectángulo es menor que el cuadrado.");
        } else if (cuadrado.esIgualQue(circulo)) {
            System.out.println("El cuadrado es igual que el círculo.");
        }
   }
}
