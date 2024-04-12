package terceraev.avanzadoscolecciones.ej1;

import java.util.LinkedList;

public class Pila <G> { // ponemos <> para crear objetos de forma generica
    LinkedList<G> elementos = new LinkedList<>();
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();
        
        pila.anyadirPila("Objeto 1");
        pila.anyadirPila("Objeto 2");
        pila.anyadirPila("Objeto 3");
        
        while (!pila.estaVacia()) {
            System.out.println("Desapilamos: " + pila.eliminarPila());
        }
    }

    public void anyadirPila(G elemento) {
        elementos.addFirst(elemento); 
    }

    public G eliminarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return elementos.removeFirst(); 
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

}
