//Catherine AM
package unidad5static.ejercicio5;

public class BombillaTest {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();

        //Se visualiza si luce o no 
        bombilla.imprimirEstadoBombilla();

        //Encendemos la bombilla
        bombilla.cambiarEstadoBombilla(true);

        //Volvemos a visualizar el estado de la bombilla
        bombilla.imprimirEstadoBombilla();

        // Encendemos el interruptor general
        bombilla.cambiarEstadoGeneral(true);

        // Verificamos el  último estado 
        bombilla.imprimirEstadoBombilla();

    }
  
}
