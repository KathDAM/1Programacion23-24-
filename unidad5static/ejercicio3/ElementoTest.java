//Catherine AM
package unidad5static.ejercicio3;

public class ElementoTest {
    public static void main(String[] args) {
        Elemento elemento1 = new Elemento("Elemento1");
        Elemento.incrementarContador();

        Elemento elemento2 = new Elemento("Elemento2");
        Elemento.incrementarContador();

        // Obtener el número total de elementos
        int totalElementos = Elemento.númeroDeElementos();

       // System.out.println("Nombre del elemento 1: " + elemento1.getNombre());

        System.out.println("Número total de elementos: " + totalElementos);
    }
}
    


