package ejerciciosopcionales.ejercicio12;

import java.util.Scanner;

public class CaracteresTrigo {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Un número entero : ");
        int num = Integer.parseInt(lect.nextLine());

        System.out.println("Dame un caracter 's', 'c' o 't')");
        String caracter = lect.nextLine();

        switch (caracter) {
            case "s":
                System.out.println("El Sin(x) de " + num + " es " + Math.sin(num));
                break;
            case "c":
            System.out.println("El Cos(x) de " + num + " es " + Math.cos(num));
                break;
            case "t":
            System.out.println("El Tan(x) de " + num + " es " + Math.tan(num));
                break;
            default:
                System.out.println("Error: carácter introducido incorrecto");
                break;
        }

        lect.close();
    }
}
