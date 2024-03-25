package terceraev.colecciones.ejr3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;

public class Paises {
    static Scanner lect = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String,Paises> listaPais = new HashMap<>();
        
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(lect.nextLine());

            switch (opcion) {
                case 1:
                    anyadirPais(listaPais);
                    break;
                case 2:
                    consultarPais(listaPais);
                    break;
                case 3:
                    eliminarPais(listaPais);
                    break;
                case 4:
                    imprimirListado(listaPais);
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
                            "1. Añadir \n" +
                            "2. Consultar por posición \n" +
                            "3. Eliminar por posición \n" +
                            "4. Consultar por valor \n" +
                            "5. Eliminar por valor \n" +
                            "6. Imprimir \n" +
                            "7. Salir \n");
        System.out.print("Seleciona una opcion del menu: ");
    }

   
    public static void anyadirPais(Map<String, Paises> paises) {
        System.out.print("Introduce el nombre del país: ");
        String nombrePais = lect.nextLine();
        System.out.print("Introduce el código del país: ");
        String codigoPais = lect.nextLine();
        paises.put(codigoPais, nombrePais);
        System.out.println("País añadido correctamente.");
    }

    public static void consultarPais(Map<String, Paises> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce el código del país a consultar: ");
        String codigoPais = lect.nextLine();

        if (paises.containsKey(codigoPais)) {
            System.out.println("El país con el código " + codigoPais + " es: " + paises.get(codigoPais));
        } else {
            System.out.println("El país con el código " + codigoPais + " no se encuentra en la lista.");
        }
    }

    public static void eliminarPais(Map<String, Paises> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce el código del país que quieres eliminar: ");
        String codigoPaisEliminar = lect.nextLine();
        if (paises.containsKey(codigoPaisEliminar)) {
            Paises paisEliminado = paises.remove(codigoPaisEliminar);
            System.out.println("Se ha eliminado el país '" + paisEliminado + "' correctamente.");
        } else {
            System.out.println("El país con el código " + codigoPaisEliminar + " no se encuentra en la lista.");
        }
    }

    public static void consultarPaisPorValor(Map<String, Paises> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce el nombre del país a consultar: ");
        String nombrePais = lect.nextLine();

        if (paises.containsValue(nombrePais)) {
            System.out.println("El país '" + nombrePais + "' se encuentra en la lista.");
        } else {
            System.out.println("El país '" + nombrePais + "' no se encuentra en la lista.");
        }
    }

    public static void eliminarPaisPorValor(Map<String, Paises> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }

        System.out.print("Introduce el nombre del país a eliminar: ");
        String nombrePaisEliminar = lect.nextLine();

        if (paises.containsValue(nombrePaisEliminar)) {
            for (Entry<String, Paises> entry : paises.entrySet()) {
                if (entry.getValue().equals(nombrePaisEliminar)) {
                    paises.remove(entry.getKey());
                    System.out.println("Se ha eliminado el país '" + nombrePaisEliminar + "' correctamente.");
                    return;
                }
            }
        } else {
            System.out.println("El país '" + nombrePaisEliminar + "' no se encuentra en la lista.");
        }
    }

    public static void imprimirListado(Map<String, Paises> paises) {
        if (paises.isEmpty()) {
            System.out.println("La lista de países está vacía.");
            return;
        }
        System.out.println("Lista de países:");
        for (Entry<String, Paises> entry : paises.entrySet()) {
            System.out.println("  " + entry.getKey() + ". " + entry.getValue());
        }
    }

}
