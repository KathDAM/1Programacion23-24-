package vectores;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("BIENVENIDO AL EJERCICIO 4");


    //SOLICITUD DEL ARRAY 
        int tamaño;
        do {
            System.out.print("¿De qué tamaño será el array? ");
            tamaño = lect.nextInt();
            if (tamaño <= 0) {
                System.out.println("Por favor, ingrese un tamaño válido (mayor que cero).");
            }
        } while (tamaño <= 0);

        int[] array = Ej3.creaArray(tamaño);
        System.out.println();
     
    //***************************************************************************
    
    //IMPRIMIR MENÚ
        int menu;
        do {
            System.out.println("Seleccione una opción disponible: ");
            System.out.println("1) Imprimir vector");
            System.out.println("2) Imprimir inverso del vector");
            System.out.println("3) Buscar");
            System.out.println("4) Salir");

            menu = lect.nextInt();
            System.out.println("Opción selecionada: [" + menu + "]");
    //OPCIONES MENÚ
            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.println("Aqui esta el vector que ha creado:");
                    Ej3.imprimirArray(array);
                    System.out.println();
                    break;
                
                case 2:
                    System.out.println();
                    System.out.println("Aqui esta el inverso del vector que has creado:");
                    inversoVector(array);
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Indica el número que buscas en el vector: ");
                    int valor = lect.nextInt();
                    Ej2.buscarValor(array, valor);
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Saliendo del menú...");
                    System.out.println(" ¡ Hasta la próxima ! ");
            
                default:
                    System.out.println();
                    System.out.println("Opción inválida, porfavor vuelva a intentarlo");
                    System.out.println();
                    break;
            }
        } while (menu != 4);
            

    lect.close();
    }

    //METODO
    public static int[] inversoVector(int[] array) {
        int[] arrayinverso = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayinverso[i] =  array[ (array.length-1)-i] ; //array es lo que recorremos y array.length-1 indice del ultimo elemento del array original, y la i la posicion inversa
            System.out.println("vector[" + i + "] = " + arrayinverso[i]);
        }
        return arrayinverso;
       
    }
}

/*   

// Solicitar el tamaño del array y validar que no es negativo o 0
        int tamaño;
        do {
            System.out.print("¿De qué tamaño será el array? ");
            tamaño = lect.nextInt();
            if (tamaño <= 0) {
                System.out.println("Por favor, ingrese un tamaño válido (mayor que cero).");
            }
        } while (tamaño <= 0);

        int[] array = Ej3.creaArray(tamaño);
        System.out.println(); */