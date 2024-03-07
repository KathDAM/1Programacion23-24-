// Catherine AM
package ejercicio3;

public class Main {
    public static void main(String[] args) {
        /*CAMBIOS EN MAIN(try catch) */
        try {
            Coche coche = new Coche("Toyota", "Corolla", 2022);
            coche.avanzar(80);
            coche.reiniciarKmRecorridos();

            // Comprobueba el cuentakilómetros reiniciado
            System.out.println("Cuentakilómetros después de reiniciar: " + coche.getKmRecorridos() + " km");
        
        } catch (RuntimeException e) {
            System.out.println("Error al crear Coche: " + e.getMessage());
        }
        
    }
}
 