//Catherine AM
package unidad5.ejercicio1;

public class CocheTest {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota Corolla", "Azul", true, "ABC123", Coche.tipoCoche.FAMILIAR, 2023, Coche.modalidadSeguro.TERCEROS);
        miCoche.imprimeCoche();
    }
}
