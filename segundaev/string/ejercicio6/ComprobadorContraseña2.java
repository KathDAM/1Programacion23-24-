package segundaev.string.ejercicio6;

import java.util.Scanner;

public class ComprobadorContraseña2 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String passwd = "1234554321";
        System.out.println("\nLa contraseña tiene un tamaño de " + passwd.length() + " caracteres númericos.");
        System.out.println("A continuación escribe la contraseña númerica para acceder: ");
        String contraseña = lect.nextLine();

        while (!contraseña.equals(passwd)) {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < contraseña.length(); i++) {
                char c1 = contraseña.charAt(i);
                char c2 = passwd.charAt(i);
                if (c1 == c2) {
                    resultado.append(c1);
                } else {
                    resultado.append('*');
                }
            }
            System.out.println("Parte de la contraseña es correcta: " + resultado.toString() + "\nVuelve a intentarlo: ");
            contraseña = lect.nextLine();
        }
        System.out.println("Contraseña correcta...accediendo al sistema.");
        lect.close();
    }
}
