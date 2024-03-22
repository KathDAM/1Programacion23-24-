package terceraev.colecciones.ejr1;

import java.util.ArrayList;
import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        Scanner lect = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-------- MENU -------- \n" +
                                "1. Añadir \n" +
                                "2. Consultar \n" +
                                "3. Eliminar \n" +
                                "4. Imprimir \n" +
                                "5. Salir \n");
            System.out.print("Seleciona una opcion del menu: ");
            opcion = Integer.parseInt(lect.nextLine());

            switch (opcion) {
                case 1:
                    anyadirPais(paises, lect);
                    break;
                case 2:
                    consultarPais(paises, lect);
                    break;
                case 3:
                    eliminarPais(paises, lect);
                    break;
                case 4:
                    imprimirListado(paises);
                    break;
                case 5:
                    System.out.println("Saliendo del menu...");
                    break;
            
                default:
                    System.out.println("Ópcion inválida. Elige una opción del 1 al 5");
                    break;
            }
            
        } while (opcion != 5);


        lect.close();
    }

    public static void anyadirPais(ArrayList<String> paises, Scanner lect) {
        System.out.print("Introduce el nombre del país: ");
        String pais = lect.nextLine();
        paises.add(pais);
        System.out.println("País añadido correctamente.");
    }

    public static void consultarPais(ArrayList<String> paises, Scanner lect) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce la posición del país a consultar: ");
        int posicion = lect.nextInt();

        if (posicion >= 0 && posicion < paises.size()) {
            System.out.println("El país con la posición " + posicion + " es: " + paises.get(posicion));
        } else {
            System.out.println("La posición es inválida, está fuera de rango.");
        }
    }

    public static void eliminarPais(ArrayList<String> paises, Scanner lect) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce la posición del país que quieres eliminar: ");
        int posicionEliminar = lect.nextInt(); 
        if (posicionEliminar >= 0 && posicionEliminar < paises.size()) {
            String paisEliminado = paises.remove(posicionEliminar);
            System.out.println("Se ha eliminado el país '" + paisEliminado + "' correctamente.");
        } else {
            System.out.println("La posición es inválida, está fuera de rango.");
        }
    }

    public static void imprimirListado(ArrayList<String> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }
        System.out.println("Lista de países:");
        for (int i = 0; i < paises.size(); i++) {
            System.out.println((i + 1) + ". " + paises.get(i));
        }
    }

}
