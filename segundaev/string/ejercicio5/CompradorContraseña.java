package segundaev.string.ejercicio5;

import java.util.Scanner;

public class CompradorContraseña {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String passwd = "1234554321";
        System.out.println("A continuación escribe la contraseña númerica para acceder: ");
        String contraseña = lect.nextLine();

        while (!contraseña.equals(passwd)) {
            System.out.println("Contraseña incorrecta.Vuelve a intentarlo");
            int comparar = contraseña.compareTo(passwd);
            if (comparar > 0) {
                System.out.println("La contraseña introducida es mayor a la real");
            } else if (comparar < 0) {
                System.out.println("La contraseña introducida es menor a la real");
            }
            contraseña = lect.nextLine();
        }
        System.out.println("Contraseña correcta...accediendo al sistema.");

        lect.close();
    }
}
