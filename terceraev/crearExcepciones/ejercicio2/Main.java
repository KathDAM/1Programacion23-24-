// Catherine AM
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        /*CAMBIOS EN MAIN(try catch) */
        try {
            Coche coche = new Coche("Toyota", "Corolla", 2022);
            coche.avanzar(80);
            coche.reiniciarKmRecorridos();
    
            // Comprueba el cuentakilómetros reiniciado
            System.out.println("Cuentakilómetros después de reiniciar: " + coche.getKmRecorridos() + " km");
        
        } catch (Exception e) {
            System.out.println("Error al crear Profesores: " + e.getMessage());
        }
       
    }
}
  