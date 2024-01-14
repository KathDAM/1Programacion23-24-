// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio3;

import java.util.Scanner;

public class Main {
    static Scanner lect = new Scanner(System.in);
    static int num;
    public static void main(String[] args) {
       
        Multimedia contenidoAnterior = null;

        while (true) {
            System.out.println("¿Desea añadir una película o una canción? \n" + "Pulsa 'p' para peliculas y 'c' para canciones");
            String tipoContenido = lect.nextLine().toLowerCase();

            if (tipoContenido.equals("p") || tipoContenido.equals("c")) {
                Multimedia nuevoContenido = crearContenido(lect, tipoContenido);

                if (contenidoAnterior != null && contenidoAnterior.equals(nuevoContenido)) {
                    System.out.println("Este contenido ya ha sido ingresado anteriormente.");
                } else {
                    System.out.println("Contenido ingresado:\n" + nuevoContenido);
                    contenidoAnterior = nuevoContenido;
                }
            } else {
                System.out.println("Opción no válida. Por favor, ingrese 'p' para película o 'c' para canción.");
            }

            System.out.println("¿Desea salir del programa? (s/n)");
            String salir = lect.nextLine().toLowerCase();
            if (salir.equals("s")) {
                System.out.println("Saliendo del programa...");
                break;
            }
        }
        lect.close();
    }

    private static Multimedia crearContenido(Scanner lect, String tipoContenido) {
        System.out.println("Ingrese el título:");
        String titulo = lect.nextLine();

        System.out.println("Ingrese el autor:");
        String autor = lect.nextLine();

        System.out.println("Ingrese el año de publicación:");
        int añoPublicacion = obtenerIntValidado(num);

        System.out.println("Ingrese el formato (mp3, mp4, mpeg, midi, mov, ogg):");
        String formato = lect.nextLine();

        System.out.println("Ingrese las horas de duración:");
        int horas = obtenerIntValidado(num);

        System.out.println("Ingrese los minutos de duración:");
        int minutos = obtenerIntValidado(num);

        System.out.println("Ingrese los segundos de duración:");
        int segundos = obtenerIntValidado(num);

        if (tipoContenido.equals("p")) {
            System.out.println("Ingrese el actor principal:");
            String actorPrincipal = lect.nextLine();

            System.out.println("Ingrese la actriz principal:");
            String actrizPrincipal = lect.nextLine();

            return new Pelicula(titulo, autor, añoPublicacion, formato, horas, minutos, segundos, actorPrincipal, actrizPrincipal);
        } else {
            System.out.println("Ingrese el estudio de grabación:");
            String estudioGrabacion = lect.nextLine();

            return new Cancion(titulo, autor, añoPublicacion, formato, horas, minutos, segundos, estudioGrabacion);
        }
    }
    private static int obtenerIntValidado(int num) {
        while (true) {
            num = lect.nextInt();
            
            if (num>0) {
                return lect.nextInt();
            } else {
                System.out.println("Formato inválido, tienes que poner un numero entero mayor a 0 \n" + "Dime un número entero: ");
                lect.close();
            }    
        }
    }  
}
