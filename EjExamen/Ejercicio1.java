package EjExamen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String passwd = "12St478d";
        String contrasena;

        do {
            System.out.println("Escribe una contraseña diferente a la anterior - \n"
                    + "(A tener en cuenta que tiene que contener: \n"
                    + " * 8 caracteres \n" 
                    + " * minimo 2 números \n" 
                    + " * una mayuscula \n"
                    + " * una minuscula \n"
                    + " * sin espacios ) :");
            contrasena = lect.nextLine();
        } while (!esContrasenaValida(contrasena, passwd));

        System.out.println("Nueva contraseña aceptada");
        lect.close();
    }

    private static boolean esContrasenaValida(String contrasena, String passwd) {
        if (contrasena.contains(" ")) {
            System.out.println("La contraseña no puede contener espacios.\n");
            return false;
        }

        if (!tamanoValido(contrasena)) {
            System.out.println("Tamaño de contraseña inválido. Debe tener exactamente 8 caracteres.\n");
            return false;
        }

        if (!contieneMinimoNumeros(contrasena, 2)) {
            System.out.println("La contraseña debe contener al menos 2 números.\n");
            return false;
        }

        if (!contieneMayuscula(contrasena)) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula.\n");
            return false;
        }

        if (!contieneMinuscula(contrasena)) {
            System.out.println("La contraseña debe contener al menos una letra minúscula.\n");
            return false;
        }

        if (contrasena.equals(passwd)) {
            System.out.println("La contraseña es igual a la anterior. Por favor, elija otra.\n");
            return false;
        }

        return true;
    }

    public static boolean tamanoValido(String contrasena) {
        return contrasena.length() == 8;
    }

    public static boolean contieneMinimoNumeros(String contrasena, int minimo) {
        int contador = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                contador++;
            }
        }
        return contador >= minimo;
    }

    public static boolean contieneMayuscula(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneMinuscula(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isLowerCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
