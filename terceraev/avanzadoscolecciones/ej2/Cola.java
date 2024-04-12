package terceraev.avanzadoscolecciones.ej2;

import java.util.LinkedList;

public class Cola<G> {  // ponemos <> para crear objetos de forma generica
    LinkedList<G> elementos = new LinkedList<>();
    public static void main(String[] args) {
        Cola<String> cola = new Cola<>();
        
        cola.anyadidoCola("Objeto 1");
        cola.anyadidoCola("Objeto 2");
        cola.anyadidoCola("Objeto 3");
        
        while (!cola.estaVacia()) {
            System.out.println("Eliminado de la cola: " + cola.quitadoCola());
        }
    }

    public void anyadidoCola(G elemento) {
        elementos.addLast(elemento);
    }

    public G quitadoCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return null;
        }
        return elementos.removeFirst();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
