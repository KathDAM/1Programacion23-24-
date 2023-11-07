package U5POO;

public class CocheApp {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota Corolla", "Azul", true, "ABC123", Coche.TipoCoche.FAMILIAR, 2023, Coche.ModalidadSeguro.TERCEROS);
        miCoche.imprimeCoche();
    }
}
