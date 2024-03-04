// Catherine AM
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2022);
        coche.avanzar(80);
        coche.reiniciarKmRecorridos();

        // Comprobueba el cuentakilómetros reiniciado
        System.out.println("Cuentakilómetros después de reiniciar: " + coche.getKmRecorridos() + " km");
    
    }
}
 