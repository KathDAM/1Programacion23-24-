package prueba;

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);

        String passw = "12Kath89";
        String contrasena = "";
        do {
            System.out.println("Crea una nueva contraseña. Ten en cuenta que \n"
                    + "*tiene que tener 8 caracteres \n"
                    + "*minimo una mayuscula, y minuscula \n"
                    + "*sin espacios en blanco \n"
                    + "*y con minimo 2 números: \n");
            contrasena = lect.nextLine();
        } while (!comprobarValidezContrasena(contrasena, passw));

        System.out.printf("La contraseña se ha guardado correctamente" );

        lect.close();
    }

    private static boolean comprobarValidezContrasena(String contrasena, String passw) {
        if (!tamañoValido(contrasena)) {
            System.out.println("Incorrecto.La contraseña tiene que tener 8 caracteres \n");
            return false;
        }

        if (contrasena.contains(" ")) {
            System.out.println("Incorrecto.La contraseña no puede tener espacios en blanco\n");
            return false;
        }

        if (!tieneMayusculas(contrasena)) {
            System.out.println("Incorrecto.La contraseña tiene que tener minimo una mayuscula\n");
            return false;
        }

        if (!tieneMinusculas(contrasena)) {
            System.out.println("Incorrecto.La contraseña tiene que tener minimo una minuscula\n");
            return false;
        }

        if (!tieneNumeros(contrasena, 2)) {
            System.out.println("Incorrecto.La contraseña tiene que tener minimo 2 numeros\n");
            return false;
        }

        if (contrasena.equals(passw)) {
            System.out.println("Incorrecto.La contraseña es igual a la anterior\n");
            return false;
        }

        return true;
    }

    private static boolean tieneNumeros(String contrasena, int min) {
        int cont = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                cont ++;
            }
        }
        return cont >= min;
    }

    private static boolean tieneMinusculas(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isLowerCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneMayusculas(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean tamañoValido(String contrasena) {
        return contrasena.length() == 8;
    }
}
