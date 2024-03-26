

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del array de precios
        int n = pedirTamanoArray(scanner);

        // Crear un array para almacenar los precios
        double[] precios = leerPrecios(scanner, n);

        // Calcular el total de la compra con descuentos
        double total = calcularTotalConDescuentos(precios);

        // Mostrar los precios con descuentos aplicados
        mostrarPreciosConDescuentos(precios);

        // Mostrar los descuentos aplicados
        mostrarDescuentosAplicados(precios);

        // Mostrar el total de la compra
        mostrarTotalCompra(total);

        scanner.close();
    }

    public static int pedirTamanoArray(Scanner scanner) {
        System.out.print("Ingrese el tamaño de la cesta: ");
        return scanner.nextInt();
    }

    public static double[] leerPrecios(Scanner scanner, int n) {
        double[] precios = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }
        return precios;
    }

    public static double calcularTotalConDescuentos(double[] precios) {
        double total = 0;
        for (double precio : precios) {
            if (precio > 200) {
                total += precio * 0.95; // Aplicar descuento adicional del 5%
            } else if (precio > 100) {
                total += precio * 0.935; // Aplicar descuento del 6.5%
            } else if (precio > 50) {
                total += precio * 0.95; // Aplicar descuento del 5%
            } else {
                total += precio; // No hay descuento
            }
        }
        return total;
    }

    public static void mostrarPreciosConDescuentos(double[] precios) {
        System.out.println("\nPrecios con descuentos aplicados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i + 1) + ": " + precios[i]);
        }
    }

    public static void mostrarDescuentosAplicados(double[] precios) {
        System.out.println("\nDescuentos aplicados:");
        for (int i = 0; i < precios.length; i++) {
            double descuento = calcularDescuento(precios[i]);
            System.out.printf("Precio %d: Descuento de %.2f aplicado\n", (i + 1), descuento);
        }
    }

    public static double calcularDescuento(double precio) {
        if (precio > 200) {
            return precio * 0.05; // Descuento adicional del 5%
        } else if (precio > 100) {
            return precio * 0.065; // Descuento del 6.5%
        } else if (precio > 50) {
            return precio * 0.05; // Descuento del 5%
        } else {
            return 0; // No hay descuento
        }
    }

    public static void mostrarTotalCompra(double total) {
        if (total > 200) {
            total -= total * 0.05; // Aplicar descuento adicional del 5%
            System.out.printf("\nTotal de la compra con descuento adicional (5%%): %.2f\n", total);
        } else {
            System.out.printf("\nTotal de la compra: %.2f\n", total);
        }
    }
}

    
    /* 
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        // Pedir al usuario el tamaño del array de precios
        int n = pedirTamanoArray(lect);

        // Crear un array para almacenar los precios
        double[] precios = leerPrecios(lect, n);

        // Aplicar descuentos y calcular el total
        double total = calcularTotalConDescuentos(precios);

        // Mostrar los precios con descuentos aplicados
        mostrarPreciosConDescuentos(precios);

        // Mostrar en qué posiciones se aplicaron descuentos
        mostrarDescuentosAplicados(precios);

        // Mostrar el total de la compra
        mostrarTotalCompra(total);

        lect.close();
    }

    public static int pedirTamanoArray(Scanner l) {
        System.out.print("Ingrese el tamaño de cesta: ");
        return l.nextInt();
    }

    public static double[] leerPrecios(Scanner scanner, int n) {
        double[] precios = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }
        return precios;
    }

    public static double calcularTotalConDescuentos(double[] precios) {
        double total = 0;
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > 200) {
                precios[i] *= 0.95; // Aplicar descuento adicional del 5%
            } else if (precios[i] > 100) {
                precios[i] *= 0.935; // Aplicar descuento del 6.5%
            } else if (precios[i] > 50) {
                precios[i] *= 0.95; // Aplicar descuento del 5%
            }
            total += precios[i]; // Sumar al total
        }
        return total;
    }

    public static void mostrarPreciosConDescuentos(double[] precios) {
        System.out.println("\nPrecios con descuentos aplicados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i + 1) + ": " + precios[i]);
        }
    }

    public static void mostrarDescuentosAplicados(double[] precios) {
        System.out.println("\nDescuentos aplicados:");
        for (int i = 0; i < precios.length; i++) {
            double descuento = 0;
            if (precios[i] <= 50) {
                descuento = 0;
            } else if (precios[i] <= 100) {
                descuento = precios[i] * 0.05; // Descuento del 5%
            } else if (precios[i] <= 200) {
                descuento = precios[i] * 0.065; // Descuento del 6.5%
            } 
            System.out.printf("Precio %d : Descuento de %.2f aplicado \n",(i + 1),descuento);
        }
    }

    public static void mostrarTotalCompra(double total) {
        if (total > 200) {
            total = total - ((total * 5)/100);
            System.out.printf("\nTotal de la compra con descuento adicional(5%%): %.2f\n ",total);
        } else{
            System.out.printf("\nTotal de la compra: %.2f\n", total);
        }
    }
}

*/