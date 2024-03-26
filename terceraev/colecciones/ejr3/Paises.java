package terceraev.colecciones.ejr3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Paises {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String,Integer> poblacionPais = new HashMap<>();
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(lect.nextLine());

            switch (opcion) {
                case 1:
                    anyadirPais(poblacionPais);
                    break;
                case 2:
                    consultarPoblacion(poblacionPais);
                    break;
                case 3:
                    eliminarPais(poblacionPais);
                    break;
                case 4:
                    imprimirListado(poblacionPais);
                    break;
                case 5:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Ópcion inválida. Elige una opción del 1 al 5");
                    break;
            }
            
        } while (opcion != 5);

        lect.close();
    }

    public static void mostrarMenu() {
        System.out.println("-------- MENU -------- \n" +
                            "1. Añadir país y población \n" +
                            "2. Consultar población país \n" +
                            "3. Eliminar pais \n" +
                            "4. Imprimir \n" +
                            "5. Salir \n");
        System.out.print("Seleciona una opcion del menu: ");
    }

   
    public static void anyadirPais(Map<String, Integer> poblacionPais) {
        System.out.print("Introduce el nombre del país: ");
        String nombrePais = lect.nextLine();

        System.out.print("Introduce la población del país: ");
        int poblacion = Integer.parseInt(lect.nextLine());

        if (poblacion < 0) {
            System.out.println("La población no puede ser negativa. Inténtalo de nuevo.");
            return;
        }

        poblacionPais.put(nombrePais, poblacion);
        System.out.println(" * País añadido correctamente.");
    }

    public static void consultarPoblacion(Map<String, Integer> poblacionPais) {
        if (poblacionPais.isEmpty()) {
            System.out.println("La lista de población está vacía.");
            return;
        }

        System.out.print("Introduce el nombre del país a consultar: ");
        String nombrePais = lect.nextLine();

        if (poblacionPais.containsKey(nombrePais)) {
            System.out.println(" * La población en el pais ' " + nombrePais + " ' es: " + poblacionPais.get(nombrePais));
        } else {
            System.out.println("El país ' " + nombrePais + " ' no se encuentra en la lista.");
        }
    }

    public static void eliminarPais(Map<String, Integer> poblacionPais) {
        if (poblacionPais.isEmpty()) {
            System.out.println("La lista de población está vacía.");
            return;
        }

        System.out.print("Introduce el nombre del país que quieres eliminar: ");
        String paisEliminar = lect.nextLine();
        if (poblacionPais.containsKey(paisEliminar)) {
            poblacionPais.remove(paisEliminar);
            System.out.println(" * Se ha eliminado el país '" + paisEliminar + "' correctamente.");
        } else {
            System.out.println("El país ' " + paisEliminar + " ' no se encuentra en la lista.");
        }
    }

    public static void imprimirListado(Map<String, Integer> poblacionPais) {
        if (poblacionPais.isEmpty()) {
            System.out.println("La lista de población está vacía.");
            return;
        }
        System.out.println("Listado de países y su población:");
        for (int i = 0; i < poblacionPais.size(); i++) {
            String pais = (String) poblacionPais.keySet().toArray()[i];
            int poblacion = poblacionPais.get(pais);
            System.out.println(" · " + pais + ", población : " + poblacion);
        }
    }

}
