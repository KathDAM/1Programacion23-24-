package segundaev.herencia2.ejer3;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(8);
        Rectangulo rectangulo = new Rectangulo(5, 2.5);

        System.out.println("Area circulo: " + circulo.getArea());
        System.out.println("Area cuadrado: " + cuadrado.getArea());
        System.out.println("Area rectangulo: " + rectangulo.getArea());

        //Cambiamos atributos de las figuras
        circulo.setRadio(2);
        cuadrado.setLado(5);
        rectangulo.setAltura(3);
        rectangulo.setBase(1);

        System.out.println("Area circulo: " + circulo.getArea());
        System.out.println("Area cuadrado: " + cuadrado.getArea());
        System.out.println("Area rectangulo: " + rectangulo.getArea());
    }
}
