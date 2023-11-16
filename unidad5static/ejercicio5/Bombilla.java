//Catherine AM
package unidad5static.ejercicio5;

public class Bombilla {
    //ATRIBUTOS
    private boolean interruptorbombilla;
    private boolean interruptorgeneral;
    
    //CONSTRUCTOR
    public Bombilla() {
        this.interruptorbombilla = false;
        this.interruptorgeneral = false;
    }

    //METODOS
    public void cambiarEstadoBombilla(boolean estado){
        this.interruptorbombilla = estado; //interruptorbombilla = !interruptorbombilla;
    }

    public void cambiarEstadoGeneral(boolean estado){
        this.interruptorgeneral = estado;
    }

    public boolean bombillaLuce(){
        return interruptorbombilla && interruptorgeneral; //verificamos tanto la bombilla como el general esten en true
    }

    public void imprimirEstadoBombilla() {
        if (bombillaLuce()) {
            System.out.println("La bombilla está ON (encendida).");
        } else {
            System.out.println("La bombilla está OFF (apagada).");
        }
    }
}
