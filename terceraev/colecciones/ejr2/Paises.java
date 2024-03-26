package terceraev.colecciones.ejr2;

import java.util.LinkedList;
import java.util.Scanner;

public class Paises {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<>();
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(lect.nextLine());

            switch (opcion) {
                case 1:
                    anyadirPais(paises);
                    break;
                    case 2:
                    consultarPaisPorPosicion(paises);
                    break;
                case 3:
                    eliminarPaisPorPosicion(paises);
                    break;
                case 4:
                    consultarPaisPorValor(paises);
                    break;
                case 5:
                    eliminarPaisPorValor(paises);
                    break;
                case 6:
                    imprimirListado(paises);
                    break;
                case 7:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Ópcion inválida. Elige una opción del 1 al 7");
                    break;
            }
            
        } while (opcion != 7);


        lect.close();
    }

    public static void mostrarMenu() {
        System.out.println("-------- MENU -------- \n" +
                            "1. Añadir \n" +
                            "2. Consultar por posición \n" +
                            "3. Eliminar por posición \n" +
                            "4. Consultar por valor \n" +
                            "5. Eliminar por valor \n" +
                            "6. Imprimir \n" +
                            "7. Salir \n");
        System.out.print("Seleciona una opcion del menu: ");
    }

    public static void anyadirPais(LinkedList<String> paises) {
        System.out.print("Introduce el nombre del país: ");
        String pais = lect.nextLine();
        paises.add(pais);
        System.out.println("País añadido correctamente.");
    }

    public static void consultarPaisPorPosicion(LinkedList<String> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce la posición del país a consultar: ");
        int posicion = Integer.parseInt(lect.nextLine());

        if (posicion >= 0 && posicion < paises.size()) {
            System.out.println("El país con la posición " + posicion + " es: " + paises.get(posicion));
        } else {
            System.out.println("La posición es inválida, está fuera de rango.");
        }
    }

    public static void eliminarPaisPorPosicion(LinkedList<String> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce la posición del país que quieres eliminar: ");
        int posicionEliminar = Integer.parseInt(lect.nextLine()); 
        if (posicionEliminar >= 0 && posicionEliminar < paises.size()) {
            String paisEliminado = paises.remove(posicionEliminar);
            System.out.println(" * Se ha eliminado el país '" + paisEliminado + "' correctamente.");
        } else {
            System.out.println("La posición es inválida, está fuera de rango.");
        }
    }


    public static void eliminarPaisPorValor(LinkedList<String> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }
        
        System.out.print("Introduce el nombre del país a eliminar: ");
        String pais = lect.nextLine();

        if (paises.contains(pais)) {
            paises.remove(pais);
            System.out.println(" * Se ha eliminado el país '" + pais + "' correctamente.");
        } else {
            System.out.println("El país '" + pais + "' no se encuentra en la lista.");
        }  }

    public static void consultarPaisPorValor(LinkedList<String> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce el nombre del país a consultar: ");
        String pais = lect.nextLine();

        if (paises.contains(pais)) {
            System.out.println(" * El país '" + pais + "' se encuentra en la lista.");
        } else {
            System.out.println(" * El país '" + pais + "' no se encuentra en la lista.");
        }   }

    public static void imprimirListado(LinkedList<String> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }
        System.out.println("Lista de países:");
        for (int i = 0; i < paises.size(); i++) {
            System.out.println("  " + i  + ". " + paises.get(i));
        }
    }

}
